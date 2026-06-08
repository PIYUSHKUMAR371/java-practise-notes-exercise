import re
from pathlib import Path

WORKSPACE = Path(r"c:/Users/piyush kumar/OneDrive/Desktop/JAVA/Learn-Java-From-Zero")

NOTE_TOPIC_MAP = {
    'RandomNumbers': {
        'imports': 'import java.util.Random;\n',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of RandomNumbers
        
        System.out.println("Learning: RandomNumbers");
        System.out.println("Topic #8 in Module 2");
        System.out.println("Random numbers are values your program chooses automatically.");
        System.out.println("They are useful for games, selection, and decisions that need surprise.");
        
        Random random = new Random(); // Create a Random object to generate random values
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use RandomNumbers");
        
        int anyInt = random.nextInt(); // any int value
        System.out.println("Random int (any value): " + anyInt);
        
        int zeroToNine = random.nextInt(10); // 0 to 9
        System.out.println("Random int 0-9: " + zeroToNine);
        
        int oneToSix = random.nextInt(6) + 1; // 1 to 6
        System.out.println("Random int 1-6 (dice roll): " + oneToSix);
        
        int tenToThirty = random.nextInt(21) + 10; // 10 to 30
        System.out.println("Random int 10-30: " + tenToThirty);
        
        double randomDouble = random.nextDouble(); // 0.0 to less than 1.0
        System.out.println("Random double 0.0-1.0: " + randomDouble);
        
        boolean randomBoolean = random.nextBoolean(); // true or false
        System.out.println("Random boolean true/false: " + randomBoolean);
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("RandomNumbers is used when building actual applications");
        System.out.println("Examples include dice rolls, random selection, and simple game logic.");
        System.out.println("Use nextInt(max) for 0-based ranges, then add an offset to shift the range.");
        System.out.println("Example: random.nextInt(6) + 1 gives 1-6 for a die roll.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Use java.util.Random to generate random values");
        System.out.println("2. nextInt() returns any int value");
        System.out.println("3. nextInt(n) returns 0 to n-1");
        System.out.println("4. Add a minimum value to shift the range");
        System.out.println("5. nextDouble() returns a decimal from 0.0 up to 1.0");
        System.out.println("6. nextBoolean() returns true or false");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_RandomNumbers.java!");
    }
''',
    },
    'MathClass': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of MathClass
        
        System.out.println("Learning: MathClass");
        System.out.println("Topic #9 in Module 2");
        System.out.println("Math class gives built-in methods for common math tasks.");
        System.out.println("You use it to calculate, compare, round, and transform numbers.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use MathClass");
        
        int a = -12;
        int absValue = Math.abs(a);
        System.out.println("Absolute value of " + a + " is " + absValue);
        
        double x = 3.7;
        System.out.println("Round " + x + " = " + Math.round(x));
        System.out.println("Ceil " + x + " = " + Math.ceil(x));
        System.out.println("Floor " + x + " = " + Math.floor(x));
        
        int b = 5;
        int c = 9;
        System.out.println("Max of " + b + " and " + c + " = " + Math.max(b, c));
        System.out.println("Min of " + b + " and " + c + " = " + Math.min(b, c));
        
        double power = Math.pow(2, 5);
        double root = Math.sqrt(36);
        System.out.println("2 to the power of 5 = " + power);
        System.out.println("Square root of 36 = " + root);
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("MathClass is used when building actual applications");
        System.out.println("Use it for geometry, scores, physics, and any numeric logic.");
        System.out.println("Math methods help keep calculations simple and readable.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Math class has useful static methods");
        System.out.println("2. Use Math.abs, Math.max, Math.min, Math.round, Math.sqrt");
        System.out.println("3. Use Math.pow for exponents");
        System.out.println("4. Math.ceil and Math.floor help with decimals");
        System.out.println("5. This is useful for many real-world calculations");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_MathClass.java!");
    }
''',
    },
    'Printf': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of Printf
        
        System.out.println("Learning: Printf");
        System.out.println("Topic #10 in Module 2");
        System.out.println("Printf lets you format output with placeholders.");
        System.out.println("It is helpful when you want clean and aligned output.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use Printf");
        
        int score = 95;
        double gpa = 3.85;
        String name = "Alex";
        
        System.out.printf("Name: %s%n", name);
        System.out.printf("Score: %d out of 100%n", score);
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.printf("Result: %s, GPA: %.1f%%\n", "Passed", gpa * 25 / 4);
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("Printf is used when building actual applications");
        System.out.println("It makes reports, tables, and logs easier to read.");
        System.out.println("Use %%d for integers, %%f for decimals, and %%s for strings.");
        System.out.println("Use %%.2f to round numbers to two decimal places.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. printf formats output with placeholders");
        System.out.println("2. Use %d for integers, %f for floats, %s for strings");
        System.out.println("3. Use %n or \n for a new line");
        System.out.println("4. Precision like %.2f controls decimal places");
        System.out.println("5. Printf helps create clean real-world output");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_Printf.java!");
    }
''',
    },
    'NestedIf': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of NestedIf
        
        System.out.println("Learning: NestedIf");
        System.out.println("Topic #12 in Module 2");
        System.out.println("Nested if statements let one decision happen inside another.");
        System.out.println("You use them when a choice depends on a previous choice.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use NestedIf");
        
        int age = 18;
        boolean hasTicket = true;
        
        if (age >= 18) {
            if (hasTicket) {
                System.out.println("You can enter the movie.");
            } else {
                System.out.println("You need a ticket to enter.");
            }
        } else {
            System.out.println("You are too young to enter.");
        }
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("NestedIf is used when building actual applications");
        System.out.println("It helps check multiple conditions in order.");
        System.out.println("For example, verify login, then verify permissions.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Nested ifs let one condition exist inside another");
        System.out.println("2. The inner if only runs when the outer if is true");
        System.out.println("3. Use else inside or after nested ifs for fallback logic");
        System.out.println("4. Nested ifs are useful for multi-step decisions");
        System.out.println("5. Keep the logic clear so it is easy to read");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_NestedIf.java!");
    }
''',
    },
    'StringMethods': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of StringMethods
        
        System.out.println("Learning: StringMethods");
        System.out.println("Topic #13 in Module 3");
        System.out.println("String methods let you work with text in Java.");
        System.out.println("You use them to change, inspect, and compare strings.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use StringMethods");
        
        String message = "Hello Java Learners";
        System.out.println("Text: " + message);
        System.out.println("Length: " + message.length());
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Lowercase: " + message.toLowerCase());
        System.out.println("Contains 'Java': " + message.contains("Java"));
        System.out.println("Replace spaces: " + message.replace(" ", "_"));
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("StringMethods is used when building actual applications");
        System.out.println("Text processing, user input, and messages all depend on string methods.");
        System.out.println("Use startsWith and endsWith to validate input formats.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. String methods help inspect and modify text");
        System.out.println("2. Use length(), toUpperCase(), toLowerCase(), contains()");
        System.out.println("3. Use replace() to change parts of text");
        System.out.println("4. Strings are immutable, methods return new strings");
        System.out.println("5. String methods are essential for Java programs");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_StringMethods.java!");
    }
''',
    },
    'Substrings': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of Substrings
        
        System.out.println("Learning: Substrings");
        System.out.println("Topic #14 in Module 3");
        System.out.println("Substrings let you extract part of a string.");
        System.out.println("You use them to get pieces of text by position.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use Substrings");
        
        String word = "JavaProgramming";
        System.out.println("Text: " + word);
        System.out.println("First 4 letters: " + word.substring(0, 4));
        System.out.println("Last 11 letters: " + word.substring(4));
        System.out.println("Middle part: " + word.substring(4, 15));
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("Substrings is used when building actual applications");
        System.out.println("Extract usernames, file types, or fixed-format text.");
        System.out.println("Remember substring(start, end) includes start but excludes end.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Use substring(start, end) to get part of text");
        System.out.println("2. The start index is inclusive, the end index is exclusive");
        System.out.println("3. Use substring(start) to get text to the end");
        System.out.println("4. Substrings work with String positions");
        System.out.println("5. This is useful for parsing and text extraction");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_Substrings.java!");
    }
''',
    },
    'TernaryOperator': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of TernaryOperator
        
        System.out.println("Learning: TernaryOperator");
        System.out.println("Topic #16 in Module 3");
        System.out.println("Ternary operator is a shorter if-else for simple choices.");
        System.out.println("It makes code compact when you select one of two values.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use TernaryOperator");
        
        int score = 82;
        String grade = score >= 75 ? "Pass" : "Fail";
        System.out.println("Score: " + score + " => " + grade);
        
        int number = 7;
        String parity = number % 2 == 0 ? "even" : "odd";
        System.out.println(number + " is " + parity);
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("TernaryOperator is used when building actual applications");
        System.out.println("Use it for simple decisions when you want one of two values.");
        System.out.println("It is common in assignments and output formatting.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Ternary operator is written condition ? value1 : value2");
        System.out.println("2. It is shorter than if-else when choosing between two results");
        System.out.println("3. Use it for simple decisions only");
        System.out.println("4. The result can be assigned to a variable");
        System.out.println("5. It keeps small conditional logic compact");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_TernaryOperator.java!");
    }
