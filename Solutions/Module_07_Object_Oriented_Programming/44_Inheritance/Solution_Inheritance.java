/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Inheritance  |  Module 7  |  Topic 44
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Inheritance.java
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

public class Solution_Inheritance {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Inheritance Example");
        Animal animal = new Animal();
        animal.eat();
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        
        System.out.println("
Exercise 3: Advanced Challenge");
        System.out.println("Dog is a type of Animal.");
    }

    static class Animal {
        void eat() {
            System.out.println("Animal is eating.");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Woof!");
        }
    }