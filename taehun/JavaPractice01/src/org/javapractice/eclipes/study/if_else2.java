package org.javapractice.eclipes.study;

import java.util.Scanner;

public class if_else2 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		int inputScore = sc.nextInt();
		
		if(inputScore >= 0 && inputScore <= 100) {
			switch(inputScore/10){
				case 10:
				case 9:
					System.out.println("A+ 입니다.");
				break;
				case 8:
					System.out.println("A 입니다.");
					break;
				case 7:
					System.out.println("B 입니다.");
					break;
				case 6:
					System.out.println("C 입니다.");
					break;
				case 5:
					System.out.println("D 입니다.");
					break;
				default:
					System.out.println("F 입니다.");
			}
		}
	}
}
