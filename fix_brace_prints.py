from pathlib import Path
import re
root = Path('.')
notes = list(root.rglob('Notes_*.java'))
fixed = []
for p in notes:
    text = p.read_text(encoding='utf-8')
    orig = text
    lines = text.splitlines()
    out = []
    for line in lines:
        stripped = line.strip()
        if stripped in ['System.out.println("}");', 'System.out.println("}");', 'writer.write("}");']:
            indent = re.match(r'^(\s*)', line).group(1)
            out.append(indent + '}')
        else:
            out.append(line)
    text2 = '\n'.join(out) + '\n'
    # Count braces
    opens = text2.count('{')
    closes = text2.count('}')
    if opens > closes:
        # Need to insert missing '}' before the key takeaways comment if present
        missing = opens - closes
        lines2 = text2.splitlines()
        insert_at = None
        for idx, l in enumerate(lines2):
            if l.strip().startswith('// ── KEY TAKEAWAYS'):
                insert_at = idx
                break
        if insert_at is None:
            # append at end before final newline
            for _ in range(missing):
                lines2.append('}')
        else:
            for _ in range(missing):
                lines2.insert(insert_at, '}')
        text2 = '\n'.join(lines2) + '\n'
    if text2 != orig:
        p.write_text(text2, encoding='utf-8')
        fixed.append(str(p))

print('fixed', len(fixed), 'files')
for f in fixed:
    print(f)
