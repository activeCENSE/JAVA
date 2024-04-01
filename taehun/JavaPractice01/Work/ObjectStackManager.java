package JavaPractice01.Work;

import java.util.Scanner;

public class ObjectStackManager {
    public static void main(String[] args) {
        //선언부
        ObjectStack objs = new ObjectStack();
        Scanner sc = new Scanner(System.in);

        //입력부
        for(int i = 0; i < 7; i++){
            System.out.println(+ i+1 +"번째 스택 입력...");
            String input = sc.nextLine().trim();
            boolean isNumeric = true;

            for(int j = 0; j<input.length(); j++) {
                if (!Character.isDigit(input.charAt(j))) //입력된 문자가 숫자형태가 아니라면
                    isNumeric = false;
            }

            if(isNumeric) //해당 input 값이 숫자형 이라면?
                objs.push(Integer.parseInt(input)); //int형으로 파싱하여 푸시
            else
                objs.push(input); // 푸시
        }

        //출력부
        System.out.print("StringStack : ");
        for(int i = 0; !objs.isEmpty("문자열"); i++){
            System.out.print(objs.pop("문자열") + " | ");
        }
        System.out.println();
        System.out.print("IntegerStack : ");
        for(int i = 0; !objs.isEmpty("정수"); i++){
            System.out.print(objs.pop("정수") + " ");
        }
        sc.close();
    }
}
