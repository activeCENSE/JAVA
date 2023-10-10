package org.javapractice.eclipes.study.InstanceFolder;

import java.util.Scanner;

public class InstanceDoubleArray {

	public static void main(String[] args) {
		Scanner printScan = new Scanner(System.in);
		
		while(true) { //무한 반복
			System.out.println(
					"=-=-=-=-메뉴-=-=-=-=\n"
					+ "1 : 입력\n"
					+ "2 : 출력\n"
					+ "0 : 종료\n"
					+ "=-=-=-=-=-=-=-=-=-=");
			int choice = printScan.nextInt();
			SetUser user = new SetUser();
			if(choice == 1) {
				System.out.println("유저 정보를 입력하세요");
				for(int i = 0; i<5; i++) {
					for(int j = 0; j<2; j++) {
						if(j == 0) {
							System.out.println((i+1)+"번째 유저의 ID를 입력하세요 : ");
							user.setId(i, j);
						}
						else {
							System.out.println((i+1)+"번째 유저의 이름를 입력하세요 : ");
							user.setName(i, j);
						}
					}
				}
			}
			
			if(choice == 2) {
				user.getUser();
			}
			
			if(choice == 0) {
				System.out.println("입력을 종료합니다.");
				break;
			}
		}
		printScan.close();

	}

}
