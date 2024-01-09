package JavaPractice01.StreamTests.ObjectStream;

import JavaPractice01.StreamTests.ObjectStream.dept.Dept;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectIOExample1_1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("iosample11.txt"));
        Object obj = ois.readObject();
        Dept d1 = (Dept)obj;
        System.out.println(d1.getDeptId());
        obj = ois.readObject();
        d1 = (Dept)obj;
        System.out.println(d1.getDeptId());
        ois.close();

//        Object o1 = ois.readObject();
//        Box b = (Box) ois.readObject();
//        System.out.println(o1);
//        System.out.println(b.width);
//        System.out.println(b.height);
//        System.out.println(b.depth);
//        System.out.println("double:" + ois.readDouble());
    }
}