''',
    },
    'EnhancedSwitches': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of EnhancedSwitches
        
        System.out.println("Learning: EnhancedSwitches");
        System.out.println("Topic #18 in Module 3");
        System.out.println("Enhanced switch gives a cleaner way to compare values.");
        System.out.println("You can use arrows and multiple labels in one case.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use EnhancedSwitches");
        
        String day = "Saturday";
        String type = switch (day) {
            case "Saturday", "Sunday" -> "Weekend";
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            default -> "Unknown";
        };
        System.out.println(day + " is a " + type);
        
        int month = 12;
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Invalid month";
        };
        System.out.println("Month " + month + " is in " + season);
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("EnhancedSwitches is used when building actual applications");
        System.out.println("It is cleaner than long if-else chains for fixed options.");
        System.out.println("Use it for menus, commands, and value-based routing.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Enhanced switch supports arrow labels and multiple cases");
        System.out.println("2. It can return values directly");
        System.out.println("3. Use default for fallback cases");
        System.out.println("4. It is easier to read than many if-else statements");
        System.out.println("5. Works well for fixed sets of values");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_EnhancedSwitches.java!");
    }
''',
    },
    'LogicalOperators': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of LogicalOperators
        
        System.out.println("Learning: LogicalOperators");
        System.out.println("Topic #20 in Module 3");
        System.out.println("Logical operators combine conditions into one decision.");
        System.out.println("You use them with &&, ||, and ! to build boolean logic.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use LogicalOperators");
        
        boolean hasID = true;
        boolean isAdult = false;
        if (hasID && isAdult) {
            System.out.println("You may enter.");
        } else if (hasID && !isAdult) {
            System.out.println("You need to be older to enter.");
        } else {
            System.out.println("You cannot enter without ID.");
        }
        
        boolean isSunny = true;
        boolean isWarm = false;
        if (isSunny || isWarm) {
            System.out.println("The weather is nice enough to go outside.");
        } else {
            System.out.println("Stay indoors today.");
        }
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("LogicalOperators is used when building actual applications");
        System.out.println("They help combine several conditions into one decision.");
        System.out.println("Use them for validation, filtering, and game rules.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. && means AND, || means OR, ! means NOT");
        System.out.println("2. Use && when all conditions must be true");
        System.out.println("3. Use || when any condition can be true");
        System.out.println("4. Use ! to reverse a boolean value");
        System.out.println("5. Logical operators are essential for decisions");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_LogicalOperators.java!");
    }
''',
    },
    'WhileLoops': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of WhileLoops
        
        System.out.println("Learning: WhileLoops");
        System.out.println("Topic #21 in Module 4");
        System.out.println("While loops repeat code while a condition is true.");
        System.out.println("You use them when you do not know exactly how many times ahead.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use WhileLoops");
        
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("WhileLoops is used when building actual applications");
        System.out.println("It is useful for reading data until there is no more.");
        System.out.println("Use a while loop for menus, input, and repeating tasks.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. while(condition) repeats code while the condition is true");
        System.out.println("2. Change the loop variable so the loop eventually stops");
        System.out.println("3. Use a while loop when you do not know the exact count");
        System.out.println("4. Infinite loops happen if the condition never becomes false");
        System.out.println("5. While loops are common in user interaction and streaming data");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_WhileLoops.java!");
    }
''',
    },
    'ForLoops': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of ForLoops
        
        System.out.println("Learning: ForLoops");
        System.out.println("Topic #23 in Module 4");
        System.out.println("For loops repeat code a fixed number of times.");
        System.out.println("They are great when you know how many repetitions you need.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use ForLoops");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Step " + i);
        }
        
        int[] numbers = {3, 6, 9, 12};
        System.out.println("\nArray values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("ForLoops is used when building actual applications");
        System.out.println("It is useful for counting, iterating arrays, and processing lists.");
        System.out.println("Use a for loop when the number of items is known.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. for(start; condition; update) repeats a fixed number of times");
        System.out.println("2. Use for loops to iterate arrays and ranges");
        System.out.println("3. For loops are easy to read and control");
        System.out.println("4. The index variable changes each time through the loop");
        System.out.println("5. For loops are common in Java programs");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_ForLoops.java!");
    }
''',
    },
    'BreakContinue': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of BreakContinue
        
        System.out.println("Learning: BreakContinue");
        System.out.println("Topic #24 in Module 4");
        System.out.println("Break and continue change loop behavior.");
        System.out.println("Break exits the loop, continue skips to the next iteration.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use BreakContinue");
        
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping " + i);
                continue; // skip this iteration
            }
            if (i == 5) {
                System.out.println("Stopping at " + i);
                break; // leave the loop early
            }
            System.out.println("Value: " + i);
        }
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("BreakContinue is used when building actual applications");
        System.out.println("Use continue to ignore bad input, break to stop early.");
        System.out.println("These keywords make loop logic more flexible.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. break exits the loop immediately");
        System.out.println("2. continue skips the current loop iteration");
        System.out.println("3. use break to stop when a condition is met");
        System.out.println("4. use continue to skip items you do not want to process");
        System.out.println("5. both are useful in loops and should be used carefully");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_BreakContinue.java!");
    }
''',
    },
    'NestedLoops': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of NestedLoops
        
        System.out.println("Learning: NestedLoops");
        System.out.println("Topic #25 in Module 4");
        System.out.println("Nested loops let you put one loop inside another.");
        System.out.println("They are useful for grids, tables, and matrices.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use NestedLoops");
        
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println();
        }
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("NestedLoops is used when building actual applications");
        System.out.println("Use them for tables, boards, and two-dimensional data.");
        System.out.println("They are also useful for comparing every item with every other item.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. One loop can run inside another loop");
        System.out.println("2. Nested loops are useful for rows and columns");
        System.out.println("3. The inner loop runs completely every time the outer loop runs");
        System.out.println("4. Use nested loops for grids, matrices, and tables");
        System.out.println("5. Keep the logic clear to avoid confusion");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_NestedLoops.java!");
    }
''',
    },
    'Methods': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of Methods
        
        System.out.println("Learning: Methods");
        System.out.println("Topic #26 in Module 5");
        System.out.println("Methods let you put code inside a reusable block.");
        System.out.println("You use them to organize logic and avoid repetition.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use Methods");
        
        sayHello();
        System.out.println("Sum: " + addNumbers(5, 7));
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("Methods are used when building actual applications");
        System.out.println("They help split programs into smaller, easier-to-read pieces.");
        System.out.println("Use methods for tasks like printing menus, calculating values, or validating input.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Methods are reusable blocks of code");
        System.out.println("2. Define methods outside main and call them inside main");
        System.out.println("3. Methods can return values or perform actions");
        System.out.println("4. Use methods to simplify and organize programs");
        System.out.println("5. Methods are a building block of Java programs");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_Methods.java!");
    }

    public static void sayHello() {
        System.out.println("Hello from a method!");
    }

    public static int addNumbers(int x, int y) {
        return x + y;
    }
''',
    },
    'OverloadedMethods': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of OverloadedMethods
        
        System.out.println("Learning: OverloadedMethods");
        System.out.println("Topic #27 in Module 5");
        System.out.println("Overloaded methods have the same name but different parameters.");
        System.out.println("You use them when the same action works with different inputs.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use OverloadedMethods");
        
        System.out.println("Sum two numbers: " + add(2, 3));
        System.out.println("Sum three numbers: " + add(2, 3, 4));
        System.out.println("Sum decimals: " + add(1.5, 2.5));
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("OverloadedMethods is used when building actual applications");
        System.out.println("It helps keep the method name consistent while supporting multiple inputs.");
        System.out.println("Use overloaded methods for printing, calculations, and conversions.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Overloaded methods share a name but differ in parameters");
        System.out.println("2. Java chooses the correct version based on arguments");
        System.out.println("3. You can overload by changing parameter count or types");
        System.out.println("4. Overloading makes code easier to use");
        System.out.println("5. It is common in Java standard libraries");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_OverloadedMethods.java!");
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static double add(double x, double y) {
        return x + y;
    }
''',
    },
    'VariableScope': {
        'imports': '',
        'body': '''    public static int classLevel = 10;

    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of VariableScope
        
        System.out.println("Learning: VariableScope");
        System.out.println("Topic #28 in Module 5");
        System.out.println("Variable scope determines where a variable can be used.");
        System.out.println("You use scope rules to keep values in the right place.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use VariableScope");
        
        int localNumber = 5;
        System.out.println("Local number: " + localNumber);
        System.out.println("Class-level number: " + classLevel);
        
        if (localNumber > 0) {
            int innerValue = localNumber * 2;
            System.out.println("Inner value: " + innerValue);
        }
        
        // The next line would be invalid because innerValue is out of scope
        // System.out.println(innerValue);
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("VariableScope is used when building actual applications");
        System.out.println("It helps prevent bugs by keeping variables confined to the right block.");
        System.out.println("Use local variables for temporary data and class fields for shared state.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Variable scope defines where a variable is valid");
        System.out.println("2. Local variables only work inside the block where they are declared");
        System.out.println("3. Class-level variables are available to methods in the class");
        System.out.println("4. Inner blocks can access outer variables but not the other way around");
        System.out.println("5. Keep scope small to avoid confusion");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_VariableScope.java!");
    }
