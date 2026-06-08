/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Printf  |  Module 2  |  Topic 10
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Printf.java
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

public class Solution_Printf {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Printf Example");
        System.out.printf("Name: %s, Age: %d%n", "Alex", 22);
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        double price = 15.6789;
        System.out.printf("Price: %.2f USD%n", price);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        String title = "Java";
        int quantity = 3;
        System.out.printf("Ordered %d copies of %s.%n", quantity, title);
        
        System.out.println("
All exercises completed!");
    }