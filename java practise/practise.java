//single line comment
/*MULTIPLE
 * LINE
 * COMMENT
 */


//test to check the compiler
// public class practise{
//     public static void main(String[] args) {
//         System.out.println("Hello from MyClass!");
//     }
// }



// public class practise{ //make sure to put your file name in class

//     public static void main(String[] args){ //for your java to run code you need main function
//         System.out.print("i like pizza");
//         System.out.print("i like pizza,it's really good");

//         System.out.println("i like pizza");//we use 'ln' for our output to be in next line,, and '\n' works as well at the last of the text
//         System.out.println("i like pizza,it's really good");

//         System.out.print("i like pizza\n");//'\n' also does the ame thing as'ln' which is to put our outputs in another line
//         System.out.print("i like pizza,it's really good\n");

//         System.out.println();//there is a trick to write the output syntax faster,it includes to writng 'sout' then press 'tab' OR 'enter'
//     }
// }



// public class practise{
//     public static void main(String[] args) {

//         // variable = a resuable container for a value
//         //            a variable behaves as if it was the value it contains

//         //primitive = simple value stored diredtly in memory (stack)
//         //Reference = memory address (stack) that points to the (heap)

//         //primitive vs refrence
//         //int          string
//         //double       array
//         //char         object
//         //boolean      

//         //2 Steps to careting a variable
//         //1.declaration
//         //2.assignment

//         int age=21;//if we declare value as an integers they can only store and hold values as an integers
//         int year= 2025;
//         int quantity = 12;

//         System.out.println(age);
//         System.out.println(year);
//         System.out.println(quantity);
//         System.out.println("this yaer is "+year);

//         double gpa = 3.5;
//         double price = 23.32;
//         double  temperature = 32.21;

//         System.out.println(gpa);
//         System.out.println(price);
//         System.out.println(temperature);

//         char grade ='A';
//         char symbol = '%';
//         char currency = '$';

//         System.out.println(grade);
//         System.out.println(symbol);
//         System.out.println(currency);

//         boolean isStudent = true; //camelcase (basically naming) ;-> if we are joing two words then the first letter of the first word is small and second letter of the second word is capital
//         boolean forSale = false;
//         boolean isOnline = true;

//         System.out.println(isStudent);
//         System.out.println(forSale);
//         System.out.println(isOnline);

//         String name = "Bro Code";//make sure to remeber taht "S" in "string" is CAPITAL
//         String food = "pizza";
//         String email = "fake123@gamail .com";//sring can contain nuber but we treat them as number and can not perform mathematics so arthimics
//         String color = "red";

//         System.out.println("hello" + name);//string cantenation
//         System.out.println("your faviourite food is " +food);
//         System.out.println("your email is"+ email + " and your fav color is "+color); //make sure that you can cantanate more than one varibales

//         if(isStudent){ // if this boolean character is true then this'if comdition' will perform itself
//             System.out.println("you are a student");
//         }
//         else{//will perform if teh boolean condition is false
//             System.out.println("you are not a student");
//         }
//     }
// }
    


// import java.util.Scanner; //this is an utility pakage that helps us to use scanner in our program
// public class practise{
//     public static void main(String[] args){

//         /*CLASS SCANNER
//          *In Java, the Scanner class is a tool that makes it easy to read user input from the console. It is part of the java.util package and can read various primitive data types like int, double, and String.
//         */

//         Scanner scanner = new Scanner(System.in); /* our scanner object can read the user input
//                                                      scanner is the object and scanner is the name of taht object */

        // System.out.println("Enter Your Name");
        // String name = scanner.nextLine(); // the'nextLine' helps us to read any string of spaces, of we only want to read upto space then we need to use 'next'

        // System.out.println("enter your age: ");
        // int age = scanner.nextInt();//if you put in the double it will given error

        // System.out.println("wht si your gpa");
        // double gpa = scanner.nextDouble();

        // System.out.println("are you a student(true/false)");
        // boolean isStudent = scanner.nextBoolean();

        // System.out.println("hello "+ name);
        // System.out.println("you are " + age + "years old");
        // System.out.println("you gpa is "+gpa);
        // System.out.println("Student " + isStudent);

        //  if(isStudent){ // if this boolean character is true then this'if comdition' will perform itself
        //     System.out.println("you are a student");
        // }
        // else{//will perform if teh boolean condition is false
        //     System.out.println("you are not a student");
        // }


//         //COMMON issues

//         System.out.println("enetr yor age");
//         int num = scanner.nextInt();//without the next line of code , it beaves a newline in buffer
//         scanner.nextLine();//this will help to run the program according to our expectations
//                            //it helps to clear the input buffer

//         System.out.println("enetr your favorite color");
//         String color = scanner.nextLine();//this nextline() call wil be skipped

//         System.out.println("you are" + num + "years old");
//         System.out.println("youa like the color"+color);

//         scanner .close();//it is good practise and if we do not colde our scanner it will lead to unexpectable behaviour
//     }
// }



// public class practise{
//         public static void main(String[] args){

//                 // //Arthmetic Operators

//                 // int x = 10;
//                 // int y = 2;
//                 // int z ;

//                 // z = x + y;
//                 // z = x - y;
//                 // z = x * y;
//                 // z = x / y;
//                 // z = x % y; //will give remainder zero
//                 // System.out.println(z);


//                 // //Augumented Asiignment Operators

//                 // int x = 10;
//                 // int y =3;

//                 // x += y;
//                 // x -= y;
//                 // x *= y;
//                 // x /= y;
//                 // x %= y;
//                 // System.out.println(x);


//                 //Increment and Decreament Operators

//                 int x = 1;

//                 //increment
//                 x++;//2
//                 x++;//3
//                 x++;//4

//                 //decrement
//                 x--;//3
//                 x--;//2
//                 x--;//1
//                 System.out.println(x);


//                 //ORDER OF OPERATION [P-E-M-D-A-S]

//                 double result = 3 + 4 * (7 - 5) / 2.0;
//                 System.out.println(result);


//         }
// }



// import java.util.Scanner;

// public class practise{
//         public static void main(String[] args) {
                
//                 //IF statement = performs a block of code if its condition is true

//                 Scanner scanner = new Scanner(System.in);
//                 int age;
//                 String name;
//                 boolean isStudent;

//                 System.out.println("enter your name");
//                 name = scanner .nextLine();

//                 System.out.println("enter your age");
//                 age = scanner .nextInt();

//                 System.out.println("Are you a student (trure/false)");
//                 isStudent = scanner .nextBoolean();

//                 //GROUP 1
//                 if(name.isEmpty()){
//                         System.out.println("you didn't put your name");
//                 }
//                 else{
//                         System.out.println("hello"+name+"!");
//                 }
//                 //GROUP 2
//                 if (age>=18){
//                         System.out.println("you are an adult!"); 
//                 }
//                 else if (age > 60){
//                         System.out.println("you are an senoir");
//                 }
//                 else if(age<0) {
//                         System.out.println("yopu havenot been born yet");
//                 }
//                 else if(age == 0){
//                         System.out.println("you are a baby");
//                 }
//                 else{
//                         System.out.println("you are not an adult");
//                 }
//                 //GROUP 3
//                 if(isStudent){
//                         System.out.println("you are a stiudent");  
//                 }
//                 else{
//                         System.out.println("you are not a student");
//                 }
//                 scanner.close();
//         }
// }



// import java.util.Random;

// public class practise{
//         public static void main(String[] args){
//                 Random random = new Random();

