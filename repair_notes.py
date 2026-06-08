from pathlib import Path
import re
root = Path('.')
notes = list(root.rglob('Notes_*.java'))
fixed_files = []
for p in notes:
    text = p.read_text(encoding='utf-8')
    lines = text.splitlines()
    new_lines = []
    i = 0
    changed = False
    while i < len(lines):
        line = lines[i]
        # detect start of a broken string literal: contains a quote start but does not close on same line
        if '"' in line and ('System.out.println(' in line or 'writer.write(' in line) and not re.search(r'".*"', line):
            # accumulate until we find a line that contains closing "); or ");); or ");\n"
            j = i + 1
            acc = line
            while j < len(lines) and not lines[j].strip().endswith('");') and not lines[j].strip().endswith('"););'):
                acc += '\n' + lines[j]
                j += 1
            if j < len(lines):
                acc += '\n' + lines[j]
                # extract the prefix up to the opening quote
                m = re.match(r'^(.*?\(\s*)\"', acc)
                prefix = ''
                if m:
                    prefix = m.group(1)
                # extract inner content: everything between first " and trailing ");
                inner = re.sub(r'^.*?\"', '', acc, count=1, flags=re.S)
                inner = re.sub(r'"\);\)?\s*$', '', inner, flags=re.S)
                inner = inner.replace('\n', '\\n')
                # remove any unicode checkmark
                inner = inner.replace('\u2713', '')
                inner = inner.replace('✓', '')
                inner = inner.strip()
                # build replacement line, preserve indentation from original line
                indent = re.match(r'^(\s*)', line).group(1)
                new_line = indent + prefix + '"\n' + inner + '");'
                new_lines.append(new_line)
                i = j + 1
                changed = True
                continue
        # also fix cases where a line contains checkmark characters outside quotes
        if '✓' in line or '\u2713' in line:
            new_lines.append(line.replace('✓', '').replace('\u2713', ''))
            changed = True
            i += 1
            continue
        new_lines.append(line)
        i += 1
    if changed:
        p.write_text('\n'.join(new_lines) + '\n', encoding='utf-8')
        fixed_files.append(str(p))

print('fixed', len(fixed_files), 'notes files')
for f in fixed_files:
    print(f)
