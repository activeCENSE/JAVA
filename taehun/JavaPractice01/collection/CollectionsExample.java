package JavaPractice01.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class CollectionsExample {
    static void printList(LinkedList<String> l){
        Iterator<String> iterator = l.iterator();
        while(iterator.hasNext()){
            String e = iterator.next();
            String separator;
            if(iterator.hasNext())
                    separator = "->";
            else
                    separator = "\n";
            System.out.print(e + separator);
        }
    }
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("이름 : ");
            String name = sc.nextLine();
            if(name.isEmpty()) break;
            myList.add(name);
        }

        Collections.sort(myList);
        printList(myList);

        System.out.print("찾을 사람을 입력하세요 : ");
        String findName = sc.nextLine();
        int index = Collections.binarySearch(myList, findName) + 1;
        System.out.println( findName + " " + index +"번째 요소입니다.");
    }
}
