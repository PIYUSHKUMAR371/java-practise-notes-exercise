/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  StringMethods  |  Module 3  |  Topic 13
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_StringMethods.java
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

public class Solution_StringMethods {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "StringMethods Example");
        String text = "hello java";
        System.out.println(text.toUpperCase());
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        System.out.println("Contains 'java': " + text.contains("java"));
        System.out.println("Replace spaces: " + text.replace(" ", "_"));
        
        System.out.println("
Exercise 3: Advanced Challenge");
        System.out.println("First 5 chars: " + text.substring(0, 5));
        System.out.println("Length: " + text.length());
        
        System.out.println("
All exercises completed!");
    }