//                 int num1;
//                 double num2;
//                 boolean num3;

//                 // num = random.nextInt();//random number and like this will work for every datatype
//                 num1 = random.nextInt(1,6);//random number from only 1 to 5
//                 num2 = random.nextDouble(1,6);
//                 num3 = random.nextBoolean();//this will jsut give true or false

//                 System.out.println(num1);
//                 System.out.println(num2);
//                 System.out.println(num3);

//                 if(num3){
//                         System.out.println("HEADS");
//                 }
//                 else{
//                         System.out.println("TAILS");
//                 }
//         }
// }



// public class practise{
//         public static void main(String[] args) {

//                 //MATH CLASS

//                 System.out.println(Math.PI);//these arethe some value that the compilers alaraedy knows
//                 System.out.println(Math.E);

//                 double result;

//                 result = Math.pow(2,3);//2 with power of 3
//                 result = Math.abs(-5);//The Math.abs() function in Java returns the absolute (positive) value of a number
//                 result = Math.sqrt(9);//this is square root over 9
//                 result = Math.round(3.14);//this is rounds the numbers up or down according to the rounding rules
//                 result = Math.ceil(3.14);//rounding up
//                 result = Math.floor(3.99);//rounding down
//                 result = Math.max(14,21);//returs the maximum of these two numbers
//                 result = Math.min(15,24);//returns the minimum of tehse two numbers
//                 System.out.println(result);
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //printf() = is a method used to format output
//                 //%[flags][width][.precision][specifier-character]

//                 // Common format specifiers
//                 // %s: for a String
//                 // %d: for a decimal integer (byte, short, int, long)
//                 // %f: for a floating-point number (float, double)
//                 // %c: for a single char character
//                 // %b: for a boolean value
//                 // %n: for a platform-independent newline character

//                 String name = "Spongebob";
//                 char firstletter = 'S';
//                 int age = 30;
//                 double height = 60.5;
//                 boolean isEmployed = true;
//                 double price1 = 9.99;
//                 double price2 = 100.13;
//                 double price3 = -52.13;

//                 System.out.printf("hello %s\n",name);
//                 System.out.printf("your name starst with a %c\n",firstletter);
//                 System.out.printf("you are %d years old\n",age);
//                 System.out.printf("you are %f inches tall\n",height);
//                 System.out.printf("employed %b\n",isEmployed);

//                 System.out.printf("%s is %d years old",name,age);

//                 //[flag]
//                 // + = output a plus or mius sign
//                 // , = comma grouping separator,puts commas in us locale
//                 // ( = negative numbers are enclosed in ()
//                 // space = display a minus if negative , space if positive

//                 System.out.printf("%1f\n",price1);//"%1f" means that it freturns the float value of 1 decimal point
//                 System.out.printf("%1f\n",price2);
//                 System.out.printf("%1f\n",price3);

//                 //+ flag
//                 System.out.printf("%+d%n",50);  // Output: +50
//                 System.out.printf("%+d%n", -50); // Output: -50

//                 //, flag
//                 System.out.printf("%,d%n", 1000000);   // Output: 1,000,000 (in US locale)
//                 System.out.printf("%,.2f%n", 12345.67); // Output: 12,345.67

//                 //( flag
//                 System.out.printf("%(d%n", 50);   // Output: 50
//                 System.out.printf("%(d%n", -50);  // Output: (50)

//                 //space flag
//                 System.out.printf("|% d|%n", 50);   // Output: | 50| (Note the leading space)
//                 System.out.printf("|% d|%n", -50);  // Output: |-50|

//                 //combining flag
//                 System.out.printf("Balance: %(,d%n", 50000);   // Output: Balance: 50,000
//                 System.out.printf("Balance: %(,d%n", -50000);  // Output: Balance: (50,000)


//                 //[width]
//                 //0 = zero padding
//                 //number = right justified padding
//                 //negative number = left justified padding

//                 int id1 = 1;
//                 int id2 = 23;
//                 int id3 = 456;
//                 int id4 = 7890;

//                 System.out.printf("%05d\n",id1);//add padding of zeroes in front of the number , and the total length of the output is 5
//                 System.out.printf("%05d\n",id2);
//                 System.out.printf("%05d\n",id3);
//                 System.out.printf("%05d\n",id4);

//                 System.out.printf("%5d\n",id1);//All numbers are aligned to the right, and spaces are added to the left to ensure the total width is 5.
//                 System.out.printf("%5d\n",id2);
//                 System.out.printf("%5d\n",id3);
//                 System.out.printf("%5d\n",id4);

//                 System.out.printf("%-5d\n",id1);//All numbers are aligned to the left within a 5-character field. Spaces are added to the right to fill the remaining width.
//                 System.out.printf("%-5d\n",id2);
//                 System.out.printf("%-5d\n",id3);
//                 System.out.printf("%-5d\n",id4);
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //nested if statements

//                 boolean isStudent = true;
//                 boolean isSenoir = true;
//                 double price = 9.99;

//                 if(isStudent){
//                         if(isSenoir){
//                                 System.out.println("You are a senoir");
//                                 System.out.println("you get a senoir discount of 10%");
//                                 price *= 0.7;
//                         }
//                         else{
//                         System.out.println("you get a stuent discoutn of 10%");
//                         price *= 0.9;
//                         }
//                 }
//                 else{
//                      if(isSenoir){
//                         System.out.println("you get a senoir discount of 20%");
//                         price *= 0.8;
//                      }
//                         else{
//                               price *= 1;
//                           }
//                      }
                
//                 System.out.println("the price of a ticket is : $"+price);
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 String name = " Bro code ";

//                 int length = name.length();//calculate length include spaces
//                 char letter = name.charAt(0);//This retrieves a single character from the name string at a specific index.
//                 int index = name.indexOf("o");//This finds the index of the first occurrence of a specified character or substring within a string
//                 int lastIndex = name.lastIndexOf("o");//find the index of the last occurrence of a specified character or substring within a string

//                 // name = name.toUpperCase();//tures every letetr to uppercase
//                 // name = name.toLowerCase();//tures every letter to lower case
//                 // name = name.trim();// removes leading and trailing whitespace from a string. 
//                 name = name.replace("o","a");//replaces the target with the replacement

//                 System.out.println(length);
//                 System.out.println(letter);
//                 System.out.println(index);
//                 System.out.println(lastIndex);
//                 System.out.println(name);
//                 System.out.println(name.isEmpty());//check if the string is empty or not ,gives result in (true/false)

//                 if(name.isEmpty()){
//                         System.out.println("your name is empty");
//                 }
//                 else{
//                         System.out.println("hello"+name);
//                 }
//                 if(name.contains(" ")){ //checks if our name contains any spaces
//                         System.out.println("your ane contain space");
//                 }
//                 else{
//                         System.out.println("your name doesn't contain any spaces");
//                 }
//                 if(name.equalsIgnoreCase("password")){//we use "IgnoreCase" to ignore upper or lower case in comparison
//                         System.out.println("your name can't be password");
//                 }
//                 else{
//                         System.out.println("hello"+name);
//                 }
//         }
// }



// import java.util.Scanner;
// public class practise{
//         public static void main(String[] args) {
                
//                 //.substring() = A method used to exract a portion of astring
//                 //               .substring(start,end)

//                 Scanner scanner = new Scanner(System.in);

//                 String email;
//                 String username;
//                 String domain;

//                 System.out.println("enter your email");
//                 email = scanner.nextLine();

//                 if(email.contains("@")){

