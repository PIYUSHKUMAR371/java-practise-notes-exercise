/*
 * ============================================================
 *  Interfaces  |  Module 7  |  Topic 49
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Define contracts This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_Interfaces.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #49
 * ============================================================
 */

public class Notes_Interfaces {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.drive();
    }

    interface Vehicle {
        void drive();
    }

    static class Car implements Vehicle {
        @Override
        public void drive() {
            System.out.println("Car is driving.");
        }
    }
}
