/* Instructor solutions for Module 01 - User Input exercises */
import java.util.Scanner;

public class Solution_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercise 1: read name and echo
        System.out.println("Please type a name and press Enter (Exercise 1):");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        // Exercise 2: read two integers and print sum
        System.out.println("Type two integers separated by space (Exercise 2):");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Sum = " + (x + y));
        scanner.nextLine(); // consume newline

        // Exercise 3: read a line and print its length
        System.out.println("Type a sentence (Exercise 3):");
        String sentence = scanner.nextLine();
        System.out.println("Length = " + sentence.length());

        scanner.close();
    }
}
