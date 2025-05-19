
package constructor;
public class Book {

     String author;
     int age;
   // Default constructor
   // Constructor overloading
   public Book (){
        System.out.println("Default constructor");

   }

   public Book (String author,int age){
this.author = author;
this.age = age;
       
   }

public void printDetails(){
        System.out.println("Author: " + author);
        System.out.println("Age: " + age);
   }
   public Book (String author){
        System.out.println("Single parameter constructor");
        System.out.println("Author: " + author);
   }
}
