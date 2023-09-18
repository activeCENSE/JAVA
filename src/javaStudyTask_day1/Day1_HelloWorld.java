package javaStudyTask_day1;
import java.util.Scanner;

public class Day1_HelloWorld {

    public static void main(String[] args) {
    	//환영문구 출력
    	System.out.println("HelloWorld");
    	
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("입력할 문구는 ?");
    	String userInput = scanner.nextLine(); //사용자의 입력을 읽음.
    	System.out.println("당신이 입력한 것은" + userInput + "입니다");
    	
    	
    	scanner.close();
    }
}