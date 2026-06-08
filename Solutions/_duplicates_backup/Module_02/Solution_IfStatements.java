/* Instructor solutions for If Statements exercises */
public class Solution_IfStatements {
    public static void main(String[] args) {
        // Solution Exercise 1: Check if a number is positive
        int number = 5;
        if (number > 0) {
            System.out.println("Positive");
        }

        // Solution Exercise 2: Check even or odd
        int value = 4;
        if (value % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Solution Exercise 3: Vote eligibility
        int age = 18;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}
