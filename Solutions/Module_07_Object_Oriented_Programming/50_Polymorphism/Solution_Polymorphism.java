/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Polymorphism  |  Module 7  |  Topic 50
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Polymorphism.java
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

public class Solution_Polymorphism {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Polymorphism Example");
        Shape circle = new Circle();
        circle.draw();
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        Shape rectangle = new Rectangle();
        rectangle.draw();
        
        System.out.println("
Exercise 3: Advanced Challenge");
        printShape(new Circle());
        
        System.out.println("
All exercises completed!");
    }

    static void printShape(Shape shape) {
        shape.draw();
    }

    static class Shape {
        void draw() {
            System.out.println("Drawing shape");
        }
    }

    static class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing circle");
        }
    }

    static class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing rectangle");
        }
    }