/*
 * ============================================================
 *  NestedLoops  |  Module 4  |  Topic 25
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Loops inside loops This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_NestedLoops.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #25
 * ============================================================
 */

public class Notes_NestedLoops {
    public static void main(String[] args) {
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println();
        }
    }
}
