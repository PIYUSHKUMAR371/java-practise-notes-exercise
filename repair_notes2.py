from pathlib import Path
import re
root = Path('.')
notes = list(root.rglob('Notes_*.java'))
fixed = []
for p in notes:
    lines = p.read_text(encoding='utf-8').splitlines()
    out = []
    i = 0
    changed = False
    while i < len(lines):
        line = lines[i]
        stripped = line.strip()
        # handle println or writer.write starting with an opening quote but no closing on same line
        if (stripped.startswith('System.out.println("') or stripped.startswith('writer.write("')) and not stripped.endswith('");'):
            # take next line if exists and it looks like string content (not a brace or standalone token)
            if i + 1 < len(lines):
                next_line = lines[i+1].strip()
                # skip combining if next_line is just a brace or similar structural token
                if re.match(r'^[\}\)\{;]+$', next_line):
                    out.append(line)
                    i += 1
                    continue
                # remove trailing closing tokens from next_line
                inner = re.sub(r'"\);\)?;?$', '', next_line)
                # remove any leading backslash-n or literal newline markers
                inner = re.sub(r'^\\n', '', inner)
                inner = re.sub(r'^\\u2713', '', inner)
                inner = inner.replace('✓', '')
                inner = inner.strip()
                # escape backslashes and double quotes inside inner
                inner = inner.replace('\\', '\\\\').replace('"', '\\"')
                # replace actual newlines with \n
                inner = inner.replace('\n', '\\n')
                indent = re.match(r'^(\s*)', line).group(1)
                if stripped.startswith('writer.write("'):
                    new_line = indent + 'writer.write("' + inner + '");'
                else:
                    new_line = indent + 'System.out.println("' + inner + '");'
                out.append(new_line)
                i += 2
                changed = True
                continue
        # remove stray checkmarks on lines
        if '✓' in line or '\u2713' in line:
            nl = line.replace('✓','').replace('\u2713','')
            out.append(nl)
            changed = True
            i += 1
            continue
        out.append(line)
        i += 1
    if changed:
        p.write_text('\n'.join(out) + '\n', encoding='utf-8')
        fixed.append(str(p))

print('fixed', len(fixed), 'files')
for f in fixed:
    print(f)
