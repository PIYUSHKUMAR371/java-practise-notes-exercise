from pathlib import Path

WORKSPACE = Path(r"c:/Users/piyush kumar/OneDrive/Desktop/JAVA/Learn-Java-From-Zero")

EXERCISE_TOPIC_MAP = {
    'Introduction': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── EXERCISE 1 ⭐ ──────────────────────────────────────
        // Task: Print "I am learning Java!" to the console
        // Expected output: I am learning Java!
        System.out.println("I am learning Java!");
        
        // ── EXERCISE 2 ⭐⭐ ────────────────────────────────────
        // Task: Print your name and favorite programming language
        // Expected output: My name is [Your Name] and I love Java!
        String name = "Your Name";
        System.out.println("My name is " + name + " and I love Java!");
        
        // ── EXERCISE 3 ⭐⭐⭐ ──────────────────────────────────
        // Task: Create a simple welcome message with multiple lines
        // Expected output:
        // Welcome to Java programming!
        // This is exercise 3
        // You are doing great!
        System.out.println("Welcome to Java programming!");
        System.out.println("This is exercise 3");
        System.out.println("You are doing great!");
    }
''',
    },
    'Variables': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── EXERCISE 1 ⭐ ──────────────────────────────────────
        // Task: Declare an int variable and print it
        // Expected output: The number is 10
        int number = 10;
        System.out.println("The number is " + number);
        
        // ── EXERCISE 2 ⭐⭐ ────────────────────────────────────
        // Task: Create a String variable for your name and print a sentence
        // Expected output: My name is [Your Name].
        String name = "Your Name";
        System.out.println("My name is " + name + ".");
        
        // ── EXERCISE 3 ⭐⭐⭐ ──────────────────────────────────
        // Task: Perform basic arithmetic with variables
        // Expected output: Result = 15
        int a = 7;
        int b = 8;
        int result = a + b;
        System.out.println("Result = " + result);
    }
''',
    },
    'UserInput': {
        'imports': 'import java.util.Scanner;\n',
        'body': '''    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ── EXERCISE 1 ⭐ ──────────────────────────────────────
        // Task: Read a name and print it back
        // Expected output: Hello, [name]!
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        
        // ── EXERCISE 2 ⭐⭐ ────────────────────────────────────
        // Task: Read two numbers and print their sum
        // Expected output: Sum = [result]
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Sum = " + (x + y));
        
        // ── EXERCISE 3 ⭐⭐⭐ ──────────────────────────────────
        // Task: Read a line and print its length
        // Expected output: Length = [length]
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.println("Length = " + sentence.length());
        
        scanner.close();
    }
''',
    },
    'Arithmetic': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── EXERCISE 1 ⭐ ──────────────────────────────────────
        // Task: Add two numbers and print the result
        // Expected output: 5 + 3 = 8
        int a = 5;
        int b = 3;
        System.out.println(a + " + " + b + " = " + (a + b));
        
        // ── EXERCISE 2 ⭐⭐ ────────────────────────────────────
        // Task: Multiply and divide two numbers
        // Expected output: 10 * 2 = 20 and 10 / 2 = 5
        int x = 10;
        int y = 2;
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));
        
        // ── EXERCISE 3 ⭐⭐⭐ ──────────────────────────────────
        // Task: Compute remainder and print it
        // Expected output: 10 % 3 = 1
        System.out.println(x + " % " + 3 + " = " + (x % 3));
    }
''',
    },
    'IfStatements': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── EXERCISE 1 ⭐ ──────────────────────────────────────
        // Task: Check if a number is positive
        // Expected output: Positive
        int number = 5;
        if (number > 0) {
            System.out.println("Positive");
        }
        
        // ── EXERCISE 2 ⭐⭐ ────────────────────────────────────
        // Task: Check if a number is even or odd
        // Expected output: Even
        int value = 4;
        if (value % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        
        // ── EXERCISE 3 ⭐⭐⭐ ──────────────────────────────────
        // Task: Check age for vote eligibility
        // Expected output: Eligible to vote
        int age = 18;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
''',
    },
    'OOP': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "OOP Example");
        Dog dog = new Dog();
        dog.bark();
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        Cat cat = new Cat();
        cat.meow();
        
        System.out.println("\nExercise 3: Advanced Challenge");
        System.out.println("Dog name: " + dog.name);
    }

    static class Dog {
        String name = "Buddy";
        void bark() {
            System.out.println("Woof!");
        }
    }

    static class Cat {
        void meow() {
            System.out.println("Meow!");
        }
    }
''',
    },
    'Constructors': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Constructors Example");
        Car car = new Car("Red");
        System.out.println("Car color: " + car.color);
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        Car car2 = new Car("Blue", 4);
        System.out.println("Car2: " + car2.color + ", wheels=" + car2.wheels);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        System.out.println(car2.color.toUpperCase());
    }

    static class Car {
        String color;
        int wheels;

        Car(String color) {
            this.color = color;
            this.wheels = 4;
        }

        Car(String color, int wheels) {
            this.color = color;
            this.wheels = wheels;
        }
    }
''',
    },
    'Inheritance': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Inheritance Example");
        Animal animal = new Animal();
        animal.eat();
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        
        System.out.println("\nExercise 3: Advanced Challenge");
        System.out.println("Dog is a type of Animal.");
    }

    static class Animal {
        void eat() {
            System.out.println("Animal is eating.");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Woof!");
        }
    }
''',
    },
    'MethodOverriding': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "MethodOverriding Example");
        Animal animal = new Animal();
        animal.sound();
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        Animal dog = new Dog();
        dog.sound();
        
        System.out.println("\nExercise 3: Advanced Challenge");
        dog.makeNoise();
    }

    static class Animal {
        void sound() {
            System.out.println("Some sound");
        }

        void makeNoise() {
            System.out.println("Animal noise");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Bark");
        }

        @Override
        void makeNoise() {
            System.out.println("Dog is barking.");
        }
    }
''',
    },
}


def read_file(path):
    return path.read_text(encoding='utf-8')


def write_file(path, content):
    path.write_text(content, encoding='utf-8')


def build_file_content(original, mapping):
    lines = original.splitlines()
    header_end = 0
    class_line_index = None
    for i, line in enumerate(lines):
        if line.startswith('public class ') or line.startswith('public enum ') or line.startswith('public interface '):
            class_line_index = i
            break
    if class_line_index is None:
        return original
    header = '\n'.join(lines[:class_line_index])
    class_decl = lines[class_line_index]
    imports = mapping.get('imports', '')
    body = mapping['body']
    if imports:
        return header + '\n' + imports + '\n' + class_decl + '\n' + body
    return header + '\n' + class_decl + '\n' + body


def process_target_files():
    for path in WORKSPACE.rglob('Exercise_*.java'):
        topic = path.stem.replace('Exercise_', '')
        if topic not in EXERCISE_TOPIC_MAP:
            continue
        original = read_file(path)
        if 'Write your code here' not in original and 'TODO' not in original:
            continue
        new_content = build_file_content(original, EXERCISE_TOPIC_MAP[topic])
        write_file(path, new_content)
        print(f"Updated {path}")

if __name__ == '__main__':
    process_target_files()
    print('Done')
