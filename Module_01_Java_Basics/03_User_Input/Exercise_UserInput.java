/*
 * ============================================================
 *  EXERCISES  |  USER INPUT IN JAVA  |  Module 01
 * ============================================================
 *  INSTRUCTIONS:
 *  - Complete each exercise below
 *  - Each exercise has a clear comment telling you what to do
 *  - The expected output is shown in a comment above each task
 *  - Try to solve it WITHOUT looking at the Notes file first!
 *  - If you get stuck, look at Notes_UserInput.java for help
 *
 *  DIFFICULTY LEVELS:
 *  ⭐         = Beginner (just follow the pattern from notes)
 *  ⭐⭐       = Intermediate (think a little)
 *  ⭐⭐⭐     = Challenge (push yourself!)
 * ============================================================
 */

import java.util.Scanner;

public class Exercise_UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ── EXERCISE 1 ⭐ ──────────────────────────────────────
        // Task: Ask for user's name and greet them
        // Expected output: Hello, [name]! Nice to meet you!
        // Your code here:
        // TODO: Use nextLine() to read name and print greeting

        // ── EXERCISE 2 ⭐⭐ ────────────────────────────────────
        // Task: Ask for age and birth year, then calculate birth year
        // Expected output: You were born in [year]
        // Your code here:
        // TODO: Read current year and age, calculate birth year

        // ── EXERCISE 3 ⭐⭐⭐ ──────────────────────────────────
        // Task: Create a simple calculator that takes two numbers and operator
        // Expected output: Result: [number1] [operator] [number2] = [result]
        // Your code here:
        // TODO: Read two doubles and a char, perform calculation based on operator

        scanner.close();
    }
}