package org.javapractice.eclipes.myapp;

class AccountingApp {
    // 전역 변수
    public static double valueOfSupply;
    public static double vatRate;
    public static double expenseRate;

    // 분배 계산 메소드
    public static void Accounting() {
        // 배열
        double[] rate = { 0.5, 0.3, 0.2 };
        for (int i = 0; i < rate.length; i++) {
            double dividend = getIncome() * rate[i];
            System.out.println("DIVIDEND" + (i + 1) + " : " + dividend);
        }
    }

    public static void print() {
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVAT());
        System.out.println("TOTAL : " + getTotal());
        System.out.println("EXPENSE : " + getExpense());
        System.out.println("INCOME : " + getIncome());
    }

    private static double getIncome() {
        return valueOfSupply - getExpense();
    }

    private static double getTotal() {
        return valueOfSupply + getVAT();
    }

    // 메소드 생성
    private static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    private static double getVAT() {
        return valueOfSupply * vatRate;
    }
}

public class AccountingArrayClass {

    public static void main(String[] args) {
        // 생활코딩 14.2 나의 앱 만들기

        // 나머지 인풋 변수
        AccountingApp.valueOfSupply = 10000.0;
        AccountingApp.vatRate = 0.1;
        AccountingApp.expenseRate = 0.3;
        
        // Print the results
        AccountingApp.print();
        AccountingApp.Accounting();
    }
}

