/*
 * ============================================================
 *  Enums  |  Module 9  |  Topic 68
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Enumeration types This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_Enums.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #68
 * ============================================================
 */

public class Notes_Enums {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;
        System.out.println("Today is " + today);

        if (today == Day.SATURDAY || today == Day.SUNDAY) {
            System.out.println("Weekend!");
        } else {
            System.out.println("Weekday.");
        }
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
