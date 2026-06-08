/*
 * ============================================================
 *  StringMethods  |  Module 3  |  Topic 13
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  String methods manipulate text This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_StringMethods.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #13
 * ============================================================
 */

public class Notes_StringMethods {
    public static void main(String[] args) {
        String text = "Java is powerful";

        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Replace: " + text.replace("powerful", "fun"));
        System.out.println("Contains 'Java': " + text.contains("Java"));
    }
}
