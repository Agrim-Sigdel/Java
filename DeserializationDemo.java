import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
      public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("Person.ser");
            ObjectInputStream ois =new ObjectInputStream(fis);
            Person per =(Person) ois.readObject();
            System.out.println("Object Deserialized::"+per.Display());
           

        }
        catch(Exception e){
            e.printStackTrace();
        }
      }
}
