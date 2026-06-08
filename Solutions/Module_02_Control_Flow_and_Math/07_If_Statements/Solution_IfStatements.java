/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  IF STATEMENTS IN JAVA  |  Module 02
 * ============================================================
 *  INSTRUCTIONS:
 *  - Complete each exercise below
 *  - Each exercise has a clear comment telling you what to do
 *  - The expected output is shown in a comment above each task
 *  - Try to solve it WITHOUT looking at the Notes file first!
 *  - If you get stuck, look at Notes_IfStatements.java for help
 *
 *  DIFFICULTY LEVELS:
 *  ⭐         = Beginner (just follow the pattern from notes)
 *  ⭐⭐       = Intermediate (think a little)
 *  ⭐⭐⭐     = Challenge (push yourself!)
 * ============================================================
 */

public class Solution_IfStatements {
    public static void main(String[] args) {
        
        // ── EXERCISE 1 ⭐ ──────────────────────────────────────
        // Task: Check if a number is positive
        // Expected output: Positive
        int number = 5;
        if (number > 0) {
            System.out.println("Positive");
        }
        
        // ── EXERCISE 2 ⭐⭐ ────────────────────────────────────
        // Task: Check if a number is even or odd
        // Expected output: Even
        int value = 4;
        if (value % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        
        // ── EXERCISE 3 ⭐⭐⭐ ──────────────────────────────────
        // Task: Check age for vote eligibility
        // Expected output: Eligible to vote
        int age = 18;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
