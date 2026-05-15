/*
 * ============================================================
 *  VARIABLES IN JAVA  |  Module 01  |  Topic 02
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Variables are like labeled boxes where you store information.
 *  Imagine you have boxes for different things: one for your age,
 *  one for your name, one for your favorite color. Variables work
 *  the same way - they hold different types of data that your
 *  program can use and change.
 *
 *  WHY DO WE NEED THIS?
 *  Without variables, you'd have to type the same values over and
 *  over. Variables make your code reusable and dynamic. They're
 *  essential for storing user input, calculations, and program state.
 *
 *  HOW TO READ THIS FILE:
 *  - Read each section top to bottom
 *  - Every line has a comment explaining what it does
 *  - Try changing the values and re-running to experiment
 *  - After reading, go to Exercise_Variables.java and try it yourself
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #02 at timestamp
 * ============================================================
 */

// ── SECTION 1: WHAT ARE VARIABLES? ─────────────────────────
// Variables are containers for storing data values
// They have a type, name, and value
// Like boxes with labels that hold different things

public class Notes_Variables {
    public static void main(String[] args) {

        // ── SECTION 2: DECLARING VARIABLES ────────────────────
        // Declaration: telling Java we want to create a variable
        // Syntax: dataType variableName;

        int age;        // Declared but not assigned - holds garbage value
        String name;    // String variables store text
        double gpa;     // double stores decimal numbers
        char grade;     // char stores single characters
        boolean isStudent; // boolean stores true/false

        // ── SECTION 3: ASSIGNING VALUES ───────────────────────
        // Assignment: giving a variable its value
        // Use the = operator

        age = 21;              // Assign integer value
        name = "Bro Code";      // Assign string (use double quotes)
        gpa = 3.8;             // Assign decimal number
        grade = 'A';           // Assign character (use single quotes)
        isStudent = true;      // Assign boolean value

        // ── SECTION 4: DECLARATION + ASSIGNMENT ──────────────
        // You can do both in one line (recommended)

        int year = 2024;           // Integer variable
        String food = "Pizza";     // String variable
        double price = 19.99;      // Double variable
        char currency = '$';       // Character variable
        boolean forSale = true;    // Boolean variable

        // ── SECTION 5: USING VARIABLES ───────────────────────
        // Once assigned, use variables in your code

        System.out.println("Age: " + age);           // Print variable value
        System.out.println("Name: " + name);         // Concatenate with text
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
        System.out.println("Is student: " + isStudent);

        // ── SECTION 6: VARIABLE NAMING RULES ─────────────────
        // 1. Start with letter, underscore, or dollar sign
        // 2. Can contain letters, numbers, underscores, dollar signs
        // 3. Case sensitive (myVar != myvar)
        // 4. No spaces allowed
        // 5. No reserved words (int, class, etc.)

        // Good naming examples:
        String firstName = "John";      // camelCase for multi-word
        int userAge = 25;              // descriptive names
        double averageScore = 85.5;    // clear purpose

        // Bad naming examples (don't do this):
        // int a = 5;                    // too vague
        // String NAME = "Bob";          // all caps usually for constants
        // double my variable = 3.14;    // spaces not allowed

        // ── SECTION 7: CHANGING VARIABLE VALUES ─────────────
        // Variables can be reassigned new values

        int score = 85;        // Initial value
        System.out.println("Initial score: " + score);

        score = 95;            // Change the value
        System.out.println("Updated score: " + score);

        // You can also use the variable in calculations
        score = score + 5;     // Add 5 to current score
        System.out.println("Final score: " + score);

        // ── SECTION 8: DISPLAYING VARIABLES ──────────────────
        // Different ways to print variables

        System.out.println("Hello " + name + "!");              // Concatenation
        System.out.println("You are " + age + " years old.");   // Multiple variables
        System.out.println(food + " costs " + currency + price); // Mixed types
    }
}

// ── KEY TAKEAWAYS ──────────────────────────────────────────
// 1. Variables store data and have type, name, and value
// 2. Declare with: dataType variableName;
// 3. Assign with: variableName = value;
// 4. Combine both: dataType variableName = value;
// 5. Use descriptive names following camelCase
// 6. Variables can be reassigned new values

// ── NEXT STEP ──────────────────────────────────────────────
// Now open Exercise_Variables.java and complete the exercises!