/*
 * ============================================================
 *  InputArray  |  Module 6  |  Topic 32
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Get user input into arrays This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_InputArray.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #32
 * ============================================================
 */

import java.util.Scanner;

public class Notes_InputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[3];

        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }

        System.out.println("You entered:");
        for (int value : values) {
            System.out.println(value);
        }
        scanner.close();
    }
}
