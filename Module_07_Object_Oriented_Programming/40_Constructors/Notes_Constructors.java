/*
 * ============================================================
 *  CONSTRUCTORS IN JAVA  |  Module 07  |  Topic 40
 * ============================================================
 *  WHAT IS THIS TOPIC?
 *  Constructors are special methods that run when you create
 *  a new object. They're like the "setup" or "initialization"
 *  code for objects. Just like how you set up a new phone
 *  when you first get it, constructors set up your objects
 *  with initial values.
 *
 *  WHY DO WE NEED THIS?
 *  Without constructors, objects would start with default
 *  or garbage values. Constructors ensure objects are
 *  properly initialized and ready to use.
 *
 *  HOW TO READ THIS FILE:
 *  - Read each section top to bottom
 *  - Every line has a comment explaining what it does
 *  - Try changing the values and re-running to experiment
 *  - After reading, go to Exercise_Constructors.java and try it yourself
 *
 *  VIDEO REFERENCE: BroCode Java Full Course - Topic #40 at timestamp
 * ============================================================
 */

public class Notes_Constructors {

    // ── SECTION 1: INSTANCE VARIABLES ────────────────────────
    // These will be initialized by constructors

    String name;      // Person's name
    int age;         // Person's age
    double gpa;      // Person's GPA
    boolean isEnrolled; // Enrollment status

    // ── SECTION 2: CONSTRUCTOR WITH PARAMETERS ──────────────
    // This constructor takes parameters to initialize the object
    // It runs automatically when you create an object with 'new'

    Notes_Constructors(String a, int b, double c) { // Constructor signature
        this.name = a;        // 'this' refers to the current object
        this.age = b;         // Set the age
        this.gpa = c;         // Set the GPA
        this.isEnrolled = true; // Default to enrolled
    }

    // ── SECTION 3: CONSTRUCTOR METHOD ───────────────────────
    // Constructors can contain logic, not just assignments

    void study() { // Method to simulate studying
        System.out.println("This name " + name + " is enrolled and studying");
    }

    // ── SECTION 4: MAIN METHOD TO TEST ──────────────────────
    public static void main(String[] args) {

        // Create objects using the constructor
        Notes_Constructors student1 = new Notes_Constructors("Alice", 20, 3.8);
        Notes_Constructors student2 = new Notes_Constructors("Bob", 22, 3.5);

        // Access the initialized properties
        System.out.println("Student 1:");
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("GPA: " + student1.gpa);
        System.out.println("Enrolled: " + student1.isEnrolled);

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("GPA: " + student2.gpa);
        System.out.println("Enrolled: " + student2.isEnrolled);

        // Call methods on the objects
        student1.study();
        student2.study();
    }
}

// ── KEY TAKEAWAYS ──────────────────────────────────────────
// 1. Constructors initialize objects when created with 'new'
// 2. Constructor name matches the class name
// 3. Constructors can take parameters to set initial values
// 4. Use 'this' to refer to the current object's variables
// 5. Constructors run automatically - you don't call them directly

// ── NEXT STEP ──────────────────────────────────────────────
// Now open Exercise_Constructors.java and complete the exercises!