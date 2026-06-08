/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  DatesAndTimes  |  Module 8  |  Topic 62
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_DatesAndTimes.java
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

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution_DatesAndTimes {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "DatesAndTimes Example");
        LocalDate date = LocalDate.now();
        System.out.println(date);
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        
        System.out.println("
Exercise 3: Advanced Challenge");
        LocalDateTime future = now.plusDays(7);
        System.out.println("One week later: " + future.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        
        System.out.println("
All exercises completed!");
    }