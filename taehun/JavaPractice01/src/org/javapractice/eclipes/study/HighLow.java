package org.javapractice.eclipes.study;

import java.util.Scanner;


public class HighLow {
	public static int count;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int highest = 0;
		int lowest = 0;
	
		System.out.println("숫자를 입력하세요.");
		int inputNum = scan.nextInt();
		
		if(inputNum == 0) {
			scan.close();
		} else if(inputNum > 0) {
			highest = inputNum;
			lowest = inputNum;
			count++;
		} else {
			count++;
		}
		
		while(true) {
			System.out.println("숫자를 입력하세요.");
			inputNum = scan.nextInt();
			
			if(inputNum == 0) {
				scan.close();
				break;
			} else if(inputNum > 0) {
				if(highest < inputNum) {
					highest = inputNum;
					count++;
				} else if(lowest > inputNum) {
					lowest = inputNum;
					count++;
				} else {
					count++;
				}
			} else {
				count++;
			}
			
		}
		System.out.println("최댓값 : " +highest+ "\n최솟값 : " +lowest+ "\n총 입력한 횟수 : " +count);
	}

}
