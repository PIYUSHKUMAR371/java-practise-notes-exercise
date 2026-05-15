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

// ── SECTION 1: PARENT CLASS ────────────────────────────────
class Vehicle { // Parent class
    void go() { // Method that can be overridden
        System.out.println("The vehicle is moving");
    }
}

// ── SECTION 2: CHILD CLASS WITH OVERRIDE ───────────────────
class Car extends Vehicle { // Car inherits from Vehicle

    @Override // Annotation indicating this method overrides parent
    void go() { // Same method name and parameters as parent
        System.out.println("The car is driving on the road");
    }
}

// ── SECTION 3: ANOTHER CHILD CLASS ─────────────────────────
class Boat extends Vehicle { // Boat also inherits from Vehicle

    @Override // This also overrides the parent method
    void go() { // Different implementation for boat
        System.out.println("The boat is sailing on the water");
    }
}

// ── SECTION 4: USING OVERRIDDEN METHODS ───────────────────
public class Notes_MethodOverriding {
    public static void main(String[] args) {

        // Create different vehicle types
        Vehicle genericVehicle = new Vehicle();
        Car myCar = new Car();
        Boat myBoat = new Boat();

        // Each calls its own version of go()
        System.out.println("Generic vehicle:");
        genericVehicle.go(); // Parent implementation

        System.out.println("\nCar:");
        myCar.go(); // Car's overridden implementation

        System.out.println("\nBoat:");
        myBoat.go(); // Boat's overridden implementation

        // ── SECTION 5: POLYMORPHISM WITH OVERRIDING ──────────
        // Parent type can hold child objects, but calls overridden methods

        Vehicle vehicle1 = new Car();  // Car object in Vehicle variable
        Vehicle vehicle2 = new Boat(); // Boat object in Vehicle variable

        System.out.println("\nPolymorphism:");
        vehicle1.go(); // Calls Car's go() method
        vehicle2.go(); // Calls Boat's go() method
    }
}

// ── KEY TAKEAWAYS ──────────────────────────────────────────
// 1. @Override annotation indicates method overriding
// 2. Child method must have same name and parameters as parent
// 3. Overriding provides different implementations for different subclasses
// 4. Polymorphism allows parent types to call overridden child methods
// 5. Use overriding when subclasses need different behavior for same method

// ── NEXT STEP ──────────────────────────────────────────────
// Now open Exercise_MethodOverriding.java and complete the exercises!