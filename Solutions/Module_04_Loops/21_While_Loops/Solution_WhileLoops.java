/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  WhileLoops  |  Module 4  |  Topic 21
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_WhileLoops.java
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

public class Solution_WhileLoops {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "WhileLoops Example");
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            i++;
        }
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        int sum = 0;
        int count = 1;
        while (count <= 5) {
            sum += count;
            count++;
        }
        System.out.println("Sum 1-5: " + sum);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        int number = 5;
        int factorial = 1;
        while (number > 0) {
            factorial *= number;
            number--;
        }
        System.out.println("5! = " + factorial);
        
        System.out.println("
All exercises completed!");
    }