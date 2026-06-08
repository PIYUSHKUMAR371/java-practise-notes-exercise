/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Constructors  |  Module 7  |  Topic 40
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Constructors.java
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

public class Solution_Constructors {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Constructors Example");
        Car car = new Car("Red");
        System.out.println("Car color: " + car.color);
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        Car car2 = new Car("Blue", 4);
        System.out.println("Car2: " + car2.color + ", wheels=" + car2.wheels);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        System.out.println(car2.color.toUpperCase());
    }

    static class Car {
        String color;
        int wheels;

        Car(String color) {
            this.color = color;
            this.wheels = 4;
        }

        Car(String color, int wheels) {
            this.color = color;
            this.wheels = wheels;
        }
    }