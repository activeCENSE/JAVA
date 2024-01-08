package JavaPractice01.StreamTests;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOExample2 {
    public static void main(String[] args) {
        try {
            byte[] data = {10, 20, 30, -40, 50};
            FileOutputStream fos = new FileOutputStream("fileioexample2.txt");
            for(byte temp: data){
                fos.write(temp);
            }
            fos.flush();
            fos.close();
            FileInputStream fis = new FileInputStream("fileioexample2.txt");
            int c;
            while((c = fis.read()) != -1){
                System.out.println(c);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
