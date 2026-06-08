/* Instructor solution for Methods exercises */
public class Solution_Methods {
    public static void main(String[] args) {
        System.out.println("Exercise 1: Methods Example");
        greet();

        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println("Product: " + multiply(4, 5));

        System.out.println("\nExercise 3: Advanced Challenge");
        System.out.println("Square of 6: " + square(6));
    }

    public static void greet() {
        System.out.println("Hello from a method!");
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int square(int x) {
        return x * x;
    }
}
