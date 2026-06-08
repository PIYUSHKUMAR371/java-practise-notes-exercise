/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Multithreading  |  Module 9  |  Topic 70
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Multithreading.java
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

public class Solution_Multithreading {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Multithreading Example");
        Thread t1 = new Thread(new MessageTask("One"));
        Thread t2 = new Thread(new MessageTask("Two"));
        t1.start();
        t2.start();
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        System.out.println("Threads started.");
        
        System.out.println("
Exercise 3: Advanced Challenge");
        Thread t3 = new Thread(new MessageTask("Three"));
        t3.start();
        
        System.out.println("
All exercises completed!");
    }

    static class MessageTask implements Runnable {
        private final String msg;

        MessageTask(String msg) {
            this.msg = msg;
        }

        @Override
        public void run() {
            System.out.println("Thread " + msg + " is running.");
        }
    }