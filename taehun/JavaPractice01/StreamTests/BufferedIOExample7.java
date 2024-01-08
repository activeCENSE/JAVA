package JavaPractice01.StreamTests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Vector;

public class BufferedIOExample7 {
    public static void main(String[] args) throws IOException {
        byte[] data1 = {10, 11, 12};
        byte[] data2 = {-10, -11, -12};
        byte[] data3 = {20, 21, 22};

        Vector<ByteArrayInputStream> v= new Vector<>();
        v.add(new ByteArrayInputStream(data1));
        v.add(new ByteArrayInputStream(data2));
        v.add(new ByteArrayInputStream(data3));
        SequenceInputStream input = new SequenceInputStream(v.elements());
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        int data = 0;
        while( (data = input.read()) != -1) output.write(data);
        byte[] outData = output.toByteArray();
        System.out.println(Arrays.toString(outData));
    }
}
