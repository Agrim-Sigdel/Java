

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BytestreamDemo {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("abc.txt");
        fos.write("this is test".getBytes());
        FileInputStream fis=new FileInputStream("abc.txt");
        int characters;
        String Output="";
        while((characters=fis.read())!=-1){
            Output=Output+(char)characters;
        }
        System.out.println(Output);
        fis.close();
        fos.close();
    }
}
