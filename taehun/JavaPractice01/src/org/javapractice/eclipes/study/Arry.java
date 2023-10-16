package org.javapractice.eclipes.study;

import java.util.Scanner;

public class Arry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("학생수 입력 :");
		int stuNum = sc.nextInt();
		int[] arr = new int[stuNum];
		
		for(int i =0; i<arr.length; i++) {
			System.out.println("점수 입력 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		sc.close();
		for(int i = 0; i<arr.length; i++)
		System.out.println(arr[i]);
		System.out.println("합계: "+sum+"  평균 : "+(double)sum/arr.length);
	}

}
