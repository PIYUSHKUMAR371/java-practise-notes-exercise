from pathlib import Path

root = Path('.')
notes_files = sorted(root.rglob('**/Notes_*.java'))

def build_content(topic):
    imports = ''
    if topic in ['UserInput', 'InputArray', 'RandomNumbers', 'ArrayLists', 'WriteFiles', 'ReadFiles', 'TimerTasks', 'DatesAndTimes', 'HashMaps']:
        imports_map = {
            'UserInput': 'import java.util.Scanner;',
            'InputArray': 'import java.util.Scanner;',
            'RandomNumbers': 'import java.util.Random;',
            'ArrayLists': 'import java.util.ArrayList;\nimport java.util.List;',
            'WriteFiles': 'import java.io.FileWriter;\nimport java.io.IOException;',
            'ReadFiles': 'import java.io.BufferedReader;\nimport java.io.FileReader;\nimport java.io.IOException;',
            'TimerTasks': 'import java.util.Timer;\nimport java.util.TimerTask;',
            'DatesAndTimes': 'import java.time.LocalDate;\nimport java.time.LocalDateTime;\nimport java.time.format.DateTimeFormatter;',
            'HashMaps': 'import java.util.HashMap;\nimport java.util.Map;',
            'Printt': 'import java.util.Formatter;',
        }
        imports = imports_map.get(topic, '')
    if topic == 'ArrayLists':
        imports = 'import java.util.ArrayList;\nimport java.util.List;'
    if topic == 'WriteFiles':
        imports = 'import java.io.FileWriter;\nimport java.io.IOException;'
    if topic == 'ReadFiles':
        imports = 'import java.io.BufferedReader;\nimport java.io.FileReader;\nimport java.io.IOException;'
    if topic == 'TimerTasks':
        imports = 'import java.util.Timer;\nimport java.util.TimerTask;'
    if topic == 'DatesAndTimes':
        imports = 'import java.time.LocalDate;\nimport java.time.LocalDateTime;\nimport java.time.format.DateTimeFormatter;'
    if topic == 'HashMaps':
        imports = 'import java.util.HashMap;\nimport java.util.Map;'
    if topic == 'UserInput':
        imports = 'import java.util.Scanner;'
    if topic == 'RandomNumbers':
        imports = 'import java.util.Random;'

    body = ''
    if topic == 'Introduction':
        body = '''    public static void main(String[] args) {
        // This file introduces Java basics in a friendly way.
        System.out.println("Welcome to Java basics!");
        System.out.println("A Java program starts in the main() method.");

        String greeting = "Hello, learner!"; // A String holds text
        int year = 2026; // An int holds whole numbers
        double version = 21.0; // A double holds decimal numbers

        System.out.println(greeting);
        System.out.println("Java version: " + version + " in " + year);
        System.out.println("Use comments to explain code to other people.");
    }'''
    elif topic == 'Variables':
        body = '''    public static void main(String[] args) {
        // Variables store values so we can reuse them later.
        int age = 25; // integer number
        double price = 19.99; // decimal number
        String name = "Java Student"; // text
        boolean isActive = true; // true or false

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: $" + price);
        System.out.println("Active: " + isActive);

        // You can update a variable after it is declared.
        age = age + 1;
        System.out.println("Next year: " + age);
    }'''
    elif topic == 'UserInput':
        body = '''    public static void main(String[] args) {
        // Scanner reads input from the user.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        System.out.println("Hello, " + userName + "!");
        System.out.println("You are " + userAge + " years old.");

        scanner.close();
    }'''
    elif topic == 'Arithmetic':
        body = '''    public static void main(String[] args) {
        int a = 12;
        int b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Integer division: " + (a / b));
        System.out.println("Remainder with modulo: " + (a % b));

        double x = 12.0;
        double y = 5.0;
        System.out.println("Decimal division: " + (x / y));
    }'''
    elif topic == 'IfStatements':
        body = '''    public static void main(String[] args) {
        int score = 72;

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 75) {
            System.out.println("Grade B");
        } else {
            System.out.println("Keep practicing!");
        }

        boolean isMember = true;
        if (isMember) {
            System.out.println("Discount applies.");
        }
    }'''
    elif topic == 'RandomNumbers':
        body = '''    public static void main(String[] args) {
        Random random = new Random();

        int roll = random.nextInt(6) + 1; // random number 1-6
        System.out.println("Dice roll: " + roll);

        int secret = random.nextInt(100); // random number 0-99
        System.out.println("Secret number example: " + secret);
    }'''
    elif topic == 'MathClass':
        body = '''    public static void main(String[] args) {
        double value = -3.7;

        System.out.println("Absolute value: " + Math.abs(value));
        System.out.println("Rounded value: " + Math.round(value));
        System.out.println("Square root of 16: " + Math.sqrt(16));
        System.out.println("Power: 2^5 = " + Math.pow(2, 5));
        System.out.println("Max of 7 and 12: " + Math.max(7, 12));
    }'''
    elif topic == 'Printf':
        body = '''    public static void main(String[] args) {
        String name = "Alex";
        int score = 95;
        double gpa = 3.85;

        System.out.printf("Name: %s%n", name);
        System.out.printf("Score: %d out of 100%n", score);
        System.out.printf("GPA: %.2f%n", gpa);
        System.out.printf("Result: %s, GPA: %.1f%%%n", "Passed", gpa);

        System.out.println("Use printf when you want aligned and formatted output.");
    }'''
    elif topic == 'NestedIf':
        body = '''    public static void main(String[] args) {
        int age = 18;
        boolean hasTicket = true;

        if (age >= 18) {
            if (hasTicket) {
                System.out.println("You can enter the event.");
            } else {
                System.out.println("You need a ticket.");
            }
        } else {
            System.out.println("You must be at least 18.");
        }
    }'''
    elif topic == 'StringMethods':
        body = '''    public static void main(String[] args) {
        String text = "Java is powerful";

        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Replace: " + text.replace("powerful", "fun"));
        System.out.println("Contains 'Java': " + text.contains("Java"));
    }'''
    elif topic == 'Substrings':
        body = '''    public static void main(String[] args) {
        String word = "substring";

        System.out.println("First 3 letters: " + word.substring(0, 3));
        System.out.println("From index 3: " + word.substring(3));
        System.out.println("Second half: " + word.substring(word.length() / 2));
    }'''
    elif topic == 'TernaryOperator':
        body = '''    public static void main(String[] args) {
        int points = 85;
        String result = points >= 75 ? "Pass" : "Fail";

        System.out.println("Points: " + points);
        System.out.println("Result: " + result);

        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println("Max value: " + max);
    }'''
    elif topic == 'EnhancedSwitches':
        body = '''    public static void main(String[] args) {
        String day = "Wednesday";

        String type = switch (day) {
            case "Saturday", "Sunday" -> "Weekend";
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            default -> "Unknown";
        };

        System.out.println(day + " is a " + type);
    }'''
    elif topic == 'LogicalOperators':
        body = '''    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWarm = false;

        if (isSunny && isWarm) {
            System.out.println("Great weather!");
        } else if (isSunny || isWarm) {
            System.out.println("Not perfect, but okay.");
        } else {
            System.out.println("Stay inside.");
        }

        System.out.println("Not sunny: " + !isSunny);
    }'''
    elif topic == 'WhileLoops':
        body = '''    public static void main(String[] args) {
        int count = 1;

        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
    }'''
    elif topic == 'ForLoops':
        body = '''    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }'''
    elif topic == 'BreakContinue':
        body = '''    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Found 5, stopping loop.");
                break;
            }
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd number: " + i);
        }
    }'''
    elif topic == 'NestedLoops':
        body = '''    public static void main(String[] args) {
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println();
        }
    }'''
    elif topic == 'Methods':
        body = '''    public static void main(String[] args) {
        greet("Student");
        int sum = add(7, 8);
        System.out.println("7 + 8 = " + sum);
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static int add(int a, int b) {
        return a + b;
    }'''
    elif topic == 'OverloadedMethods':
        body = '''    public static void main(String[] args) {
        printValue(10);
        printValue("Java");
        printValue(4.5);
    }

    static void printValue(int value) {
        System.out.println("Integer: " + value);
    }

    static void printValue(String value) {
        System.out.println("String: " + value);
    }

    static void printValue(double value) {
        System.out.println("Double: " + value);
    }'''
    elif topic == 'VariableScope':
        body = '''    static int classLevel = 10; // class-level variable

    public static void main(String[] args) {
        int methodLevel = 5; // method-level variable
        System.out.println("classLevel: " + classLevel);
        System.out.println("methodLevel: " + methodLevel);
        printScope();
    }

    static void printScope() {
        int local = 3;
        System.out.println("local: " + local);
    }'''
    elif topic == 'Arrays':
        body = '''    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};

        System.out.println("Array length: " + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }'''
    elif topic == 'InputArray':
        body = '''    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[3];

        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        for (int value : values) {
            System.out.println(value);
        }
        scanner.close();
    }'''
    elif topic == 'SearchArray':
        body = '''    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};
        int target = 15;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        if (index >= 0) {
            System.out.println("Found " + target + " at index " + index);
        } else {
            System.out.println(target + " not found.");
        }
    }'''
    elif topic == 'Varargs':
        body = '''    public static void main(String[] args) {
        System.out.println("Sum: " + sum(1, 2, 3, 4));
        System.out.println("Sum: " + sum(10, 20));
    }

    static int sum(int... values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }'''
    elif topic == '2DArrays':
        body = '''    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }'''
    elif topic == 'OOP':
        body = '''    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 2025);
        car.start();
        car.drive();
        car.brake();
        car.stop();
    }

    static class Car {
        String make;
        String model;
        int year;
        boolean running;

        Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.running = false;
        }

        void start() {
            running = true;
            System.out.println(model + " started.");
        }

        void drive() {
            if (running) {
                System.out.println(model + " is driving.");
            }
        }

        void brake() {
            System.out.println(model + " is braking.");
        }

        void stop() {
            running = false;
            System.out.println(model + " stopped.");
        }
    }'''
    elif topic == 'Constructors':
        body = '''    public static void main(String[] args) {
        Student student = new Student("Mia", 20);
        System.out.println(student.name + " is " + student.age + " years old.");
    }

    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }'''
    elif topic == 'OverloadedConstructors':
        body = '''    public static void main(String[] args) {
        Book book1 = new Book("Java Basics");
        Book book2 = new Book("Advanced Java", 450);

        System.out.println(book1.title + " has " + book1.pages + " pages.");
        System.out.println(book2.title + " has " + book2.pages + " pages.");
    }

    static class Book {
        String title;
        int pages;

        Book(String title) {
            this.title = title;
            this.pages = 100;
        }

        Book(String title, int pages) {
            this.title = title;
            this.pages = pages;
        }
    }'''
    elif topic == 'ArrayOfObjects':
        body = '''    public static void main(String[] args) {
        Person[] people = {
            new Person("Asha", 28),
            new Person("Leo", 32)
        };

        for (Person person : people) {
            System.out.println(person.name + " is " + person.age + " years old.");
        }
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }'''
    elif topic == 'Static':
        body = '''    static int count = 0;

    public static void main(String[] args) {
        count = 5;
        System.out.println("Static count: " + count);
        printCount();
    }

    static void printCount() {
        System.out.println("count from static method: " + count);
    }'''
    elif topic == 'Inheritance':
        body = '''    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeSound();
    }

    static class Animal {
        String name;

        Animal(String name) {
            this.name = name;
        }

        void makeSound() {
            System.out.println(name + " makes a sound.");
        }
    }

    static class Dog extends Animal {
        Dog(String name) {
            super(name);
        }
    }'''
    elif topic == 'Super':
        body = '''    public static void main(String[] args) {
        Car car = new Car("Honda", 2023);
        car.printDetails();
    }

    static class Vehicle {
        String brand;
        int year;

        Vehicle(String brand, int year) {
            this.brand = brand;
            this.year = year;
        }
    }

    static class Car extends Vehicle {
        Car(String brand, int year) {
            super(brand, year);
        }

        void printDetails() {
            System.out.println("Car: " + brand + " " + year);
        }
    }'''
    elif topic == 'MethodOverriding':
        body = '''    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.makeSound();
    }

    static class Animal {
        void makeSound() {
            System.out.println("Animal sound");
        }
    }

    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Meow");
        }
    }'''
    elif topic == 'ToString':
        body = '''    public static void main(String[] args) {
        Product product = new Product("Headphones", 79.99);
        System.out.println(product);
    }

    static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{name='" + name + "', price=" + price + "}";
        }
    }'''
    elif topic == 'Abstraction':
        body = '''    public static void main(String[] args) {
        Shape shape = new Circle(3.0);
        System.out.println("Area: " + shape.area());
    }

    static abstract class Shape {
        abstract double area();
    }

    static class Circle extends Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }'''
    elif topic == 'Interfaces':
        body = '''    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.drive();
    }

    interface Vehicle {
        void drive();
    }

    static class Car implements Vehicle {
        @Override
        public void drive() {
            System.out.println("Car is driving.");
        }
    }'''
    elif topic == 'Polymorphism':
        body = '''    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
    }

    static class Animal {
        void makeSound() {
            System.out.println("Animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks.");
        }
    }'''
    elif topic == 'RuntimePolymorphism':
        body = '''    public static void main(String[] args) {
        Shape shape = new Square(4);
        System.out.println("Square area: " + shape.area());
    }

    static abstract class Shape {
        abstract int area();
    }

    static class Square extends Shape {
        int side;
        Square(int side) {
            this.side = side;
        }

        @Override
        int area() {
            return side * side;
        }
    }'''
    elif topic == 'GettersSetters':
        body = '''    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Lina");
        person.setAge(24);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }

    static class Person {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age >= 0) {
                this.age = age;
            }
        }
    }'''
    elif topic == 'Aggregation':
        body = '''    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Car car = new Car(engine, "Mustang");
        System.out.println(car.name + " uses engine " + car.engine.type);
    }

    static class Engine {
        String type;

        Engine(String type) {
            this.type = type;
        }
    }

    static class Car {
        Engine engine;
        String name;

        Car(Engine engine, String name) {
            this.engine = engine;
            this.name = name;
        }
    }'''
    elif topic == 'Composition':
        body = '''    public static void main(String[] args) {
        Book book = new Book("Java Guide");
        System.out.println(book.title + " has author " + book.author.name);
    }

    static class Author {
        String name;

        Author(String name) {
            this.name = name;
        }
    }

    static class Book {
        String title;
        Author author;

        Book(String title) {
            this.title = title;
            this.author = new Author("BroCode");
        }
    }'''
    elif topic == 'WrapperClasses':
        body = '''    public static void main(String[] args) {
        Integer number = 10; // wrapper for int
        Double price = 4.99; // wrapper for double

        int sum = number + 5; // unboxing
        System.out.println("Sum: " + sum);

        String text = "123";
        int parsed = Integer.parseInt(text);
        System.out.println("Parsed int: " + parsed);
    }'''
    elif topic == 'ArrayLists':
        body = '''    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits list size: " + fruits.size());
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }'''
    elif topic == 'ExceptionHandling':
        body = '''    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        } finally {
            System.out.println("This always runs.");
        }
    }'''
    elif topic == 'WriteFiles':
        body = '''    public static void main(String[] args) {
        String filename = "notes_example.txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Java notes file example.\\n");
            writer.write("Write files using FileWriter and try-with-resources.\\n");
            System.out.println("File written: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }'''
    elif topic == 'ReadFiles':
        body = '''    public static void main(String[] args) {
        String filename = "notes_example.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }'''
    elif topic == 'DatesAndTimes':
        body = '''    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Today: " + today);
        System.out.println("Now: " + now.format(formatter));
    }'''
    elif topic == 'AnonymousClasses':
        body = '''    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is an anonymous class running.");
            }
        };
        task.run();
    }'''
    elif topic == 'TimerTasks':
        body = '''    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Timer task executed.");
                timer.cancel();
            }
        }, 1000);
    }'''
    elif topic == 'Generics':
        body = '''    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("Java Book");
        System.out.println("Box contains: " + box.getItem());
    }

    static class Box<T> {
        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }'''
    elif topic == 'HashMaps':
        body = '''    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 92);
        scores.put("Bob", 85);

        System.out.println("Alice's score: " + scores.get("Alice"));
        for (String name : scores.keySet()) {
            System.out.println(name + ": " + scores.get(name));
        }
    }'''
    elif topic == 'Enums':
        body = '''    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        System.out.println("Today is " + today);

        if (today == Day.SATURDAY || today == Day.SUNDAY) {
            System.out.println("Weekend!");
        } else {
            System.out.println("Weekday.");
        }
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }'''
    elif topic == 'Threading':
        body = '''    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Thread is running."));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }'''
    elif topic == 'Multithreading':
        body = '''    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
            }
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        thread1.start();
        thread2.start();
    }'''
    else:
        body = f'''    public static void main(String[] args) {{
        System.out.println("Notes for {topic} are under construction.");
    }}'''
    return imports, body

for note_path in notes_files:
    text = note_path.read_text(encoding='utf-8')
    header_end = text.find('*/')
    if header_end != -1:
        header = text[:header_end+2].rstrip() + '\n\n'
    else:
        header = ''

    topic = note_path.stem.replace('Notes_', '')
    imports, body = build_content(topic)
    file_text = header
    if imports:
        file_text += imports + '\n\n'
    file_text += f'public class {note_path.stem} {{\n{body}\n}}\n'
    note_path.write_text(file_text, encoding='utf-8')
    print('rewrote', note_path)
