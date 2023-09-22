package org.javapractice.eclipes.javaApp;

public class Equal {

	public static void main(String[] args) {
		String o1 = new String("java");
		String o2 = new String("java");
		
		String o3 = "java";
		String o4 = "java";
		
		/*원시 데이터 타입은 == 써도 됨.
		그러나 아닌 타입은 equals 쓰삼 
		(문자나 객체타입은 equals 써야함) */
		
		if(o3 == o4) { //o1 == o2 > 불일치 / o3 == 04 > 동등
			System.out.println("동등");
		} else {
			System.out.println("불일치");
		}
		if(o1.equals(o2)){ // 동등
			System.out.println("동등");
		} else {
			System.out.println("불일치");
		}

	}

}
