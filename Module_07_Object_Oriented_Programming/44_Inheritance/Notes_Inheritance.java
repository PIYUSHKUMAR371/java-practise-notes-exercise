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

// ── SECTION 1: PARENT CLASS ────────────────────────────────
// This is the base class that will be inherited from

class Animal { // Parent class
    String name; // Name of the animal

    void eat() { // Method that all animals can do
        System.out.println(name + " is eating");
    }

    void sleep() { // Method that all animals can do
        System.out.println(name + " is sleeping");
    }
}

// ── SECTION 2: CHILD CLASS ─────────────────────────────────
// This class inherits from Animal using 'extends'

class Dog extends Animal { // Dog inherits from Animal
    int lives = 1; // Dogs have 1 life (unlike cats)

    void bark() { // Dog-specific method
        System.out.println(name + " says woof!");
    }
}

// ── SECTION 3: ANOTHER CHILD CLASS ─────────────────────────
class Cat extends Animal { // Cat also inherits from Animal
    int lives = 9; // Cats have 9 lives

    void meow() { // Cat-specific method
        System.out.println(name + " says meow!");
    }
}

// ── SECTION 4: USING INHERITED CLASSES ────────────────────
public class Notes_Inheritance {
    public static void main(String[] args) {

        // Create Dog object - inherits eat() and sleep() from Animal
        Dog myDog = new Dog();
        myDog.name = "Buddy"; // Set inherited property

        System.out.println("Dog:");
        myDog.eat();   // Inherited method
        myDog.sleep(); // Inherited method
        myDog.bark();  // Dog-specific method

        // Create Cat object - also inherits from Animal
        Cat myCat = new Cat();
        myCat.name = "Whiskers"; // Set inherited property

        System.out.println("\nCat:");
        myCat.eat();   // Inherited method
        myCat.sleep(); // Inherited method
        myCat.meow();  // Cat-specific method

        // ── SECTION 5: POLYMORPHISM WITH INHERITANCE ────────
        // You can treat child objects as parent type

        Animal animal1 = new Dog();  // Dog is an Animal
        Animal animal2 = new Cat();  // Cat is an Animal

        // But you can only call parent methods
        animal1.eat();  // Works - inherited from Animal
        animal2.sleep(); // Works - inherited from Animal
        // animal1.bark(); // ERROR - bark() not in Animal class
    }
}

// ── KEY TAKEAWAYS ──────────────────────────────────────────
// 1. Use 'extends' to make a class inherit from another
// 2. Child classes get all parent properties and methods
// 3. Child classes can add their own properties and methods
// 4. Child classes can override parent methods
// 5. Inheritance creates "is-a" relationships (Dog is an Animal)

// ── NEXT STEP ──────────────────────────────────────────────
// Now open Exercise_Inheritance.java and complete the exercises!