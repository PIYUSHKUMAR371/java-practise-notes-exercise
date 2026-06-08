/*
 * ============================================================
 *  METHOD OVERRIDING  |  Module 07  |  Topic 46
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Method overriding lets child classes provide their own
 *  version of a method that they inherited from the parent.
 *  It's like customizing inherited behavior. For example,
 *  all animals make sounds, but dogs bark while cats meow.
 *  Overriding lets each animal type define its own sound.
 *
 *  WHY DO WE NEED THIS?
 *  Different subclasses often need different implementations
 *  of the same method. Overriding provides flexibility while
 *  maintaining the same method signature across the hierarchy.
 *
 *  HOW TO READ THIS FILE:
 *  - Read each section top to bottom
 *  - Every line has a comment explaining what it does
 *  - Try changing the values and re-running to experiment
 *  - After reading, go to Exercise_MethodOverriding.java and try it yourself
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #46 at timestamp
 * ============================================================
 */

public class Notes_MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.makeSound();
    }

    static class Animal {
        void makeSound() {
            System.out.println("Animal sound");
        }
    }

    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Meow");
        }
    }
}
