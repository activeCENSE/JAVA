package JavaPractice01.study.study;
import java.util.Scanner;

public class Code1016_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score >= 0 && score <= 100) {
			switch(score/10) {
			case 10: 
			case 9:  System.out.println('A');
				 	 break;
			case 8:  System.out.println('B');
					 break;
			case 7:  System.out.println('C');
			 		 break;
			case 6:  System.out.println('D');
			 		 break;
			default: System.out.println('F');
			}
		}
		else
			System.out.println("점수가 잘못됨");
	}

}
