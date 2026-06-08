from pathlib import Path
import re
import shutil

root = Path('.')
solution_root = root / 'Solutions'
solution_root.mkdir(exist_ok=True)

py_candidates = ['fix_exercise_files.py','fix_exercise_lines.py','repair_exercise_lines.py']

for p in root.glob('*.py'):
    if p.name in py_candidates:
        try:
            p.unlink()
            print('deleted', p)
        except Exception as e:
            print('failed delete', p, e)

for path in root.rglob('Exercise_*.java'):
    try:
        rel = path.relative_to(root)
        parts = rel.parts
        # create corresponding solution dir preserving module structure
        sol_dir = solution_root.joinpath(*parts[:-1])
        sol_dir.mkdir(parents=True, exist_ok=True)

        text = path.read_text(encoding='utf-8')
        # find header block (first /* ... */) if exists
        header = ''
        m_header = re.match(r'(\s*/\*.*?\*/\s*)', text, re.S)
        if m_header:
            header = m_header.group(1).rstrip() + '\n\n'
            body = text[len(m_header.group(1)):]
        else:
            body = text

        # find original class name
        m_class = re.search(r'public\s+class\s+([A-Za-z0-9_]+)', body)
        if not m_class:
            print('no public class in', path)
            continue
        class_name = m_class.group(1)
        # create solution class name
        if class_name.startswith('Exercise_'):
            sol_class = class_name.replace('Exercise_', 'Solution_')
        else:
            sol_class = 'Solution_' + class_name

        # create solution file content by replacing class name
        sol_text = header + re.sub(r'public\s+class\s+' + re.escape(class_name), 'public class ' + sol_class, body, count=1)
        sol_file = sol_dir / ('Solution_' + path.name[len('Exercise_'):])
        sol_file.write_text('/* INSTRUCTOR SOLUTION - DO NOT SHARE */\n' + sol_text, encoding='utf-8')
        print('wrote solution', sol_file)

        # create exercise skeleton
        topic = parts[-2] if len(parts) >= 2 else 'Topic'
        exercise_prompt = []
        exercise_prompt.append(header)
        exercise_prompt.append('public class ' + class_name + ' {')
        exercise_prompt.append('    public static void main(String[] args) {')
        exercise_prompt.append('        System.out.println("Exercises for ' + topic.replace('_', ' ') + '.\");')
        exercise_prompt.append('        System.out.println("1) Implement the required functionality as described in the Notes for this topic.");')
        exercise_prompt.append('        System.out.println("2) Follow the test specifications in the exercise comments and write modular code.");')
        exercise_prompt.append('        System.out.println("3) HINT: Refer to the instructor solutions in the Solutions folder if you are stuck (instructors only).\");')
        exercise_prompt.append('    }')
        exercise_prompt.append('}\n')
        new_ex = '\n'.join(exercise_prompt)
        path.write_text(new_ex, encoding='utf-8')
        print('rewrote exercise', path)
    except Exception as e:
        print('error processing', path, e)

print('done')
