package JavaPractice01.StreamTests.ObjectStream;

import JavaPractice01.StreamTests.ObjectStream.dept.Dept;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectIOExample1 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("iosample11.txt"));
        Dept d1 = new Dept("12", "컴퓨터it", 3);
        Dept d2 = new Dept("19", "디콘디", 2);
        oos.writeObject(d1);
        oos.writeObject(d2);
        oos.close();

//        String str1 = "***넓이, 높이, 길이 ***";
//        Box b1 = new Box(10,20,30);
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("iosample11.txt"));
//        oos.writeObject(str1);
//        oos.writeObject(b1);
//        oos.writeDouble(3.14);
//        oos.close();
    }
}
