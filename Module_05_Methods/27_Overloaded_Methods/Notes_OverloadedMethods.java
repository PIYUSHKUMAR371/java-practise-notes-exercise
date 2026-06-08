/*
 * ============================================================
 *  OverloadedMethods  |  Module 5  |  Topic 27
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Same name, different parameters This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_OverloadedMethods.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #27
 * ============================================================
 */

public class Notes_OverloadedMethods {
    public static void main(String[] args) {
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
    }
}
