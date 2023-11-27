package JavaPractice01.String;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestString {
    public static void main(String[] args) {
        System.out.println("사용하는 기본 문자셋:" + Charset.defaultCharset()); //UTF-8

        byte[] bt = {65,66,68};
        String btTemp = new String(bt);
        System.out.println(btTemp);

        byte[] btt = {'u','l','s'};
        String bttTemp = new String(btt);
        System.out.println(bttTemp);


        byte[] bt1 = "a가나다라".getBytes();
        byte[] bt2 = "a가나다라".getBytes(StandardCharsets.UTF_16);

        for(byte temp: bt1)
                System.out.print(temp + " ");
        System.out.println();
        for(byte temp: bt2)
            System.out.print(temp + " ");
        System.out.println();


        String str1 = new String(bt1);
        System.out.println(str1);
        String str2 = new String(bt2);
        System.out.println(str2);
        String str3 = new String(bt2, StandardCharsets.UTF_16);
        System.out.println(str3);

        byte[] bt3 = bt2;
        bt3[bt3.length-1]=0;
        bt3[bt3.length-2]=0;
        String str4 = new String(bt3, StandardCharsets.UTF_16);
        System.out.println(str4);
    }
}
