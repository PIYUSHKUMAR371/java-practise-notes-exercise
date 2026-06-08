/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  ReadFiles  |  Module 8  |  Topic 59
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_ReadFiles.java
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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution_ReadFiles {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "ReadFiles Example");
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("Read error");
        }
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Read error");
        }
        
        System.out.println("
Exercise 3: Advanced Challenge");
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            int count = 0;
            while (reader.readLine() != null) {
                count++;
            }
            System.out.println("Lines: " + count);
        } catch (IOException e) {
            System.out.println("Read error");
        }
        
        System.out.println("
All exercises completed!");
    }