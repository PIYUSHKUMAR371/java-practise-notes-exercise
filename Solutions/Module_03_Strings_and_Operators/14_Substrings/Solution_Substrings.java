/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Substrings  |  Module 3  |  Topic 14
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Substrings.java
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

public class Solution_Substrings {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Substrings Example");
        String word = "JavaProgramming";
        System.out.println(word.substring(0, 4));
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        System.out.println(word.substring(4, 15));
        
        System.out.println("
Exercise 3: Advanced Challenge");
        int length = word.length();
        System.out.println("Last 4 letters: " + word.substring(length - 4));
        
        System.out.println("
All exercises completed!");
    }