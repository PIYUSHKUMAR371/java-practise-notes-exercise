from pathlib import Path
import re
root = Path('.')
notes = sorted(root.rglob('Module_*/*/Notes_*.java'))
fixed = []
member_re = re.compile(r'^	*\s*(public|private|protected)?\s*(static\s+)?(class|interface|enum|void|[A-Za-z0-9_<>,\[\]]+\s+[A-Za-z0-9_]+)\s*\(')
class_re = re.compile(r'^	*\s*(public|private|protected)?\s*(static\s+)?(class|interface|enum)\b')
for p in notes:
    lines = p.read_text(encoding='utf-8').splitlines()
    changed = False
    # merge broken printf/println strings split across lines
    merged = []
    i = 0
    while i < len(lines):
        line = lines[i]
        stripped = line.strip()
        if any(keyword in stripped for keyword in ['System.out.printf("', 'System.out.println("', 'writer.write("']) and '"' in stripped and not stripped.endswith('");'):
            if i + 1 < len(lines):
                next_line = lines[i + 1].strip()
                if next_line.startswith('",') or next_line.startswith('";') or next_line.startswith('" )') or next_line.startswith('" );'):
                    merged.append(line.rstrip() + next_line)
                    i += 2
                    changed = True
                    continue
        merged.append(line)
        i += 1
    lines = merged
    # if class has no final close, append one later
    brace = 0
    main_start = None
    main_started = False
    main_ended = False
    for idx, line in enumerate(lines):
        if main_start is None and 'public static void main' in line:
            main_start = idx
            if '{' in line:
                brace += line.count('{') - line.count('}')
                main_started = True
            continue
        if main_start is not None and not main_started:
            if '{' in line:
                brace += line.count('{') - line.count('}')
                main_started = True
                continue
        if main_started and not main_ended:
            brace += line.count('{') - line.count('}')
            if brace == 0:
                main_ended = True
                continue
    # if no main end, we may need to insert it before member definitions
    if main_started and not main_ended:
        brace = 0
        for idx, line in enumerate(lines):
            if main_start is not None and idx >= main_start:
                if 'public static void main' in line and '{' in line:
                    brace = line.count('{') - line.count('}')
                    continue
                if main_start < idx:
                    brace += line.count('{') - line.count('}')
                if brace == 0:
                    main_ended = True
                    break
    # ensure members appear outside main
    if main_start is not None:
        brace = 0
        in_main = False
        if 'public static void main' in lines[main_start]:
            in_main = True
            brace += lines[main_start].count('{') - lines[main_start].count('}')
        for idx in range(main_start + 1, len(lines)):
            line = lines[idx]
            stripped = line.strip()
            if in_main:
                brace += line.count('{') - line.count('}')
                if brace == 0:
                    in_main = False
                    continue
                # if a member declaration appears while still inside main, insert a closing brace before it
                if member_re.match(stripped) or class_re.match(stripped):
                    lines.insert(idx, '        }')
                    changed = True
                    in_main = False
                    break
            else:
                if main_start is not None and idx > main_start and not in_main and 'public static void main' in line:
                    in_main = True
                    brace += line.count('{') - line.count('}')
    # final brace balancing: class should be closed once
    opens = sum(line.count('{') for line in lines)
    closes = sum(line.count('}') for line in lines)
    if closes < opens:
        for _ in range(opens - closes):
            lines.append('}')
        changed = True
    elif closes > opens:
        # remove excess closing braces at end if they are stray and file already has a class close
        while len(lines) > 0 and closes > opens and lines[-1].strip() == '}':
            lines.pop()
            closes -= 1
            changed = True
        if closes < opens:
            lines.append('}')
            changed = True
    if changed:
        p.write_text('\n'.join(lines) + '\n', encoding='utf-8')
        fixed.append(str(p))
print('normalized', len(fixed), 'Notes files')
for f in fixed:
    print(f)
