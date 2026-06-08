/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  VariableScope  |  Module 5  |  Topic 28
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_VariableScope.java
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

public class Solution_VariableScope {
    public static int globalValue = 10;

    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "VariableScope Example");
        int localValue = 5;
        System.out.println("Global: " + globalValue + ", Local: " + localValue);
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        if (localValue > 0) {
            int innerValue = localValue * 2;
            System.out.println("Inner value: " + innerValue);
        }
        
        System.out.println("
Exercise 3: Advanced Challenge");
        printValue();
        
        System.out.println("
All exercises completed!");
    }

    public static void printValue() {
        System.out.println("Accessing global value: " + globalValue);
    }