/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  GettersSetters  |  Module 7  |  Topic 52
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_GettersSetters.java
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

public class Solution_GettersSetters {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "GettersSetters Example");
        Person p = new Person();
        p.setName("Sam");
        p.setAge(28);
        System.out.println(p.getName() + " " + p.getAge());
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        p.setAge(30);
        System.out.println("Updated age: " + p.getAge());
        
        System.out.println("
Exercise 3: Advanced Challenge");
        System.out.println("Name length: " + p.getName().length());
        
        System.out.println("
All exercises completed!");
    }

    static class Person {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age >= 0) {
                this.age = age;
            }
        }
    }