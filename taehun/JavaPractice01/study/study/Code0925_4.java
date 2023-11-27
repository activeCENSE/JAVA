package JavaPractice01.study.study;
import java.util.Scanner;

public class Code0925_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자입니다.");
		}
		else {
			System.out.println("소문자입니다.");
		}
		
	}

}