''',
    },
    'Arrays': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of Arrays
        
        System.out.println("Learning: Arrays");
        System.out.println("Topic #31 in Module 6");
        System.out.println("Arrays store multiple values in one variable.");
        System.out.println("You use them when you need a simple list of items.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use Arrays");
        
        int[] numbers = {5, 10, 15, 20};
        System.out.println("Array length: " + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("Arrays is used when building actual applications");
        System.out.println("Use arrays for fixed-size collections of values.");
        System.out.println("They are useful for scores, days, and simple tables.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Arrays hold multiple values in one variable");
        System.out.println("2. Use new Type[size] or {value1, value2} to create arrays");
        System.out.println("3. Access items with index syntax like array[0]");
        System.out.println("4. Use array.length to get the number of items");
        System.out.println("5. Arrays are a basic collection in Java");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_Arrays.java!");
    }
''',
    },
    'InputArray': {
        'imports': 'import java.util.Scanner;\n',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of InputArray
        
        System.out.println("Learning: InputArray");
        System.out.println("Topic #32 in Module 6");
        System.out.println("Input into arrays lets users fill an array with values.");
        System.out.println("You use it when you want dynamic arrays from user input.");
        
        Scanner scanner = new Scanner(System.in);
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        // Here we show practical examples you'll use
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use InputArray");
        
        int[] numbers = new int[3];
        System.out.println("Enter 3 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("You entered:");
        for (int number : numbers) {
            System.out.println(number);
        }
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        // See how this concept is used in real programs
        
        System.out.println("\nReal World Use:");
        System.out.println("InputArray is used when building actual applications");
        System.out.println("Use it to collect scores, names, or settings from users.");
        System.out.println("Remember to close Scanner when done to free resources.");
        
        scanner.close();
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Use Scanner to read user values into an array");
        System.out.println("2. Create the array with a fixed size before filling it");
        System.out.println("3. Use a loop to store each user input");
        System.out.println("4. Print the array values after input");
        System.out.println("5. Close the scanner when finished");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_InputArray.java!");
    }
''',
    },
    'SearchArray': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of SearchArray
        
        System.out.println("Learning: SearchArray");
        System.out.println("Topic #33 in Module 6");
        System.out.println("Search an array to find a specific value.");
        System.out.println("You use it when you need to check whether an item exists.");
        
        int[] numbers = {5, 8, 12, 20};
        int target = 12;
        boolean found = false;
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use SearchArray");
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found " + target + " at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(target + " was not found.");
        }
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("SearchArray is used when building actual applications");
        System.out.println("Use it to look up values, names, or IDs in a list.");
        System.out.println("A simple loop can find the first matching item.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Search an array with a loop");
        System.out.println("2. Compare each item to the target value");
        System.out.println("3. Use break to stop when found");
        System.out.println("4. Use a boolean flag to record the result");
        System.out.println("5. Searching arrays is a common task");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_SearchArray.java!");
    }
''',
    },
    'Varargs': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of Varargs
        
        System.out.println("Learning: Varargs");
        System.out.println("Topic #34 in Module 6");
        System.out.println("Varargs lets a method accept a variable number of arguments.");
        System.out.println("You use it when the number of inputs can change.");
        
        // ── SECTION 2: EXAMPLE USAGE ────────────────────────────
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use Varargs");
        
        System.out.println("Sum of 2 numbers: " + sum(3, 5));
        System.out.println("Sum of 4 numbers: " + sum(1, 2, 3, 4));
        System.out.println("Sum of 0 numbers: " + sum());
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("Varargs is used when building actual applications");
        System.out.println("Use it for methods like print(), format(), or math operations.");
        System.out.println("Varargs keep the method easy to call with different counts.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Varargs use three dots after the type: int... values");
        System.out.println("2. The method treats the arguments like an array");
        System.out.println("3. You can call it with any number of values");
        System.out.println("4. Varargs are useful for flexible methods");
        System.out.println("5. They help avoid multiple overloaded methods");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_Varargs.java!");
    }

    public static int sum(int... values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
''',
    },
    '2DArrays': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of 2DArrays
        
        System.out.println("Learning: 2DArrays");
        System.out.println("Topic #35 in Module 6");
        System.out.println("2D arrays store values in rows and columns.");
        System.out.println("You use them for grids, tables, and matrices.");
        
        int[][] table = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use 2DArrays");
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.print(table[row][col] + " ");
            }
            System.out.println();
        }
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("2DArrays is used when building actual applications");
        System.out.println("Use them for game boards, matrices, and tables.");
        System.out.println("Each row is an array inside the outer array.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. 2D arrays have rows and columns");
        System.out.println("2. Use array[row][col] to access values");
        System.out.println("3. The outer array holds inner arrays");
        System.out.println("4. Nested loops are useful with 2D arrays");
        System.out.println("5. 2D arrays are common for grid-style data");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_2DArrays.java!");
    }
''',
    },
    'OverloadedConstructors': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of OverloadedConstructors
        
        System.out.println("Learning: OverloadedConstructors");
        System.out.println("Topic #41 in Module 7");
        System.out.println("Overloaded constructors let a class be created in different ways.");
        System.out.println("You use them to provide multiple ways to build objects.");
        
        Person person1 = new Person("Anna");
        Person person2 = new Person("Ben", 25);
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use OverloadedConstructors");
        System.out.println(person1.name + " is " + person1.age + " years old.");
        System.out.println(person2.name + " is " + person2.age + " years old.");
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("OverloadedConstructors is used when building actual applications");
        System.out.println("Use them to create objects with different initial details.");
        System.out.println("For example, default users or users with full profile data.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Constructors create objects from classes");
        System.out.println("2. Overloaded constructors use the same name but different parameters");
        System.out.println("3. They help build objects with default or custom values");
        System.out.println("4. Use this() to call another constructor if needed");
        System.out.println("5. Overloaded constructors improve flexibility");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_OverloadedConstructors.java!");
    }

    static class Person {
        String name;
        int age;

        Person(String name) {
            this.name = name;
            this.age = 18;
        }

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
''',
    },
    'ArrayOfObjects': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of ArrayOfObjects
        
        System.out.println("Learning: ArrayOfObjects");
        System.out.println("Topic #42 in Module 7");
        System.out.println("Arrays of objects store objects in a list.");
        System.out.println("You use them when you need multiple object instances.");
        
        Student[] students = {
            new Student("Emma", 90),
            new Student("Noah", 85),
            new Student("Liam", 92)
        };
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use ArrayOfObjects");
        for (Student student : students) {
            System.out.println(student.name + " scored " + student.score);
        }
        
        System.out.println("\nReal World Use:");
        System.out.println("ArrayOfObjects is used when building actual applications");
        System.out.println("It helps group related objects, like students, products, or users.");
        System.out.println("You can loop through the array and access each object.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. An array can hold object references");
        System.out.println("2. Each array element can be a separate object");
        System.out.println("3. Use a loop to process the objects in the array");
        System.out.println("4. Arrays of objects are useful for related data sets");
        System.out.println("5. They are common in object-oriented programs");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_ArrayOfObjects.java!");
    }

    static class Student {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
''',
    },
    'Static': {
        'imports': '',
        'body': '''    public static int count = 0;

    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of Static
        
        System.out.println("Learning: Static");
        System.out.println("Topic #43 in Module 7");
        System.out.println("Static means the member belongs to the class, not the object.");
        System.out.println("You use static fields and methods for shared data and helpers.");
        
        count++;
        System.out.println("Static count: " + count);
        printMessage();
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("Static is used when building actual applications");
        System.out.println("Use static methods for utility functions and shared values.");
        System.out.println("Static fields can store configuration or counters.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Static members belong to the class, not an instance");
        System.out.println("2. Use static methods to call without creating an object");
        System.out.println("3. Use static fields for shared values across all objects");
        System.out.println("4. Static variables can be useful for counters and constants");
        System.out.println("5. Static is a core concept in Java classes");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_Static.java!");
    }

    public static void printMessage() {
        System.out.println("This is a static method.");
    }
''',
    },
    'Super': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of Super
        
        System.out.println("Learning: Super");
        System.out.println("Topic #45 in Module 7");
        System.out.println("super lets a subclass call the parent class constructor or members.");
        System.out.println("You use it to reuse and extend inherited behavior.");
        
        Student student = new Student("Emma", 20);
        student.printInfo();
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("Super is used when building actual applications");
        System.out.println("It helps subclasses initialize parent data and reuse methods.");
        System.out.println("Use super() in constructors when extending classes.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Use super() to call the parent constructor");
        System.out.println("2. Use super.member to access parent members");
        System.out.println("3. super is useful when extending a class");
        System.out.println("4. It helps share and customize behavior");
        System.out.println("5. Super is part of Java inheritance");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_Super.java!");
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }

    static class Student extends Person {
        int age;

        Student(String name, int age) {
            super(name);
            this.age = age;
        }

        void printInfo() {
            System.out.println(name + " is " + age + " years old.");
        }
    }
