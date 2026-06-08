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
        int score = 72;

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 75) {
            System.out.println("Grade B");
        } else {
            System.out.println("Keep practicing!");
        }

        boolean isMember = true;
        if (isMember) {
            System.out.println("Discount applies.");
        }
    }
}
