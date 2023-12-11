package JavaPractice01.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Code1211_1 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> cName = new ArrayList<>();
    static int menu(){
        System.out.println("1. insert   2. search   3. remove   4. change  5. list  6. exit===> ");
        return Integer.parseInt(sc.nextLine());
    }
    static void insert(){
        System.out.println("넣을 도시 이름을 입력해주세요");
        cName.add(sc.nextLine());
        System.out.println("성공적으로 추가되었습니다.");

    }
    static void search(){
        System.out.println("찾는 도시 이름을 입력해주세요");
        String fName = sc.nextLine();
        for(int i = 0; i< cName.size(); i++){
            if(cName.get(i).equals(fName)){
                System.out.println(cName.get(i)+"이 목록에 있습니다.");
                return;
            }
        }
        System.out.println(fName+"을 찾을 수 없습니다.");
    }

    static void remove(){
        String dName = sc.nextLine();
        for(int i = 0; i< cName.size(); i++){
            if(cName.get(i).equals(dName)){
                cName.remove(i);
                System.out.println(dName+"을 삭제하였습니다.");
                return;
            }
        }
        System.out.println(dName+"을 찾을 수 없습니다.");
    }

    static void change(){
        System.out.println("찾을 도시를 입력하세요.");
        String fName = sc.nextLine();
        System.out.println("바꿀 도시를 입력하세요.");
        String changedName = sc.nextLine();
        for(int i = 0; i< cName.size(); i++){
            if(cName.get(i).equals(fName)){
                cName.set(i, changedName);
                System.out.println(fName+"을 "+changedName+" 으로 변경하였습니다.");
                return;
            }
        }
        System.out.println(fName+"을 찾을 수 없습니다.");
    }

    static void list(){
        for(int i = 0; i< cName.size(); i++){
            System.out.print(cName.get(i)+", ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        while(true){
            switch(menu()){
                case 1:
                    insert();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    change();
                    break;
                case 5:
                    list();
                    break;
                case 6:
                    System.out.println("종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                    break;
            }
        }
    }

}
