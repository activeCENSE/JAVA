package JavaPractice01.StreamTests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOExample01 {
    public static void main(String[] args) {
        byte[] inSrc = {11, 2, 3, 4, 6, 13};
        byte[] outSrc = null;
        byte[] outSrc1 = new byte[inSrc.length];

        for(int i = 0; i < inSrc.length; i++){
            outSrc1[i] = inSrc[i];
        }

        ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        int data;
        while( (data = input.read()) != -1){
            output.write(data);
        }
        outSrc = output.toByteArray();

        System.out.println(Arrays.toString(inSrc));
        System.out.println(Arrays.toString(outSrc));
        System.out.println(Arrays.toString(outSrc1));
    }
}
