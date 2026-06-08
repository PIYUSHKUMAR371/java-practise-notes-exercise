/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  ToString  |  Module 7  |  Topic 47
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_ToString.java
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

public class Solution_ToString {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "ToString Example");
        Book book = new Book("Java", "Sam");
        System.out.println(book);
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        System.out.println(book.toString());
        
        System.out.println("
Exercise 3: Advanced Challenge");
        Book book2 = new Book("Code", "Ann");
        System.out.println(book2);
        
        System.out.println("
All exercises completed!");
    }

    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "Book{" + "title='" + title + "', author='" + author + "'}";
        }
    }