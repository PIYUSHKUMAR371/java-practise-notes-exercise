/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  OverloadedMethods  |  Module 5  |  Topic 27
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_OverloadedMethods.java
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

public class Solution_OverloadedMethods {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "OverloadedMethods Example");
        System.out.println("3 + 4 = " + add(3, 4));
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        System.out.println("3 + 4 + 5 = " + add(3, 4, 5));
        
        System.out.println("
Exercise 3: Advanced Challenge");
        System.out.println("1.5 + 2.5 = " + add(1.5, 2.5));
        
        System.out.println("
All exercises completed!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }