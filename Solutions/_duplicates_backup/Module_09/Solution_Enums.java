/* Instructor solution for Enums exercises */
public class Solution_Enums {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }

    public static void main(String[] args) {
        System.out.println("Exercise 1: Enums Example");
        Day day = Day.MONDAY;
        System.out.println(day);

        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println(day.name());

        System.out.println("\nExercise 3: Advanced Challenge");
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
