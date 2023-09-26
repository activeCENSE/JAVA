package org.javapractice.eclipes.study;

import java.util.Scanner;

public class basket {
	public static int i,j,k;

	public static void main(String[] args) {

		int[] list = new int[100];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("바구니의 총 개수를 입력해주세요");
		int n = scan.nextInt();
		System.out.println("몇 번 공을 넣을 건지 입력해주세요");
		int m = scan.nextInt();
		
		for(int a = 1; a <= m; a++) {
			System.out.println(+a+"번째 바구니 몇번부터?");
			i = scan.nextInt();
			System.out.println(+a+"번째 바구니 몇번까지?");
			j = scan.nextInt();
			System.out.println(+a+"번째 바구니 공 몇 번 넣을거?");
			k = scan.nextInt();
			if(i<=n && j<=n && k<=n) {
				for(int z = i; z<=j; z++) {
					list[z] = k;
				}
			}
		}
		scan.close();
		for(int b = 1; b<=n; b++) {
		System.out.print(list[b]);
		}

	}

}

