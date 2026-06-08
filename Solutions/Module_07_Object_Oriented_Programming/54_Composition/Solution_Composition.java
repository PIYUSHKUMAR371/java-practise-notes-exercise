/* INSTRUCTOR SOLUTION - DO NOT SHARE */
/*
 * ============================================================
 *  EXERCISES  |  Composition  |  Module 7  |  Topic 54
 * ============================================================
 *  HOW TO USE THIS FILE:
 *  1. Try to complete each exercise WITHOUT looking at the Notes
 *  2. If you get stuck, look at Notes_Composition.java
 *  3. Modify your code and experiment until it works
 *  4. Don't just copy-paste - try to understand it!
 *
 *  DIFFICULTY LEVELS:
 *  ⭐         = Beginner (follow the pattern from notes)
 *  ⭐⭐       = Intermediate (think about the problem)
 *  ⭐⭐⭐     = Challenge (push yourself!)
 *
 * ============================================================
 */

public class Solution_Composition {
    public static void main(String[] args) {
        
        System.out.println("Exercise 1: " + "Composition Example");
        Room[] rooms = {new Room("Kitchen"), new Room("Hall")};
        House house = new House(rooms);
        house.printRooms();
        
        System.out.println("
Exercise 2: Intermediate Challenge");
        System.out.println("Room count: " + house.rooms.length);
        
        System.out.println("
Exercise 3: Advanced Challenge");
        house.printRooms();
        
        System.out.println("
All exercises completed!");
    }

    static class Room {
        String name;

        Room(String name) {
            this.name = name;
        }
    }

    static class House {
        Room[] rooms;

        House(Room[] rooms) {
            this.rooms = rooms;
        }

        void printRooms() {
            for (Room room : rooms) {
                System.out.println(room.name);
            }
        }
    }