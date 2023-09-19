package org.javapractice.eclipes.study;

import java.util.Scanner;

public class NoWayQuit {

	public static void main(String[] args) {
		Scanner InputScore = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.println("너의 점수를 입력하세요. 그만 치고 싶으면 quit를 치삼요");
			String userInput = InputScore.next();
			if(userInput.equals("quit")) {
				InputScore.close();
				break;
			}
            // 입력 값을 Int로 변환.
			try {
				int score = Integer.parseInt(userInput);
				sum += score;
			} catch(NumberFormatException e) { // 예외 처리 (자바 깊은 개념  => 보통 e의 변수로 많이 처리함)
				System.out.println("숫자만 입력해주세요.");
			}
		}
		System.out.println("계속된 점수의 합계는 :" +sum);
		InputScore.close();
	}

}
