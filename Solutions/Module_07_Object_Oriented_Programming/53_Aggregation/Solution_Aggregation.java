/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Aggregation  |  Module 7  |  Topic 53
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Aggregation.java
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

public class Solution_Aggregation {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Aggregation Example");
        Engine engine = new Engine("V8");
        Car car = new Car(engine);
        car.printEngine();
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        System.out.println("Engine type: " + car.engine.type);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        System.out.println("Car has an engine: " + (car.engine != null));
        
        System.out.println("
All exercises completed!");
    }

    static class Engine {
        String type;

        Engine(String type) {
            this.type = type;
        }
    }

    static class Car {
        Engine engine;

        Car(Engine engine) {
            this.engine = engine;
        }

        void printEngine() {
            System.out.println("Engine: " + engine.type);
        }
    }