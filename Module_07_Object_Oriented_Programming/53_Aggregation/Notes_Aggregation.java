/*
 * ============================================================
 *  Aggregation  |  Module 7  |  Topic 53
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Has-a relationship This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_Aggregation.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #53
 * ============================================================
 */

public class Notes_Aggregation {
    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Car car = new Car(engine, "Mustang");
        System.out.println(car.name + " uses engine " + car.engine.type);
    }

    static class Engine {
        String type;

        Engine(String type) {
            this.type = type;
        }
    }

    static class Car {
        Engine engine;
        String name;

        Car(Engine engine, String name) {
            this.engine = engine;
            this.name = name;
        }
    }
}
