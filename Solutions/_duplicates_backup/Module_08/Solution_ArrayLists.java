/* Instructor solution for ArrayLists exercises */
import java.util.ArrayList;

public class Solution_ArrayLists {
    public static void main(String[] args) {
        System.out.println("Exercise 1: ArrayLists Example");
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list);

        System.out.println("\nExercise 2: Intermediate Challenge");
        list.remove("Apple");
        System.out.println(list);

        System.out.println("\nExercise 3: Advanced Challenge");
        list.add("Cherry");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
