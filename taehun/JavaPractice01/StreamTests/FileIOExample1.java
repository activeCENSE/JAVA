package JavaPractice01.StreamTests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOExample1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/mac/Desktop/Coding/Java/taehun/JavaPractice01/data.txt");
            FileOutputStream fos = new FileOutputStream("fileioexample1.txt");
            int data;
            while((data = fis.read()) != -1){
                fos.write(data);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
