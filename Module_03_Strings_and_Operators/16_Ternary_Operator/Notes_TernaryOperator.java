/*
 * ============================================================
 *  TernaryOperator  |  Module 3  |  Topic 16
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Shorthand if-else statement This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_TernaryOperator.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #16
 * ============================================================
 */

public class Notes_TernaryOperator {
    public static void main(String[] args) {
        int points = 85;
        String result = points >= 75 ? "Pass" : "Fail";

        System.out.println("Points: " + points);
        System.out.println("Result: " + result);

        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println("Max value: " + max);
    }
}
