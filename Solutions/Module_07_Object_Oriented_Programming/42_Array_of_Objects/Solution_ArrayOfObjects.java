/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  ArrayOfObjects  |  Module 7  |  Topic 42
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_ArrayOfObjects.java
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

public class Solution_ArrayOfObjects {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "ArrayOfObjects Example");
        Student[] students = {new Student("A", 80), new Student("B", 90)};
        System.out.println(students[0].name + " " + students[0].score);
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        for (Student student : students) {
            System.out.println(student.name + " " + student.score);
        }
        
        System.out.println("
Exercise 3: Advanced Challenge");
        students[0].score += 5;
        System.out.println("Updated: " + students[0].name + " " + students[0].score);
        
        System.out.println("
All exercises completed!");
    }

    static class Student {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }