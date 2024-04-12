package JavaPractice01.middle.study.Figure;

import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value1, value2;
        String color;
        Shape s;

        System.out.print("삼각형 밑변길이 : ");
        value1 = Integer.parseInt(sc.next());
        System.out.print("삼각형 높이 : ");
        value2 = Integer.parseInt(sc.next());
        s = new Triangle(value1, value2);
        System.out.print("삼각형 색상 : ");
        color = sc.next();
        s.setColor(color);
        System.out.println("삼각형(밑변="+Triangle.getBaseLength()+", 높이="+Triangle.getHeight()+", 색상=" +s.getColor()+"의 면적" + s.area);

        System.out.print("사각형 너비 : ");
        value1 = Integer.parseInt(sc.next());
        System.out.print("사각형 높이 : ");
        value2 = Integer.parseInt(sc.next());
        s = new Rectangle(value1, value2);
        System.out.print("사각형 색상 : ");
        color = sc.next();
        s.setColor(color);
        System.out.println("사각형(너비="+Rectangle.getWidth()+", 높이="+Triangle.getHeight()+", 색상=" +s.getColor()+"의 면적" + s.area);

        System.out.print("원 반지름 : ");
        value1 = Integer.parseInt(sc.next());
        s = new Circle(value1);
        System.out.print("원 색상 : ");
        color = sc.next();
        s.setColor(color);
        System.out.println("원(반지름="+Circle.getRadius()+", 색상=" +s.getColor()+"의 면적" + s.area);
    }
}
