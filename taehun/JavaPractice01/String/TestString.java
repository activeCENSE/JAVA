package JavaPractice01.String;

import java.nio.charset.Charset;

public class TestString {
    public static void main(String[] args) {
        System.out.println("사용하는 기본 문자셋:" + Charset.defaultCharset()); //UTF-8

        byte[] bt = {65,66,68};
        String btTemp = new String(bt);
        System.out.println(btTemp);

        byte[] btt = {'u','l','s'};
        String bttTemp = new String(btt);
        System.out.println(bttTemp);

        byte[] bt1 = "a가".getBytes();
        for(byte temp: bt1)
                System.out.print(temp + " ");
        String bt1Temp = new String(bt1);
        System.out.println("\n"+bt1Temp);
    }
}
