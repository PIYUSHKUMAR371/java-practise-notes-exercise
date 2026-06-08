/*
 * ============================================================
 *  DatesAndTimes  |  Module 8  |  Topic 62
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Date and time This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_DatesAndTimes.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #62
 * ============================================================
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Notes_DatesAndTimes {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Today: " + today);
        System.out.println("Now: " + now.format(formatter));
    }
}
