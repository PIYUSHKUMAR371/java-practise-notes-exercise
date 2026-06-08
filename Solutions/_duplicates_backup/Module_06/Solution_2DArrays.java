/* Instructor solution for 2D Arrays exercises */
public class Solution_2DArrays {
    public static void main(String[] args) {
        System.out.println("Exercise 1: 2DArrays Example");
        int[][] grid = {{1, 2}, {3, 4}};
        System.out.println(grid[1][1]);

        System.out.println("\nExercise 2: Intermediate Challenge");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nExercise 3: Advanced Challenge");
        int total = 0;
        for (int[] row : grid) {
            for (int value : row) {
                total += value;
            }
        }
        System.out.println("Total = " + total);
    }
}
