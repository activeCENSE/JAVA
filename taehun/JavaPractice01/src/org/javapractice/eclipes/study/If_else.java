package org.javapractice.eclipes.study;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		System.out.println("학번을 입력하세요:");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		int deptNum = (input/1000) - ((input/100000)*100); 
		switch(deptNum) {
			case 12:
				System.out.println("컴퓨터IT학부 입니다.");
				break;
			case 19:
				System.out.println("디콘디학부 입니다.");
				break;
			case 02:
				System.out.println("전기공학부 입니다.");
				break;
			case 01:
				System.out.println("기계공학부 입니다.");
				break;
			default:
				System.out.println("찾을 수 없습니다.");
		}
		

	}

}
