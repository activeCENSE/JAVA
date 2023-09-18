package org.javapractice.eclipes.myapp;

public class AccountingArray {

	public static void main(String[] args) {
		//	생활코딩 14.2 나의 앱 만들기
		
//		인풋 변수 (파라미터에 등록함)
		double valueOfSupply = Double.parseDouble(args[0]);
//		나머지 인풋 변수
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double VAT = valueOfSupply * vatRate;
		double total =  valueOfSupply + VAT;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
//		배열
		double[] rate = {0.5, 0.3, 0.2};
		
//		내용
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ VAT);
		System.out.println("TOTAL : "+ total);
		System.out.println("EXPENSE : "+ expense);	
		System.out.println("INCOME : "+ income);
		
		// 배분 반복문
		for(int i = 0; i< rate.length; i++) {
		double devidend = income * rate[i];
		System.out.println("DIVIDEND"+(i+1)+" : "+ devidend);
		}
	}

}
