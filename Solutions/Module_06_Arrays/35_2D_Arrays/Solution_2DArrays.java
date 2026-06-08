/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  2DArrays  |  Module 6  |  Topic 35
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_2DArrays.java
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

public class Solution_2DArrays {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "2DArrays Example");
        int[][] grid = {{1, 2}, {3, 4}};
        System.out.println(grid[1][1]);
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("
Exercise 3: Advanced Challenge");
        int total = 0;
        for (int[] row : grid) {
            for (int value : row) {
                total += value;
            }
        }
        System.out.println("Total = " + total);
        
        System.out.println("
All exercises completed!");
    }