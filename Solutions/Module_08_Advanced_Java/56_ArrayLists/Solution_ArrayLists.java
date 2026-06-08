/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  ArrayLists  |  Module 8  |  Topic 56
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_ArrayLists.java
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

import java.util.ArrayList;

public class Solution_ArrayLists {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "ArrayLists Example");
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list);
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        list.remove("Apple");
        System.out.println(list);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        list.add("Cherry");
        for (String item : list) {
            System.out.println(item);
        }
        
        System.out.println("
All exercises completed!");
    }