//                 // String username= email.substring(0,6); //will return string from index 0 to 5
//                 // String domain= email.substring(7,0);//even tho we do nt need to write 0 

//                 username= email.substring(0,email.indexOf("@")); 
//                 domain= email.substring(email.indexOf("@"));

//                 System.out.println(username);
//                 System.out.println(domain);   
//                 }
//                 else{
//                         System.out.println("emil must contain @");
//                 }


//                 scanner.close();
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 // ternary operator ? = Return 1 of 2 values if a condition is true
//                 // variable = (condition) ? ifTrue: ifFalse

//                 int score = 55;
//                 String passOfFail = (score >= 60) ? "PASS" : "FAIL";

//                 int num = 24;
//                 String evenOrOdd = (num % 2 == 0) ? "EVEN" : "ODD";

//                 System.out.println(passOfFail);
//                 System.out.println(evenOrOdd);
//         }
// }



// import java.util.Scanner;
// public class practise{
//         public static void main(String[] args) {
               
//                 //Enhanced switch = A replacement to many else if statments
//                 //(java 14 feature)

//                 Scanner scanner = new Scanner (System.in);

//                 System.out.println("enetr teh day");
//                 String day = scanner.nextLine();

//                 // switch(day){
//                 //         case"Monday"-> System.out.println("it is a monday");
//                 //         case"tuesday"-> System.out.println("it is a tuesday");
//                 //         case"wednesday"-> System.out.println("it is a webnesday");
//                 //         case"thursday"-> System.out.println("it is a thursday");
//                 //         case"friday"-> System.out.println("it is a friday");
//                 //         case"saturday"-> System.out.println("it is a saturday");
//                 //         case"sunday"-> System.out.println("it is a sunday");
//                 //         default -> System.out.println(day+"this is not an day");
//                 // }

//                 switch(day){
//                         case"Monday","tuesday","wednesday","thursday","friday"->
//                         System.out.println("it is a weekday");
//                         case"saturday","sunday"-> 
//                         System.out.println("it is a weekend");
                        
//                         default -> System.out.println(day+"this is not an day");
//                 }
//                 scanner.close();
//         }
// }



// import java.util.Scanner;
// public class practise{
//         public static void main(String[] args) {
                
//                 // && = AND
//                 // || = OR
//                 // ! NOT

//                 // double temp = 20;
//                 // boolean isSunny = false;

//                 // if(temp <=30 && temp >= 0 && isSunny) {
//                 //         System.out.println("the weather is good");
//                 //         System.out.println("the weather is sunny today");
//                 // }
//                 // else if(temp <=30 && temp >= 0 && !isSunny){
//                 //         System.out.println("the weather is good");
//                 //         System.out.println("the weather is not sunny today");
//                 // }
//                 // else if(temp >30 || temp < 0){
//                 //         System.out.println("the weather is bad");
//                 //         System.out.println("the weather is cloudy today");

//                 Scanner scanner = new Scanner (System.in);

//                 //username must be between 4-12 characters
//                 //usename must not contain spaces or underscores

//                 String username;

//                 System.out.println("enetr your new username");
//                 username = scanner.nextLine();

//                 if(username.length() < 4 || username.length() > 12){
//                         System.out.println("username must be between 4-12 characters");
//                 }
//                 else if(username.contains(" ") || username.contains("_")){
//                         System.out.println("username must not contain spaces or underscores");
//                 }
//                 else{
//                         System.out.println("welcome" + username);
//                 }

//                 scanner.close();
//         }
// }



// import java.util.Scanner;
// public class practise{
//         public static void main(String[] args) {
//                //while loop = repeat some code forever
//                //             while some condition remains true 

//                Scanner scanner = new Scanner(System.in);
               
//         //        String name = "";
//         //        while(name.isEmpty()){ //if we use if-statement the program will only check the condition once , but when we use while-loop the progarm will check the condition again and again
//         //         System.out.println("enetr your name");
//         //         name = scanner.nextLine();
//         //        }
//         //        System.out.println(("hello" + name));

//         // while( 1 == 1 ){ //infinite loop
//         //         System.out.println("HELP ! I'M STUCK IN THE LOOP");
//         // }

//         // String response = "";
//         // while(!response.equals("Q")){
//         //         System.out.println("you are playing a game");
//         //         System.out.println("Press Q to quit");
//         //         response = scanner.next().toUpperCase();//next() reads only the next word, stopping when it encounters a whitespace character (like a space, tab, or the Enter key).
//         //                                                 //nextLine() reads the entire line of input, stopping only when it encounters the newline character (\n) created by pressing the Enter key. 
//         // }
//         // System.out.println("you have quit the game");

//         // int age = 0;
//         // System.out.println("enetr your age");
//         // age = scanner.nextInt();

//         // while(age<0){
//         //         System.out.println("your age can't be negative");
//         //         System.out.println("enetr your age");
//         //         age = scanner.nextInt();
//         //         scanner.nextLine();// Consume the leftover newline character basically reads whole line even after the apcesa an ddoes not stop when it encounters the space in the input
//         // }
//         // System.out.println("you are"+age+"years old");

//         // int num = 0;
//         // while(num < 1 || num > 10){
//         //         System.out.println("th enum are between 1-10");
//         //         num = scanner.nextInt();
//         // }
//         // System.out.println("you picked"+num);


//         //do-while loop

//         String name = "";
//         do{ //if we use if-statement the program will only check the condition once , but when we use while-loop the progarm will check the condition again and again
//         System.out.println("enetr your name");
//         name = scanner.nextLine();
//         }
//         while(name.isEmpty());
//         System.out.println(("hello" + name));

//         // int age = 0;
//         // do{//in here the programs are performed first ,then the conditons are checked
//         //         System.out.println("your age can't be negative");
//         //         System.out.println("enetr your age");
//         //         age = scanner.nextInt();
//         //         scanner.nextLine();// Consume the leftover newline character basically reads whole line even after the apcesa an ddoes not stop when it encounters the space in the input
//         // }
//         // while(age<0);
//         // System.out.println("you are"+age+"years old");

//         // int num = 0;
//         // do{
//         //         System.out.println("th enum are between 1-10");
//         //         num = scanner.nextInt();
//         // }
//         // while(num < 1 || num > 10);
//         // System.out.println("you picked"+num);

//                scanner.close();
//         }
// }



// import java.util.Scanner;
// public class practise{
//         public static void main(String[] args) throws InterruptedException{//This is a required part of the method signature for main because Thread.sleep() can be interrupted and must be handled. 
//                                                                                      //InterruptedException: This is a checked exception that is thrown if another thread interrupts the current thread while it is in a waiting or sleeping state.
//                                                                   //throws keyword: Instead of handling the exception with a try-catch block inside the method, the throws keyword is used in the method signature to declare that the method may throw this exception. This shifts the responsibility for handling the exception up the call stack. In this case, since the exception is thrown from the main method, the Java Virtual Machine (JVM) will handle it by terminating the program and printing an error message. 

//                 Scanner scanner = new Scanner(System.in);        

//                 //for-loop = execute some code a CERTAIN amount of times                
//                 //for(****;****;****)

//                 // for(int i = 0;i < 10 ;i++){
//                 //         System.out.println(i);  


//                 // System.out.println("Enter how many times you want to loop");
//                 // int max = scanner.nextInt();

//                 // for(int i = 0 ; i <= max ; i++ ){
//                 //         System.out.println(i);
//                 // }

//                 System.out.println("How many sceonds to countdown from?");
//                 int start = scanner.nextInt();

