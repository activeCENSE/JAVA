package JavaPractice01.StreamTests;

import java.io.*;
import java.util.Vector;

public class SquenceTest {
    public static void main(String[] args) throws IOException {
        Vector<FileInputStream> v = new Vector<>();
        v.add(new FileInputStream("./uc1.txt"));
        v.add(new FileInputStream("./uc2.txt"));
        v.add(new FileInputStream("./uc3.txt"));
        SequenceInputStream input = new SequenceInputStream(v.elements());
        FileOutputStream output = new FileOutputStream("./uc4.txt");

        int data = 0;
        while((data = input.read()) != -1) output.write(data);

        input.close();
        output.close();
    }
}
