/*
 * ============================================================
 *  Printf  |  Module 2  |  Topic 10
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Format output with printf This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_Printf.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #10
 * ============================================================
 */

public class Notes_Printf {
    public static void main(String[] args) {
        String name = "Alex";
        int score = 95;
        double gpa = 3.85;

        System.out.printf("Name: %s%n", name);
        System.out.printf("Score: %d out of 100%n", score);
        System.out.printf("GPA: %.2f%n", gpa);
        System.out.printf("Result: %s, GPA: %.1f%%%n", "Passed", gpa);

        System.out.println("Use printf when you want aligned and formatted output.");
    }
}
