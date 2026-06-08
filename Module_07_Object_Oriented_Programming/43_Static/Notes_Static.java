/*
 * ============================================================
 *  Static  |  Module 7  |  Topic 43
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Static variables and methods This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_Static.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #43
 * ============================================================
 */

public class Notes_Static {
    static int count = 0;

    public static void main(String[] args) {
        count = 5;
        System.out.println("Static count: " + count);
        printCount();
    }

    static void printCount() {
        System.out.println("count from static method: " + count);
    }
}
