/*
 * ============================================================
 *  PROJECT: SHOPPING CART PROGRAM  |  Module 01  |  Topic 06
 * ============================================================
 *  WHAT IS THIS PROJECT?
 *  A simple shopping cart that lets users add items, specify
 *  quantities and prices, then calculates the total cost.
 *  This combines variables, user input, and arithmetic operations
 *  into a practical, real-world program.
 *
 *  WHAT YOU WILL LEARN:
 *  - Collecting multiple types of user input
 *  - Performing calculations with user data
 *  - Formatting output nicely
 *  - Building interactive console applications
 *
 *  HOW TO RUN:
 *  1. Compile: javac ShoppingCart.java
 *  2. Run: java ShoppingCart
 *  3. Enter item details when prompted
 *  4. See your total cost calculated!
 * ============================================================
 */

import java.util.Scanner; // For reading user input

public class ShoppingCart {
    public static void main(String[] args) {

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Display welcome message
        System.out.println("🛒 Welcome to the Shopping Cart! 🛒");
        System.out.println("Let's calculate the total cost of your purchase.\n");

        // ── GETTING ITEM INFORMATION ──────────────────────────
        // Ask user for item details

        System.out.print("What item would you like to purchase? ");
        String item = scanner.nextLine(); // Read item name

        System.out.print("What is the price for each " + item + "? $");
        double price = scanner.nextDouble(); // Read price per item

        System.out.print("How many " + item + "(s) would you like? ");
        int quantity = scanner.nextInt(); // Read quantity

        // ── CALCULATING TOTAL ──────────────────────────────────
        // Use arithmetic to calculate the total cost

        double total = price * quantity; // Multiply price by quantity

        // ── DISPLAYING RECEIPT ────────────────────────────────
        // Show a nicely formatted receipt

        System.out.println("\n--- Your Receipt ---");
        System.out.println("Item: " + item);
        System.out.println("Price per item: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total cost: $" + total);
        System.out.println("Thank you for shopping with us! 🎉");

        // Close the scanner
        scanner.close();
    }
}

/*
 * SAMPLE RUN:
 * Welcome to the Shopping Cart!
 * What item would you like to purchase? Pizza
 * What is the price for each Pizza? 15.99
 * How many Pizzas would you like? 2
 *
 * Your Receipt:
 * Item: Pizza
 * Price per item: $15.99
 * Quantity: 2
 * Total cost: $31.98
 * Thank you for shopping with us!
 */