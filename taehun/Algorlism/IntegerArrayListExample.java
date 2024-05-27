package Algorlism;

import java.util.Scanner;

public class IntegerArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntegerArrayList ial = new IntegerArrayList(10);
        for(int i = 0; i<4; i++){
            System.out.print("Enter Num : ");
            int val = sc.nextInt();
            ial.append(val);
        }
        System.out.println(ial.size());
        System.out.println(ial.indexOf(12));
    }
}
