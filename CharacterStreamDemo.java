import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
public class CharacterStreamDemo {
    public static void main(String[] args) throws Exception{
        FileWriter writer = new FileWriter("abc.txt");
        writer.write("this is test");
        writer.close();
        FileReader reader =new FileReader("abc.txt");
        BufferedReader read2 =new BufferedReader(reader);
        String line;
        while((line = read2.readLine())!= null){
            System.out.println(line); //read a line
        }
        reader.close();
    }
}
