/*
 * ============================================================
 *  Composition  |  Module 7  |  Topic 54
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Composition relationship This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_Composition.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #54
 * ============================================================
 */

public class Notes_Composition {
    public static void main(String[] args) {
        Book book = new Book("Java Guide");
        System.out.println(book.title + " has author " + book.author.name);
    }

    static class Author {
        String name;

        Author(String name) {
            this.name = name;
        }
    }

    static class Book {
        String title;
        Author author;

        Book(String title) {
            this.title = title;
            this.author = new Author("BroCode");
        }
    }
}
