/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Methods  |  Module 5  |  Topic 26
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Methods.java
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

public class Solution_Methods {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Methods Example");
        greet();
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        System.out.println("Product: " + multiply(4, 5));
        
        System.out.println("
Exercise 3: Advanced Challenge");
        System.out.println("Square of 6: " + square(6));
        
        System.out.println("
All exercises completed!");
    }

    public static void greet() {
        System.out.println("Hello from a method!");
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int square(int x) {
        return x * x;
    }