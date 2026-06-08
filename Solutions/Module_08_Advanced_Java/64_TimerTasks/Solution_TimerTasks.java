/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  TimerTasks  |  Module 8  |  Topic 64
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_TimerTasks.java
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

import java.util.Timer;
import java.util.TimerTask;

public class Solution_TimerTasks {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "TimerTasks Example");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Timer executed.");
                timer.cancel();
            }
        }, 100);
        
        System.out.println("Timer started.");
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        Timer timer2 = new Timer();
        timer2.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Another timer.");
                timer2.cancel();
            }
        }, 100);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        Timer timer3 = new Timer();
        timer3.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Third timer.");
                timer3.cancel();
            }
        }, 100);
        
        System.out.println("
All exercises completed!");
    }