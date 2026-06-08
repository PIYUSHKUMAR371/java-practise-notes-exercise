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

public class Notes_OOP {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 2025);
        car.start();
        car.drive();
        car.brake();
        car.stop();
    }

    static class Car {
        String make;
        String model;
        int year;
        boolean running;

        Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.running = false;
        }

        void start() {
            running = true;
            System.out.println(model + " started.");
        }

        void drive() {
            if (running) {
                System.out.println(model + " is driving.");
            }
        }

        void brake() {
            System.out.println(model + " is braking.");
        }

        void stop() {
            running = false;
            System.out.println(model + " stopped.");
        }
    }
}
