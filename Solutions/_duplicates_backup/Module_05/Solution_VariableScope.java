/* Instructor solution for VariableScope exercises */
public class Solution_VariableScope {
    public static int globalValue = 10;

    public static void main(String[] args) {
        System.out.println("Exercise 1: VariableScope Example");
        int localValue = 5;
        System.out.println("Global: " + globalValue + ", Local: " + localValue);

        System.out.println("\nExercise 2: Intermediate Challenge");
        if (localValue > 0) {
            int innerValue = localValue * 2;
            System.out.println("Inner value: " + innerValue);
        }

        System.out.println("\nExercise 3: Advanced Challenge");
        printValue();
    }

    public static void printValue() {
        System.out.println("Accessing global value: " + globalValue);
    }
}
