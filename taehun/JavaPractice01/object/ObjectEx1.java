package JavaPractice01.object;

import java.util.Scanner;

public class ObjectEx1 {
    static String temp = "uc College";
    public static void main(String[] args) {
        Student s = new Student("uc", 90);
        Student t = new Student("uc", 90);
        Student y = new Student("uc", 98);
        Student x = s;

        System.out.println(s.hashCode());
        System.out.println(t.hashCode());
        System.out.println(y.hashCode());
        System.out.println(s==t);
        System.out.println(s.equals(t));

        System.out.println("------------------------");

        OverStudent ov1 = new OverStudent("uc", 20);
        OverStudent ov2 = new OverStudent("uc", 20);

        System.out.println(ov1.equals(ov2)); // 해시코드가 같아도 false => hashCode()라는 메소드를 간접적으로 바꿔준 것일뿐 실질적인 주소값은 변경되지 않았기 때문에..?
        System.out.println(ov1.hashCode());
        System.out.println(ov2.hashCode());

    }
}
