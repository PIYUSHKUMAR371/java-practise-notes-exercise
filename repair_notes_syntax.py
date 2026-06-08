from pathlib import Path
import re
root = Path('.')
notes = sorted(root.rglob('Module_*/*/Notes_*.java'))
fixed = []
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
                if next_line.startswith('",') or next_line.startswith('" )') or next_line.startswith('" );') or next_line.startswith('";'):
                    combined = line.rstrip() + next_line
                    merged.append(combined)
                    i += 2
                    changed = True
                    continue
        merged.append(line)
        i += 1
    lines = merged
    # find main boundary
    main_start = None
    brace_count = 0
    started = False
    main_end = None
    for idx, line in enumerate(lines):
        if main_start is None and 'public static void main' in line:
            main_start = idx
            if '{' in line:
                brace_count += line.count('{') - line.count('}')
                started = True
            continue
        if main_start is not None and not started:
            if '{' in line:
                brace_count += line.count('{') - line.count('}')
                started = True
                continue
        if started:
            brace_count += line.count('{') - line.count('}')
            if brace_count == 0:
                main_end = idx
                break
    if main_start is None or main_end is None:
        continue
    # collect tail lines after main_end until the final closing brace of the file
    if len(lines) > main_end + 1:
        tail = lines[main_end+1:]
        # if last line is closing brace, keep it as final brace and move the rest inside main
        if tail and tail[-1].strip() == '}':
            to_move = tail[:-1]
            if any(line.strip() and not line.strip().startswith('//') for line in to_move):
                insert_at = main_end
                for line in to_move:
                    if line.strip() == '' and (not merged or insert_at == main_end):
                        continue
                    lines.insert(insert_at, line)
                    insert_at += 1
                    changed = True
                # remove moved lines from original position
                del lines[main_end+1:len(lines)-1]
    # ensure file ends with a final brace after class closure
    if lines and lines[-1].strip() != '}':
        lines.append('}')
        changed = True
    if changed:
        p.write_text('\n'.join(lines) + '\n', encoding='utf-8')
        fixed.append(str(p))
print('fixed', len(fixed), 'Notes files')
for f in fixed:
    print(f)
