/*
 * ============================================================
 *  EnhancedSwitches  |  Module 3  |  Topic 18
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Switch statements This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_EnhancedSwitches.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #18
 * ============================================================
 */

public class Notes_EnhancedSwitches {
    public static void main(String[] args) {
        String day = "Wednesday";

        String type = switch (day) {
            case "Saturday", "Sunday" -> "Weekend";
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            default -> "Unknown";
        };

        System.out.println(day + " is a " + type);
    }
}
