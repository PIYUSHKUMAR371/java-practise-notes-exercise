/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  MethodOverriding  |  Module 7  |  Topic 46
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_MethodOverriding.java
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

public class Solution_MethodOverriding {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "MethodOverriding Example");
        Animal animal = new Animal();
        animal.sound();
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        Animal dog = new Dog();
        dog.sound();
        
        System.out.println("
Exercise 3: Advanced Challenge");
        dog.makeNoise();
    }

    static class Animal {
        void sound() {
            System.out.println("Some sound");
        }

        void makeNoise() {
            System.out.println("Animal noise");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Bark");
        }

        @Override
        void makeNoise() {
            System.out.println("Dog is barking.");
        }
    }