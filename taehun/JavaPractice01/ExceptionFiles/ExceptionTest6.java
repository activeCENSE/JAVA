package JavaPractice01.ExceptionFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest6 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fi = new FileInputStream("./data.txt");

    }
}
