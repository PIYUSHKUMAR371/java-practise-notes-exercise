from pathlib import Path

root = Path('.')
missed = []
for path in root.rglob('*.java'):
    text = path.read_text(encoding='utf-8')
    if 'Write your code here' in text or 'This demonstrates how to use' in text or 'TODO' in text:
        missed.append(str(path))
print('PLACEHOLDERS FOUND:', len(missed))
for p in missed:
    print(p)
