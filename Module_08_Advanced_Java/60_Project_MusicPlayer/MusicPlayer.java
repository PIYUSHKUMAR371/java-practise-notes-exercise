/*
 * ============================================================
 *  PROJECT: MusicPlayer  |  Module 8  |  Topic 60
 * ============================================================
 *  WHAT IS THIS PROJECT?
 *  Music player
 *
 *  WHAT YOU WILL LEARN:
 *  - How to combine multiple Java concepts into one program
 *  - Real-world problem solving approach
 *  - Writing clean, organized code
 *
 *  HOW TO RUN THIS PROJECT:
 *  1. Compile: javac MusicPlayer.java
 *  2. Run: java MusicPlayer
 *
 *  IMPORTANT NOTES:
 *  - Read all the comments to understand how it works
 *  - Try to modify the code and see what changes
 *  - Challenge yourself to add new features
 *  - This is a real, working program you can use!
 *
 * ============================================================
 */

public class MusicPlayer {
    
    // ── HELPER METHOD 1 ─────────────────────────────────────
    // This method does [something important]
    private static void displayWelcome() {
        System.out.println("===================================");
        System.out.println("Welcome to MusicPlayer");
        System.out.println("===================================");
    }
    
    // ── HELPER METHOD 2 ─────────────────────────────────────
    // This method does [something useful]
    private static void displayInstructions() {
        System.out.println("\nInstructions:");
        System.out.println("This project demonstrates the concepts learned");
    }
    
    // ── HELPER METHOD 3 ─────────────────────────────────────
    // This method does [something that helps]
    private static void displayResults() {
        System.out.println("\n===================================");
        System.out.println("Project Complete!");
        System.out.println("===================================");
    }
    
    // ── MAIN METHOD ──────────────────────────────────────────
    // This is where the program starts running
    public static void main(String[] args) {
        
        // Show welcome message
        displayWelcome();
        
        // Show instructions
        displayInstructions();
        
        // Do the main work
        System.out.println("\nRunning MusicPlayer...");
        
        // Show results
        displayResults();
    }
}
