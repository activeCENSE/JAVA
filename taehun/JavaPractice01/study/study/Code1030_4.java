package JavaPractice01.study.study;
import java.util.Scanner;

public class Code1030_4 {
	static Scanner sc = new Scanner(System.in);
	
	public static int[] inputData(int su) {
		int[] score = new int[su];
		for(int i=0; i < su; i++) {
			System.out.print((i+1) + "번 학생 점수:");
			score[i] = sc.nextInt();
		}
		return score;
	}
	
	public static void printData(int[] score) {
		for(int i=score.length-1; i >=0; i--) {
			System.out.println((score.length-i)+ "등 점수 "+ score[i]);
		}
	}
	public static void main(String[] args) {
		System.out.print("학생수:");
		int su = sc.nextInt();
		int[] data = inputData(su);
		java.util.Arrays.sort(data);
		printData(data);

	}

}
