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

public class Notes_Variables {
    public static void main(String[] args) {
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
    }
}
