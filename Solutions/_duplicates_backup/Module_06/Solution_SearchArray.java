/* Instructor solution for SearchArray exercises */
public class Solution_SearchArray {
    public static void main(String[] args) {
        System.out.println("Exercise 1: SearchArray Example");
        int[] numbers = {2, 4, 6, 8};
        int target = 6;
        boolean found = false;
        for (int number : numbers) {
            if (number == target) {
                found = true;
                break;
            }
        }
        System.out.println("Found = " + found);

        System.out.println("\nExercise 2: Intermediate Challenge");
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("Index = " + index);

        System.out.println("\nExercise 3: Advanced Challenge");
        int search = 7;
        found = false;
        for (int number : numbers) {
            if (number == search) {
                found = true;
            }
        }
        System.out.println(search + " found? " + found);
    }
}
