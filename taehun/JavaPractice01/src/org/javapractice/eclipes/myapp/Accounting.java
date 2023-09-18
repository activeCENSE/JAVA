package org.javapractice.eclipes.myapp;

public class Accounting {

	public static void main(String[] args) {
		//	생활코딩 14.2 나의 앱 만들기
		
//		인풋 변수 (파라미터에 등록함)
		double valueOfSupply = Double.parseDouble(args[0]);
//		나머지 인풋 변수
		double VAT = valueOfSupply * 0.1;
		double total =  valueOfSupply + valueOfSupply * 0.1;
		double expense = valueOfSupply * 0.3;
		double income = valueOfSupply - valueOfSupply * 0.3;
		double devidend1 = income * 0.5;
		double devidend2 = income * 0.3;
		double devidend3 = income * 0.2;
		
//		내용
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ VAT);
		System.out.println("TOTAL : "+ total);
		System.out.println("EXPENSE : "+ expense);	
		System.out.println("INCOME : "+ income);
		System.out.println("DIVIDEND 1 : "+ devidend1);
		System.out.println("DIVIDEND 2 : "+ devidend2);
		System.out.println("DIVIDEND 3: "+ devidend3);
	}

}
