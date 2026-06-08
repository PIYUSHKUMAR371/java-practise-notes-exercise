/*
 * ============================================================
 *  HashMaps  |  Module 9  |  Topic 67
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Key-value pairs This is a fundamental concept in Java programming
 *  that you'll use frequently. Understanding this will help you
 *  write better code and solve problems more effectively.
 *
 *  WHY DO WE NEED THIS?
 *  This concept is important because it helps organize code,
 *  make programs more efficient, and creates more readable solutions.
 *
 *  HOW TO READ THIS FILE:
 *  - Read each section from top to bottom
 *  - Read the comments - they explain every important line
 *  - Try running this file and watch the output
 *  - Change values and run it again to experiment
 *  - When done, move to Exercise_HashMaps.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #67
 * ============================================================
 */

import java.util.HashMap;
import java.util.Map;

public class Notes_HashMaps {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 92);
        scores.put("Bob", 85);

        System.out.println("Alice's score: " + scores.get("Alice"));
        for (String name : scores.keySet()) {
            System.out.println(name + ": " + scores.get(name));
        }
    }
}
