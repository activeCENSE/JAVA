package org.javapractice.eclipes.study.InstanceFolder;

import java.util.Scanner;

public class InstanceDoubleArray {
	public static Scanner printScan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		while(true) { //무한 반복
			System.out.println(
					"=-=-=-=-메뉴-=-=-=-=\n"
					+ "1 : 입력\n"
					+ "2 : 출력\n"
					+ "0 : 종료\n"
					+ "=-=-=-=-=-=-=-=-=-=");
			int choice = printScan.nextInt();
			if(choice == 1) {
				System.out.println("정보를 입력할 유저의 수를 입력하세요.");
				int num = printScan.nextInt();
				SetUser user = new SetUser(num);
				user.roopInputUser(user);
			}
			
			if(choice == 2) {
				SetUser.getUser();
			}
			
			if(choice == 0) {
				System.out.println("입력을 종료합니다.");
				break;
			}
		}
		printScan.close();

	}

}
