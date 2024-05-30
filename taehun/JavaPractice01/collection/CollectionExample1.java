package JavaPractice01.collection;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class CollectionExample1 {
    public static void main(String[] args) {
        Vector<Integer> data = new Vector<>(7); //7개 정도를 담을 수 있는 Vector - default 10 - 더 늘어나도 상관없음
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("점수 : ");
            int val = sc.nextInt();
            if(val < 0) break;
            data.add(val);
        }
        System.out.println(data.toString());
        System.out.println(data.size()); // 4
        System.out.println(data.capacity()); // 7 - 넘어가면 *2

        //가져오는 방식의 차이
        for (Integer datum : data) {
            System.out.print(datum + " ");
        }
        
        Iterator<Integer> it = data.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}