//                 for(int i = start ; i > 0 ; i--){
//                         System.out.println(i);
//                         Thread.sleep(1000);//this will give 1000milliiseconds to each output
//                 }
//                 System.out.println("HAPPY NEW YEAR!");

//                 scanner.close();
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //break = break out of a loop (STOP)
//                 //continue = skip current iteration of a loop (SKIP)

//                 for(int i = 0 ; i < 10 ; i++){
//                         if(i == 5){
//                                 // break;//this will just give output to 4
//                                 continue;//this will skip the 5 and continue on till 9
//                         }
//                         System.out.println(i+" ");
//                 }
//         }
// }



// import java.util.Scanner;
// public class practise{
//         public static void main(String[] args) {

//                 Scanner scanner = new Scanner(System.in);
                
//                 //nested loop = A loop inside another loop
//                 //              Used often with matrices or DS&A

//                 // for(int i = 1; i <= 9; i++){
//                 //         System.out.print(i + " ");
//                 // }
//                 // System.out.println(" ");//we do this to put each rowas in a new line
//                 // for(int i = 1; i <= 9; i++){
//                 //         System.out.print(i + " ");
//                 // }
//                 // System.out.println(" ");
//                 // for(int i = 1; i <= 9; i++){
//                 //         System.out.print(i + " ");
//                 // }

// //we re able to do the above program in kust few line as seen in below

//                 // for(int i = 1; i <= 3; i++){
//                 //         for(int j = 1; j <= 9; j++){
//                 //                 System.out.print(j + " ");
//                 //         }
//                 //         System.out.println(" ");//we write this line to make sure that every line of prgram is in the new line
//                 // }


//                 int rows;
//                 int columns;
//                 char symbol;

//                 System.out.println("enter the no. of rows");
//                 rows=scanner.nextInt();

//                 System.out.println("enter the no. of columns");
//                 columns=scanner.nextInt();

//                 System.out.println("Ente rthe symbole to use");
//                 symbol= scanner.next().charAt(0);//'charAt' gives the character at that index

//                 for(int i =0 ; i < rows ; i++)
//                 for(int j = 0 ; j < columns ; j++){
//                         System.out.println(symbol);
//                 }
//                 scanner.close();
//         }
// }



// public class practise{
//         public static void main(String[] args) {
//                 //D.R.Y.= Don't repeat yourself
//                 //method = a block od reuseable code that is excited when called)

//                 String name = "Bro";
//                 int age = 5;
//                 String name1 = "KUMAR";

//                 happyBirthday(name,age);
//                 //ways for the output
//                 System.out.println(square(age));
//                 double result1 = square(age);
//                 System.out.println(result1);

//                 System.out.println(cube(age));

//                 System.out.println(getFullName(name,name1));

//                 System.out.println(ageCheck(age));
//                 if(ageCheck(age)){
//                         System.out.println("You may vote");
//                 }
//                 else{
//                         System.out.println("You are not eligible to vote");
//                 }
//         }
//         static void happyBirthday(String name,int num){ //The static keyword makes a method belong to the class itself, not to any specific object of that class         
//                 System.out.println("Happy birthdays ");
//                 System.out.printf("Happy birthdays for you %s\n",name);//this can not work with passing on the argument since it won'it be able to read whats inside
//                 System.out.printf("you are %d yaers old\n ",num);
//                 System.out.println("Happy birthdays to you ");
//         }
//         static double square(int num){//when we are not returing anything we woul dgenerraly use void , but since we are returing double, we need to use double in our method heading
//                 return num * num;
//         }
//         static double cube(int num){//when we are not returing anything we woul dgenerraly use void , but since we are returing double, we need to use double in our method heading
//                 return num * num * num;        
//         }
//         static String getFullName(String first , String last){
//                 return first + " " + last;
//         }
//         static boolean ageCheck(int num){
//                 if(num >= 18){
//                         return true;
//                 }
//                 else{
//                         return false;
//                 }
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //overloaded mathods = methods that share the same name,but different paramenters
//                 //signature = name + parameters

//                 System.out.println(add(1,2));
//                 System.out.println(add(1,2,3));
//                 System.out.println(add(1,2,3,4));

//                 System.out.println(bakePizza("flatBread"));
//                 System.out.println(bakePizza("flatBread","mozzerla"));
//                 System.out.println(bakePizza("flatBread","mozzerala","capicum"));
//         }
//         static double add(double a, double b){
//                 return a + b;
//         }
//         static double add(double a, double b,double c){
//                 return a + b + c;
//         }
//         static double add(double a, double b,double c , double d){
//                 return a + b + c + d;
//         }
//         static String bakePizza(String bread){
//                 return bread + "Pizza";
//         }
//         static String bakePizza(String bread,String cheese){
//                 return cheese +  " " + bread + "Pizza";
//         }
//         static String bakePizza(String bread,String cheese,String topping){
//                 return cheese + " " + bread + "Pizza" + topping;
//         }
// }



// public class practise{

//         //just a point ot yourself when you give both local and class to internal programmings  , they would choose the local variable

//         static int x = 3; //CLASS

//         public static void main(String[] args) {
                
//                 //variable scope = where a variable can be accessed
//                 //In Java, variable scope determines where a variable can be accessed, modified, and used within a program

//                 // int x = 1; //LOCAL
//                 System.out.println(x);
//                 doSomething();
//         }
//         static void doSomething(){
//                 // int x = 2; //Local
//                 System.out.println(x);
//         }
// }



// import java.util.Arrays;
// public class practise{
//         public static void main(String[] args) {
                
//                 //array = a collection of values of the same data type
//                 //        think of it as a variabel taht can store more than 1 value 

//                 String[] fruits = {"apple","orange","banana","coconut"};

//                 fruits[0] = "pineapple";
//                 System.out.println(fruits[0]);

//                 int numOfFruits = fruits.length;
//                 System.out.println(numOfFruits);

//                 Arrays.sort(fruits);//this will sort the array in aphlabetic order
//                 Arrays.fill(fruits,"pineapple");//this will fill thwe whole array with pinapple data


// //there are two methods to print the whole data corectly

//                 //1.use 'Array.toString()'
//                 System.out.println(Arrays.toString(fruits));

//                  //2.use for loop
//                 for(String fruit : fruits){
//                         System.out.println(fruit);
//                 }
//                 for(int i = 0; i < fruits.length ; i++){
//                         System.out.print(fruits[i] + " ");
//                 }
//         }
// }



// //IN HERE WE ARE GOING TO ACCPET THE USER INPUTS IN ARRAYS
// import java.util.Scanner;
// public class practise{
//         public static void main(String[] args) {
                
//                 Scanner scanner = new Scanner (System.in);
//                 String[] foods;//Basic array naming won't work for accepting user input in an array in Java because Java arrays have a fixed size that must be declared at the time of creation
//                 int size;

//                 System.out.println("what is the num of foods that you want");
//                 size = scanner.nextInt();
//                 scanner.nextLine();

//                 foods = new String [size];
//                 // foods[0] = "pizza";//one way of putting your inpits in the array
//                 // foods[1] = "taco";
//                 // foods[2] = "hamburger";

//                 for(int i = 0 ; i < foods.length; i++) {
//                         System.out.println("enter a food");
//                         foods[i] = scanner.nextLine();
//                 }

//                 System.out.println(foods.length);

//                 for(String hungry : foods){
//                         System.out.println(hungry);
//                 }

//                 scanner.close();
//         }
// }