''',
    },
    'ToString': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of ToString
        
        System.out.println("Learning: ToString");
        System.out.println("Topic #47 in Module 7");
        System.out.println("toString returns a text description of an object.");
        System.out.println("You use it to print objects in a readable way.");
        
        Book book = new Book("Java Basics", "Alice");
        System.out.println(book);
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("ToString is used when building actual applications");
        System.out.println("It helps display object data without manually formatting every field.");
        System.out.println("Most Java objects use toString for debugging and logs.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Override toString() to return a string describing the object");
        System.out.println("2. Printing an object calls its toString() method");
        System.out.println("3. toString() makes debugging and output easier");
        System.out.println("4. Use it for custom object formats");
        System.out.println("5. It is a common pattern in Java classes");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_ToString.java!");
    }

    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "Book{title='" + title + "', author='" + author + "'}";
        }
    }
''',
    },
    'Abstraction': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of Abstraction
        
        System.out.println("Learning: Abstraction");
        System.out.println("Topic #48 in Module 7");
        System.out.println("Abstraction hides details and shows the important parts.");
        System.out.println("You use abstract classes to define a common template.");
        
        Animal dog = new Dog();
        dog.makeSound();
        
        Animal cat = new Cat();
        cat.makeSound();
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("Abstraction is used when building actual applications");
        System.out.println("It lets you define behavior without specifying every detail.");
        System.out.println("Use abstract classes when subclasses share common methods.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Abstract classes can define methods without implementation");
        System.out.println("2. Subclasses must implement abstract methods");
        System.out.println("3. Abstraction helps organize common behavior");
        System.out.println("4. It hides implementation details from users");
        System.out.println("5. It is useful in object-oriented design");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_Abstraction.java!");
    }

    abstract static class Animal {
        abstract void makeSound();
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog says: Woof woof!");
        }
    }

    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Cat says: Meow!");
        }
    }
''',
    },
    'Interfaces': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of Interfaces
        
        System.out.println("Learning: Interfaces");
        System.out.println("Topic #49 in Module 7");
        System.out.println("Interfaces define methods that classes must implement.");
        System.out.println("You use them to create shared behavior across different classes.");
        
        Playable guitar = new Guitar();
        guitar.play();
        
        Playable piano = new Piano();
        piano.play();
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("Interfaces are used when building actual applications");
        System.out.println("They let different objects support the same actions.");
        System.out.println("Use interfaces for plugins, callbacks, and common APIs.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Interfaces declare methods without implementation");
        System.out.println("2. Classes implement interfaces and define the methods");
        System.out.println("3. Interfaces support multiple types with shared behavior");
        System.out.println("4. Use interfaces for flexible and reusable code");
        System.out.println("5. They are a key part of Java design");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_Interfaces.java!");
    }

    interface Playable {
        void play();
    }

    static class Guitar implements Playable {
        public void play() {
            System.out.println("Playing guitar: Strum strum");
        }
    }

    static class Piano implements Playable {
        public void play() {
            System.out.println("Playing piano: Ding ding");
        }
    }
''',
    },
    'Polymorphism': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of Polymorphism
        
        System.out.println("Learning: Polymorphism");
        System.out.println("Topic #50 in Module 7");
        System.out.println("Polymorphism means many forms for a single reference type.");
        System.out.println("You use it when objects share a parent type but behave differently.");
        
        Shape shape = new Circle();
        shape.draw();
        
        shape = new Rectangle();
        shape.draw();
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("Polymorphism is used when building actual applications");
        System.out.println("It lets code work with a general type while using specific behavior.");
        System.out.println("Use it for shapes, animals, and reusable object interfaces.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Polymorphism lets a parent type refer to child objects");
        System.out.println("2. The actual method run depends on the object's class");
        System.out.println("3. It makes code more flexible and extensible");
        System.out.println("4. Use it with inheritance or interfaces");
        System.out.println("5. It is a core object-oriented principle");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_Polymorphism.java!");
    }

    static class Shape {
        void draw() {
            System.out.println("Drawing a shape");
        }
    }

    static class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a circle");
        }
    }

    static class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a rectangle");
        }
    }
''',
    },
    'RuntimePolymorphism': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of RuntimePolymorphism
        
        System.out.println("Learning: RuntimePolymorphism");
        System.out.println("Topic #51 in Module 7");
        System.out.println("Runtime polymorphism chooses the method at run time.");
        System.out.println("You use it when a single reference type can hold many object types.");
        
        Animal animal = new Dog();
        makeSound(animal);
        animal = new Cat();
        makeSound(animal);
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("RuntimePolymorphism is used when building actual applications");
        System.out.println("It lets code call the correct method for each subclass.");
        System.out.println("Use it to handle different behaviors through a common interface.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Runtime polymorphism happens when methods are chosen at run time");
        System.out.println("2. A parent reference can point to child objects");
        System.out.println("3. Override methods in subclasses to customize behavior");
        System.out.println("4. This makes code more flexible and reusable");
        System.out.println("5. It is used in many Java APIs and frameworks");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_RuntimePolymorphism.java!");
    }

    static void makeSound(Animal animal) {
        animal.sound();
    }

    static class Animal {
        void sound() {
            System.out.println("Some animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks: Woof!");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Cat meows: Meow!");
        }
    }
''',
    },
    'GettersSetters': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of GettersSetters
        
        System.out.println("Learning: GettersSetters");
        System.out.println("Topic #52 in Module 7");
        System.out.println("Getters and setters let you control access to private fields.");
        System.out.println("You use them to protect data and allow validation.");
        
        Person person = new Person();
        person.setName("Tom");
        person.setAge(22);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("GettersSetters is used when building actual applications");
        System.out.println("They help protect fields and keep object data safe.");
        System.out.println("Use them for validation and controlled access.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Use private fields to hide object data");
        System.out.println("2. Getters return field values");
        System.out.println("3. Setters change field values with validation");
        System.out.println("4. They help make classes safer and easier to maintain");
        System.out.println("5. Getters and setters are common in Java classes");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_GettersSetters.java!");
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
    }
''',
    },
    'Aggregation': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of Aggregation
        
        System.out.println("Learning: Aggregation");
        System.out.println("Topic #53 in Module 7");
        System.out.println("Aggregation is when one object uses another object.");
        System.out.println("You use it when objects are related but have their own life cycles.");
        
        Engine engine = new Engine("V6");
        Car car = new Car(engine);
        car.printDetails();
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("Aggregation is used when building actual applications");
        System.out.println("A car has an engine, but the engine may exist separately.");
        System.out.println("It is a way to connect objects without owning them completely.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Aggregation means one object contains another object");
        System.out.println("2. The contained object can exist independently");
        System.out.println("3. Use it when objects are related but not tightly coupled");
        System.out.println("4. It models real-world relationships well");
        System.out.println("5. Aggregation is a common object-oriented pattern");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_Aggregation.java!");
    }

    static class Engine {
        String type;

        Engine(String type) {
            this.type = type;
        }
    }

    static class Car {
        Engine engine;

        Car(Engine engine) {
            this.engine = engine;
        }

        void printDetails() {
            System.out.println("Car with engine: " + engine.type);
        }
    }
''',
    },
    'Composition': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of Composition
        
        System.out.println("Learning: Composition");
        System.out.println("Topic #54 in Module 7");
        System.out.println("Composition is when one object owns another object.");
        System.out.println("You use it when the contained object is part of the container.");
        
        Room[] rooms = {new Room("Kitchen"), new Room("Bedroom")};
        House house = new House(rooms);
        house.printRooms();
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("Composition is used when building actual applications");
        System.out.println("A house owns rooms, and rooms do not exist without the house.");
        System.out.println("It models strong ownership in object-oriented code.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Composition means objects are tightly linked");
        System.out.println("2. The owned object does not normally exist alone");
        System.out.println("3. Use it when one object is part of another");
        System.out.println("4. It helps model whole-part relationships");
        System.out.println("5. Composition is another object-oriented pattern");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_Composition.java!");
    }

    static class Room {
        String name;

        Room(String name) {
            this.name = name;
        }
    }

    static class House {
        Room[] rooms;

        House(Room[] rooms) {
            this.rooms = rooms;
        }

        void printRooms() {
            System.out.println("House rooms:");
            for (Room room : rooms) {
                System.out.println(room.name);
            }
        }
    }
