/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Generics  |  Module 9  |  Topic 66
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Generics.java
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

public class Solution_Generics {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Generics Example");
        Box<String> box = new Box<>();
        box.set("Hello");
        System.out.println(box.get());
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println(intBox.get());
        
        System.out.println("
Exercise 3: Advanced Challenge");
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);
        System.out.println(doubleBox.get());
        
        System.out.println("
All exercises completed!");
    }

    static class Box<T> {
        private T value;

        public void set(T value) {
            this.value = value;
        }

        public T get() {
            return value;
        }
    }