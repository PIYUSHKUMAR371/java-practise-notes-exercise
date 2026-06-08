/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Static  |  Module 7  |  Topic 43
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Static.java
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

public class Solution_Static {
    public static int value = 5;

    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Static Example");
        System.out.println("Value: " + value);
        printStatic();
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        value += 3;
        System.out.println("Updated: " + value);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        System.out.println("Squared: " + square(value));
        
        System.out.println("
All exercises completed!");
    }

    public static void printStatic() {
        System.out.println("Static method called.");
    }

    public static int square(int x) {
        return x * x;
    }