''',
    },
    'WrapperClasses': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of WrapperClasses
        
        System.out.println("Learning: WrapperClasses");
        System.out.println("Topic #55 in Module 8");
        System.out.println("Wrapper classes let primitive values behave like objects.");
        System.out.println("You use them when you need methods or collections with primitives.");
        
        Integer number = Integer.valueOf(100);
        int primitive = number.intValue();
        System.out.println("Wrapper value: " + number);
        System.out.println("Primitive value: " + primitive);
        
        Double decimal = Double.parseDouble("3.14");
        System.out.println("Parsed double: " + decimal);
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("WrapperClasses is used when building actual applications");
        System.out.println("They let you store numbers and booleans in collections like ArrayList.");
        System.out.println("Use parse methods to convert text to primitive values.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Wrapper classes are object versions of primitive types");
        System.out.println("2. Use Integer, Double, Boolean, etc. when objects are needed");
        System.out.println("3. Autoboxing converts primitives to wrappers automatically");
        System.out.println("4. Unboxing converts wrapper objects back to primitives");
        System.out.println("5. Wrapper classes are useful for collections and parsing");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_WrapperClasses.java!");
    }
''',
    },
    'ArrayLists': {
        'imports': 'import java.util.ArrayList;\n',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of ArrayLists
        
        System.out.println("Learning: ArrayLists");
        System.out.println("Topic #56 in Module 8");
        System.out.println("ArrayLists are resizable arrays that grow as needed.");
        System.out.println("You use them when you need a list that can change size.");
        
        ArrayList<String> shopping = new ArrayList<>();
        shopping.add("Milk");
        shopping.add("Eggs");
        shopping.add("Bread");
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use ArrayLists");
        for (String item : shopping) {
            System.out.println(item);
        }
        
        shopping.remove("Eggs");
        System.out.println("After remove: " + shopping);
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("ArrayLists is used when building actual applications");
        System.out.println("Use them for dynamic lists, menus, and collected data.");
        System.out.println("ArrayList makes it easy to add, remove, and search items.");
        
        System.out.println("\nSize: " + shopping.size());
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. ArrayList can grow and shrink at runtime");
        System.out.println("2. Use add() to add items and remove() to remove them");
        System.out.println("3. Use size() to get the number of elements");
        System.out.println("4. ArrayList stores object references, not primitives");
        System.out.println("5. It is a common collection in Java");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_ArrayLists.java!");
    }
''',
    },
    'ExceptionHandling': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of ExceptionHandling
        
        System.out.println("Learning: ExceptionHandling");
        System.out.println("Topic #57 in Module 8");
        System.out.println("Exception handling catches errors so the program can continue.");
        System.out.println("You use try and catch to handle problems safely.");
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use ExceptionHandling");
        
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
        
        try {
            int number = Integer.parseInt("abc");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("ExceptionHandling is used when building actual applications");
        System.out.println("It helps keep your program running even when input or files fail.");
        System.out.println("Catch specific exceptions to handle each error correctly.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Use try and catch to handle exceptions");
        System.out.println("2. Catch specific exception types when possible");
        System.out.println("3. Exception handling prevents crashes");
        System.out.println("4. You can use finally to run code every time");
        System.out.println("5. It is essential for robust Java programs");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_ExceptionHandling.java!");
    }
''',
    },
    'WriteFiles': {
        'imports': 'import java.io.FileWriter;\nimport java.io.IOException;\n',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of WriteFiles
        
        System.out.println("Learning: WriteFiles");
        System.out.println("Topic #58 in Module 8");
        System.out.println("Write files lets your program save text to a file.");
        System.out.println("You use it when you want to preserve output or records.");
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use WriteFiles");
        
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello from Java!\n");
            writer.write("This text is saved to a file.\n");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Unable to write to file: " + e.getMessage());
        }
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("WriteFiles is used when building actual applications");
        System.out.println("Use it for logs, reports, and data storage.");
        System.out.println("Try-with-resources ensures the file is closed automatically.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Use FileWriter to write text files");
        System.out.println("2. Wrap file writing in try/catch for IOException");
        System.out.println("3. Try-with-resources auto-closes the file");
        System.out.println("4. Writing files is useful for persistent storage");
        System.out.println("5. Always handle file errors gracefully");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_WriteFiles.java!");
    }
''',
    },
    'ReadFiles': {
        'imports': 'import java.io.BufferedReader;\nimport java.io.FileReader;\nimport java.io.IOException;\n',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of ReadFiles
        
        System.out.println("Learning: ReadFiles");
        System.out.println("Topic #59 in Module 8");
        System.out.println("Read files lets your program load text from a file.");
        System.out.println("You use it when you want to read saved data or configuration.");
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use ReadFiles");
        
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Unable to read file: " + e.getMessage());
        }
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("ReadFiles is used when building actual applications");
        System.out.println("Use it to load configuration, data, and user history.");
        System.out.println("BufferedReader reads the file line by line efficiently.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Use FileReader and BufferedReader to read files");
        System.out.println("2. Read lines in a loop until null");
        System.out.println("3. Handle IOException when reading files");
        System.out.println("4. Reading files is useful for loading saved data");
        System.out.println("5. Close the reader or use try-with-resources");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_ReadFiles.java!");
    }
''',
    },
    'DatesAndTimes': {
        'imports': 'import java.time.LocalDate;\nimport java.time.LocalDateTime;\nimport java.time.LocalTime;\nimport java.time.format.DateTimeFormatter;\n',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of DatesAndTimes
        
        System.out.println("Learning: DatesAndTimes");
        System.out.println("Topic #62 in Module 8");
        System.out.println("Dates and times help your program work with calendars and clocks.");
        System.out.println("You use them when you need current dates, times, or formatting.");
        
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime now = LocalDateTime.now();
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use DatesAndTimes");
        System.out.println("Today: " + today);
        System.out.println("Time: " + time);
        System.out.println("Now: " + now);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Formatted now: " + now.format(formatter));
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("DatesAndTimes is used when building actual applications");
        System.out.println("Use them for logs, event scheduling, and timestamps.");
        System.out.println("Formatting makes dates readable for people.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Use LocalDate, LocalTime, and LocalDateTime for date and time");
        System.out.println("2. Use DateTimeFormatter to format dates and times");
        System.out.println("3. now() gives the current date/time");
        System.out.println("4. Dates and times are useful for schedules and logs");
        System.out.println("5. The java.time package is modern and recommended in Java");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_DatesAndTimes.java!");
    }
''',
    },
    'AnonymousClasses': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of AnonymousClasses
        
        System.out.println("Learning: AnonymousClasses");
        System.out.println("Topic #63 in Module 8");
        System.out.println("Anonymous classes let you define a class without a name.");
        System.out.println("You use them when you need a one-time object implementation.");
        
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class running.");
            }
        };
        task.run();
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("AnonymousClasses is used when building actual applications");
        System.out.println("Use them for event listeners and quick implementations.");
        System.out.println("They are handy when a full named class is not needed.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Anonymous classes are defined without a name");
        System.out.println("2. They are useful for single-use objects");
        System.out.println("3. Use them with interfaces or abstract classes");
        System.out.println("4. They are common with Runnable and listeners");
        System.out.println("5. They keep code compact for one-time behavior");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_AnonymousClasses.java!");
    }
''',
    },
    'TimerTasks': {
        'imports': 'import java.util.Timer;\nimport java.util.TimerTask;\n',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of TimerTasks
        
        System.out.println("Learning: TimerTasks");
        System.out.println("Topic #64 in Module 8");
        System.out.println("TimerTask schedules code to run after a delay.");
        System.out.println("You use it for timed events and repeated actions.");
        
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Timer task executed.");
                timer.cancel();
            }
        }, 1000);
        
        System.out.println("Timer scheduled, waiting for task...");
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("TimerTasks is used when building actual applications");
        System.out.println("Use it for alarms, reminders, and repeated jobs.");
        System.out.println("TimerTask runs code in the future without manual waiting.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Timer schedules tasks for later execution");
        System.out.println("2. TimerTask defines the code to run");
        System.out.println("3. Use schedule(task, delay) for one-time events");
        System.out.println("4. Cancel the timer when finished to stop it");
        System.out.println("5. TimerTasks are useful for timed actions");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_TimerTasks.java!");
    }
''',
    },
    'Generics': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of Generics
        
        System.out.println("Learning: Generics");
        System.out.println("Topic #66 in Module 9");
        System.out.println("Generics let you create classes and methods for many types.");
        System.out.println("You use them to write safer and reusable code.");
        
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println("Box holds: " + stringBox.get());
        
        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println("Box holds: " + intBox.get());
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("Generics is used when building actual applications");
        System.out.println("Use them for collections, wrappers, and reusable helpers.");
        System.out.println("Generics prevent type errors at compile time.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Generics work with types like Box<T> and List<T>");
        System.out.println("2. They keep code type-safe and reusable");
        System.out.println("3. Use type parameters for classes and methods");
        System.out.println("4. Generics avoid casts and ClassCastException");
        System.out.println("5. They are a powerful Java feature");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_Generics.java!");
    }

    static class Box<T> {
        private T value;

        public void set(T value) {
            this.value = value;
        }

        public T get() {
            return value;
        }
    }
''',
    },
    'HashMaps': {
        'imports': 'import java.util.HashMap;\nimport java.util.Map;\n',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of HashMaps
        
        System.out.println("Learning: HashMaps");
        System.out.println("Topic #67 in Module 9");
        System.out.println("HashMap stores key-value pairs for fast lookup.");
        System.out.println("You use it when you need to find values by keys.");
        
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 92);
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use HashMaps");
        System.out.println("Alice's score: " + scores.get("Alice"));
        
        System.out.println("All values:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("HashMaps is used when building actual applications");
        System.out.println("Use them for lookups, counts, and data associations.");
        System.out.println("HashMap is fast for finding values by keys.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. HashMap stores keys and values together");
        System.out.println("2. Use put(key, value) and get(key)");
        System.out.println("3. Iterate with entrySet() to see all pairs");
        System.out.println("4. Keys should be unique in a HashMap");
        System.out.println("5. HashMap is useful for fast lookups");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_HashMaps.java!");
    }
