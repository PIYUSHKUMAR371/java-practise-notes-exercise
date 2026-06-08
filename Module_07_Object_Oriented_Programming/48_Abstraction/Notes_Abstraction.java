/*
 * ============================================================
 *  Abstraction  |  Module 7  |  Topic 48
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Hide implementation details This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_Abstraction.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #48
 * ============================================================
 */

public class Notes_Abstraction {
    public static void main(String[] args) {
        Shape shape = new Circle(3.0);
        System.out.println("Area: " + shape.area());
    }

    static abstract class Shape {
        abstract double area();
    }

    static class Circle extends Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }
}
