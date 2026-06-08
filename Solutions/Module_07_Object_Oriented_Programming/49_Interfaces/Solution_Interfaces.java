/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Interfaces  |  Module 7  |  Topic 49
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Interfaces.java
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

public class Solution_Interfaces {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Interfaces Example");
        Playable piano = new Piano();
        piano.play();
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        Playable guitar = new Guitar();
        guitar.play();
        
        System.out.println("
Exercise 3: Advanced Challenge");
        performPlay(new Piano());
        
        System.out.println("
All exercises completed!");
    }

    static void performPlay(Playable playable) {
        playable.play();
    }

    interface Playable {
        void play();
    }

    static class Piano implements Playable {
        public void play() {
            System.out.println("Playing piano.");
        }
    }

    static class Guitar implements Playable {
        public void play() {
            System.out.println("Playing guitar.");
        }
    }