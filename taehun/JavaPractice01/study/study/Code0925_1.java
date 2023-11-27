package JavaPractice01.study.study;
import java.util.Scanner;

public class Code0925_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("정수값 2개를 입력해주세요...");
		a = sc.nextInt();
		b = sc.nextInt();
		if(a > b) {
			System.out.println("두개 정수값 차이는 "+ (a-b));
		}
		else {
			System.out.println("두개 정수값 차이는 "+ (b-a));
		}
		System.out.print("두개 정수값 차이는 ");
		System.out.println( (a>b)?(a-b):(b-a) );
	}

}
