package JavaPractice01.StreamTests;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class IOExample12 {
    public static void main(String[] args) {
        try {
            String fileName = "ioexample12.txt";
            FileInputStream fis = new FileInputStream(fileName);
            FileReader fr = new FileReader(fileName);

            int data = 0;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
            fis.close();
            System.out.println("----------------------");

            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
