/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  HashMaps  |  Module 9  |  Topic 67
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_HashMaps.java
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

import java.util.HashMap;

public class Solution_HashMaps {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "HashMaps Example");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        System.out.println(map.get("A"));
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        map.put("B", 2);
        System.out.println(map);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        
        System.out.println("
All exercises completed!");
    }