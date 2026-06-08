/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  ARITHMETIC OPERATIONS  |  Module 01
 * ============================================================
 *  INSTRUCTIONS:
 *  - Complete each exercise below
 *  - Each exercise has a clear comment telling you what to do
 *  - The expected output is shown in a comment above each task
 *  - Try to solve it WITHOUT looking at the Notes file first!
 *  - If you get stuck, look at Notes_Arithmetic.java for help
 *
 *  DIFFICULTY LEVELS:
 *  ⭐         = Beginner (just follow the pattern from notes)
 *  ⭐⭐       = Intermediate (think a little)
 *  ⭐⭐⭐     = Challenge (push yourself!)
 * ============================================================
 */

public class Solution_Arithmetic {
    public static void main(String[] args) {
        
        // ── EXERCISE 1 ⭐ ──────────────────────────────────────
        // Task: Add two numbers and print the result
        // Expected output: 5 + 3 = 8
        int a = 5;
        int b = 3;
        System.out.println(a + " + " + b + " = " + (a + b));
        
        // ── EXERCISE 2 ⭐⭐ ────────────────────────────────────
        // Task: Multiply and divide two numbers
        // Expected output: 10 * 2 = 20 and 10 / 2 = 5
        int x = 10;
        int y = 2;
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));
        
        // ── EXERCISE 3 ⭐⭐⭐ ──────────────────────────────────
        // Task: Compute remainder and print it
        // Expected output: 10 % 3 = 1
        System.out.println(x + " % " + 3 + " = " + (x % 3));
    }
