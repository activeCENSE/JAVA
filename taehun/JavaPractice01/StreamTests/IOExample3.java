package JavaPractice01.StreamTests;
import java.io.*;
import java.util.Arrays;

public class IOExample3 {
    static void printing(byte[] temp, byte[] outSrc) {
        System.out.println("Temp           :" + Arrays.toString(temp));
        System.out.println("Output Source:" + Arrays.toString(outSrc));
    }

    public static void main(String[] args) {
        byte[] inSrc = {0,11,12,13,14,15,16,17,18,19};
        byte[] outSrc = null;
        byte[] temp = new byte[4];

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        System.out.println("Input Source   :" + Arrays.toString(inSrc));

        try {
            while(input.available()>0) {
                input.read(temp);
                output.write(temp);
                outSrc = output.toByteArray();
                printing(temp, outSrc);
            }
        }
        catch(IOException e) {

        }
    }

}