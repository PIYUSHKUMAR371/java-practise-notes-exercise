/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Enums  |  Module 9  |  Topic 68
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Enums.java
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

public class Solution_Enums {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }

    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Enums Example");
        Day day = Day.MONDAY;
        System.out.println(day);
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        System.out.println(day.name());
        
        System.out.println("
Exercise 3: Advanced Challenge");
        for (Day d : Day.values()) {
            System.out.println(d);
        }
        
        System.out.println("
All exercises completed!");
    }