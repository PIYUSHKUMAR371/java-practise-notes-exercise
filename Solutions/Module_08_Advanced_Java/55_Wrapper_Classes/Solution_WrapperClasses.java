/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  WrapperClasses  |  Module 8  |  Topic 55
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_WrapperClasses.java
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

public class Solution_WrapperClasses {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "WrapperClasses Example");
        Integer number = 100;
        System.out.println("Boxed: " + number);
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        int value = number + 20;
        System.out.println("Unboxed sum: " + value);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        int parsed = Integer.parseInt("123");
        System.out.println("Parsed int: " + parsed);
        
        System.out.println("
All exercises completed!");
    }