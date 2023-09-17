package org.javapractice.eclipes.myapp;

public class AccountingIf {

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
		double devidend1;
		double devidend2;
		double devidend3;
		double[] rate = {0.5, 0.3, 0.2};

		if(income > 10000.0) {
			devidend1 = income * rate[0];
			devidend2 = income * rate[1];
			devidend3 = income * rate[2];
		} else {
			devidend1 = income * 1;
			devidend2 = income * 0;
			devidend3 = income * 0;
		}
		
//		내용
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ VAT);
		System.out.println("TOTAL : "+ total);
		System.out.println("EXPENSE : "+ expense);	
		System.out.println("INCOME : "+ income);
		System.out.println("DEVIDEND1 : "+ devidend1);
		System.out.println("DEVIDEND2 : "+ devidend2);
		System.out.println("DEVIDEND3 : "+ devidend3);
	}

}
