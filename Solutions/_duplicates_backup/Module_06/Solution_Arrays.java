/* Instructor solution for Arrays exercises */
public class Solution_Arrays {
    public static void main(String[] args) {
        System.out.println("Exercise 1: Arrays Example");
        int[] nums = {1, 2, 3};
        System.out.println(nums[1]);

        System.out.println("\nExercise 2: Intermediate Challenge");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Value[" + i + "]=" + nums[i]);
        }

        System.out.println("\nExercise 3: Advanced Challenge");
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        System.out.println("Total = " + total);
    }
}
