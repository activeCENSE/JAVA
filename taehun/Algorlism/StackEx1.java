package Algorlism;

import java.util.Arrays;
import java.util.Scanner;

public class StackEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("최대 맻개를 저장할래? : ");
        int size = sc.nextInt();
        ArrayStack as = new ArrayStack(size);
        while (true){
            System.out.println("1. 푸시\t2. 팝\t3. 탑\t4.나가");
            switch (sc.nextInt()){
                case 1:
                    System.out.print("숫자 뭐 넣을거임? : "); as.push(sc.nextInt());
                    break;
                case 2:
                    System.out.println("이거 뻇디 : " + as.pop());
                    break;
                case 3:
                    System.out.println("젤 위에껀 이거다 : " + as.top());
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("왜 잘못입력하노.");
            }
        }
    }
}
