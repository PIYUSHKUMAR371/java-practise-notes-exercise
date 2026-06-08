/*
 * ============================================================
 *  VariableScope  |  Module 5  |  Topic 28
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Where variables can be used This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_VariableScope.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #28
 * ============================================================
 */

public class Notes_VariableScope {
    static int classLevel = 10; // class-level variable

    public static void main(String[] args) {
        int methodLevel = 5; // method-level variable
        System.out.println("classLevel: " + classLevel);
        System.out.println("methodLevel: " + methodLevel);
        printScope();
    }

    static void printScope() {
        int local = 3;
        System.out.println("local: " + local);
    }
}
