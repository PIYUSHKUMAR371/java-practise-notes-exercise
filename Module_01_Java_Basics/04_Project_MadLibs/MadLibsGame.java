/*
 * ============================================================
 *  PROJECT: MAD LIBS GAME  |  Module 01  |  Topic 04
 * ============================================================
 *  WHAT IS THIS PROJECT?
 *  Mad Libs is a fun word game where you fill in blanks with random
 *  words to create silly stories! This project combines everything
 *  you've learned so far: variables, user input, and string
 *  concatenation. You'll ask the user for words, then plug them
 *  into a funny story template.
 *
 *  WHAT YOU WILL LEARN:
 *  - Collecting multiple inputs from user
 *  - Storing inputs in variables
 *  - Building strings with concatenation
 *  - Creating interactive programs
 *
 *  HOW TO RUN:
 *  1. Compile: javac MadLibsGame.java
 *  2. Run: java MadLibsGame
 *  3. Follow the prompts to enter words
 *  4. Enjoy your silly story!
 * ============================================================
 */

import java.util.Scanner; // For reading user input

public class MadLibsGame {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Display welcome message
        System.out.println("🎉 Welcome to Mad Libs! 🎉");
        System.out.println("I'll ask you for some words, then create a funny story!");
        System.out.println("Let's get started...\n");

        // ── COLLECTING WORDS FROM USER ─────────────────────────
        // Ask for different types of words to make the story fun

        System.out.print("Enter a color: ");
        String color = scanner.nextLine(); // Read the color

        System.out.print("Enter a plural noun: ");
        String pluralNoun = scanner.nextLine(); // Read plural noun

        System.out.print("Enter a celebrity's name: ");
        String celebrity = scanner.nextLine(); // Read celebrity name

        System.out.print("Enter an adjective (describing word): ");
        String adjective = scanner.nextLine(); // Read adjective

        System.out.print("Enter a verb (action word): ");
        String verb = scanner.nextLine(); // Read verb

        // ── BUILDING THE STORY ─────────────────────────────────
        // Use string concatenation to plug words into the story template

        System.out.println("\n--- Your Mad Libs Story ---");
        System.out.println("Roses are " + color);                    // Color in first line
        System.out.println(pluralNoun + " are blue");               // Plural noun in second line
        System.out.println("I love " + celebrity);                  // Celebrity in third line
        System.out.println("The " + adjective + " cat started to " + verb + " very loudly.");
        // Adjective and verb in last line

        // ── ENDING THE GAME ───────────────────────────────────
        // Thank the user and close resources

        System.out.println("\nThanks for playing Mad Libs!");
        System.out.println("Hope you enjoyed your silly story! 😄");

        scanner.close(); // Always close the scanner
    }
}

/*
 * SAMPLE RUN:
 * Welcome to Mad Libs!
 * Enter a color: red
 * Enter a plural noun: bananas
 * Enter a celebrity's name: Elon Musk
 * Enter an adjective: silly
 * Enter a verb: dance
 *
 * Your Mad Libs Story:
 * Roses are red
 * Bananas are blue
 * I love Elon Musk
 * The silly cat started to dance very loudly.
 */