/*
 * ============================================================
 *  WrapperClasses  |  Module 8  |  Topic 55
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Primitive wrappers This is a fundamental concept in Java programming
 *  that you'll use frequently. Understanding this will help you
 *  write better code and solve problems more effectively.
 *
 *  WHY DO WE NEED THIS?
 *  This concept is important because it helps organize code,
 *  make programs more efficient, and creates more readable solutions.
 *
 *  HOW TO READ THIS FILE:
 *  - Read each section from top to bottom
 *  - Read the comments - they explain every important line
 *  - Try running this file and watch the output
 *  - Change values and run it again to experiment
 *  - When done, move to Exercise_WrapperClasses.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #55
 * ============================================================
 */

public class Notes_WrapperClasses {
    public static void main(String[] args) {
        Integer number = 10; // wrapper for int
        Double price = 4.99; // wrapper for double

        int sum = number + 5; // unboxing
        System.out.println("Sum: " + sum);

        String text = "123";
        int parsed = Integer.parseInt(text);
        System.out.println("Parsed int: " + parsed);
    }
}
