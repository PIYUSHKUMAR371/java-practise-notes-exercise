/*
 * ============================================================
 *  Threading  |  Module 9  |  Topic 69
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Threading basics This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_Threading.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #69
 * ============================================================
 */

public class Notes_Threading {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Thread is running."));
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}
