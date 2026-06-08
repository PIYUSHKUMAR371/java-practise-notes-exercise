/*
 * ============================================================
 *  USER INPUT IN JAVA  |  Module 01  |  Topic 03
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  User input is how your program talks to the user! Instead of
 *  hardcoding values, you can ask the user for information.
 *  Think of it like a conversation - your program asks questions,
 *  the user types answers, and your program remembers them.
 *  This makes programs interactive and personalized.
 *
 *  WHY DO WE NEED THIS?
 *  Static programs are boring! User input makes apps useful -
 *  calculators, games, forms, etc. Without input, every user
 *  would get the same experience. Input makes programs dynamic.
 *
 *  HOW TO READ THIS FILE:
 *  - Read each section top to bottom
 *  - Every line has a comment explaining what it does
 *  - Try changing the values and re-running to experiment
 *  - After reading, go to Exercise_UserInput.java and try it yourself
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #03 at timestamp
 * ============================================================
 */

import java.util.Scanner;

public class Notes_UserInput {
    public static void main(String[] args) {
        // Scanner reads input from the user.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        System.out.println("Hello, " + userName + "!");
        System.out.println("You are " + userAge + " years old.");

        scanner.close();
    }
}
