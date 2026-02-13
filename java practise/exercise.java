// import java.util.Scanner;

// public class exercise {
//     public static void main(String[] args){

//         //calculate area of rectangle

//         double length;
//         double width;
//         double area;
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("enetr the width");
//         width = scanner.nextDouble();

//         System.out.println("enetr the length");
//         length = scanner.nextDouble();

//         area=  (width * length);

//         System.out.println("the area is"+area);

//         scanner.close();
//     }
// }



// import java.util.Scanner; // Import the Scanner class to get user input

// /**
//  * A basic Java program that plays a simple Mad Libs game.
//  * The program prompts the user for various words and then prints a story using those words.
//  */
// public class exercise {

//     public static void main(String[] args) {
//         // Create a Scanner object to read user input from the console
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user for words and store them in String variables
//         System.out.println("Let's play Mad Libs! Please enter the following words:");

//         System.out.print("Enter a color: ");
//         String color = scanner.nextLine(); //

//         System.out.print("Enter a plural noun: ");
//         String pluralNoun = scanner.nextLine(); //

//         System.out.print("Enter a celebrity's name: ");
//         String celebrity = scanner.nextLine(); //

//         System.out.print("Enter an adjective: ");
//         String adjective = scanner.nextLine();

//         System.out.print("Enter a verb: ");
//         String verb = scanner.nextLine();

//         // Close the scanner to prevent resource leaks
//         scanner.close();

//         // Use the input words to construct and print the Mad Libs story
//         System.out.println("\n--- Your Mad Libs Story ---");
//         System.out.println("Roses are " + color);
//         System.out.println(pluralNoun + " are blue");
//         System.out.println("I love " + celebrity);
//         System.out.println("The " + adjective + " cat started to " + verb + " very loudly.");
//     }
// }



// import java.util.Scanner;

// public class exercise{
//     public static void main(String[] args){

//         //SHOPPING CART PROGRAM

//         Scanner scanner = new Scanner (System.in);

//         String item;
//         double price;
//         int quantity;
//         char currency = '$';
//         double total;

//         System.out.println("what item would you like to purchase");
//         item = scanner.nextLine();

//         System.out.println("what is the price for each?");
//         price = scanner.nextDouble();

//         System.out.println("what is the quantity");
//         quantity = scanner.nextInt();

//         total = price *quantity;
//         System.out.println(total);
//         System.out.println(item);
//         System.out.println("IN"+currency);

//         scanner.close();
//     }
// }



// import java.util.Scanner;
// public class exercise{
//     public static void main(String[] args) {
        
//         //HYPOTENUSE C = MATH.SQRT(A^2 = B^2)

//         Scanner scanner = new Scanner(System.in);

//         double a;
//         double b;
//         double c;

//         System.out.println("enetr the length of side A");
//         a = scanner.nextDouble();

//         System.out.println("enetr tehlength of side B");
//         b= scanner.nextDouble();

//         c= Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
//         System.out.println(c);
//         scanner.close();
//     }
// }



// import java.util.Scanner;
// public class exercise{
//     public static void main(String[] args) {

//         //Circumference = 2 * Math.PI * radius;
//         //area = Math.PI *Math.pow(radius,2);
//         //volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

//         Scanner scanner = new Scanner(System.in);

//         double radius;
//         double circumference;
//         double area;
//         double volume;

//     System.out.println("enter teh radius");
//     radius = scanner.nextDouble();

//     circumference = 2 * Math.PI * radius;
//     area = Math.PI *Math.pow (radius,2);
//     volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

//     System.out.println("the circumference is"+circumference+"cm");
//     System.out.println("the area is "+area+"cm^2");
//     System.out.println("the volume is"+volume+"cm^3");

// //     Common format specifiers
// // %s: for a String
// // %d: for a decimal integer (byte, short, int, long)
// // %f: for a floating-point number (float, double)
// // %c: for a single char character
// // %b: for a boolean value
// // %n: for a platform-independent newline character

//     System.out.printf("the circumference is %fcm\n",circumference);
//     System.out.printf("the area is %fcm^2\n",area);
//     System.out.printf("the circumference is %fcm^3\n",volume);

//     scanner.close();
//     }
// }



// import java.util.Scanner;
// public class exercise{
//     public static void main(String[] args) {
        
//         //compound interest calculator

//         Scanner scanner =new Scanner (System.in);

//         double principal;
//         double rate;
//         int timesCompounded; 
//         int years;
//         double amount;

//         System.out.println("Enter the principle amount");
//         principal = scanner.nextDouble();

//         System.out.println("Enter teh interest ( in % )");
//         rate = scanner.nextDouble()/100;

//         System.out.println("Enter the # of time scompounded per year");
//         timesCompounded = scanner.nextInt();

//         System.out.println("Enter teh # of years");
//         years = scanner.nextInt();

//         amount = principal * Math.pow(1 + rate / timesCompounded , timesCompounded * years);
//         System.out.println("'the amount after"+years+"is $"+amount);
//         scanner.close();
//     }
// }