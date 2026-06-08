/*
 * ============================================================
 *  BreakContinue  |  Module 4  |  Topic 24
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Break and continue in loops This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_BreakContinue.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #24
 * ============================================================
 */

public class Notes_BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Found 5, stopping loop.");
                break;
            }
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd number: " + i);
        }
    }
}
