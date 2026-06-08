/*
 * ============================================================
 *  RuntimePolymorphism  |  Module 7  |  Topic 51
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Runtime polymorphism This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_RuntimePolymorphism.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #51
 * ============================================================
 */

public class Notes_RuntimePolymorphism {
    public static void main(String[] args) {
        Shape shape = new Square(4);
        System.out.println("Square area: " + shape.area());
    }

    static abstract class Shape {
        abstract int area();
    }

    static class Square extends Shape {
        int side;
        Square(int side) {
            this.side = side;
        }

        @Override
        int area() {
            return side * side;
        }
    }
}
