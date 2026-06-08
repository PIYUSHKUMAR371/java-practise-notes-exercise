/* Instructor solution for Threading exercises */
public class Solution_Threading {
    public static void main(String[] args) {
        System.out.println("Exercise 1: Threading Example");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running.");
            }
        });
        thread.start();

        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println("Main continues.");

        System.out.println("\nExercise 3: Advanced Challenge");
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Second thread.");
            }
        });
        thread2.start();
    }
}
