package JavaPractice01.Work;

import java.util.Scanner;

public class StackManager {
    public static void main(String[] args) {
        StringStack sst = new StringStack();
        IntegerStack ist = new IntegerStack();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 7; i++){
            System.out.println(+ i+1 +"번째 스택 입력...");
            String input = sc.nextLine().trim();
            boolean isNumeric = true;
            for(int j = 0; j<input.length(); j++) {
                if (!Character.isDigit(input.charAt(j))) {
                    isNumeric = false;
                }
            }
            if(isNumeric){
                ist.push(Integer.parseInt(input));
            } else {
                sst.push(input);
            }
        }
        System.out.print("StringStack : ");
        for(int i = 0; i <= sst.length(); i++){
            System.out.print( sst.pop() + " ");
        }
        System.out.println();
        System.out.print("IntegerStack : ");
        for(int i = 0; i <= ist.length(); i++){
            System.out.print( ist.pop() + " ");
        }
        sc.close();
    }
}
