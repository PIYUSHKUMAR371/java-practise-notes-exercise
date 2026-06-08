/*
 * ============================================================
 *  ReadFiles  |  Module 8  |  Topic 59
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Read from files This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_ReadFiles.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #59
 * ============================================================
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Notes_ReadFiles {
    public static void main(String[] args) {
        String filename = "notes_example.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
