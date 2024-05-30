package JavaPractice01.collection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class PointVectorExample {
    static Vector<Point> v = new Vector<>();
    static Scanner sc = new Scanner(System.in);
    public static void addPoint(){
        while (true) {
            System.out.print("x: ");
            int x = sc.nextInt();
            if (x < 0) break;
            System.out.print("y: ");
            int y = sc.nextInt();
            v.add(new Point(x, y));
        }
    }

    public static void searchPoint(){
        for(int i = 0; i<v.size(); i++){
            System.out.println(v.get(i));
        }
        System.out.println("찾는 좌표값을 입력해주세요");
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();
        int flag = v.indexOf(new Point(x,y));
        if(flag != -1){
            System.out.println("point" + v.get(flag) + "는 " + flag + "번 위치에 있습니다.");
        } else {
            System.out.println("해당 point는 존재하지 않습니다.");
        }
    }
    public static void main(String[] args) {
        while(true){
            System.out.println("1.Add\t2.Search\t3.exit");
            switch (sc.nextInt()){
                case 1: addPoint(); break;
                case 2: searchPoint(); break;
                case 3: System.exit(0); break;
                default:
                    System.out.println("다시 입력해주세요");
            }
        }
    }
}
