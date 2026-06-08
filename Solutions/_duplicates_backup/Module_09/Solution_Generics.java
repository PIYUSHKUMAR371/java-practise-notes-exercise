/* Instructor solution for Generics exercises */
public class Solution_Generics {
    public static void main(String[] args) {
        System.out.println("Exercise 1: Generics Example");
        Box<String> box = new Box<>();
        box.set("Hello");
        System.out.println(box.get());

        System.out.println("\nExercise 2: Intermediate Challenge");
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println(intBox.get());

        System.out.println("\nExercise 3: Advanced Challenge");
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);
        System.out.println(doubleBox.get());
    }

    static class Box<T> {
        private T value;

        public void set(T value) {
            this.value = value;
        }

        public T get() {
            return value;
        }
    }
}
