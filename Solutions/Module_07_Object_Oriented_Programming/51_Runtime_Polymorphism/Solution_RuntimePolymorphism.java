/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  RuntimePolymorphism  |  Module 7  |  Topic 51
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_RuntimePolymorphism.java
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

public class Solution_RuntimePolymorphism {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "RuntimePolymorphism Example");
        Animal animal = new Dog();
        animal.sound();
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        animal = new Cat();
        animal.sound();
        
        System.out.println("
Exercise 3: Advanced Challenge");
        makeSound(new Dog());
        
        System.out.println("
All exercises completed!");
    }

    static void makeSound(Animal animal) {
        animal.sound();
    }

    static class Animal {
        void sound() {
            System.out.println("Some sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Woof!");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Meow!");
        }
    }