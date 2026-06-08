/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  BreakContinue  |  Module 4  |  Topic 24
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_BreakContinue.java
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

public class Solution_BreakContinue {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "BreakContinue Example");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        
        System.out.println("
Exercise 3: Advanced Challenge");
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd: " + i);
        }
        
        System.out.println("
All exercises completed!");
    }