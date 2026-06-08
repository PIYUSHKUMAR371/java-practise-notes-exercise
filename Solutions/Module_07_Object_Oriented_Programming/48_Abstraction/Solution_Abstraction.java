/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Abstraction  |  Module 7  |  Topic 48
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Abstraction.java
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

public class Solution_Abstraction {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Abstraction Example");
        Animal dog = new Dog();
        dog.makeSound();
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        Animal cat = new Cat();
        cat.makeSound();
        
        System.out.println("
Exercise 3: Advanced Challenge");
        printSound(new Dog());
        
        System.out.println("
All exercises completed!");
    }

    static void printSound(Animal animal) {
        animal.makeSound();
    }

    abstract static class Animal {
        abstract void makeSound();
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Woof!");
        }
    }

    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Meow!");
        }
    }