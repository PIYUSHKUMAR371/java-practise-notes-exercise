/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Threading  |  Module 9  |  Topic 69
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Threading.java
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

public class Solution_Threading {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Threading Example");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running.");
            }
        });
        thread.start();
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        System.out.println("Main continues.");
        
        System.out.println("
Exercise 3: Advanced Challenge");
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Second thread.");
            }
        });
        thread2.start();
        
        System.out.println("
All exercises completed!");
    }