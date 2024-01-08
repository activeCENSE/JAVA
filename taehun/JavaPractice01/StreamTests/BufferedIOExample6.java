package JavaPractice01.StreamTests;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOExample6 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("ioexample9.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        for(int i ='a'; i <= 'z'; i++){
            bos.write(i);
        }
        bos.close();
    }
}
