/* Instructor solution for OverloadedMethods exercises */
public class Solution_OverloadedMethods {
    public static void main(String[] args) {
        System.out.println("Exercise 1: OverloadedMethods Example");
        System.out.println("3 + 4 = " + add(3, 4));

        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println("3 + 4 + 5 = " + add(3, 4, 5));

        System.out.println("\nExercise 3: Advanced Challenge");
        System.out.println("1.5 + 2.5 = " + add(1.5, 2.5));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
