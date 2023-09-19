package org.javapractice.eclipes.study;

public class GotoStar {

	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print('*');
			}
			System.out.println("\n");
		}

	}

}
