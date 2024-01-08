package JavaPractice01.StreamTests;

import java.io.*;

public class FIleIOExample4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("ioexample7.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(123);
        dos.writeUTF("울산");
//        dos.writeBytes("울산");
        dos.close();

        FileInputStream fis = new FileInputStream("ioexample7.txt");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readUTF());
//
//        byte[] bt = new byte[dis.available()];
//        if (dis.available() > 0){
//            int l = dis.read(bt);
//            System.out.println(l);
//            System.out.println(new String(bt));
//        }
        dis.close();
    }
}
