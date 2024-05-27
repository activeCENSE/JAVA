package JavaPractice01.StringPackage;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class EnDeExample {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("기본 방식: " + Charset.defaultCharset().name());
        byte[] bt1, bt2;
        String str1 = "ulsan";
        String str2 = "대한민국";
        bt1 = str1.getBytes();
        bt2 = str1.getBytes(StandardCharsets.UTF_16);
        for (byte b : bt1) {
            System.out.print(b + " ");
        }
        System.out.println();
        for (byte b : bt2) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println(new String(bt1));
        System.out.println(new String(bt2, "UTF-16")); //ulsan
        System.out.println(new String(bt2, 2, 10, StandardCharsets.UTF_16)); // ulsan - 앞 2개는 인코딩-디코딩 방식을 결정하는 것
        System.out.println("---------------------");
        bt1 = str2.getBytes();
        bt2 = str2.getBytes(StandardCharsets.UTF_16);
        for (byte b : bt1) {
            System.out.print(b + " ");
        }
        System.out.println();
        for (byte b : bt2) {
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println(new String(bt1));
        System.out.println(new String(bt2, "UTF-16")); //ulsan
        System.out.println(new String(bt2, 2, 8, StandardCharsets.UTF_16)); // ulsan - 앞 2개는 인코딩-디코딩 방식을 결정하는 것
        System.out.println(new String(bt1, StandardCharsets.UTF_16));
    }
}
