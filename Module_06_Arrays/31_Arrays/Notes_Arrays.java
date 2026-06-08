/*
 * ============================================================
 *  Arrays  |  Module 6  |  Topic 31
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Arrays store multiple values This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_Arrays.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #31
 * ============================================================
 */

public class Notes_Arrays {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};

        System.out.println("Array length: " + numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}
