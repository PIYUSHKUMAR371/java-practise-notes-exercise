/*
 * ============================================================
 *  Polymorphism  |  Module 7  |  Topic 50
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Many forms This is a fundamental concept in Java programming
 *  that you'll use frequently. Understanding this will help you
 *  write better code and solve problems more effectively.
 *
 *  WHY DO WE NEED THIS?
 *  This concept is important because it helps organize code,
 *  make programs more efficient, and creates more readable solutions.
 *
 *  HOW TO READ THIS FILE:
 *  - Read each section from top to bottom
 *  - Read the comments - they explain every important line
 *  - Try running this file and watch the output
 *  - Change values and run it again to experiment
 *  - When done, move to Exercise_Polymorphism.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #50
 * ============================================================
 */

public class Notes_Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
    }

    static class Animal {
        void makeSound() {
            System.out.println("Animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks.");
        }
    }
}
