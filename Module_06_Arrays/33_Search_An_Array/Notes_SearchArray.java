/*
 * ============================================================
 *  SearchArray  |  Module 6  |  Topic 33
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Search arrays This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_SearchArray.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #33
 * ============================================================
 */

public class Notes_SearchArray {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};
        int target = 15;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        if (index >= 0) {
            System.out.println("Found " + target + " at index " + index);
        } else {
            System.out.println(target + " not found.");
        }
    }
}
