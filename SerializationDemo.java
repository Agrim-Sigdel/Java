
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        Person per=new Person("john",30);


        try{
            FileOutputStream fos= new FileOutputStream("person.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(per);
            fos.close();
            oos.close();
        }

        catch(IOException e){
          e.printStackTrace();
        }
    }
}
