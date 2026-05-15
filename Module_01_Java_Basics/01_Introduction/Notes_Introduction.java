/*
 * ============================================================
 *  INTRODUCTION TO JAVA  |  Module 01  |  Topic 01
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Welcome to Java programming! Java is like a powerful toolbox
 *  that lets you build amazing things like apps, websites, and games.
 *  Think of Java as a universal language that computers all over the
 *  world can understand. Just like how English is spoken globally,
 *  Java code can run on Windows, Mac, Linux, and even phones!
 *
 *  WHY DO WE NEED THIS?
 *  Java is used everywhere - from Android apps to big company systems.
 *  Learning Java gives you superpowers to create anything you imagine.
 *  It's like learning to cook - once you know the basics, you can make
 *  simple meals or gourmet feasts!
 *
 *  HOW TO READ THIS FILE:
 *  - Read each section top to bottom
 *  - Every line has a comment explaining what it does
 *  - Try changing the values and re-running to experiment
 *  - After reading, go to Exercise_Introduction.java and try it yourself
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #01 at 0:00
 * ============================================================
 */

// ── SECTION 1: WHAT IS JAVA? ─────────────────────────────
// Java is a programming language created by James Gosling at Sun Microsystems
// It's object-oriented, meaning we organize code like real-world objects
// Java code gets compiled to bytecode that runs on any machine with JVM

// ── SECTION 2: YOUR FIRST JAVA PROGRAM ───────────────────
// Every Java program needs a class (like a blueprint) and a main method (entry point)
// The main method is where your program starts running

public class Notes_Introduction { // This is our class - like a container for our code
    public static void main(String[] args) { // This is the main method - program starts here
        // System.out.println() prints text to the console (black screen)
        System.out.println("Hello, World!"); // Prints "Hello, World!" and moves to next line
        System.out.println("Welcome to Java programming!"); // Another message

        // We can also print without moving to next line using print()
        System.out.print("This is on the same line ");
        System.out.println("as this text!");

        // ── SECTION 3: BASIC SYNTAX ──────────────────────────
        // Java statements end with semicolons ;
        // Code is organized in blocks using curly braces { }
        // Comments help explain what code does - like this one!

        // Variables store data - we'll learn more in the next topic
        String name = "Java Learner"; // String stores text
        int year = 2024; // int stores whole numbers

        System.out.println("Hello, " + name + "! It's " + year + ".");

        // ── SECTION 4: WHY JAVA IS GREAT ─────────────────────
        // 1. Platform independent - write once, run anywhere
        // 2. Object-oriented - organizes code like real world
        // 3. Secure - built-in security features
        // 4. Rich libraries - tons of pre-built tools
        // 5. Huge community - lots of help available

        System.out.println("Java is:");
        System.out.println("- Platform independent");
        System.out.println("- Object-oriented");
        System.out.println("- Secure and reliable");
        System.out.println("- Used by millions worldwide");
    }
}

// ── KEY TAKEAWAYS ──────────────────────────────────────────
// 1. Java programs need a class with a main method to run
// 2. System.out.println() displays text to the user
// 3. Code is organized in classes and methods
// 4. Java is platform independent - runs on any computer

// ── NEXT STEP ──────────────────────────────────────────────
// Now open Exercise_Introduction.java and complete the exercises!