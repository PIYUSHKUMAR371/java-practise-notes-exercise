/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  AnonymousClasses  |  Module 8  |  Topic 63
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_AnonymousClasses.java
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

public class Solution_AnonymousClasses {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "AnonymousClasses Example");
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task running.");
            }
        };
        task.run();
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        Runnable greet = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class.");
            }
        };
        greet.run();
        
        System.out.println("
Exercise 3: Advanced Challenge");
        Runnable bye = new Runnable() {
            @Override
            public void run() {
                System.out.println("Goodbye.");
            }
        };
        bye.run();
        
        System.out.println("
All exercises completed!");
    }