package JavaPractice01.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNameExample {
    static ArrayList<String> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void searchfind(){
        while(true){
            System.out.print("찾을 이름을 입력하세요 : ");
            String find = sc.next();
            if(find.equals("q")){
                System.out.println("종료합니다");
                System.exit(0);
            }
            if(list.contains(find)){
                System.out.println(find + " 는 목록에 있습니다.");
            } else {
                System.out.println(find + " 는 목록에 없습니다.");
            }
        }
    }
    public static void main(String[] args) {

        for(int i = 0; i<4; i++){
            System.out.print("이름을 입력하세요 : ");
            list.add(sc.next());
        }
        searchfind();
    }
}