// //IN HERE WE ARE GOING TO SEARCH IN AN ARRAY
// import java.util.Scanner;
// public class practise{
//         public static void main(String[] args) {
                
//                 Scanner scanner = new Scanner(System.in);

//                 int[] numbers = {1,9,2,3,5,6,4,7,6};
//                 int target = 57;
//                 String[] fruits = {"apple","orange","banana"};
//                 String target2 = "orange";

//                 boolean isFound = false;

//                 System.out.println("eneter the array you wan tto find");
//                 target=scanner.nextInt();

//                 scanner.nextLine();//we did this so that we are able to eneter in both of the variables

//                 System.out.println("eneter the array you wan tto find");
//                 target2=scanner.nextLine();
//                 for (int i = 0; i < fruits.length; i++){
//                         if(target2 == fruits[i]){
//                                 System.out.println("elements found at index" + i);
//                                 isFound = true;
//                                 break;
//                         }
//                 }
//                 if(!isFound){
//                 System.out.println("Elemts not found in the array");
//                 }
//                 scanner.close();
//         }
        
// }



// public class practise{
//         public static void main(String[] args){

//                 //vararga = allow a method to accept a varying # of arguments
//                 //          makes methods more flexible , no need for overloaded methods
//                 //          java will pack the arguments into an array
//                 //          ...(ellipsis)

//                 System.out.println(add(1,2,3,4));
//                 System.out.println(average(23.123,123.21,123.23,324.32));
//         }
//         static int add(int...num){
//                 int sum = 0;
//                 for(int nums : num){    
//                         System.out.println("processing num "+nums);     
//                         sum += nums;
//                 }
//                 return sum;
//         }
//         static double average(double... num1){
//                 double sum = 0;
//                 if(num1.length == 0){
//                         return 0;
//                 }
//                 for( double num2 : num1){
//                         sum +=num2;
//                 }
//                 return sum / num1.length;
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //2D array = An array where each element is an array
//                 //           Useful for storing a matrix of data

//                 // String[] fruits = {"apple","orange","banana"};
//                 // String[] vegetables = {"potato","onion","carrot"};
//                 // String[] meats = {"chicken","pork","beef","fish"};
//                 // String[][] groceries = {fruits,vegetables,meats};

//                 // String[][] groceries = {{"apple","orange","banana"},
//                 //                         {"potato","onion","carrot"},
//                 //                         {"chicken","pork","beef","fish"}};

//                 // groceries[0][0] = "pineapple";

//                 // for(String[]foods : groceries){
//                 //         // System.out.println(foods);//This will give the hexadecimal representation of the object's hash code, which is essentially a unique identifier for that specific array object in memory
//                 //         for(String food : foods){
//                 //                 System.out.print(food + " ");
//                 //         }
//                 //         System.out.println();//this will help us to put every array inside the 2D array in different line
//                 // }


//                 char [][] telephone = {{'1','2','3'},
//                                        {'4','5','6'},
//                                        {'7','8','9'},
//                                        {'*','0','#'}};

//                 for(char[] row : telephone){
//                         for(char number : row){
//                                 System.out.print(number + " ");
//                         }
//                         System.out.println();
//                 }                     
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //object = An entity that holds data (Attributes) and can perform actions (methods)
//                 //         It is an reference data-type

//                 object car = new object();

//                 // car.isRunning = true;

//                 System.out.println((car.make));
//                 System.out.println((car.model));
//                 System.out.println((car.year));
//                 System.out.println((car.price));
//                 System.out.println((car.isRunning));

//                 System.out.println((car.isRunning));//we wrote these 4 lines of code to check our instance methods
//                 car.star();
//                 System.out.println((car.isRunning));
//                 car.stop();
//                 System.out.println((car.isRunning));

//                 car.drive();
//                 car.brake();

//                 object car2 = new object();

//                 System.out.println(car.make + " " + car.model);
//                 System.out.println(car2.make + " " + car2.model);
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //constructor = A special method to initial objects
//                 //              You can pass arguments to a cosntructor
//                 //              and set up initial values

//                 object student1 = new object("rickFlag",30 , 3.2);
//                 object student2 = new object("patrikBateman",30,3.5);

//                 System.out.println(student1.name);
//                 System.out.println(student1.age);
//                 System.out.println(student1.gpa);
//                 System.out.println(student1.isEnrolled);
//                 student1.study();

//                 System.out.println(student2.name);
//                 System.out.println(student2.age);
//                 System.out.println(student2.gpa);
//                 System.out.println(student2.isEnrolled);
//                 student2.study();
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //overloaded constructor = Allow a class to have multiple with different parameters lists
//                 //                         Enable objects to be initialized in various ways

//                 object user1 = new object("dexterMorgan");
//                 object user2 = new object("dexterMorgan","abd@gamil.com");
//                 object user3 = new object("dexterMorgan","abd@gamil.com",13);
//                 object user4 = new object();

//                 System.out.println(user1.username);
//                 System.out.println(user1.email);
//                 System.out.println(user1.age);

//                 System.out.println(user2.username);
//                 System.out.println(user2.email);
//                 System.out.println(user2.age);

//                 System.out.println(user3.username);
//                 System.out.println(user3.email);
//                 System.out.println(user3.age);

//                 System.out.println(user4.username);
//                 System.out.println(user4.email);
//                 System.out.println(user4.age);
//         }
// }



// public class practise{
//         public static void main(String[] args) {

//                 // object car1 = new object("Mustang","Yellow");
//                 // object car2 = new object("Corvette","Black");
//                 // object car3 = new object("Charger","Blue");

//                 // object[] cars ={car1,car2,car3};

//                 // for(int i = 0; i < cars.length; i++ ){
//                 //         cars[i].drive();
//                 // }

//                 // for(object car : cars){//this just just an another way to get the output from the ouput
//                 //         car.drive();
//                 // }

//                 object[] cars ={new object("Mustang","Yellow"),
//                                 new object("Corvette","Black"),
//                                 new object("Charger","Blue")};

//                 for(object car : cars){
//                         car.color = "black";
//                 }
//                 for(object car : cars){
//                         car.drive();
//                 }
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //static = Makes a varible or method belong to the class ,rather than to any specific object
//                 //         Commonly used for utility methods or shared resources     

//                 object Friend1 = new object("spongbob");
//                 object Friend2 = new object("Rick");
//                 object Friend3 = new object("Morty");
//                 object Friend4 = new object("Picky");

//                 System.out.println(Friend1.numOfFriends);
//                 System.out.println(Friend2.numOfFriends);
//                 System.out.println(Friend3.numOfFriends);
//                 System.out.println(Friend4.numOfFriends);
//                 System.out.println(object.numOfFriends);

//                 object.showFriends();

//                System.out.println(Math.round(3.99)); 
//         }
// }



// public class practise{
//         public static void main(String[] args){

//                 //Inheritance = One class inherits the attributes and methods from another class
//                 //             Child <- Parent <- Grandparent

//                 object2 Dog = new object2();
//                 object3 Cat = new object3();
//                 object5 plant = new object5();

//                 System.out.println(Dog.isAlive);//as we can see from here the object2 inherited the attributes and methods from object
//                 System.out.println(Cat.isAlive);//even if we use  the grandparent logic for object and object4 our program runs as same as before

//                 Dog.eat();//They are performing the method from the parent object or th einherited object
//                 Cat.eat();

//                 Dog.speak();//this her shows that they can still perform thei rown methods
//                 Cat.speak();

