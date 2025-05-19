public class CustomExceptionDemo {
   public static void main (String []args){
    int age=18;
    
    try {
        if (age<18){
        throw new invalidAgeException("you are not eligible"); 
     }
    }
catch(invalidAgeException e){
    throw e;
}
    catch (Exception e) {
        System.out.println("Invalid Input");

    }
    }
    
 


   }
