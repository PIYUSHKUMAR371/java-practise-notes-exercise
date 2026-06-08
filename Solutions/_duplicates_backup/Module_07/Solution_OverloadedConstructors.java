/* Instructor solution for OverloadedConstructors exercises */
public class Solution_OverloadedConstructors {
    public static void main(String[] args) {
        System.out.println("Exercise 1: OverloadedConstructors Example");
        Person p1 = new Person("Sara");
        System.out.println(p1.name + " " + p1.age);

        System.out.println("\nExercise 2: Intermediate Challenge");
        Person p2 = new Person("Joe", 30);
        System.out.println(p2.name + " " + p2.age);

        System.out.println("\nExercise 3: Advanced Challenge");
        Person p3 = new Person("Mia", 25);
        System.out.println(p3.name + " " + p3.age);
    }

    static class Person {
        String name;
        int age;

        Person(String name) {
            this.name = name;
            this.age = 18;
        }

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