//                 plant.photosynthesis();
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //super = Refers to the parent class (subclass <- superclass)
//                 //        Used in constructors and method overriding
//                 //        Calls the parent constructor to initialize attributes

//                 object person = new object("BRO","CODE");
//                 object2 student = new object2("HARRY", "POTTER", 3.5);
//                 object3 employee = new object3("Rubeus","Hagrid",500000);

//                 person.showName();

//                 student.showName();
//                 student.showGpa();

//                 employee.showSalary();
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //Method overriding = When a subclass provides its own
//                 //                    implementation of a method that is already defined
//                 //                    Allows for a code reusability and give sprecific implementation
//                 //YOU WILL SEE YOURSELF USING THIS FUNCTION IN OBJECT4

//                 object2 dog = new object2();
//                 object3 cat = new object3();
//                 object4 fish = new object4();

//                 dog.move();
//                 cat.move();
//                 fish.move();//dude to @override function,we are able to get the reult from that method that put in object4
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //toString() = Method inherited from the Object class
//                 //             Used to return a String representation of an object
//                 //             By default . it returns a hash code as a unique identifier
//                 //             It can be overridden to provide meaningful details

//                 object car1 = new object("Ford", "Mustang", 2025, "Red");
//                 object car2 = new object("Chevrolet", "Corvette", 2026, "Blue");

//                 System.out.println(car1);
//                 System.out.println(car2);

//                 // System.out.println(car.color + " " + car.year + " " + car.make + " " + car.model);
//         }
// }



// public class practise{
//         public static void main(String[] args){

//                 //abstarct = Used to define abstract classes and methods
//                 //           Abstraction is the process of hiding implementation details and showing only the essential features;
//                 //           Abstract classes CAN'T be instantiatd directly
//                 //           Can contain 'abstract' methods (which must be implemented)
//                 //           Can contain 'concrete' methods (which are inherited)

//                 object2 circle = new object2(3);
//                 object3 triangle = new object3(4,5);
//                 object4 rectangle = new object4(6,7);

//                 circle.display();
//                 triangle.display();
//                 rectangle.display();

//                 System.out.println(circle.area());
//                 System.out.println(triangle.area());
//                 System.out.println(rectangle.area());
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //Interface = A blueprint for a class that specifies a set of abstract methods that implementing classes MUST define
//                 //            Supports multiple inherited-like behaviour

//                 object3 rabbit = new object3();
//                 object4 hawk = new object4();
//                 object5 fish = new object5();

//                 rabbit.flee();
//                 hawk.hunt();

//                 fish.flee();
//                 fish.hunt();
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //Polymorphism = "POLY" = "MANY"
//                 //               "MORPH" = "SHAPE"
//                 //               Objects can identify as other objects
//                 //               Objects can be treated as objects of a common superclass

//                 object2 car = new object2();
//                 object3 bike = new object3();
//                 object4 boat = new object4();

//                 car.go();
//                 bike.go();
//                 boat.go();

//                 object[] vehicles = {car, bike, boat};//if we use anything else then this will be incompatable since object3 and object4 can not be converted to object2

//                 for(object vehicle : vehicles){
//                         vehicle.go();
//                 }
//         }
// }



// import java.util.Scanner;
// public class practise{
//         public static void main(String[] args) {

//         //Runtime polymorphism = When the method that gets executed is decided at runtime based on teh actual type of the object

//         Scanner scanner = new Scanner (System.in);

//         object animal;

//         System.out.println("would you lilke a dog or a cat ( 1= dog , 2 = cat) ");
//         int choice = scanner.nextInt();

//         if(choice == 1){
//                 animal = new object2();
//                 animal.speak();
//         }
//         else if(choice == 2){
//                 animal = new object3();
//                 animal.speak();
//         }

//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //They help protect object dat and rules for accessing or modifying them
//                 //GETTER = Methods that make a field READABLE
//                 //SETTER = Methods that make a field WRITEABLE

//                 object car = new object("Charger", "Yellow", 10000);

//                 // car.model ="Corvette";
//                 // System.out.println(car.color + " " + car.model + " " + car.price);//this would have work if the variables in class object wasn't private

//                 car.setModel("wefwwf");
//                 car.setColor("Blue");
//                 car.setPrice(133113);

//                 System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());//this will work after they are private 
//         }
// }



// public class practise {
//         public static void main(String[] args) {
                
//                 //Aggregation = Represents a "has-a" relationship between objects
//                 //              One object contains another object  as part of its structure,
//                 //              but the contained object/s can exist independently

//                 object book1 = new object("Murberbot", 354);
//                 object book2 = new object("The hobbit", 435);
//                 object book3 = new object("The two towers", 576);

//                 object[] books = {book1, book2, book3};

//                 // System.out.println(book1.displaynInfo());
//                 // System.out.println(book2.displaynInfo());
//                 // System.out.println(book3.displaynInfo());

//                 // for(object book : books){
//                 //         System.out.println(book.displaynInfo());
//                 // }

//                 object2 library = new object2("NYC Public Library", 1890, books);
//                 library.displayInfo();
//         }
// }



// public class practise{
//         public static void main(String[] args) {

//         //Composition = Represents a "part-of" relationship between objects
//         //              For example , an Engine is "Part of" a Car
//         //              Allows complex objects to be constructed from smaller objects

//         object car = new object("Corvette",2025,"V8");

//         System.out.println(car.model);
//         System.out.println(car.year);
//         System.out.println(car.engine);//with this we are only given the hashID
//         System.out.println(car.engine.type);//this one will hep us eget us the output

//         car.start();
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //Wrapper classes = Allow primitive (int, char, double, boolean) to be used as objects."Wrap them in an object"
//                 //                  Generally , don't wrap primitives unless you need an object
//                 //                  Allows use of Collections Framework and static utility Mehtods

//                 // Integer a = new Integer(123);//we are using wrapper class of integer
//                 // Double b = new Double(3.14);
//                 // Character = new Character('$'');
//                 // Boolean d = new Boolean(true);

//                 // //Autoboxing
//                 // //this is the modern way of using 'Wrapper classes'
//                 // Integer a = 123;//we are using wrapper class of integer
//                 // Double b = 3.14;
//                 // Character c = '$';
//                 // Boolean d = true;

//                 // //unboxing
//                 // int x = a;
//                 // double y = b;
//                 // char z = c;
//                 // boolean w = d;


//                 // String a = Integer.toString(9123);//we used the wrapper classes to convert these primitive datatypes into string
//                 // String b = Double.toString(3.14);
//                 // String c = Character.toString('$');
//                 // String d = Boolean.toString(true);

//                 // String x = a + b + c + d;
//                 // System.out.println(x);


//                 // int a = Integer.parseInt("123");//we are converting this string into an integer
//                 // double b = Double.parseDouble("3.14");//we are converting 3.14 as string to double datatype
//                 // char c = "pizza".charAt(0);//since characters do not have parse method and converting the string "pizza" back to character
//                 // boolean d = Boolean.parseBoolean("true");//we are converting string to boolean datatype

//                 // String x = a + b + c + d;///thess won't work not since a,b,c,d are of different datatype
//                 // System.out.println(x);


//                 char letter = 'b';
//                 System.out.println(Character.isLetter(letter));//to check if our character is really character,to be specific if it is a letter or not
//                 System.out.println(Character.isUpperCase(letter));//to check if our letter is upper-case or not
//         }
// }



// import java.util.ArrayList;//we use this to make array list and manipulate them
// import java.util.Collections;//we put this here to use the Collections framework
// public class practise{
//         public static void main(String[] args) {
                
