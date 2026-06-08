/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  OverloadedConstructors  |  Module 7  |  Topic 41
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_OverloadedConstructors.java
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

public class Solution_OverloadedConstructors {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "OverloadedConstructors Example");
        Person p1 = new Person("Sara");
        System.out.println(p1.name + " " + p1.age);
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        Person p2 = new Person("Joe", 30);
        System.out.println(p2.name + " " + p2.age);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        Person p3 = new Person("Mia", 25);
        System.out.println(p3.name + " " + p3.age);
        
        System.out.println("
All exercises completed!");
    }

    static class Person {
        String name;
        int age;

        Person(String name) {
            this.name = name;
            this.age = 18;
        }

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }