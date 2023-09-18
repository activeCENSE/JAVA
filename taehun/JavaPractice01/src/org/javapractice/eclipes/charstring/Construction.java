package org.javapractice.eclipes.charstring;

public class Construction {

	public static void main(String[] args) {
		//	Variable
		int intVariable = 1;
		System.out.println(intVariable); //1 => integer 정수 데이터 타입
		
		double doubleVariable = 1.1;
		System.out.println(doubleVariable); // 1.1 => 소수 데이터 타입
		
		String stringVariable = "김태훈"; 
		System.out.println(stringVariable); //김태훈 => 문자열 데이터 타입
		
//		변수의 효용
		String name = "훈이";
		System.out.println("Hello, "+name+" ... "+name+" ... "+name+"... bye.");
		
//		Casting (double vs INT )
		double a = 1.1;
		double b = 1;
		System.out.println("a의 값은" +a+ "이고 b의 값은" +b+ "이다.");
		
//		int c = 1.1; ERROR
		double b2 = (double)1; //.0이 생성
		int e = (int)1.1; //0.1이 손실
		System.out.println(b2);
		
//		1 to String
		String f = Integer.toString(23124);
		System.out.println(f.getClass()); //문자열임을 알려줌 getClass();
	}

}
