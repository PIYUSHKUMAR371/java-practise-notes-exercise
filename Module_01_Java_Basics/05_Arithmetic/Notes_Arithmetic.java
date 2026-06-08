/*
 * ============================================================
 *  ARITHMETIC OPERATIONS  |  Module 01  |  Topic 05
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Arithmetic is math in programming! Just like in school,
 *  you can add, subtract, multiply, and divide numbers.
 *  But in Java, you use symbols like + - * / instead of words.
 *  These operations let you calculate totals, averages, and more.
 *
 *  WHY DO WE NEED THIS?
 *  Math is everywhere in programming - games need scores,
 *  apps need calculations, websites need totals. Without
 *  arithmetic, programs would just display static information.
 *
 *  HOW TO READ THIS FILE:
 *  - Read each section top to bottom
 *  - Every line has a comment explaining what it does
 *  - Try changing the values and re-running to experiment
 *  - After reading, go to Exercise_Arithmetic.java and try it yourself
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #05 at timestamp
 * ============================================================
 */

public class Notes_Arithmetic {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Integer division: " + (a / b));
        System.out.println("Remainder with modulo: " + (a % b));

        double x = 12.0;
        double y = 5.0;
        System.out.println("Decimal division: " + (x / y));
    }
}
