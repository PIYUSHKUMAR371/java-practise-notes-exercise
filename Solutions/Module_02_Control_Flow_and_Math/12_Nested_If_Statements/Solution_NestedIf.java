/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  NestedIf  |  Module 2  |  Topic 12
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_NestedIf.java
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

public class Solution_NestedIf {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "NestedIf Example");
        int age = 20;
        boolean hasID = true;
        if (age >= 18) {
            if (hasID) {
                System.out.println("Entry allowed.");
            } else {
                System.out.println("Entry denied: no ID.");
            }
        } else {
            System.out.println("Entry denied: too young.");
        }
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        int score = 80;
        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 70) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C or below.");
        }
        
        System.out.println("
Exercise 3: Advanced Challenge");
        boolean isMember = true;
        int points = 120;
        if (isMember) {
            if (points >= 100) {
                System.out.println("Gold member");
            } else {
                System.out.println("Silver member");
            }
        } else {
            System.out.println("No membership.");
        }
        
        System.out.println("
All exercises completed!");
    }