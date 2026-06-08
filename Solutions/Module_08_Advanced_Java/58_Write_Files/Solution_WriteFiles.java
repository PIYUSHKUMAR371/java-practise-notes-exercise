/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  WriteFiles  |  Module 8  |  Topic 58
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_WriteFiles.java
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

import java.io.FileWriter;
import java.io.IOException;

public class Solution_WriteFiles {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "WriteFiles Example");
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("Example text
");
            System.out.println("Written example.txt");
        } catch (IOException e) {
            System.out.println("Write error");
        }
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        try (FileWriter writer = new FileWriter("example.txt", true)) {
            writer.write("More text
");
            System.out.println("Appended text");
        } catch (IOException e) {
            System.out.println("Append error");
        }
        
        System.out.println("
Exercise 3: Advanced Challenge");
        try (FileWriter writer = new FileWriter("example2.txt")) {
            writer.write("Another file
");
            System.out.println("Created example2.txt");
        } catch (IOException e) {
            System.out.println("Write error");
        }
        
        System.out.println("
All exercises completed!");
    }