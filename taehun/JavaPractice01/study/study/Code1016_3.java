package JavaPractice01.study.study;
import java.util.Scanner;

public class Code1016_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score, sum =  0, count = 0;
		
		do {
			score = sc.nextInt();
			if( score == 0) {
				System.out.println("입력한 값들의 평균은" + ((double)sum/count) + "입니다.");
				break;
			}
			else {
				sum += score;
				count++;
			}
		}while(true);
		
		

	}

}