//                 //ArrayList = A resizeable array that stores objects (autoboxing)
//                 //            Array are fixed in size,but ArrayLists can change

//                 // ArrayList<Integer> list = new ArrayList<>();//<> is use for telling what type of datatype we are storing, and we do not need to store it second time
//                 // list.add(1);//we add element 1 at index 0
//                 // list.add(2);
//                 // list.add(3);

//                 // ArrayList<Double> list = new ArrayList<>();//<> is use for telling what type of datatype we are storing, and we do not need to store it second time
//                 // list.add(1.123);
//                 // list.add(2.434);
//                 // list.add(3.463);

//                 ArrayList<String> list = new ArrayList<>();//<> is use for telling what type of datatype we are storing, and we do not need to store it second time
//                 list.add("apple");
//                 list.add("pineapple");
//                 list.add("guava");

//                 // list.remove(0);//in here we removed the element at index 0

//                 // list.set(0, "Banana");//in here we are setting element "Banana" at index 0 and hence removing the "apple"

//                 // System.out.println(list.get(0));//this will help us to get the elemnt at index 0

//                 // System.out.println(list.size());//this will return thw total no of elements in an ArrayList

//                 // Collections.sort(list);//this will help us to sort the ArrayList,and we are using the Collections framework

//                 // System.out.println(list);

//                 for(String fruits : list){//we are using the for loop to itterate all through the elments in ArrayList
//                         System.out.println(fruits);
//                 }
//         }
// }



// import java.util.InputMismatchException;//i needed to include thic to catch this type of exceptions
// import java.util.Scanner;
// public class practise{
//         public static void main(String[] args){

//                 //Exception = An event that interrupts the normal flow of a program
//                 //            (Dividing by zero, file not found, mismatch input type)
//                 //            Surround any dangerous code with a try{} block
//                 //            try{}, catch{}, finally{}
//                 //final{} -> it is optional, excecute no matter the eception or not , this is where you might clean up any resources

//                 // System.out.println(1 / 0);//Exception in thread "main" java.lang.ArithmeticException: / by zero
//                                              //this code is dangerious by interrping our program by causing an exceptions

//                 Scanner scanner = new Scanner (System.in);//we can put this in paranthesis in try{} and java will automatically close it

//                 try(){//any dangerous code we are going to surround it with try block
//                         System.out.println("Enter the number");
//                         int num = scanner.nextInt();
//                         System.out.println(num / 0);
//                 }
//                 catch(InputMismatchException e){//catch() with nickname of 'e'
//                         System.out.println("you can not enetr the string idiot");
//                 }
//                 catch(ArithmeticException e){//in here we catch exception and describe exactly what kind of exception do we want to catch
//                                              //we are naming this exception character 'e'

//                         System.out.println("You can't divide by zero");
//                 }
//                 catch(Exception e){//we use to to catch all exceptions,but the user won't know exactly what kind of exception occured here
//                                    //SAFETY NET
//                         System.out.println("something went wrong");
//                 }
//                 finally{
//                         scanner.close();
//                         System.out.println("This always executes");
//                 }
//         }
// }



// import java.io.FileNotFoundException;
// import java.io.FileWriter;
// import java.io.IOException;

// public class practise {
//         public static void main(String[] args) {

//         //How to write a file using java (4 popular options)

//         //FileWriter = Good for small or medium-sized text files
//         //BufferWriter = Better performance for large amounts of text
//         //PrintWriter = Best for structured data, like reports or logs
//         //FileOutputStream = Best for binary files (e.g., images,audio files)

//         String FilePath = "C:\\Users\\piyush kumar\\OneDrive\\Desktop\\text.txt";//with just 'text.txt' you get a file in vs-code itslef ,but with all that you get a file in destop
//                                                                                  //file named = text,and file extention = txt
//         // String TextContent = "i like pizza\n it really good\n Buy me pizza";
//         String TextContent =//thsi is multi-line String
//                         """
//         Rose are red
//         violet are blue
//         the thirth line with rhmying
//                         """;

//         try(FileWriter writer = new FileWriter(FilePath)){
//                 writer.write(TextContent);//we just use the write method here,also you should check your source folder 'text.txt' and check the result
//                 System.out.println("the file has been written");
//         }
//         catch(FileNotFoundException e){
//                 System.out.println("could not loacte file location");
//         }
//         catch(IOException e){//we are catching input and output exception here
//                 System.out.println("Could not write file");
//         }
// }
// }



// import java.io.BufferedReader;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;

// public class practise{
//         public static void main(String[] args) {
                
//                 //How to read a file using java(3 popular option)

//                 //BufferedReader + FileReader: Best for reading text files line-by-line
//                 //FileInputStream: Best for binary files (e.g., images, audio files)
//                 //RandomAccessFile: Best for read/write specific portions of a large file

//                 String filePath = "C:\\Users\\piyush kumar\\OneDrive\\Desktop\\java practise\\text.txt";

//                 try(BufferedReader reader = new BufferedReader(new FileReader(filePath));){
//                         System.out.println("File found");
//                         String Line;
//                         while((Line = reader.readLine()) != null){
//                                 System.out.println(Line);
//                         }
//                 }
//                 catch(FileNotFoundException e){
//                         System.out.println("could not locate file");
//                 }
//                 catch(IOException e){
//                         System.out.println("Something went wrong");
//                 }
//         }
// }



// import java.time.Instant;
// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.time.format.DateTimeFormatter;
// public class practise {
//         public static void main(String[] args) {
                
//                 //How to work with DATES &TIME using java
//                 //(LocalDate, LocalTime, LocalDataTime, UTC timestamp)

//                 // LocalDate date = LocalDate.now();//this will show that date at the present 
//                 // LocalTime date = LocalTime.now();//this will show time at the present
//                 // LocalDateTime date = LocalDateTime.now();//this will show date and time at the present
//                 // Instant date = Instant.now();//this will show date and time at the present,but the time will be at UTC timestamp,the value is always the same everywhere in the world, as it is based on UTC.
//                 // System.out.println(date);


//                 // //CUSTOM FORMAT //for put date & time
//                 // LocalDateTime dateTime = LocalDateTime.now();
//                 // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY  HH:mm:ss");//for more types look at the java pattern list
//                 // String newDataTime = dateTime.format(formatter);
//                 // System.out.println(newDataTime);


//                 //CUSTOM FORMAT //for date
//                 // LocalDate date = LocalDate.of(2024, 23,25);//format for date
//                 LocalDateTime date1 = LocalDateTime.of(2025, 3,25,12,0,0);//format for date and time
//                 LocalDateTime date2 = LocalDateTime.of(2025, 3,25,12,0,0);//format for date and time

//                 if(date1.isBefore(date2)){
//                    System.out.println(date1 + "is earlier than" + date2);     
//                 }
//                 else if(date1.isAfter(date2)){
//                         System.out.println(date1 + "is later than" + date2);
//                 }
//                 else if(date1.isEqual(date2)){
//                         System.out.println(date1 + "is equal to" + date2);
//                 }
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //Anonymous class = A class that doesn't have a name . Cannot be reused
//                 //                  Add custom behaviour without having to create a new class
//                 //                  Often used for one time uses (TimerTask , Runnable , callbacks)

//                 // object2 talkingDog = new object2();
//                 // talkingDog.speak();

