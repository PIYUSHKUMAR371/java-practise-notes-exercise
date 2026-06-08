/*
 * ============================================================
 *  CONSTRUCTORS IN JAVA  |  Module 07  |  Topic 40
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Constructors are special methods that run when you create
 *  a new object. They're like the "setup" or "initialization"
 *  code for objects. Just like how you set up a new phone
 *  when you first get it, constructors set up your objects
 *  with initial values.
 *
 *  WHY DO WE NEED THIS?
 *  Without constructors, objects would start with default
 *  or garbage values. Constructors ensure objects are
 *  properly initialized and ready to use.
 *
 *  HOW TO READ THIS FILE:
 *  - Read each section top to bottom
 *  - Every line has a comment explaining what it does
 *  - Try changing the values and re-running to experiment
 *  - After reading, go to Exercise_Constructors.java and try it yourself
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #40 at timestamp
 * ============================================================
 */

public class Notes_Constructors {
    public static void main(String[] args) {
        Student student = new Student("Mia", 20);
        System.out.println(student.name + " is " + student.age + " years old.");
    }

    static class Student {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
