package org.javapractice.eclipes.study;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, count = 0;
		 do {
			System.out.println("정수값을 입력하세요. 종료는 0");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("입력된 값의 평균 값은 "+((double)sum/count)+" 입니다.");
				break;
			} else {
				sum += input;
				++count;
			}
		} while(true);
		sc.close();
	}

}
