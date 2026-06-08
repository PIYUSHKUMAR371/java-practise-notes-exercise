/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  InputArray  |  Module 6  |  Topic 32
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_InputArray.java
 *  3. Modify your code and experiment until it works
 *  4. Don't just copy-paste - try to understand it!
 *
 *  DIFFICULTY LEVELS:
 *  ⭐         = Beginner (follow the pattern from notes)
 *  ⭐⭐       = Intermediate (think about the problem)
 *  ⭐⭐⭐     = Challenge (push yourself!)
 *
 * ============================================================
 */

import java.util.Scanner;

public class Solution_InputArray {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercise 1: " + "InputArray Example");
        int[] values = new int[2];
        values[0] = scanner.nextInt();
        values[1] = scanner.nextInt();
        System.out.println("Read: " + values[0] + ", " + values[1]);
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        int sum = values[0] + values[1];
        System.out.println("Sum = " + sum);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        System.out.println("Average = " + (double) sum / values.length);
        
        scanner.close();
        System.out.println("
All exercises completed!");
    }