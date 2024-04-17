package JavaPractice01.object;

import java.util.HashMap;
import java.util.Scanner;

public class HashExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        HashMap<Key1, String> map = new HashMap<>();
//
//        map.put(new Key1(1), "ulsan");
//        map.put(new Key1(2), "busan");
//        map.put(new Key1(3), "gwangju");
//        map.put(new Key1(4), "seoul");
//
//        System.out.println(map.get(new Key1(sc.nextInt()))); // 논리적으로 동등함을 보장해야 찾을 수 있음.(hashCode()와 equals를 Overriding 해야 함)


        HashMap<String, String> telList = new HashMap<>();
        telList.put("ulsan", "052");
        telList.put("seoul", "02");
        telList.put("busan", "051");
        telList.put("daegu", "053");

        System.out.println(telList.get(sc.nextLine()));
    }
}
