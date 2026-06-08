/* Instructor solution for NestedLoops exercises */
public class Solution_NestedLoops {
    public static void main(String[] args) {
        System.out.println("Exercise 1: NestedLoops Example");
        for (int row = 1; row <= 2; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print(row * col + " ");
            }
            System.out.println();
        }

        System.out.println("\nExercise 2: Intermediate Challenge");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nExercise 3: Advanced Challenge");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }
}
