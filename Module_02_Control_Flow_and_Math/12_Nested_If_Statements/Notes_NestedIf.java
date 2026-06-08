/*
 * ============================================================
 *  NestedIf  |  Module 2  |  Topic 12
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  If statements inside if statements This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_NestedIf.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #12
 * ============================================================
 */

public class Notes_NestedIf {
    public static void main(String[] args) {
        int age = 18;
        boolean hasTicket = true;

        if (age >= 18) {
            if (hasTicket) {
                System.out.println("You can enter the event.");
            } else {
                System.out.println("You need a ticket.");
            }
        } else {
            System.out.println("You must be at least 18.");
        }
    }
}
