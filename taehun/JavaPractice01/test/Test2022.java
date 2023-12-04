package JavaPractice01.test;

import java.util.Scanner;

public class Test2022 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("고객수: ");
        int customerSu = Integer.parseInt(sc.nextLine());
        Customer[] cust = new Customer[customerSu];

        for(int i=0; i < cust.length; i++ ) {
            System.out.print( (i+1) + "번 고객 정보(홍길동 981219-1234567 울산): ");
            String inStr = sc.nextLine();
            String[] spliceStr = inStr.split("\\s+");
            cust[i] = new Customer(spliceStr[0], spliceStr[1], spliceStr[2]);
            cust[i].setGender();
            cust[i].setYoung();
        }
        sc.close();
        //출력
        System.out.println("<<통계>>");
        System.out.println("성별비교 : "+Customer.male+"(M)"+Customer.female+"(F)");
        System.out.println("거주지목록 : "+cust[0].getAddress()+" "+cust[1].getAddress()+" "+cust[2].getAddress());
        System.out.println("2000년 이후 출생자 : "+Customer.young);
        System.out.println("<<고객 명단>>");
        cust[0].getFullInfo();
        cust[1].getFullInfo();
        cust[2].getFullInfo();
    }
}
