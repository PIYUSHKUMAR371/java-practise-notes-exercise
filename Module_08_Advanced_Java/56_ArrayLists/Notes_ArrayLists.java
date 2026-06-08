/*
 * ============================================================
 *  ArrayLists  |  Module 8  |  Topic 56
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Resizable arrays This is a fundamental concept in Java programming
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
 *  - When done, move to Exercise_ArrayLists.java
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #56
 * ============================================================
 */

import java.util.ArrayList;
import java.util.List;

public class Notes_ArrayLists {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Fruits list size: " + fruits.size());
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
