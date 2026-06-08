/*
 * ============================================================
 *  MathClass  |  Module 2  |  Topic 9
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Math class has mathematical functions This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_MathClass.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #9
 * ============================================================
 */

public class Notes_MathClass {
    public static void main(String[] args) {
        double value = -3.7;

        System.out.println("Absolute value: " + Math.abs(value));
        System.out.println("Rounded value: " + Math.round(value));
        System.out.println("Square root of 16: " + Math.sqrt(16));
        System.out.println("Power: 2^5 = " + Math.pow(2, 5));
        System.out.println("Max of 7 and 12: " + Math.max(7, 12));
    }
}