''',
    },
    'Enums': {
        'imports': '',
        'body': '''    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of Enums
        
        System.out.println("Learning: Enums");
        System.out.println("Topic #68 in Module 9");
        System.out.println("Enums define a fixed set of constants.");
        System.out.println("You use them when a value should only be one of a few choices.");
        
        Day today = Day.WEDNESDAY;
        System.out.println("Today is " + today);
        
        System.out.println("\nBasic Example:");
        System.out.println("This demonstrates how to use Enums");
        
        switch (today) {
            case SATURDAY, SUNDAY -> System.out.println("It's the weekend!");
            default -> System.out.println("It's a weekday.");
        }
        
        System.out.println("All days:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("Enums is used when building actual applications");
        System.out.println("Use them for fixed categories like states, seasons, or roles.");
        System.out.println("They make code safer than string constants.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Enums list fixed constant values");
        System.out.println("2. Use EnumType.VALUE to refer to one of them");
        System.out.println("3. Switch can handle enum values cleanly");
        System.out.println("4. Enums are better than plain strings for fixed choices");
        System.out.println("5. They are useful for configuration and states");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_Enums.java!");
    }
''',
    },
    'Threading': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of Threading
        
        System.out.println("Learning: Threading");
        System.out.println("Topic #69 in Module 9");
        System.out.println("A thread is a path of execution in a program.");
        System.out.println("You use it when you want code to run separately from the main flow.");
        
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running.");
            }
        });
        thread.start();
        
        System.out.println("Main method continues while the thread runs.");
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("Threading is used when building actual applications");
        System.out.println("Use threads for background tasks like loading data.");
        System.out.println("Each thread can run a different task at the same time.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Threading runs code in parallel threads");
        System.out.println("2. Use Thread and Runnable to create a thread");
        System.out.println("3. start() begins the thread");
        System.out.println("4. Threading is useful for background work");
        System.out.println("5. Be careful with shared data in threads");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_Threading.java!");
    }
''',
    },
    'Multithreading': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── SECTION 1: BASIC CONCEPT ────────────────────────────
        // This section introduces the core idea of Multithreading
        
        System.out.println("Learning: Multithreading");
        System.out.println("Topic #70 in Module 9");
        System.out.println("Multithreading runs multiple threads at the same time.");
        System.out.println("You use it when you need several tasks to happen concurrently.");
        
        Thread first = new Thread(new MessageTask("First thread"));
        Thread second = new Thread(new MessageTask("Second thread"));
        first.start();
        second.start();
        
        System.out.println("Main method finished.");
        
        // ── SECTION 3: REAL WORLD APPLICATION ───────────────────
        System.out.println("\nReal World Use:");
        System.out.println("Multithreading is used when building actual applications");
        System.out.println("Use it for games, servers, and background processing.");
        System.out.println("Multiple threads can do work at the same time.");
        
        // ── KEY TAKEAWAYS ───────────────────────────────────────
        System.out.println("\n=== WHAT YOU LEARNED ===");
        System.out.println("1. Multithreading uses more than one thread simultaneously");
        System.out.println("2. Each thread runs its own code path");
        System.out.println("3. Use Runnable or Thread subclasses");
        System.out.println("4. Multithreading is useful for responsive programs");
        System.out.println("5. Synchronization may be needed for shared data");
        
        // ── NEXT STEP ───────────────────────────────────────────
        System.out.println("\n✓ Ready? Go to Exercise_Multithreading.java!");
    }

    static class MessageTask implements Runnable {
        private final String message;

        MessageTask(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            System.out.println(message + " is running.");
        }
    }
