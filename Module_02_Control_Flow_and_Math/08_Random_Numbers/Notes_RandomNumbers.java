/*
 * ============================================================
 *  RandomNumbers  |  Module 2  |  Topic 8
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Generate random numbers This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_RandomNumbers.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #8
 * ============================================================
 */

import java.util.Random;

public class Notes_RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int roll = random.nextInt(6) + 1; // random number 1-6
        System.out.println("Dice roll: " + roll);

        int secret = random.nextInt(100); // random number 0-99
        System.out.println("Secret number example: " + secret);
    }
}
