/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  ExceptionHandling  |  Module 8  |  Topic 57
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_ExceptionHandling.java
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

public class Solution_ExceptionHandling {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "ExceptionHandling Example");
        try {
            int result = 10 / 2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        }
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        try {
            int number = Integer.parseInt("12a");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number.");
        }
        
        System.out.println("
Exercise 3: Advanced Challenge");
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Null value found.");
        }
        
        System.out.println("
All exercises completed!");
    }