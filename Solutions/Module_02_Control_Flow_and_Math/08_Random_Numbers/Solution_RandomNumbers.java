/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  RandomNumbers  |  Module 2  |  Topic 8
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_RandomNumbers.java
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

import java.util.Random;

public class Solution_RandomNumbers {
    public static void main(String[] args) {
        
        // ── EXERCISE 1 ⭐ ──────────────────────────────────────
        // Task (Beginner): Generate a single random integer between 0 and 99
        // - Use java.util.Random
        // - Print a message showing the generated number
        // Hint: random.nextInt(100) returns 0..99
        System.out.println("Exercise 1: RandomNumbers Example");
        // Write your code here:
        // Random random = new Random();
        // int value = random.nextInt(100);
        // System.out.println("Random number 0-99: " + value);
        
        // ── EXERCISE 2 ⭐⭐ ────────────────────────────────────
        // Task (Intermediate): Simulate a dice roll (1-6)
        // - Generate a value 1..6
        // - Print the result and a short message if the roll is 6
        // Hint: random.nextInt(6) + 1
        System.out.println("\nExercise 2: Intermediate Challenge");
        // Write your code here:
        // int roll = random.nextInt(6) + 1;
        // System.out.println("Dice roll result: " + roll);
        
        // ── EXERCISE 3 ⭐⭐⭐ ──────────────────────────────────
        // Task (Advanced): Build a small utility using Random
        // - Create an array of 5 strings (e.g., colors)
        // - Pick and print a random element from the array
        // - (Stretch) Write a helper method pickRandom(String[] arr)
        System.out.println("\nExercise 3: Advanced Challenge");
        // Write your code here:
        // String[] colors = {"red","blue","green","yellow","purple"};
        // int idx = random.nextInt(colors.length);
        // System.out.println("Random color picker: " + colors[idx]);
        
        System.out.println("\n✓ All exercises completed!");
    }
}
