/* Instructor solution for Multithreading exercises */
public class Solution_Multithreading {
    public static void main(String[] args) {
        System.out.println("Exercise 1: Multithreading Example");
        Thread t1 = new Thread(new MessageTask("One"));
        Thread t2 = new Thread(new MessageTask("Two"));
        t1.start();
        t2.start();

        System.out.println("\nExercise 2: Intermediate Challenge");
        System.out.println("Threads started.");

        System.out.println("\nExercise 3: Advanced Challenge");
        Thread t3 = new Thread(new MessageTask("Three"));
        t3.start();
    }

    static class MessageTask implements Runnable {
        private final String msg;

        MessageTask(String msg) {
            this.msg = msg;
        }

        @Override
        public void run() {
            System.out.println("Thread " + msg + " is running.");
        }
    }
}
