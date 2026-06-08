/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  EnhancedSwitches  |  Module 3  |  Topic 18
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_EnhancedSwitches.java
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

public class Solution_EnhancedSwitches {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "EnhancedSwitches Example");
        String day = "Sunday";
        String type = switch (day) {
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Weekday";
        };
        System.out.println(type);
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        int month = 7;
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Invalid";
        };
        System.out.println(season);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        String status = "open";
        String message = switch (status) {
            case "open" -> "Shop is open.";
            case "closed" -> "Shop is closed.";
            default -> "Status unknown.";
        };
        System.out.println(message);
        
        System.out.println("
All exercises completed!");
    }