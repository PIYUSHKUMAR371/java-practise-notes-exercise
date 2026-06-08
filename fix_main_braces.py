from pathlib import Path
import re
root = Path('.')
notes = list(root.rglob('Notes_*.java'))
fixed = []
for p in notes:
    lines = p.read_text(encoding='utf-8').splitlines()
    changed = False
    # find main
    main_idx = None
    for idx, l in enumerate(lines):
        if 'public static void main' in l:
            main_idx = idx
            break
    if main_idx is None:
        continue
    # look for premature closing brace that is followed soon by KEY TAKEAWAYS
    for j in range(main_idx+1, min(len(lines), main_idx+200)):
        if lines[j].strip() == '}':
            # check next up to 8 lines for key takeaways or WHAT YOU LEARNED or '=== WHAT YOU LEARNED'
            window = '\n'.join(lines[j+1:j+10]).lower()
            if 'key takeaways' in window or 'what you learned' in window or '=== what you learned' in window:
                # remove this brace
                del lines[j]
                changed = True
                break
    if changed:
        # find insertion point: before 'static class' or before last '}' that closes class
        insert_at = None
        for idx, l in enumerate(lines):
            if re.search(r'static\s+class', l) or re.search(r'class\s+\w+\s*\{', l) and idx > main_idx:
                insert_at = idx
                break
        if insert_at is None:
            # find last line that starts with '//' (comments), insert before it
            for idx in range(len(lines)-1, -1, -1):
                if lines[idx].strip().startswith('//'):
                    insert_at = idx
                    break
        if insert_at is None:
            insert_at = len(lines)
        # ensure braces between main_idx and insert_at are balanced
        segment = '\n'.join(lines[main_idx:insert_at])
        opens = segment.count('{')
        closes = segment.count('}')
        miss = opens - closes
        for _ in range(miss):
            lines.insert(insert_at, '}')
        p.write_text('\n'.join(lines) + '\n', encoding='utf-8')
        fixed.append(str(p))

print('fixed', len(fixed), 'files')
for f in fixed:
    print(f)
