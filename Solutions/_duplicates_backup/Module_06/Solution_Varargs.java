/* Instructor solution for Varargs exercises */
public class Solution_Varargs {
    public static void main(String[] args) {
        System.out.println("Exercise 1: Varargs Example");
        System.out.println("Sum = " + sum(2, 3));

        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println("Sum = " + sum(1, 2, 3, 4));

        System.out.println("\nExercise 3: Advanced Challenge");
        System.out.println("Sum = " + sum(5, 10, 15, 20, 25));
    }

    public static int sum(int... values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
}
