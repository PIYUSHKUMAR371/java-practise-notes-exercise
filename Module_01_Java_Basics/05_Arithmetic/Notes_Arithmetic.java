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

        // ── SECTION 1: BASIC ARITHMETIC OPERATORS ─────────────
        // These are the four basic math operations

        int a = 10;
        int b = 3;

        int sum = a + b;        // Addition: 10 + 3 = 13
        int difference = a - b; // Subtraction: 10 - 3 = 7
        int product = a * b;    // Multiplication: 10 * 3 = 30
        int quotient = a / b;   // Division: 10 / 3 = 3 (integer division)

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // ── SECTION 2: DECIMAL DIVISION ───────────────────────
        // Use double for decimal results

        double x = 10.0;
        double y = 3.0;
        double decimalQuotient = x / y; // 10.0 / 3.0 = 3.333...

        System.out.println("\nDecimal division:");
        System.out.println(x + " / " + y + " = " + decimalQuotient);

        // ── SECTION 3: MODULO OPERATOR ────────────────────────
        // % gives the remainder of division
        // Useful for checking if numbers are even/odd

        int remainder = a % b;  // 10 % 3 = 1
        System.out.println("\nModulo:");
        System.out.println(a + " % " + b + " = " + remainder);

        // Check if even or odd
        int number = 7;
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        // ── SECTION 4: OPERATOR PRECEDENCE ────────────────────
        // Order of operations: PEMDAS (Parentheses, Exponents, Multiplication/Division, Addition/Subtraction)

        int result1 = 2 + 3 * 4;     // 3*4 first = 14, then +2 = 16
        int result2 = (2 + 3) * 4;   // 2+3 first = 5, then *4 = 20

        System.out.println("\nOperator precedence:");
        System.out.println("2 + 3 * 4 = " + result1);
        System.out.println("(2 + 3) * 4 = " + result2);

        // ── SECTION 5: COMPOUND ASSIGNMENT ────────────────────
        // Shorthand for operations on the same variable

        int counter = 5;
        System.out.println("\nOriginal counter: " + counter);

        counter += 3;  // counter = counter + 3;  -> 8
        System.out.println("After += 3: " + counter);

        counter -= 2;  // counter = counter - 2;  -> 6
        System.out.println("After -= 2: " + counter);

        counter *= 4;  // counter = counter * 4;  -> 24
        System.out.println("After *= 4: " + counter);

        counter /= 6;  // counter = counter / 6;  -> 4
        System.out.println("After /= 6: " + counter);

        counter %= 3;  // counter = counter % 3;  -> 1
        System.out.println("After %= 3: " + counter);

        // ── SECTION 6: INCREMENT/DECREMENT ─────────────────────
        // Add or subtract 1

        int num = 10;
        System.out.println("\nIncrement/Decrement:");
        System.out.println("Original: " + num);

        num++;  // num = num + 1;  -> 11
        System.out.println("After ++: " + num);

        num--;  // num = num - 1;  -> 10
        System.out.println("After --: " + num);

        // ── SECTION 7: PRACTICAL EXAMPLE ──────────────────────
        // Calculate total cost with tax

        double itemPrice = 29.99;
        int quantity = 3;
        double taxRate = 0.08; // 8% tax

        double subtotal = itemPrice * quantity;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        System.out.println("\n--- Receipt ---");
        System.out.println("Item price: $" + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax (8%): $" + tax);
        System.out.println("Total: $" + total);
    }
}

// ── KEY TAKEAWAYS ──────────────────────────────────────────
// 1. Basic operators: + (add), - (subtract), * (multiply), / (divide)
// 2. % (modulo) gives remainder of division
// 3. Use double for decimal division results
// 4. PEMDAS order: Parentheses, Exponents, Multiply/Divide, Add/Subtract
// 5. Compound assignment: +=, -=, *=, /=, %=
// 6. Increment (++), decrement (--)

// ── NEXT STEP ──────────────────────────────────────────────
// Now open Exercise_Arithmetic.java and complete the exercises!