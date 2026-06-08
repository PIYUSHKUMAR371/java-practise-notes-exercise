/* Instructor solution for InputArray exercises */
import java.util.Scanner;

public class Solution_InputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercise 1: InputArray Example");
        int[] values = new int[2];
        values[0] = scanner.nextInt();
        values[1] = scanner.nextInt();
        System.out.println("Read: " + values[0] + ", " + values[1]);

        System.out.println("\nExercise 2: Intermediate Challenge");
        int sum = values[0] + values[1];
        System.out.println("Sum = " + sum);

        System.out.println("\nExercise 3: Advanced Challenge");
        System.out.println("Average = " + (double) sum / values.length);

        scanner.close();
    }
}
