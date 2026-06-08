from pathlib import Path
from collections import defaultdict
root = Path('.')
sol_root = root / 'Solutions'
backup = sol_root / '_duplicates_backup'
backup.mkdir(parents=True, exist_ok=True)

files = list(sol_root.rglob('Solution_*.java'))
byname = defaultdict(list)
for f in files:
    byname[f.name].append(f)

moved = []
for name, paths in byname.items():
    if len(paths) <= 1:
        continue
    # choose keep path = longest path (most specific)
    paths_sorted = sorted(paths, key=lambda p: len(str(p)))
    keep = paths_sorted[-1]
    extras = [p for p in paths if p != keep]
    for p in extras:
        target = backup / p.relative_to(sol_root)
        target.parent.mkdir(parents=True, exist_ok=True)
        p.rename(target)
        moved.append((p, target))

print('moved', len(moved), 'duplicates to', backup)
for src,tgt in moved[:200]:
    print(src, '->', tgt)
