/*
 * ============================================================
 *  Varargs  |  Module 6  |  Topic 34
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Variable length arguments This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_Varargs.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #34
 * ============================================================
 */

public class Notes_Varargs {
    public static void main(String[] args) {
        System.out.println("Sum: " + sum(1, 2, 3, 4));
        System.out.println("Sum: " + sum(10, 20));
    }

    static int sum(int... values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
}
