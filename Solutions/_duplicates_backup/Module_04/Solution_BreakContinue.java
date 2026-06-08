/* Instructor solution for Break and Continue exercises */
public class Solution_BreakContinue {
    public static void main(String[] args) {
        System.out.println("Exercise 1: BreakContinue Example");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\nExercise 2: Intermediate Challenge");
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("\nExercise 3: Advanced Challenge");
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd: " + i);
        }
    }
}
