
// //we used ths to learn about the objects
// public class object{
//         String make = "Ford";
//         String model = "Mustang";
//         int year = 2025;
//         double price = 58000.99;
//         boolean isRunning = false;

//         void star(){ //these are call instance methods
//                 isRunning = true;
//                 System.out.println("you star the engine");
//         }
//         void stop(){
//                 isRunning = false;
//                 System.out.println("You have stop the car");
//         }
//         void drive(){
//                 System.out.println("you drive the " + model);
//         }
//         void  brake(){
//                 System.out.println("you brake the " + model);
//         }
// }



// //WE USE THIS TO LEARN ABOUT THE CONSTRUCTORS
// public class object{

//         String name;
//         int age;
//         double gpa;
//         boolean isEnrolled;

//         object(String a, int b, double c){// Constructor with parameters
//                 this.name = a;// 'this' refers to the current object and its instance variables
//                 this.age = b;
//                 this.gpa = c;
//                 this.isEnrolled = true;
//         }
//         void study(){
//                 System.out.println("this name " + name + "is enrolled");
//         }
// }



// //WE USE THIS TO LEARN ABOUT THE OVERLOADED CONSTRUCTOR
// public class object{
//         String username;
//         String email;
//         int age;

//         object(){
//                 this.username = "Guest";
//                 this.email = "Not provided";
//                 this.age = 0;
//         }
//         object(String a){
//                 this.username = a;
//                 this.email ="not provided";
//         }
//         object(String a,String b){
//                 this.username = a;
//                 this.email = b;
//         }
//         object(String a,String b,int c){
//                 this.username = a;
//                 this.email = b;
//                 this.age = c;
//         }
// }



// //WE USE THIS TO LEARN ABOUT THE ARRAY OF OBJECTS
// public class object{

//         String model;
//         String color;

//         object(String a,String b){
//                 this.model = a;
//                 this.color = b;
//         }
//         void drive(){
//                 System.out.println("You drive the" + this.color + " " + this.model);
//         }
// }



// //WE USE THDI TO LEARN ABOUT THE STATIC
// public class object{

//         String name;
//         static int numOfFriends;//we just used the ststic modifier in this,hence the reference variables all said thsi one "numOfFriends"

//         object(String a){
//                 this.name = a;
//                 numOfFriends++;
//         }
//         static void showFriends(){
//                 System.out.println("You have " + numOfFriends + " total friend");
//         }
// }



//MAKE SURE TO INVOKE THE OBJECT2,3,4,5 WHEN USING THIS ONE
//WE USE THIS TO LEARN ABOUT THE INHERTITANCE FUNCTION
// public class object extends object4{

//         void eat(){
//                 System.out.println("Thane animeal is eating");
//         }
// }



// //WE USE THIS TO LEARN ABOUT SUPER
// public class object{

//         String first;
//         String last;

//         object(String a, String b){
//                 this.first = a;
//                 this.last = b;
//         }
//         void showName(){
//                 System.out.println(this.first + " " + this.last);
//         }
// }



// //WE USE THIS TO LEARN ABOUT METHOD OVERIDDING
// public class object{

//     void move(){
//         System.out.println("This animal is running");
//     }
// }



// //IN HERE WE LEARNING ABOUT toString() FUNCTION IN JAVA
// public class object{

//     String make;
//     String model;
//     int year;
//     String color;

//     object(String a , String b , int c , String d){
//         this.make = a;
//         this.model = b;
//         this.year = c;
//         this.color = d;
//     }
//     @Override
//     public String toString(){
//         return this.color + " " + this.year + " " + this.make + " " + this.model;
//     }
// }



// //WE ARE GOING TO LEARN ABOUT THE ABSTRACT FUNCTION IN JAVA
// public abstract class object{

//     abstract double area();//ABSTRACT

//     void display(){//CONCRETE
//         System.out.println("This is a shape");
//     }
// }



// //WE ARE LEARNING INTERFACE FUNCTION HERE
// public interface object {

//     void flee();
// }



//WE ARE LEARNING THE POLYMORPHISM HERE
// public abstract class object{

