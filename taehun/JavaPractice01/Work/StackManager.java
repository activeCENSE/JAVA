package JavaPractice01.Work;

import java.util.Scanner;

public class StackManager {
    public static void main(String[] args) {
        //선언부
        StringStack sst = new StringStack();
        IntegerStack ist = new IntegerStack();
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
                ist.push(Integer.parseInt(input)); //int형으로 파싱하여 IntegerStack에 푸시
            else
                sst.push(input); //StringStack에 푸시
        }

        //출력부
        System.out.print("StringStack : ");
        for(int i = 0; !sst.isEmpty(); i++){ //sst의 stack 객체가 빌 때 까지 반복
            System.out.print(sst.pop() + " ");
        }
        System.out.println();
        System.out.print("IntegerStack : ");
        for(int i = 0; !ist.isEmpty(); i++){ //ist의 stack 객체가 빌 때 까지 반복
            System.out.print(ist.pop() + " ");
        }
        sc.close();
    }
}
