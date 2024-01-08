package JavaPractice01.StreamTests;

import java.io.*;
import java.util.Arrays;

public class FileIOExample3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("ioexample6.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeBoolean(true);
        dos.writeByte(Byte.MAX_VALUE);
        dos.writeInt(123);
        dos.writeChar('가');
        dos.writeDouble(1.1123);
        dos.writeBytes("울산");

        FileInputStream fis = new FileInputStream("ioexample6.txt");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readBoolean());
        System.out.println(dis.readByte());
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readDouble());
    }
}