//                 object dog1 = new object();
//                 object dog2 = new object(){// This is the anonymous class, extending the object class
//                 @Override
//                 void speak(){
//                         System.out.println("Scooby Doo says *RUF RUF*");
//                   }
//                 };
//                 dog1.speak();
//                 dog2.speak();
//                 }      
// }



// import java.util.Timer;
// import java.util.TimerTask;
// public class practise{
//         public static void main(String[] args) {
                
//                 //Timer = Class that schedules taskes at specific times or periodically
//                 //        Useful for : sending notifications , scheduled updates , repetitive actions

//                 //TimerTask = Represents teh task taht will be executed by the Timer
//                 //            You will extend the TimerTask class to define your task
//                 //            Create a subclass of TimerTask and @Override run()

//                 Timer timer = new Timer();
//                 TimerTask task = new TimerTask() {
//                         int count  = 3;
//                         @Override
//                         public void run(){
//                                 System.out.println("Hello!");
//                                 count--;
//                                 if(count < 0){
//                                         System.out.println("Task complete");
//                                         timer.cancel();//this will just cancel the timer program
//                                 }
//                         }
//                 };
//                 timer.schedule(task,3000, 1000);//the time is in (ms) //1000: The delay in milliseconds before the task's first execution. In this case, the task will run for the first time after 1 second.
//                                                                                    //3000: The period in milliseconds between successive task executions. After the initial delay, the task will run repeatedly every 3 seconds.
//                 System.out.println("Timer scheduled .Will run carry 3 seconds");//The timer message appears at the end because your program is executing in two separate threads: the main thread and the Timer's thread. The main method finishes its code almost instantly, while the Timer's task runs on its own schedule in the background
//         }
// }



// import java.util.ArrayList;
// public class practise {
//         public static void main(String[] args) {
                
//                 //Generics = A concept where you can write a class , interface , or method
//                 //           that is compatible with different data types
//                 //           <T , U> type parameter (placeholder that gets replaced with a reel type)
//                 //           <String> type argument (specifies the type)


//                 // ArrayList<String> fruits = new ArrayList<>();
//                 // fruits.add("apple");
//                 // fruits.add("pineapple");
//                 // fruits.add("banana");


//                 // object<String> box = new object<>();
//                 // box.setItem("banana");
//                 // System.out.println(box.getItem());

//                 // object<Integer> box = new object<>();
//                 // box.setItem(234);
//                 // System.out.println(box.getItem());

//                 object<Double> box = new object<>();
//                 box.setItem(234.213);
//                 System.out.println(box.getItem());


//                 object2<String , Double> product1 = new object2<>("pokemon ball", 13.13);
//                 System.out.println(product1.item + " " + product1.price);

//                 object2<Character , Integer> product2 = new object2<>('$', 133212);
//                 System.out.println(product2.item + " " + product2.price);
//         }
// }



// import java.util.HashMap;
// public class practise{
//         public static void main(String[] args) {
                
//                 //HashMap = A data structure that stores key-values pairs
//                 //          Keys are unique , but Values can be duplicated 
//                 //          Does not maintain any order , but is memory efficient
//                 //          HashMap<Key , Value>

//                 HashMap<String , Double> map = new HashMap<>();//we ahve store String as a key and double as a value

//                 map.put("apple", 0.50);//we use put method to push values in HashMap
//                 map.put("banana", 234.234);
//                 map.put("pienapple", 345.34);

//                 map.put("banana", 2000.000);///in here we overwrite ethe previous key 

//                 // map.remove("apple");//in here we remove the apple

//                 System.out.println(map);
//                 System.out.println(map.get("apple"));//in here we are going to get the value of the specified key
//                 System.out.println(map.containsKey("banana"));//checks if our HashMap contains this particular key
//                 System.out.println(map.containsValue(345.34));
//                 System.out.println(map.size());

//                 if(map.containsKey("apple")){
//                         System.out.println(map.get("apple"));
//                 }
//                 else{
//                         System.out.println("key not found");
//                 }

//                 for(String key : map.keySet()){//this will get all the keys with their values
//                         System.out.println(key + " : $" + map.get(key));
//                 }
//         }
// }



// public class practise{
//         public static void main(String[] args) {
                
//                 //Enums = (Enumerations) A special kind of class that represents a fixed set of constants.
//                 //        They improve code readability and are easy to maintain
//                 //        More efficient with switches when comparing Strings


//         // --- Practice 1: Using a single enum constant ---
//         System.out.println("--- Practice 1: Access a single enum constant ---");
//         object myDay = object.SUNDAY;
//         System.out.println("My day number is: " + myDay.getDayNumber());
//         System.out.println();

//         // --- Practice 2: Iterating through all enum constants ---
//         System.out.println("--- Practice 2: Iterate through all constants using values() ---");
//         // The values() method is a built-in static method that returns an array
//         // of all the enum constants in the order they were declared.
//         for (object day : object.values()) {
//             System.out.println(day + " is day number " + day.getDayNumber());
//         }
//         System.out.println();

//         // --- Practice 3: Using an enum in a switch statement ---
//         System.out.println("--- Practice 3: Use an enum in a switch statement ---");
//         object today = object.MONDAY;
//         switch (today) {
//             case MONDAY:
//                 System.out.println("Today is Monday. Start of the week!");
//                 break;
//             case FRIDAY:
//                 System.out.println("Today is Friday. Almost the weekend!");
//                 break;
//             case SATURDAY:
//             case SUNDAY:
//                 System.out.println("It's the weekend!");
//                 break;
//             default:
//                 System.out.println("It's a weekday.");
//                 break;
//         }
//     }
// }



// import java.util.Scanner;
// public class practise{
//         public static void main(String[] args) {
                
//                 //Threading = Allows a program to run multiple tasks simultaneously
//                 //            Helps improve performance with time-consuming operations
//                 //            (File I/O , network communications, or any background tasks)

//                 //How to create a Thread
//                 //Option 1. Extend the Thread class (simpler)
//                 //Option 2. Implement the Runnable interface (better)

//                 Scanner scanner = new Scanner(System.in);

//                 object myRunnable = new object();
//                 Thread thread = new Thread(myRunnable);
//                 thread.setDaemon(true);//A daemon thread runs in the background and does not prevent the Java Virtual Machine (JVM) from exiting. When all user threads finish, the JVM terminates any remaining daemon threads abruptly and shuts down. 
//                                           //this thread is going to end as soon as our main thread is finished
//                                           //Without 'System.exit(0)' line we are able to write out name still after the time runs out
//                 thread.start();

//                 System.out.println("You have 5 sec to enter your name");
//                 System.out.println("Enter your name");
//                 String name = scanner.nextLine();
//                 System.out.println("Hello " + name);
//                 scanner.close();
//         }
// }



public class practise{
        public static void main(String[] args) {
                
                //Multithreading = Enables a program to run multiple threads concurrently
                //                 (Thread = A set of instructions that run independently)
                //                 Useful for background tasks or time-consuming operations
                //1.Extend Thread class
                //2.Implement Runnable interfaces

                // object myRunnable = n;
                // Thread thread = new Thread(myRunnable);

                Thread thread1 = new Thread(new object("PING"));//both above an below codes do the same thing
                Thread thread2 = new Thread(new object("PONG"));//this is successfully multi-threading

                System.out.println("GAME START");

                thread1.start();
                thread2.start();

                try{//this whole code is so that the GAME OVER is at the end of the thread
                        thread1.join();
                        thread2.join();
                }
                catch(InterruptedException e){
                        System.out.println("main thread was interrupted");
                }

                System.out.println("GAME OVER");
        }
}