/*
 * ============================================================
 *  INTRODUCTION TO OOP  |  Module 07  |  Topic 39
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  OOP stands for Object-Oriented Programming. Instead of writing
 *  code as a long list of instructions, OOP organizes code like
 *  real-world objects. Think of a car - it has properties (color,
 *  model, year) and actions (start, drive, brake). OOP lets you
 *  create "blueprints" for objects and then make instances of them.
 *
 *  WHY DO WE NEED THIS?
 *  OOP makes code more organized, reusable, and easier to maintain.
 *  Large programs would be chaos without it. It's like building
 *  with LEGO blocks instead of random pieces.
 *
 *  HOW TO READ THIS FILE:
 *  - Read each section top to bottom
 *  - Every line has a comment explaining what it does
 *  - Try changing the values and re-running to experiment
 *  - After reading, go to Exercise_OOP.java and try it yourself
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #39 at timestamp
 * ============================================================
 */

// ── SECTION 1: WHAT IS A CLASS? ────────────────────────────
// A class is a blueprint/template for creating objects
// It defines what properties and methods objects will have

public class Notes_OOP {

    // ── SECTION 2: INSTANCE VARIABLES ────────────────────────
    // These are the properties/attributes of the object
    // Each object instance gets its own copy of these variables

    String make = "Ford";        // The car's brand/make
    String model = "Mustang";    // The car's model name
    int year = 2025;            // The car's manufacturing year
    double price = 58000.99;    // The car's price in dollars
    boolean isRunning = false;  // Whether the car engine is running

    // ── SECTION 3: INSTANCE METHODS ──────────────────────────
    // These are the actions/behaviors the object can perform
    // Methods can access and modify the instance variables

    void start() { // Method to start the car
        isRunning = true; // Set running status to true
        System.out.println("You start the engine"); // Print message
    }

    void stop() { // Method to stop the car
        isRunning = false; // Set running status to false
        System.out.println("You stop the car"); // Print message
    }

    void drive() { // Method to drive the car
        System.out.println("You drive the " + model); // Use the model variable
    }

    void brake() { // Method to brake the car
        System.out.println("You brake the " + model); // Use the model variable
    }

    // ── SECTION 4: MAIN METHOD TO TEST ──────────────────────
    // This is where we create and use objects

    public static void main(String[] args) {

        // Create an object instance of the Notes_OOP class
        Notes_OOP myCar = new Notes_OOP(); // 'new' creates the object

        // Access the object's properties
        System.out.println("Car make: " + myCar.make);
        System.out.println("Car model: " + myCar.model);
        System.out.println("Car year: " + myCar.year);
        System.out.println("Car price: $" + myCar.price);
        System.out.println("Is running: " + myCar.isRunning);

        // Call the object's methods
        myCar.start();  // Start the car
        myCar.drive();  // Drive the car
        myCar.brake();  // Brake the car
        myCar.stop();   // Stop the car

        // ── SECTION 5: MULTIPLE OBJECTS ───────────────────────
        // You can create multiple objects from the same class
        // Each has its own properties and state

        Notes_OOP car2 = new Notes_OOP(); // Second car object
        car2.make = "Toyota";    // Change properties for this object
        car2.model = "Camry";
        car2.year = 2023;
        car2.price = 25000.00;

        System.out.println("\nSecond car:");
        System.out.println("Make: " + car2.make);
        System.out.println("Model: " + car2.model);

        car2.start();  // Start the second car
        car2.drive();  // Drive the second car
    }
}

// ── KEY TAKEAWAYS ──────────────────────────────────────────
// 1. Classes are blueprints for creating objects
// 2. Objects have properties (instance variables) and behaviors (methods)
// 3. Use 'new ClassName()' to create object instances
// 4. Each object has its own copy of instance variables
// 5. Methods can access and modify object properties
// 6. Multiple objects can be created from the same class

// ── NEXT STEP ──────────────────────────────────────────────
// Now open Exercise_OOP.java and complete the exercises!