''',
    },
}

EXERCISE_TOPIC_MAP = {
    'RandomNumbers': {
        'imports': 'import java.util.Random;\n',
        'body': '''    public static void main(String[] args) {
        
        // ── EXERCISE 1 ⭐ ──────────────────────────────────────
        // Task: Create a basic example using RandomNumbers
        // Expected: Some meaningful output
        // Hint: Look at the Notes file to see the pattern
        
        System.out.println("Exercise 1: " + "RandomNumbers Example");
        Random random = new Random();
        int randomValue = random.nextInt(100);
        System.out.println("Random number 0-99: " + randomValue);
        
        // ── EXERCISE 2 ⭐⭐ ────────────────────────────────────
        // Task: Implement something slightly more complex
        // Expected: Show that you understand the concept
        // Hint: Combine what you learned with previous topics
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        int roll = random.nextInt(6) + 1;
        System.out.println("Dice roll: " + roll);
        if (roll == 6) {
            System.out.println("You rolled the highest number!");
        } else {
            System.out.println("Try again to roll a 6.");
        }
        
        // ── EXERCISE 3 ⭐⭐⭐ ──────────────────────────────────
        // Task: Create your own implementation
        // Expected: Something original using RandomNumbers
        // Hint: Think about how this could be used in a real app
        
        System.out.println("\nExercise 3: Advanced Challenge");
        String[] items = {"apple", "banana", "cherry", "date", "fig"};
        int index = random.nextInt(items.length);
        System.out.println("Random fruit picker: " + items[index]);
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'MathClass': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        // ── EXERCISE 1 ⭐ ──────────────────────────────────────
        System.out.println("Exercise 1: " + "MathClass Example");
        System.out.println("Absolute of -8 = " + Math.abs(-8));
        
        // ── EXERCISE 2 ⭐⭐ ────────────────────────────────────
        System.out.println("\nExercise 2: Intermediate Challenge");
        double value = 7.2;
        System.out.println("Round " + value + " = " + Math.round(value));
        System.out.println("Square root of 49 = " + Math.sqrt(49));
        
        // ── EXERCISE 3 ⭐⭐⭐ ──────────────────────────────────
        System.out.println("\nExercise 3: Advanced Challenge");
        int x = 12;
        int y = 5;
        System.out.println("Max: " + Math.max(x, y));
        System.out.println("Min: " + Math.min(x, y));
        System.out.println("2^3 = " + Math.pow(2, 3));
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'Printf': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Printf Example");
        System.out.printf("Name: %s, Age: %d%n", "Alex", 22);
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        double price = 15.6789;
        System.out.printf("Price: %.2f USD%n", price);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        String title = "Java";
        int quantity = 3;
        System.out.printf("Ordered %d copies of %s.%n", quantity, title);
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'NestedIf': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "NestedIf Example");
        int age = 20;
        boolean hasID = true;
        if (age >= 18) {
            if (hasID) {
                System.out.println("Entry allowed.");
            } else {
                System.out.println("Entry denied: no ID.");
            }
        } else {
            System.out.println("Entry denied: too young.");
        }
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        int score = 80;
        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 70) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C or below.");
        }
        
        System.out.println("\nExercise 3: Advanced Challenge");
        boolean isMember = true;
        int points = 120;
        if (isMember) {
            if (points >= 100) {
                System.out.println("Gold member");
            } else {
                System.out.println("Silver member");
            }
        } else {
            System.out.println("No membership.");
        }
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'StringMethods': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "StringMethods Example");
        String text = "hello java";
        System.out.println(text.toUpperCase());
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println("Contains 'java': " + text.contains("java"));
        System.out.println("Replace spaces: " + text.replace(" ", "_"));
        
        System.out.println("\nExercise 3: Advanced Challenge");
        System.out.println("First 5 chars: " + text.substring(0, 5));
        System.out.println("Length: " + text.length());
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'Substrings': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Substrings Example");
        String word = "JavaProgramming";
        System.out.println(word.substring(0, 4));
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println(word.substring(4, 15));
        
        System.out.println("\nExercise 3: Advanced Challenge");
        int length = word.length();
        System.out.println("Last 4 letters: " + word.substring(length - 4));
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'TernaryOperator': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "TernaryOperator Example");
        int score = 75;
        String result = score >= 60 ? "Pass" : "Fail";
        System.out.println(result);
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        int number = 4;
        String type = number % 2 == 0 ? "Even" : "Odd";
        System.out.println(number + " is " + type);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        boolean isMember = true;
        int discount = isMember ? 10 : 0;
        System.out.println("Discount: " + discount + "%");
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'EnhancedSwitches': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "EnhancedSwitches Example");
        String day = "Sunday";
        String type = switch (day) {
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Weekday";
        };
        System.out.println(type);
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        int month = 7;
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Invalid";
        };
        System.out.println(season);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        String status = "open";
        String message = switch (status) {
            case "open" -> "Shop is open.";
            case "closed" -> "Shop is closed.";
            default -> "Status unknown.";
        };
        System.out.println(message);
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'LogicalOperators': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "LogicalOperators Example");
        boolean rain = true;
        boolean umbrella = false;
        if (rain && umbrella) {
            System.out.println("Go outside.");
        } else {
            System.out.println("Stay inside.");
        }
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        boolean hungry = true;
        boolean tired = false;
        if (hungry || tired) {
            System.out.println("Take a break.");
        } else {
            System.out.println("Keep working.");
        }
        
        System.out.println("\nExercise 3: Advanced Challenge");
        boolean isWeekend = true;
        boolean hasWork = false;
        if (isWeekend && !hasWork) {
            System.out.println("Relax today.");
        } else {
            System.out.println("Plan your day.");
        }
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'WhileLoops': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "WhileLoops Example");
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        int sum = 0;
        int count = 1;
        while (count <= 5) {
            sum += count;
            count++;
        }
        System.out.println("Sum 1-5: " + sum);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        int number = 5;
        int factorial = 1;
        while (number > 0) {
            factorial *= number;
            number--;
        }
        System.out.println("5! = " + factorial);
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'ForLoops': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "ForLoops Example");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum 1-5: " + sum);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        String[] animals = {"cat", "dog", "bird"};
        for (int i = 0; i < animals.length; i++) {
            System.out.println("Animal " + (i + 1) + ": " + animals[i]);
        }
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'BreakContinue': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "BreakContinue Example");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        
        System.out.println("\nExercise 3: Advanced Challenge");
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd: " + i);
        }
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'NestedLoops': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "NestedLoops Example");
        for (int row = 1; row <= 2; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print(row * col + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\nExercise 3: Advanced Challenge");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'Methods': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Methods Example");
        greet();
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println("Product: " + multiply(4, 5));
        
        System.out.println("\nExercise 3: Advanced Challenge");
        System.out.println("Square of 6: " + square(6));
        
        System.out.println("\n✓ All exercises completed!");
    }

    public static void greet() {
        System.out.println("Hello from a method!");
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int square(int x) {
        return x * x;
    }
''',
    },
    'OverloadedMethods': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "OverloadedMethods Example");
        System.out.println("3 + 4 = " + add(3, 4));
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println("3 + 4 + 5 = " + add(3, 4, 5));
        
        System.out.println("\nExercise 3: Advanced Challenge");
        System.out.println("1.5 + 2.5 = " + add(1.5, 2.5));
        
        System.out.println("\n✓ All exercises completed!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }
''',
    },
    'VariableScope': {
        'imports': '',
        'body': '''    public static int globalValue = 10;

    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "VariableScope Example");
        int localValue = 5;
        System.out.println("Global: " + globalValue + ", Local: " + localValue);
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        if (localValue > 0) {
            int innerValue = localValue * 2;
            System.out.println("Inner value: " + innerValue);
        }
        
        System.out.println("\nExercise 3: Advanced Challenge");
        printValue();
        
        System.out.println("\n✓ All exercises completed!");
    }

    public static void printValue() {
        System.out.println("Accessing global value: " + globalValue);
    }
''',
    },
    'Arrays': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Arrays Example");
        int[] nums = {1, 2, 3};
        System.out.println(nums[1]);
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Value[" + i + "]=" + nums[i]);
        }
        
        System.out.println("\nExercise 3: Advanced Challenge");
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        System.out.println("Total = " + total);
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'InputArray': {
        'imports': 'import java.util.Scanner;\n',
        'body': '''    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercise 1: " + "InputArray Example");
        int[] values = new int[2];
        values[0] = scanner.nextInt();
        values[1] = scanner.nextInt();
        System.out.println("Read: " + values[0] + ", " + values[1]);
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        int sum = values[0] + values[1];
        System.out.println("Sum = " + sum);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        System.out.println("Average = " + (double) sum / values.length);
        
        scanner.close();
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'SearchArray': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "SearchArray Example");
        int[] numbers = {2, 4, 6, 8};
        int target = 6;
        boolean found = false;
        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }
        System.out.println("Found = " + found);
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("Index = " + index);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        int search = 7;
        found = false;
        for (int number : numbers) {
            if (number == search) {
                found = true;
            }
        }
        System.out.println(search + " found? " + found);
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'Varargs': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Varargs Example");
        System.out.println("Sum = " + sum(2, 3));
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println("Sum = " + sum(1, 2, 3, 4));
        
        System.out.println("\nExercise 3: Advanced Challenge");
        System.out.println("Sum = " + sum(5, 10, 15, 20, 25));
        
        System.out.println("\n✓ All exercises completed!");
    }

    public static int sum(int... values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
''',
    },
    '2DArrays': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "2DArrays Example");
        int[][] grid = {{1, 2}, {3, 4}};
        System.out.println(grid[1][1]);
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nExercise 3: Advanced Challenge");
        int total = 0;
        for (int[] row : grid) {
            for (int value : row) {
                total += value;
            }
        }
        System.out.println("Total = " + total);
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'OverloadedConstructors': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "OverloadedConstructors Example");
        Person p1 = new Person("Sara");
        System.out.println(p1.name + " " + p1.age);
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        Person p2 = new Person("Joe", 30);
        System.out.println(p2.name + " " + p2.age);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        Person p3 = new Person("Mia", 25);
        System.out.println(p3.name + " " + p3.age);
        
        System.out.println("\n✓ All exercises completed!");
    }

    static class Person {
        String name;
        int age;

        Person(String name) {
            this.name = name;
            this.age = 18;
        }

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
''',
    },
    'ArrayOfObjects': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "ArrayOfObjects Example");
        Student[] students = {new Student("A", 80), new Student("B", 90)};
        System.out.println(students[0].name + " " + students[0].score);
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        for (Student student : students) {
            System.out.println(student.name + " " + student.score);
        }
        
        System.out.println("\nExercise 3: Advanced Challenge");
        students[0].score += 5;
        System.out.println("Updated: " + students[0].name + " " + students[0].score);
        
        System.out.println("\n✓ All exercises completed!");
    }

    static class Student {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
''',
    },
    'Static': {
        'imports': '',
        'body': '''    public static int value = 5;

    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Static Example");
        System.out.println("Value: " + value);
        printStatic();
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        value += 3;
        System.out.println("Updated: " + value);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        System.out.println("Squared: " + square(value));
        
        System.out.println("\n✓ All exercises completed!");
    }

    public static void printStatic() {
        System.out.println("Static method called.");
    }

    public static int square(int x) {
        return x * x;
    }
''',
    },
    'Super': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Super Example");
        Student student = new Student("Lara", 21);
        student.printInfo();
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println(student.name + " is " + student.age);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        student.sayHello();
        
        System.out.println("\n✓ All exercises completed!");
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }

    static class Student extends Person {
        int age;

        Student(String name, int age) {
            super(name);
            this.age = age;
        }

        void printInfo() {
            System.out.println(name + " " + age);
        }

        void sayHello() {
            System.out.println("Hello, " + name + "!");
        }
    }
''',
    },
    'ToString': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "ToString Example");
        Book book = new Book("Java", "Sam");
        System.out.println(book);
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println(book.toString());
        
        System.out.println("\nExercise 3: Advanced Challenge");
        Book book2 = new Book("Code", "Ann");
        System.out.println(book2);
        
        System.out.println("\n✓ All exercises completed!");
    }

    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "Book{" + "title='" + title + "', author='" + author + "'}";
        }
    }
''',
    },
    'Abstraction': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Abstraction Example");
        Animal dog = new Dog();
        dog.makeSound();
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        Animal cat = new Cat();
        cat.makeSound();
        
        System.out.println("\nExercise 3: Advanced Challenge");
        printSound(new Dog());
        
        System.out.println("\n✓ All exercises completed!");
    }

    static void printSound(Animal animal) {
        animal.makeSound();
    }

    abstract static class Animal {
        abstract void makeSound();
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Woof!");
        }
    }

    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Meow!");
        }
    }
''',
    },
    'Interfaces': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Interfaces Example");
        Playable piano = new Piano();
        piano.play();
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        Playable guitar = new Guitar();
        guitar.play();
        
        System.out.println("\nExercise 3: Advanced Challenge");
        performPlay(new Piano());
        
        System.out.println("\n✓ All exercises completed!");
    }

    static void performPlay(Playable playable) {
        playable.play();
    }

    interface Playable {
        void play();
    }

    static class Piano implements Playable {
        public void play() {
            System.out.println("Playing piano.");
        }
    }

    static class Guitar implements Playable {
        public void play() {
            System.out.println("Playing guitar.");
        }
    }
''',
    },
    'Polymorphism': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Polymorphism Example");
        Shape circle = new Circle();
        circle.draw();
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        Shape rectangle = new Rectangle();
        rectangle.draw();
        
        System.out.println("\nExercise 3: Advanced Challenge");
        printShape(new Circle());
        
        System.out.println("\n✓ All exercises completed!");
    }

    static void printShape(Shape shape) {
        shape.draw();
    }

    static class Shape {
        void draw() {
            System.out.println("Drawing shape");
        }
    }

    static class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing circle");
        }
    }

    static class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing rectangle");
        }
    }
''',
    },
    'RuntimePolymorphism': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "RuntimePolymorphism Example");
        Animal animal = new Dog();
        animal.sound();
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        animal = new Cat();
        animal.sound();
        
        System.out.println("\nExercise 3: Advanced Challenge");
        makeSound(new Dog());
        
        System.out.println("\n✓ All exercises completed!");
    }

    static void makeSound(Animal animal) {
        animal.sound();
    }

    static class Animal {
        void sound() {
            System.out.println("Some sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Woof!");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Meow!");
        }
    }
''',
    },
    'GettersSetters': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "GettersSetters Example");
        Person p = new Person();
        p.setName("Sam");
        p.setAge(28);
        System.out.println(p.getName() + " " + p.getAge());
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        p.setAge(30);
        System.out.println("Updated age: " + p.getAge());
        
        System.out.println("\nExercise 3: Advanced Challenge");
        System.out.println("Name length: " + p.getName().length());
        
        System.out.println("\n✓ All exercises completed!");
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
    }
