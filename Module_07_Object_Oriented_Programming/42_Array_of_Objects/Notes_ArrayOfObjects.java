/*
 * ============================================================
 *  ArrayOfObjects  |  Module 7  |  Topic 42
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Arrays of objects This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_ArrayOfObjects.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #42
 * ============================================================
 */

public class Notes_ArrayOfObjects {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Asha", 28),
            new Person("Leo", 32)
        };

        for (Person person : people) {
            System.out.println(person.name + " is " + person.age + " years old.");
        }
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
