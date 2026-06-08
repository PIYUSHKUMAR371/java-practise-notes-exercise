/*
 * ============================================================
 *  Super  |  Module 7  |  Topic 45
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Access parent class This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_Super.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #45
 * ============================================================
 */

public class Notes_Super {
    public static void main(String[] args) {
        Car car = new Car("Honda", 2023);
        car.printDetails();
    }

    static class Vehicle {
        String brand;
        int year;

        Vehicle(String brand, int year) {
            this.brand = brand;
            this.year = year;
        }
    }

    static class Car extends Vehicle {
        Car(String brand, int year) {
            super(brand, year);
        }

        void printDetails() {
            System.out.println("Car: " + brand + " " + year);
        }
    }
}
