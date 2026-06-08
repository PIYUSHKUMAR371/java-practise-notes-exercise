/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  TernaryOperator  |  Module 3  |  Topic 16
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_TernaryOperator.java
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

public class Solution_TernaryOperator {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "TernaryOperator Example");
        int score = 75;
        String result = score >= 60 ? "Pass" : "Fail";
        System.out.println(result);
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        int number = 4;
        String type = number % 2 == 0 ? "Even" : "Odd";
        System.out.println(number + " is " + type);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        boolean isMember = true;
        int discount = isMember ? 10 : 0;
        System.out.println("Discount: " + discount + "%");
        
        System.out.println("
All exercises completed!");
    }