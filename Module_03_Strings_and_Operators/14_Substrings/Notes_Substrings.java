/*
 * ============================================================
 *  Substrings  |  Module 3  |  Topic 14
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Extract parts of strings This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_Substrings.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #14
 * ============================================================
 */

public class Notes_Substrings {
    public static void main(String[] args) {
        String word = "substring";

        System.out.println("First 3 letters: " + word.substring(0, 3));
        System.out.println("From index 3: " + word.substring(3));
        System.out.println("Second half: " + word.substring(word.length() / 2));
    }
}