//     abstract void go ();
// }


// public interface object {//AS POLYMORPHISM CAN ALSO BE ACHIVED THROUGH INTERFACES

//     void go();
// }



// //WE ARE USING THIS TO LEARN ABOUT RUNTIME POLYMORPHISM
// public abstract class object{

//     abstract void speak();
// }



// //WE ARE GOIN TO LEARN ABOUT GETTER AND SETTER
// public class object{

//     private String model;//this will help us to not access these variables in practise.java
//     private String color;
//     private int price;

//     object(String a,String b,int c){
//         this.model = a;
//         this.color = b;
//         this.price = c;
//     }

//     String getModel(){//THESE ARE GETTERS
//         return this.model;
//     }
//     String getColor(){
//         return this.color;
//     }
//     String getPrice(){
//         return "$" + this.price;
//     }

//     void setModel(String model){//THIS IS SETTER
//         this.model = model;
//     }
//     void setColor(String color){
//         this.color = color;
//     }
//     void setPrice(int price){
//         if(price < 0){
//             System.out.println("you can not enter the price less than 0");
//         }
//         else{
//             this.price = price;
//         }
//     }
// }



// //WE ARE LEARNING ABOUT AGGREGATION HERE
// public class object{

//     String title;
//     int pages;

//     object(String a,int b){
//         this.title = a;
//         this.pages = b;
//     }
//     String displaynInfo(){
//         return this.title + " " + this.pages + " pages";
//     }
// }



// //WE ARE LEARNING ABOUT COMPOSITION HERE
// public class object{

//     String model;
//     int year;
//     object2 engine;

//     object(String a, int b, String engineType){
//         this.model = a;
//         this.year = b;
//         this.engine = new object2(engineType);
//     }
//     void start(){
//         this.engine.start();//since when we start the class we also start the engine
//         System.out.println("The " + this.model + "running");
//     }
// }



// //WE ARE HERE TO LEARN ABOUT ANONYMOUS CLASS
// public class object{
//     void speak(){
//         System.out.println("The dog goes *woof*");
//     }
// }



// //WE HERE TO LEARN ABOUT GENERICS
// public class object<T>{//T meaning type,or you can take it as a 'THING' and you do not know what that 'THING' reallyt is 
//                        //basically you do not have to announce the datatype 

//     T item ;
//     public void setItem(T item){
//         this.item = item;
//     }
//     public T getItem(){
//         return this.item;
//     }
// }



// //WE ARE HERE TO LEARN ABOUT THE ENUMS (ENUMERATIONS)
// public enum object{

//     SUNDAY(1) , MONDAY(2) , TUESDAY(3) , WEDNESDAY(4) , THURSDAY(5) , FRIDAY(6) , SATURDAY(7);

//     private final int dayNumber;// A private field to hold the day number.

//     object(int dayNumber){
//         this.dayNumber = dayNumber;
//     }
//     public int getDayNumber(){
//         return this.dayNumber;
//     }
// }



// //WE ARE HERE TO LEARN ABOUT THREADING
// public class object implements Runnable{//it is kinda like we are signing a contract
    
//     @Override
//     public void run(){
//         for(int i = 1 ; i <= 5 ; i++){

//             try{
//                 Thread.sleep(1000);    
//                 }
//                 catch(InterruptedException e){
//                     System.out.println("Thread was interrupted");
//                 }
//                 if(i == 5){
//                     System.out.println("Time's up!");
//                     System.exit(0);//this is where we would like our program to exit
//                 }
//             }
//         }
// }
       


//WE ARE LEARING ABOUT MULTI-THREADING
public class object implements Runnable{

    private final String text;
    object(String text){
       this.text = text; 
    }
    
    @Override
    public void run(){
        for(int i = 1 ; i <= 5 ; i++){
            try{
                Thread.sleep(1000);    
                // System.out.println(Thread.currentThread().getName() + " " + i);
                System.out.println(text);
                }
                catch(InterruptedException e){
                    System.out.println("Thread was interrupted");
                }
        }
    }
}