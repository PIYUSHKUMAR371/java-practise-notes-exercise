from pathlib import Path
from collections import defaultdict
root = Path('.')
all_files = [p for p in root.rglob('Solutions/**/*.java') if p.is_file()]
byname = defaultdict(list)
for p in all_files:
    if '_duplicates_backup' in p.parts:
        continue
    byname[p.name].append(p)
print('duplicate solution base names in Solutions:')
for name, paths in sorted(byname.items()):
    if len(paths) > 1:
        print(name)
        for p in paths:
            print('  ', p)
print()
print('Total canonical Solutions files:', sum(1 for p in all_files if '_duplicates_backup' not in p.parts))
print('Total duplicates backup files:', sum(1 for p in all_files if '_duplicates_backup' in p.parts))
