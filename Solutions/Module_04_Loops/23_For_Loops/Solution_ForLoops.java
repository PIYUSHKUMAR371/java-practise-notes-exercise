/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  ForLoops  |  Module 4  |  Topic 23
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_ForLoops.java
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

public class Solution_ForLoops {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "ForLoops Example");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum 1-5: " + sum);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        String[] animals = {"cat", "dog", "bird"};
        for (int i = 0; i < animals.length; i++) {
            System.out.println("Animal " + (i + 1) + ": " + animals[i]);
        }
        
        System.out.println("
All exercises completed!");
    }