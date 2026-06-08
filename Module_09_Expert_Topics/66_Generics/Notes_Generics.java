/*
 * ============================================================
 *  Generics  |  Module 9  |  Topic 66
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Generic types This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_Generics.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #66
 * ============================================================
 */

public class Notes_Generics {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("Java Book");
        System.out.println("Box contains: " + box.getItem());
    }

    static class Box<T> {
        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }
}
