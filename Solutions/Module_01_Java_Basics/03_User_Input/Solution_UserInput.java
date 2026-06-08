/* INSTRUCTOR SOLUTION - DO NOT SHARE */
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

import java.util.Scanner;

public class Solution_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ── EXERCISE 1 ⭐ ──────────────────────────────────────
        // Task: Read a name and print it back
        // Expected output: Hello, [name]!
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        
        // ── EXERCISE 2 ⭐⭐ ────────────────────────────────────
        // Task: Read two numbers and print their sum
        // Expected output: Sum = [result]
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Sum = " + (x + y));
        
        // ── EXERCISE 3 ⭐⭐⭐ ──────────────────────────────────
        // Task: Read a line and print its length
        // Expected output: Length = [length]
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.println("Length = " + sentence.length());
        
        scanner.close();
    }
