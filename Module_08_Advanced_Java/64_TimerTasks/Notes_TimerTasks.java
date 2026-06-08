/*
 * ============================================================
 *  TimerTasks  |  Module 8  |  Topic 64
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Timer tasks This is a fundamental concept in Java programming
 *  that you'll use frequently. Understanding this will help you
 *  write better code and solve problems more effectively.
 *
 *  WHY DO WE NEED THIS?
 *  This concept is important because it helps organize code,
 *  make programs more efficient, and creates more readable solutions.
 *
 *  HOW TO READ THIS FILE:
 *  - Read each section from top to bottom
 *  - Read the comments - they explain every important line
 *  - Try running this file and watch the output
 *  - Change values and run it again to experiment
 *  - When done, move to Exercise_TimerTasks.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #64
 * ============================================================
 */

import java.util.Timer;
import java.util.TimerTask;

public class Notes_TimerTasks {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Timer task executed.");
                timer.cancel();
            }
        }, 1000);
    }
}
