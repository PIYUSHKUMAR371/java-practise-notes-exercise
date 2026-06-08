/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  MathClass  |  Module 2  |  Topic 9
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_MathClass.java
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

public class Solution_MathClass {
    public static void main(String[] args) {
        
        // ── EXERCISE 1 ⭐ ──────────────────────────────────────
        System.out.println("Exercise 1: " + "MathClass Example");
        System.out.println("Absolute of -8 = " + Math.abs(-8));
        
        // ── EXERCISE 2 ⭐⭐ ────────────────────────────────────
        System.out.println("
Exercise 2: Intermediate Challenge");
        double value = 7.2;
        System.out.println("Round " + value + " = " + Math.round(value));
        System.out.println("Square root of 49 = " + Math.sqrt(49));
        
        // ── EXERCISE 3 ⭐⭐⭐ ──────────────────────────────────
        System.out.println("
Exercise 3: Advanced Challenge");
        int x = 12;
        int y = 5;
        System.out.println("Max: " + Math.max(x, y));
        System.out.println("Min: " + Math.min(x, y));
        System.out.println("2^3 = " + Math.pow(2, 3));
        
        System.out.println("
All exercises completed!");
    }