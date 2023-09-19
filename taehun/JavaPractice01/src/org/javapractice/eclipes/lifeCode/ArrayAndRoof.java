package org.javapractice.eclipes.lifeCode;

public class ArrayAndRoof {

	public static void main(String[] args) {
//		String[] arrayNew = new String[3];
		String[][] arrayNew = {
				{"egoing", "1111"},
				{"yalco", "2222"},
				{"codeApple", "3333"}
		};
		
		String inputId = args[0];
		String inputPassword = args[1];
		
		boolean found = false;
		
		for(int i = 0; i < arrayNew.length; i++) {
			String[] current = arrayNew[i]; 
			if(
					current[0].equals(inputId)&&
					current[1].equals(inputPassword)
			) {
				System.out.println("아이디와 비번이 일치합니다 : " +current[0]);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("일치하는 값을 찾을 수 없습니다! : " +inputId);
	}
	}

}
