import java.util.Random;

/*
 * Instructor solutions for Exercise_RandomNumbers.java
 * These examples show one correct way to implement each exercise.
 * Students should try the exercises themselves before viewing solutions.
 */

public class Solution_RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        // Solution Exercise 1
        System.out.println("Solution 1: Generate 0-99");
        int value = random.nextInt(100); // 0..99
        System.out.println("Random number 0-99: " + value);

        // Solution Exercise 2
        System.out.println("\nSolution 2: Dice roll 1-6");
        int roll = random.nextInt(6) + 1; // 1..6
        System.out.println("Dice roll result: " + roll);
        if (roll == 6) {
            System.out.println("Great! You rolled the highest number!");
        } else {
            System.out.println("Try again to roll a 6.");
        }

        // Solution Exercise 3
        System.out.println("\nSolution 3: Random color picker");
        String[] colors = {"red", "blue", "green", "yellow", "purple"};
        int idx = random.nextInt(colors.length);
        System.out.println("Random color picker: " + colors[idx]);

        // Optional helper method demonstration (in-file)
        System.out.println("\nUsing helper: " + pickRandom(colors, random));
    }

    // Helper method to pick a random element from an array
    private static String pickRandom(String[] arr, Random random) {
        if (arr == null || arr.length == 0) return null;
        return arr[random.nextInt(arr.length)];
    }
}
