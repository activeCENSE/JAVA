package org.javapractice.eclipes.javaApp;

import java.util.Scanner;

public class highandLower {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int bigger = 0;
		int lower = 0;
		
		System.out.println("입력값을 입력해주세요");
		int inputScan = scan.nextInt();
		
		if(inputScan == 0) {
			scan.close();
		} else if(inputScan > 0) {
			bigger = inputScan;
			lower = inputScan;
		}
		
		while(true) {
			System.out.println("입력값을 입력해주세요");
			inputScan = scan.nextInt();
			if(inputScan == 0) {
				scan.close();
				break;
			} else if(inputScan > 0) {
				if(bigger < inputScan) {
					bigger = inputScan;
				} else if (lower>inputScan) {
					lower = inputScan;
				}
			}
		}
		
		System.out.println("최댓값은 :" +bigger+ "\n최소값은 :" +lower);

	}

}
