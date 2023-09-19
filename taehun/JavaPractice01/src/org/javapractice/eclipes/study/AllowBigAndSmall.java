package org.javapractice.eclipes.study;

import java.util.Scanner;

public class AllowBigAndSmall {

	public static void main(String[] args) {
		Scanner inputAlphabet = new Scanner(System.in);
		System.out.println("입력 값을 입력하세요.");
		String bet = inputAlphabet.next();
		inputAlphabet.close();
		
		if(bet.charAt(0) >= 'a' && bet.charAt(0) <= 'z') {
			System.out.println("해당 첫 문자의 입력값은 소문자 입니다.");
		} else if(bet.charAt(0) >= 'A' && bet.charAt(0) <= 'Z') {
			System.out.println("해당 첫 문자의 입력값은 대문자 입니다.");
		} else {
			System.out.println("해당 입력 값은 소문자, 대문자가 아닙니다.");
		}

	}

}
