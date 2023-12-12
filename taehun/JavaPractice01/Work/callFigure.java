package JavaPractice01.Work;

import java.util.Scanner;

public class callFigure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("1. 원형, 2. 사각형, 3. 삼각형, 4. 종료");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
            int select = sc.nextInt();
            switch (select) {
                case 1: //원
                    System.out.println("좌표값 x를 입력하세요");
                    double x = sc.nextDouble();
                    System.out.println("좌표값 y를 입력하세요");
                    double y = sc.nextDouble();
                    System.out.println("중심좌표 x를 입력하세요");
                    double centerX = sc.nextDouble();
                    System.out.println("중심좌표 y를 입력하세요");
                    double centerY = sc.nextDouble();

                    Circle circle = new Circle();

                    circle.setLength(x, centerX, y, centerY);
                    System.out.println("해당 원의 지름은 " + circle.getLength() + " 입니다.");
                    circle.setArea();
                    System.out.println("해당 원의 넓이는 " + circle.getArea() + " 입니다.");
                    circle.setCircumference();
                    System.out.println("해당 원의 둘레는 " + circle.getCircumference() + " 입니다.");
                    break;

                case 2: //사각형
                    System.out.println("점 A의 좌표값 x를 입력하세요");
                    double rx = sc.nextDouble();
                    System.out.println("점 A의 좌표값 y를 입력하세요");
                    double ry = sc.nextDouble();
                    System.out.println("점 B의 좌표값 x를 입력하세요");
                    double rx2 = sc.nextDouble();
                    System.out.println("점 B의 좌표값 y를 입력하세요");
                    double ry2 = sc.nextDouble();

                    Rect rect = new Rect();
                    rect.setWidth(rx, rx2);
                    System.out.println("사각형의 가로 길이는 " + rect.getWidth() + " 입니다.");
                    rect.setHeight(ry, ry2);
                    System.out.println("사각형의 세로 길이는 " + rect.getHeight() + " 입니다.");
                    rect.setArea();
                    System.out.println("사각형의 넓이는 " + rect.getArea() + " 입니다.");
                    rect.setCircumference();
                    System.out.println("사각형의 둘레는 " + rect.getCircumference() + " 입니다.");
                    break;

                case 3: //삼각형
                    System.out.println("삼각형을 형성하는 세 점의 좌표를 입력하세요");
                    System.out.println("점 A의 좌표값 x를 입력하세요");
                    double tx1 = sc.nextDouble();
                    System.out.println("점 A의 좌표값 y를 입력하세요");
                    double ty1 = sc.nextDouble();
                    System.out.println("점 B의 좌표값 x를 입력하세요");
                    double tx2 = sc.nextDouble();
                    System.out.println("점 B의 좌표값 y를 입력하세요");
                    double ty2 = sc.nextDouble();
                    System.out.println("점 C의 좌표값 x를 입력하세요");
                    double tx3 = sc.nextDouble();
                    System.out.println("점 C의 좌표값 y를 입력하세요");
                    double ty3 = sc.nextDouble();

                    Triangle ta = new Triangle();

                    ta.setLength(tx1, tx2, ty1, ty2);
                    double sideA = ta.getLength();
                    ta.setLength(tx2, tx3, ty2, ty3);
                    double sideB = ta.getLength();
                    ta.setLength(tx3, tx1, ty3, ty1);
                    double sideC = ta.getLength();

                    System.out.println("삼각형의 빗변 A 길이는 " + sideA + " 입니다.");
                    System.out.println("삼각형의 빗변 B 길이는 " + sideB + " 입니다.");
                    System.out.println("삼각형의 빗변 C 길이는 " + sideC + " 입니다.");
                    ta.getType(sideA, sideB, sideC);
                    ta.setCircumference(sideA, sideB, sideC);
                    System.out.println("삼각형의 둘레는 " + ta.getCircumference() + " 입니다.");
                    ta.setArea(sideA, sideB, sideC);
                    System.out.println("삼각형의 넓이는 " + ta.getArea() + " 입니다.");
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    break;
            }
            if( select == 4) {
                break;
            }
        }
    }
}
