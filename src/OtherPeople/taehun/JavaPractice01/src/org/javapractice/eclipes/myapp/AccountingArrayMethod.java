package org.javapractice.eclipes.myapp;

public class AccountingArrayMethod {
	//전역 변수
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		//	생활코딩 14.2 나의 앱 만들기
		
//		나머지 인풋 변수
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
//		배열
		double[] rate = {0.5, 0.3, 0.2};
		
//		내용
		print();
		
		// 배분 반복문
		for(int i = 0; i< rate.length; i++) {
		double devidend = getIncome() * rate[i];
		System.out.println("DIVIDEND"+(i+1)+" : "+ devidend);
		}
	}

	private static void print() {
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ getVAT());
		System.out.println("TOTAL : "+ getTotal());
		System.out.println("EXPENSE : "+ getExpense());	
		System.out.println("INCOME : "+ getIncome());
	}

	private static double getIncome() {
		return valueOfSupply - getExpense();
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}

	//메소드 생성
	private static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private static double getVAT() {
		return valueOfSupply * vatRate;
	}

}