''',
    },
    'Aggregation': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Aggregation Example");
        Engine engine = new Engine("V8");
        Car car = new Car(engine);
        car.printEngine();
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println("Engine type: " + car.engine.type);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        System.out.println("Car has an engine: " + (car.engine != null));
        
        System.out.println("\n✓ All exercises completed!");
    }

    static class Engine {
        String type;

        Engine(String type) {
            this.type = type;
        }
    }

    static class Car {
        Engine engine;

        Car(Engine engine) {
            this.engine = engine;
        }

        void printEngine() {
            System.out.println("Engine: " + engine.type);
        }
    }
''',
    },
    'Composition': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Composition Example");
        Room[] rooms = {new Room("Kitchen"), new Room("Hall")};
        House house = new House(rooms);
        house.printRooms();
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println("Room count: " + house.rooms.length);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        house.printRooms();
        
        System.out.println("\n✓ All exercises completed!");
    }

    static class Room {
        String name;

        Room(String name) {
            this.name = name;
        }
    }

    static class House {
        Room[] rooms;

        House(Room[] rooms) {
            this.rooms = rooms;
        }

        void printRooms() {
            for (Room room : rooms) {
                System.out.println(room.name);
            }
        }
    }
''',
    },
    'WrapperClasses': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "WrapperClasses Example");
        Integer number = 100;
        System.out.println("Boxed: " + number);
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        int value = number + 20;
        System.out.println("Unboxed sum: " + value);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        int parsed = Integer.parseInt("123");
        System.out.println("Parsed int: " + parsed);
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'ArrayLists': {
        'imports': 'import java.util.ArrayList;\n',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "ArrayLists Example");
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list);
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        list.remove("Apple");
        System.out.println(list);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        list.add("Cherry");
        for (String item : list) {
            System.out.println(item);
        }
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'ExceptionHandling': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "ExceptionHandling Example");
        try {
            int result = 10 / 2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        }
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        try {
            int number = Integer.parseInt("12a");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number.");
        }
        
        System.out.println("\nExercise 3: Advanced Challenge");
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Null value found.");
        }
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'WriteFiles': {
        'imports': 'import java.io.FileWriter;\nimport java.io.IOException;\n',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "WriteFiles Example");
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("Example text\n");
            System.out.println("Written example.txt");
        } catch (IOException e) {
            System.out.println("Write error");
        }
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        try (FileWriter writer = new FileWriter("example.txt", true)) {
            writer.write("More text\n");
            System.out.println("Appended text");
        } catch (IOException e) {
            System.out.println("Append error");
        }
        
        System.out.println("\nExercise 3: Advanced Challenge");
        try (FileWriter writer = new FileWriter("example2.txt")) {
            writer.write("Another file\n");
            System.out.println("Created example2.txt");
        } catch (IOException e) {
            System.out.println("Write error");
        }
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'ReadFiles': {
        'imports': 'import java.io.BufferedReader;\nimport java.io.FileReader;\nimport java.io.IOException;\n',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "ReadFiles Example");
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("Read error");
        }
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Read error");
        }
        
        System.out.println("\nExercise 3: Advanced Challenge");
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            int count = 0;
            while (reader.readLine() != null) {
                count++;
            }
            System.out.println("Lines: " + count);
        } catch (IOException e) {
            System.out.println("Read error");
        }
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'DatesAndTimes': {
        'imports': 'import java.time.LocalDate;\nimport java.time.LocalDateTime;\nimport java.time.format.DateTimeFormatter;\n',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "DatesAndTimes Example");
        LocalDate date = LocalDate.now();
        System.out.println(date);
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        
        System.out.println("\nExercise 3: Advanced Challenge");
        LocalDateTime future = now.plusDays(7);
        System.out.println("One week later: " + future.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'AnonymousClasses': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "AnonymousClasses Example");
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task running.");
            }
        };
        task.run();
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        Runnable greet = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class.");
            }
        };
        greet.run();
        
        System.out.println("\nExercise 3: Advanced Challenge");
        Runnable bye = new Runnable() {
            @Override
            public void run() {
                System.out.println("Goodbye.");
            }
        };
        bye.run();
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'TimerTasks': {
        'imports': 'import java.util.Timer;\nimport java.util.TimerTask;\n',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "TimerTasks Example");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Timer executed.");
                timer.cancel();
            }
        }, 100);
        
        System.out.println("Timer started.");
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        Timer timer2 = new Timer();
        timer2.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Another timer.");
                timer2.cancel();
            }
        }, 100);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        Timer timer3 = new Timer();
        timer3.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Third timer.");
                timer3.cancel();
            }
        }, 100);
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'Generics': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Generics Example");
        Box<String> box = new Box<>();
        box.set("Hello");
        System.out.println(box.get());
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println(intBox.get());
        
        System.out.println("\nExercise 3: Advanced Challenge");
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);
        System.out.println(doubleBox.get());
        
        System.out.println("\n✓ All exercises completed!");
    }

    static class Box<T> {
        private T value;

        public void set(T value) {
            this.value = value;
        }

        public T get() {
            return value;
        }
    }
''',
    },
    'HashMaps': {
        'imports': 'import java.util.HashMap;\n',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "HashMaps Example");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        System.out.println(map.get("A"));
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        map.put("B", 2);
        System.out.println(map);
        
        System.out.println("\nExercise 3: Advanced Challenge");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'Enums': {
        'imports': '',
        'body': '''    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }

    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Enums Example");
        Day day = Day.MONDAY;
        System.out.println(day);
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println(day.name());
        
        System.out.println("\nExercise 3: Advanced Challenge");
        for (Day d : Day.values()) {
            System.out.println(d);
        }
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'Threading': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Threading Example");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running.");
            }
        });
        thread.start();
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println("Main continues.");
        
        System.out.println("\nExercise 3: Advanced Challenge");
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Second thread.");
            }
        });
        thread2.start();
        
        System.out.println("\n✓ All exercises completed!");
    }
''',
    },
    'Multithreading': {
        'imports': '',
        'body': '''    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Multithreading Example");
        Thread t1 = new Thread(new MessageTask("One"));
        Thread t2 = new Thread(new MessageTask("Two"));
        t1.start();
        t2.start();
        
        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println("Threads started.");
        
        System.out.println("\nExercise 3: Advanced Challenge");
        Thread t3 = new Thread(new MessageTask("Three"));
        t3.start();
        
        System.out.println("\n✓ All exercises completed!");
    }

    static class MessageTask implements Runnable {
        private final String msg;

        MessageTask(String msg) {
            this.msg = msg;
        }

        @Override
        public void run() {
            System.out.println("Thread " + msg + " is running.");
        }
    }
''',
    },
}

NOTE_FILES = []
EXERCISE_FILES = []

for path in WORKSPACE.rglob('Notes_*.java'):
    NOTE_FILES.append(path)
for path in WORKSPACE.rglob('Exercise_*.java'):
    EXERCISE_FILES.append(path)

NOTE_FILES.sort()
EXERCISE_FILES.sort()

PLACEHOLDER_NOTE = re.compile(r"This demonstrates how to use")
PLACEHOLDER_EXERCISE = re.compile(r"Write your code here")


def read_file(path):
    return path.read_text(encoding='utf-8')


def write_file(path, content):
    path.write_text(content, encoding='utf-8')


def build_file_content(original, topic, mapping, is_note=True):
    lines = original.splitlines()
    header_end = 0
    class_line = None
    for i, line in enumerate(lines):
        if line.startswith('public class ') or line.startswith('public enum ') or line.startswith('public interface '):
            header_end = i
            class_line = line
            break
        if line.startswith('import '):
            header_end = i + 1
    if class_line is None:
        return original

    header = '\n'.join(lines[:header_end])
    rest_lines = lines[header_end:]
    class_decl = rest_lines[0]
    imports = mapping.get('imports', '')
    body = mapping['body']

    if imports:
        if header.strip().endswith('*/'):
            new_content = header + '\n' + imports + '\n' + class_decl + '\n' + body
        else:
            new_content = header + '\n' + imports + class_decl + '\n' + body
    else:
        new_content = header + '\n' + class_decl + '\n' + body
    return new_content


def process_files(file_list, placeholder_pattern, mapping_dict, is_note=True):
    for path in file_list:
        content = read_file(path)
        if is_note and not placeholder_pattern.search(content):
            continue
        if not is_note and not placeholder_pattern.search(content):
            continue
        topic = path.stem.replace('Notes_', '').replace('Exercise_', '')
        if topic not in mapping_dict:
            print(f"No mapping for {topic}")
            continue
        new_content = build_file_content(content, topic, mapping_dict[topic], is_note)
        write_file(path, new_content)
        print(f"Updated {path}")

if __name__ == '__main__':
    process_files(NOTE_FILES, PLACEHOLDER_NOTE, NOTE_TOPIC_MAP, is_note=True)
    process_files(EXERCISE_FILES, PLACEHOLDER_EXERCISE, EXERCISE_TOPIC_MAP, is_note=False)
    print('Done')
