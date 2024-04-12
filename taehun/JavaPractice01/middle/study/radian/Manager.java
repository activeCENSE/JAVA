package JavaPractice01.middle.study.radian;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Manager {
    static Triangle[] data;
    static int su;
    static Scanner sc = new Scanner(System.in);
    public static int calLength(int val1, int val2){
        return Math.abs((val1 - val2));
    }

    static double calC(int a, int b){
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }
    public static void main(String[] args) {
        System.out.print("삼각형 갯수:");
        su = Integer.parseInt(sc.nextLine());
        data = new Triangle[su];
        int lengthA, lengthB;
        double lengthC;

        for(int k=0; k < su; k++){
            System.out.print((k+1)+"번째 삼각형...");
            System.out.print("첫번째 포인트 좌표(x,y):");
            String str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str, ",");
            Point p1 = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            System.out.print("두번째 포인트 좌표(x,y):");
            str = sc.nextLine();
            st = new StringTokenizer(str, ",");
            Point p2 = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            lengthA = calLength(p1.x, p2.x); lengthB = calLength(p1.y, p2.y);
            lengthC = calC(lengthA, lengthB);

            data[k] = new Triangle(lengthA, lengthB, lengthC);
        }
        for(Triangle temp:data){
            System.out.println("면적:" + temp.getArea());
        }
        for(int k=0; k<su; k++){
            System.out.print((k+1)+"번째 삼각형...");
            System.out.print("면적 : "+data[k].getArea());
            System.out.print(" 변길이 : [" +data[k].Lvalue[0] + ","+data[k].Lvalue[1] + ", " + data[k].Lvalue[2] + "],");
            System.out.println(" 각도 : [" +data[k].Avalue[0] + ","+data[k].Avalue[1] + ", " + data[k].Avalue[2] + "]");
        }
    }
}
