package javaStudyTask_day1;
import java.util.Scanner;

public class Day1_HelloWorld {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("입력할 문구는 ?");
    	String userInput = scanner.nextLine(); //사용자의 입력을 읽음.
    	userInput = "HELLO TAEHUN?"; // 이전의 입력을 무시하고 임시로 입력 ㅋㅋ 태훈 ㅎㅇ
    	System.out.println("당신이 입력한 것은" + userInput + "입니다");
    	
    	scanner.close();
    }
}