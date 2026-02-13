//WE JUST INHERITED THE ATTRIBUTES FROM THE OBJECT AND NOW CAN USE IT THROUGH OBJECT2
// public class object2 extends object {
    
//     int lives = 1;

//     void speak(){
//         System.out.println("The dog goes *woof*");
//     }
// }



// //WE ARE USING THIS TO LEARN ABOUT SUPER
// public class object2 extends object{

//     double gpa;

//     object2(String a,String b,double c){
//        super(a,b);
//         this.gpa = c;
//     }
//     void showGpa(){
//         System.out.println(this.first + "'s gpa is " + this.gpa);
//     }
// }



// //WE ARE USING THIS TO LEARN ABOUT METHOD OVERRIDING
// public class object2 extends object{

// }



// //WE ARE GOING TO LEARN ABOUT THE ABSTRACT FUNCTION IN JAVA
// public class object2 extends object{
    
//     double radius;
//     object2(double a){
//         this.radius = a;
//     }

//     @Override
//     double area(){
//         return Math.PI * radius * radius;
//     }
// }



// //WE ARE LEARNING INTERFACE FUNCTION HERE
// public interface object2 {

//     void hunt();
// }



//WE ARE LEARNING THE POLYMORPHISM HERE
// public class object2 extends object{

//     @Override
//     void go(){
//         System.out.println("You drive the car");
//     }
// }


// public class object2 implements object{//AS POLYMORPHISM CAN BE ACHIVED THIS WAY TOO

//     @Override
//     public void go(){
//         System.out.println("You drive the car");
//     }
// }



// //WE ARE USING THIS TO LEARN ABOUT RUNTIME POLYMORPHISM
// public class object2 extends object{

//     void speak(){
//         System.out.println("The dog goeos *woof*");
//     }
// }



// //WE ARE LEARNING ABOUT AGGREGATION HERE
// public class object2{

//     String name;
//     int year;
//     object[] books;

// object2(String a, int b,object[] c){
//     this.name = a;
//     this.year = b;
//     this.books = c;
// }
// void displayInfo(){
//     System.out.println("The" + this.year + " " + this.name);
//     System.out.println("Books available");
//     for(object book:books){
//         System.out.println(book.displaynInfo());
//     }
// }
// }



// //WE ARE LEARNING ABOUT COMPOSITION HERE
// public class object2{
    
//     String type;
//     object2(String type){
//         this.type = type;
//     }
//     void start(){
//         System.out.println("you start the " + this.type + "engine"); 
//     }
// }



// //WE ARE HERE TO LEARN ABOUT ANONYMOUS CLASS
// public class object2 extends object{

//     @Override
//     void speak(){
//         System.out.println("Scooby Doo says *RUF RUF*");
//     }
// }



// //WE HERE TO LEARN ABOUT GENERICS
// public class object2<T , U>{ //we can even use 'V' as our 3th argument

//     T item;
//     U price;

//     object2(T a,U b){
//         this.item = a;
//         this.price = b;
//     }
//     public T item( T item){
//         return item ;
//     }
//     public U price( U price){
//         return price ;
//     }
// }