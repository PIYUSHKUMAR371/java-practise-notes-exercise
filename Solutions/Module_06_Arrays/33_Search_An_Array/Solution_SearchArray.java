/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  SearchArray  |  Module 6  |  Topic 33
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_SearchArray.java
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

public class Solution_SearchArray {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "SearchArray Example");
        int[] numbers = {2, 4, 6, 8};
        int target = 6;
        boolean found = false;
        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }
        System.out.println("Found = " + found);
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("Index = " + index);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        int search = 7;
        found = false;
        for (int number : numbers) {
            if (number == search) {
                found = true;
            }
        }
        System.out.println(search + " found? " + found);
        
        System.out.println("
All exercises completed!");
    }