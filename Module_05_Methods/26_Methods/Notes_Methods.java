/*
 * ============================================================
 *  Methods  |  Module 5  |  Topic 26
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Methods are reusable code blocks This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_Methods.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #26
 * ============================================================
 */

public class Notes_Methods {
    public static void main(String[] args) {
        greet("Student");
        int sum = add(7, 8);
        System.out.println("7 + 8 = " + sum);
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static int add(int a, int b) {
        return a + b;
    }
}
