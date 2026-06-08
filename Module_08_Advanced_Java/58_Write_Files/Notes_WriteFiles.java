/*
 * ============================================================
 *  WriteFiles  |  Module 8  |  Topic 58
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Write to files This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_WriteFiles.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #58
 * ============================================================
 */

import java.io.FileWriter;
import java.io.IOException;

public class Notes_WriteFiles {
    public static void main(String[] args) {
        String filename = "notes_example.txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Java notes file example.\n");
            writer.write("Write files using FileWriter and try-with-resources.\n");
            System.out.println("File written: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
