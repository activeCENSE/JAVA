package JavaPractice01.StreamTests;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedIOExample5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("ioexample8_ansi.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        System.out.println("읽을 수 있는 바이트수 : " + bis.available());
        int i = bis.read();
        System.out.println(i);
        System.out.println("읽을 수 있는 바이트수 : " + bis.available());
        bis.close();

        fis = new FileInputStream("ioexample8.txt");
        bis = new BufferedInputStream(fis);
        while((i = fis.read()) != -1){
            System.out.print((char)i);
        }
        System.out.println();
        bis.close();

        fis = new FileInputStream("ioexample8.txt");
        bis = new BufferedInputStream(fis);
        bis.skip(5);
        while((i = fis.read()) != -1){
            System.out.print((char)i);
        }
        System.out.println();
        bis.close();
    }
}
