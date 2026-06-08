/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  INTRODUCTION TO OOP  |  Module 07
 * ============================================================
 *  INSTRUCTIONS:
 *  - Complete each exercise below
 *  - Each exercise has a clear comment telling you what to do
 *  - The expected output is shown in a comment above each task
 *  - Try to solve it WITHOUT looking at the Notes file first!
 *  - If you get stuck, look at Notes_OOP.java for help
 *
 *  DIFFICULTY LEVELS:
 *  ⭐         = Beginner (just follow the pattern from notes)
 *  ⭐⭐       = Intermediate (think a little)
 *  ⭐⭐⭐     = Challenge (push yourself!)
 * ============================================================
 */

public class Solution_OOP {
    public static void main(String[] args) {
        
        // ── EXERCISE 1 ⭐ ──────────────────────────────────────
        // Task: Create a simple Person class with name and age properties, and a greet method
        // Expected output: Hello, I'm John and I'm 25 years old!
        Person john = new Person("John", 25);
        john.greet();
        
        // ── EXERCISE 2 ⭐⭐ ────────────────────────────────────
        // Task: Create a Book class with title, author, and pages. Add a read method
        // Expected output: Reading "Java Basics" by Alice, 300 pages
        Book book = new Book("Java Basics", "Alice", 300);
        book.read();
        
        // ── EXERCISE 3 ⭐⭐⭐ ──────────────────────────────────
        // Task: Create a BankAccount class with balance and methods to deposit/withdraw
        // Expected output:
        // Initial balance: $1000.00
        // After deposit $500: $1500.00
        // After withdraw $200: $1300.00
        BankAccount account = new BankAccount(1000.00);
        System.out.printf("Initial balance: $%.2f\n", account.getBalance());
        account.deposit(500.00);
        System.out.printf("After deposit $500: $%.2f\n", account.getBalance());
        account.withdraw(200.00);
        System.out.printf("After withdraw $200: $%.2f\n", account.getBalance());
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void greet() {
            System.out.println("Hello, I'm " + name + " and I'm " + age + " years old!");
        }
    }

    static class Book {
        String title;
        String author;
        int pages;

        Book(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
        }

        void read() {
            System.out.println("Reading \"" + title + "\" by " + author + ", " + pages + " pages");
        }
    }

    static class BankAccount {
        private double balance;

        BankAccount(double balance) {
            this.balance = balance;
        }

        double getBalance() {
            return balance;
        }

        void deposit(double amount) {
            balance += amount;
        }

        void withdraw(double amount) {
            balance -= amount;
        }
    }
}
