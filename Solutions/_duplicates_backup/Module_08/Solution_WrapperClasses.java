/* Instructor solution for WrapperClasses exercises */
public class Solution_WrapperClasses {
    public static void main(String[] args) {
        System.out.println("Exercise 1: WrapperClasses Example");
        Integer number = 100;
        System.out.println("Boxed: " + number);

        System.out.println("\nExercise 2: Intermediate Challenge");
        int value = number + 20;
        System.out.println("Unboxed sum: " + value);

        System.out.println("\nExercise 3: Advanced Challenge");
        int parsed = Integer.parseInt("123");
        System.out.println("Parsed int: " + parsed);
    }
}
