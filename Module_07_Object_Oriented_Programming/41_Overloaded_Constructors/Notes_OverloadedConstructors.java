/*
 * ============================================================
 *  OverloadedConstructors  |  Module 7  |  Topic 41
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Multiple constructors This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_OverloadedConstructors.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #41
 * ============================================================
 */

public class Notes_OverloadedConstructors {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics");
        Book book2 = new Book("Advanced Java", 450);

        System.out.println(book1.title + " has " + book1.pages + " pages.");
        System.out.println(book2.title + " has " + book2.pages + " pages.");
    }

    static class Book {
        String title;
        int pages;

        Book(String title) {
            this.title = title;
            this.pages = 100;
        }

        Book(String title, int pages) {
            this.title = title;
            this.pages = pages;
        }
    }
}
