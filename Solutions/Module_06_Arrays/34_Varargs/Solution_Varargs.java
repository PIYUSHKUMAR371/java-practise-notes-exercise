/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Varargs  |  Module 6  |  Topic 34
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Varargs.java
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

public class Solution_Varargs {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Varargs Example");
        System.out.println("Sum = " + sum(2, 3));
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        System.out.println("Sum = " + sum(1, 2, 3, 4));
        
        System.out.println("
Exercise 3: Advanced Challenge");
        System.out.println("Sum = " + sum(5, 10, 15, 20, 25));
        
        System.out.println("
All exercises completed!");
    }

    public static int sum(int... values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }