/*
 * ============================================================
 *  INHERITANCE IN JAVA  |  Module 07  |  Topic 44
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Inheritance is like family relationships in programming!
 *  A child class can inherit properties and methods from a
 *  parent class. Think of it like a car (parent) and a sports
 *  car (child) - the sports car gets all the car features plus
 *  its own special features. This saves code and creates hierarchy.
 *
 *  WHY DO WE NEED THIS?
 *  Inheritance prevents code duplication. Instead of rewriting
 *  common code, child classes inherit it. It's essential for
 *  organizing related classes in a hierarchy.
 *
 *  HOW TO READ THIS FILE:
 *  - Read each section top to bottom
 *  - Every line has a comment explaining what it does
 *  - Try changing the values and re-running to experiment
 *  - After reading, go to Exercise_Inheritance.java and try it yourself
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #44 at timestamp
 * ============================================================
 */

public class Notes_Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeSound();
    }

    static class Animal {
        String name;

        Animal(String name) {
            this.name = name;
        }

        void makeSound() {
            System.out.println(name + " makes a sound.");
        }
    }

    static class Dog extends Animal {
        Dog(String name) {
            super(name);
        }
    }
}
