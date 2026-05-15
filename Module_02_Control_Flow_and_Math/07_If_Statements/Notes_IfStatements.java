/*
 * ============================================================
 *  IF STATEMENTS IN JAVA  |  Module 02  |  Topic 07
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  If statements let your program make decisions! They're like
 *  choosing what to do based on conditions. "If it's raining,
 *  take an umbrella. If you're hungry, eat lunch." If statements
 *  check if something is true, and if so, run certain code.
 *
 *  WHY DO WE NEED THIS?
 *  Programs need to respond differently based on user input,
 *  data, or conditions. Without if statements, programs would
 *  always do the same thing, which wouldn't be very useful.
 *
 *  HOW TO READ THIS FILE:
 *  - Read each section top to bottom
 *  - Every line has a comment explaining what it does
 *  - Try changing the values and re-running to experiment
 *  - After reading, go to Exercise_IfStatements.java and try it yourself
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #07 at timestamp
 * ============================================================
 */

public class Notes_IfStatements {
    public static void main(String[] args) {

        // ── SECTION 1: BASIC IF STATEMENT ─────────────────────
        // If the condition is true, execute the code block

        int age = 18; // Try changing this value

        if (age >= 18) { // Condition: is age greater than or equal to 18?
            System.out.println("You are an adult!"); // This runs if true
        }

        // ── SECTION 2: IF-ELSE STATEMENT ─────────────────────
        // If condition is true, run first block. Otherwise, run else block

        int temperature = 25; // Try changing this

        if (temperature > 30) { // Hot weather
            System.out.println("It's hot outside!");
        } else { // Not hot (else case)
            System.out.println("It's not too hot.");
        }

        // ── SECTION 3: IF-ELSE IF-ELSE CHAIN ─────────────────
        // Check multiple conditions in order

        int score = 85; // Try different scores: 95, 85, 75, 65

        if (score >= 90) { // First condition
            System.out.println("Grade: A");
        } else if (score >= 80) { // Second condition (only if first is false)
            System.out.println("Grade: B");
        } else if (score >= 70) { // Third condition
            System.out.println("Grade: C");
        } else { // None of the above
            System.out.println("Grade: F");
        }

        // ── SECTION 4: BOOLEAN CONDITIONS ────────────────────
        // Conditions can use boolean variables directly

        boolean isRaining = true; // Try changing to false
        boolean hasUmbrella = false; // Try changing to true

        if (isRaining) { // If it's raining...
            System.out.println("It's raining!");
            if (hasUmbrella) { // Nested if: check umbrella inside raining check
                System.out.println("Good thing you have an umbrella!");
            } else {
                System.out.println("You might get wet!");
            }
        } else { // Not raining
            System.out.println("No rain today!");
        }

        // ── SECTION 5: COMPARISON OPERATORS ──────────────────
        // Common operators used in conditions

        int a = 10;
        int b = 20;

        if (a == b) { // Equal to
            System.out.println("a equals b");
        }
        if (a != b) { // Not equal to
            System.out.println("a does not equal b");
        }
        if (a < b) { // Less than
            System.out.println("a is less than b");
        }
        if (a <= b) { // Less than or equal
            System.out.println("a is less than or equal to b");
        }
        if (a > b) { // Greater than
            System.out.println("a is greater than b");
        }
        if (a >= b) { // Greater than or equal
            System.out.println("a is greater than or equal to b");
        }
    }
}

// ── KEY TAKEAWAYS ──────────────────────────────────────────
// 1. if checks a condition and runs code if true
// 2. else runs code when if condition is false
// 3. else if checks additional conditions in order
// 4. Conditions use comparison operators: ==, !=, <, >, <=, >=
// 5. You can nest if statements inside other if statements
// 6. Boolean variables can be used directly as conditions

// ── NEXT STEP ──────────────────────────────────────────────
// Now open Exercise_IfStatements.java and complete the exercises!