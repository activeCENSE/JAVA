package org.javapractice.eclipes.study.InstanceFolder;

import java.util.Scanner;

public class SetUser {
	private static String[][] list = new String[5][2]; //사용자 선언 가능 메소드 외 접근 제어자 private 설정
	private Scanner sc = new Scanner(System.in);
	private String id;
	private String name;
	
	public void setId(int row, int col) {
		this.id = this.sc.next();
		list[row][col] = this.id;
	}
	public void setName(int row, int col) {
		this.name = this.sc.next();
		list[row][col] = this.name;
	}
	public void getUser() {
		System.out.println("=-=-=-=- 유저정보 -=-=-=-=\n");
		for(int i = 0; i<5; i++) {
			System.out.print("id : "+list[i][0]+"  이름 : "+list[i][1]+"\n");
		}
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
	}
}
