package JavaPractice01.study.study;
import java.util.Scanner;

public class CalculateStandardWeight {

	public static void main(String[] args) {
		System.out.println("신장을 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		System.out.println("표준 체중은 " + ((height-100)*0.9)  + "입니다.");
		
		System.out.println("정수값을 입력하세요");
		int number = sc.nextInt();
		if( number%2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		sc.close();

	}

}
