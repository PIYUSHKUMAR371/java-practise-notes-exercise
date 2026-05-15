/*
 * ============================================================
 *  USER INPUT IN JAVA  |  Module 01  |  Topic 03
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  User input is how your program talks to the user! Instead of
 *  hardcoding values, you can ask the user for information.
 *  Think of it like a conversation - your program asks questions,
 *  the user types answers, and your program remembers them.
 *  This makes programs interactive and personalized.
 *
 *  WHY DO WE NEED THIS?
 *  Static programs are boring! User input makes apps useful -
 *  calculators, games, forms, etc. Without input, every user
 *  would get the same experience. Input makes programs dynamic.
 *
 *  HOW TO READ THIS FILE:
 *  - Read each section top to bottom
 *  - Every line has a comment explaining what it does
 *  - Try changing the values and re-running to experiment
 *  - After reading, go to Exercise_UserInput.java and try it yourself
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #03 at timestamp
 * ============================================================
 */

import java.util.Scanner; // Import the Scanner class for user input

public class Notes_UserInput {
    public static void main(String[] args) {

        // ── SECTION 1: WHAT IS SCANNER? ────────────────────────
        // Scanner is a tool that reads user input from the console
        // It's like a microphone that listens to what the user types
        // We need to import java.util.Scanner at the top

        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        // System.in means "read from the console/keyboard"

        // ── SECTION 2: READING STRINGS ────────────────────────
        // nextLine() reads a whole line of text including spaces

        System.out.println("What is your name?"); // Ask the user
        String name = scanner.nextLine(); // Wait for user to type and press Enter
        System.out.println("Hello, " + name + "!"); // Use their input

        // ── SECTION 3: READING NUMBERS ────────────────────────
        // nextInt() reads whole numbers
        // nextDouble() reads decimal numbers

        System.out.println("How old are you?");
        int age = scanner.nextInt(); // Read integer input
        System.out.println("You are " + age + " years old!");

        System.out.println("What is your GPA?");
        double gpa = scanner.nextDouble(); // Read decimal input
        System.out.println("Your GPA is " + gpa);

        // ── SECTION 4: COMMON ISSUES ──────────────────────────
        // Problem: Mixing nextInt()/nextDouble() with nextLine()
        // Solution: Add scanner.nextLine() to consume the leftover newline

        System.out.println("Enter your favorite number:");
        int number = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter your favorite color:");
        String color = scanner.nextLine(); // Now this works!

        System.out.println("Your favorite number is " + number);
        System.out.println("Your favorite color is " + color);

        // ── SECTION 5: PRACTICAL EXAMPLE ──────────────────────
        // Let's build a simple profile collector

        System.out.println("\n--- User Profile ---");

        System.out.print("First name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Age: ");
        int userAge = scanner.nextInt();

        System.out.print("Height in cm: ");
        double height = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // Display the collected information
        System.out.println("\n--- Your Profile ---");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + userAge);
        System.out.println("Height: " + height + " cm");
        System.out.println("Student: " + isStudent);

        // ── SECTION 6: CLOSING THE SCANNER ────────────────────
        // Always close the scanner when done to free up resources
        scanner.close(); // Good practice!

        System.out.println("Thank you for the information!");
    }
}

// ── KEY TAKEAWAYS ──────────────────────────────────────────
// 1. Use Scanner to read user input from console
// 2. Import java.util.Scanner at the top
// 3. Create scanner with: Scanner scanner = new Scanner(System.in);
// 4. Use nextLine() for strings, nextInt() for integers, nextDouble() for decimals
// 5. Watch out for newline issues when mixing input types
// 6. Always close the scanner with scanner.close()

// ── NEXT STEP ──────────────────────────────────────────────
// Now open Exercise_UserInput.java and complete the exercises!