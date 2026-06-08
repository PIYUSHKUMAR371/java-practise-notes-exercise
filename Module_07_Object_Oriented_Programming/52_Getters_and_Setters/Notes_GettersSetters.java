/*
 * ============================================================
 *  GettersSetters  |  Module 7  |  Topic 52
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Accessor methods This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_GettersSetters.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #52
 * ============================================================
 */

public class Notes_GettersSetters {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Lina");
        person.setAge(24);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }

    static class Person {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age >= 0) {
                this.age = age;
            }
        }
    }
}
