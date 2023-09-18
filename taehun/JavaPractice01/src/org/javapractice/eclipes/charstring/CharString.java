package org.javapractice.eclipes.charstring;

public class CharString {

	public static void main(String[] args) {
//		string vs number
		System.out.println(6); //Number
		System.out.println("Six"); //String
		System.out.println(6+6); // Result 12
		System.out.println("6"+6); //String 6 + 6 = "66"
		System.out.println(6*6); //36
//		System.out.println("6"*"6"); //Error 
		System.out.println("1111".length()); // result 4
//		System.out.println(1111.length()); //Error
		System.out.println("문자열과"+3+4+(3+4));
		
//		Character vs String
		System.out.println("Hello World"); //String (문자열)
		System.out.println('H'); //Character (문자)
		System.out.println("Hello\nWorld"); //줄바꿈~ 
		System.out.println("Hello \"World\""); //Hello "World"
//		String Operation
		System.out.println("Hello World".length()); //11
		System.out.println("Hello, [[name]] ... bye.".replace("[[name]]", "hoon"));
	}

}
 