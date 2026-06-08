/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  LogicalOperators  |  Module 3  |  Topic 20
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_LogicalOperators.java
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

public class Solution_LogicalOperators {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "LogicalOperators Example");
        boolean rain = true;
        boolean umbrella = false;
        if (rain && umbrella) {
            System.out.println("Go outside.");
        } else {
            System.out.println("Stay inside.");
        }
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        boolean hungry = true;
        boolean tired = false;
        if (hungry || tired) {
            System.out.println("Take a break.");
        } else {
            System.out.println("Keep working.");
        }
        
        System.out.println("
Exercise 3: Advanced Challenge");
        boolean isWeekend = true;
        boolean hasWork = false;
        if (isWeekend && !hasWork) {
            System.out.println("Relax today.");
        } else {
            System.out.println("Plan your day.");
        }
        
        System.out.println("
All exercises completed!");
    }