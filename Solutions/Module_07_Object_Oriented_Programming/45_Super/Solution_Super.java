/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Super  |  Module 7  |  Topic 45
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Super.java
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

public class Solution_Super {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Super Example");
        Student student = new Student("Lara", 21);
        student.printInfo();
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        System.out.println(student.name + " is " + student.age);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        student.sayHello();
        
        System.out.println("
All exercises completed!");
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }

    static class Student extends Person {
        int age;

        Student(String name, int age) {
            super(name);
            this.age = age;
        }

        void printInfo() {
            System.out.println(name + " " + age);
        }

        void sayHello() {
            System.out.println("Hello, " + name + "!");
        }
    }