/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Arrays  |  Module 6  |  Topic 31
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Arrays.java
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

public class Solution_Arrays {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Arrays Example");
        int[] nums = {1, 2, 3};
        System.out.println(nums[1]);
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Value[" + i + "]=" + nums[i]);
        }
        
        System.out.println("
Exercise 3: Advanced Challenge");
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        System.out.println("Total = " + total);
        
        System.out.println("
All exercises completed!");
    }