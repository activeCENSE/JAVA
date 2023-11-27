package JavaPractice01.study.study;
import java.util.Scanner;

public class Code1016_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score;
		int su, sum = 0;
		int[] code = {1,2,12,19};
		//code = {100,200,300,400};
		
		System.out.print("Enter Std su: ");
		su = sc.nextInt();
		score = new int[su];
		System.out.println(score);
		for(int i=0; i < score.length; i++) {
			System.out.print("Enter Data: ");
			score[i] = sc.nextInt();
		}
		for(int i=0 ; i < score.length;i++)
			sum += score[i];
		System.out.println("sum: " + sum);
		System.out.println("Average: " + sum/score.length);
		
		for(int i=0; i < code.length;i++)
			System.out.println(code[i]);
	}

}
