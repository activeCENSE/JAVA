package JavaPractice01.arrayList.PhoneManager;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PhoneManager {
    static SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd"); //날짜 생성
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Friend> phoneList = new ArrayList<>();

    static String search;
    public static int menu(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("1. 추가\t2. 출력\t3. 검색\t4. 수정\t5. 삭제\t6. 종료");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        String select = sc.nextLine();
        return Integer.parseInt(select);
    }

    static void create(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("1. 일반\\친구\t2. 친한 친구\t3. 연인");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        String select = sc.nextLine();
        System.out.print("추가할 사람의 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("\n추가할 사람의 전화 번호를 입력하세요 : ");
        String phoneNum = sc.nextLine();
        switch (select) {
            case "1" : phoneList.add(new Friend(name, phoneNum, date.format(new Date()))); break;
            case "2" :
                System.out.print("\n추가할 사람의 생년월일을 입력하세요(형식:YYMMDD) : ");
                String birth = sc.nextLine();
                phoneList.add(new ClosestFriend(name, phoneNum, date.format(new Date()), birth)); break;
            case "3" :
                System.out.print("\n추가할 사람의 생년월일을 입력하세요(형식:YYMMDD) : ");
                String birthday = sc.nextLine();
                System.out.print("\n연인의 처음 만난 날짜를 입력하세요(형식:YYMMDD) : ");
                String firstMet = sc.nextLine();
                phoneList.add(new GirlFriend(name, phoneNum, date.format(new Date()), birthday, firstMet));
                break;
            default:
                System.out.println("잘못입력하셨습니다. 다시 입력하세요.");
        }
        System.out.println("성공적으로 추가되었습니다.");
    }

    static void printFriend(Friend item){
        System.out.print("일반/친구\t");
        System.out.print(item.getName() + "\t");
        String num = item.getPhoneNum();
        // 010-1234-5678 형식으로 변경하여 출력
        System.out.print(num.substring(0,3) + "-" + num.substring(3,7) + "-" + num.substring(7,11) + "\t");
        String[] day = item.getAddedDay().split("-"); // 구분자 "-"로 분리하여 배열로 나눔.
        System.out.print(day[0] + "년 " + day[1] + "월 " + day[2] + "일 " + "\n");
    }

    static void printClosestFriend(ClosestFriend item){
        System.out.print("친한친구\t");
        System.out.print(item.getName() + "\t");
        String num = item.getPhoneNum();
        // 010-1234-5678 형식으로 변경하여 출력
        System.out.print(num.substring(0,3) + "-" + num.substring(3,7) + "-" + num.substring(7,11) + "\t");
        String[] day = item.getAddedDay().split("-"); // 구분자 "-"로 분리하여 배열로 나눔.
        System.out.print(day[0] + "년 " + day[1] + "월 " + day[2] + "일 " + "\t");
        String birthday = item.getBirthday();
        System.out.print(birthday.substring(0,2) + "년 "
                + birthday.substring(2,4) + "월 "
                + birthday.substring(4,6) + "일" + "\n");
    }

    static void printGirlFriend(GirlFriend item){
        System.out.print("연인\t");
        System.out.print(item.getName() + "\t");
        String num = item.getPhoneNum();
        // 010-1234-5678 형식으로 변경하여 출력
        System.out.print(num.substring(0,3) + "-" + num.substring(3,7) + "-" + num.substring(7,11) + "\t");
        String[] day = item.getAddedDay().split("-"); // 구분자 "-"로 분리하여 배열로 나눔.
        System.out.print(day[0] + "년 " + day[1] + "월 " + day[2] + "일" + "\t");
        String birthday = item.getBirthday();
        System.out.print(birthday.substring(0,2) + "년 "
                + birthday.substring(2,4) + "월 "
                + birthday.substring(4,6) + "일" + "\t");
        String firstMet = item.getFirstDay();
        System.out.print(firstMet.substring(0,2) + "년 "
                + firstMet.substring(2,4) + "월 "
                + firstMet.substring(4,6) + "일" + "\n");
    }

    static void print(Friend friend, int i){
        if (friend instanceof ClosestFriend) {
            System.out.print(i + "\t");
            printClosestFriend((ClosestFriend) friend);
        } else if (friend instanceof GirlFriend) {
            System.out.print(i + "\t");
            printGirlFriend((GirlFriend) friend);
        } else {
            System.out.print(i + "\t");
            printFriend(friend);
        }
    }

    static void list(){
        Friend friend;
        System.out.println("번호\t구분\t이름\t전화번호\t추가한 날짜\t생년월일\t처음 만난 날짜");
        System.out.println("----------------------------------------------");
        for(int i = 0; i<phoneList.size(); i++) {
            friend = phoneList.get(i);
            print(friend, i);
        }
            System.out.println("----------------------------------------------");
    }

    static void search(){
        Friend friend;
        list();
        System.out.print("찾을 사람의 이름을 입력하세요 : ");
        search = sc.nextLine();
        System.out.println();
        System.out.println("--------------------검색결과---------------------");
        System.out.println("번호\t구분\t이름\t전화번호\t추가한 날짜\t생년월일\t처음 만난 날짜");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < phoneList.size(); i++) {
            friend = phoneList.get(i);
            if (search.contains(friend.getName()))
                print(friend, i);
        }
        System.out.println("----------------------------------------------");
    }

    static void delete() {
        search();
        Friend friend;
        System.out.print("해당 선택 인원을 삭제하시겠습니까? Y/N : ");
        String select = sc.nextLine();
        if (select.equals("Y") | select.equals("y")) {
            for (int i = 0; i < phoneList.size(); i++) {
                friend = phoneList.get(i);
                if (search.contains(friend.getName())) {
                    phoneList.remove(friend);
                    System.out.println(friend.getName() + "의 번호를 삭제했습니다.");
                }
            }
        }
    }

    static void update() {
        search();
        Friend friend;
        System.out.println("해당 인원의 정보를 수정하시겠습니까? Y/N : ");
        String select = sc.nextLine();
        if (select.equals("Y") | select.equals("y")) {
            for (Friend value : phoneList) {
                friend = value;
                if (search.contains(friend.getName())){
                    if(friend instanceof GirlFriend){
                        System.out.print("수정할 부분을 입력하세요 (이름|전화번호|생년월일|첫날짜) : ");
                        String updateSelect = sc.nextLine();
                        switch (updateSelect){
                            case "이름":
                                System.out.print("수정할 이름을 입력하세요 : ");
                                String name = sc.nextLine();
                                friend.setName(name);
                                break;
                            case "전화번호":
                                System.out.print("수정할 전화번호을 입력하세요 : ");
                                String num = sc.nextLine();
                                friend.setPhoneNum(num);
                                break;
                            case "생년월일":
                                System.out.print("수정할 생년월일을 입력하세요 : ");
                                String birth = sc.nextLine();
                                ((GirlFriend) friend).setBirthday(birth);
                                break;
                            case "첫날짜":
                                System.out.print("수정할 첫 만난 날짜를 입력하세요 : ");
                                String first = sc.nextLine();
                                ((GirlFriend) friend).setFirstDay(first);
                                break;
                        }
                    }

                    else if(friend instanceof  ClosestFriend){
                        System.out.print("수정할 부분을 입력하세요 (이름|전화번호|생년월일) : ");
                        String updateSelect = sc.nextLine();
                        switch (updateSelect){
                            case "이름":
                                System.out.print("수정할 이름을 입력하세요 : ");
                                String name = sc.nextLine();
                                friend.setName(name);
                                break;
                            case "전화번호":
                                System.out.print("수정할 전화번호을 입력하세요 : ");
                                String num = sc.nextLine();
                                friend.setPhoneNum(num);
                                break;
                            case "생년월일":
                                System.out.print("수정할 생년월일을 입력하세요 : ");
                                String birth = sc.nextLine();
                                ((ClosestFriend) friend).setBirthday(birth);
                                break;
                        }
                    }
                    else {
                        System.out.print("수정할 부분을 입력하세요 (이름|전화번호) : ");
                        String updateSelect = sc.nextLine();
                        switch (updateSelect){
                            case "이름":
                                System.out.print("수정할 이름을 입력하세요 : ");
                                String name = sc.nextLine();
                                friend.setName(name);
                                break;
                            case "전화번호":
                                System.out.print("수정할 전화번호을 입력하세요 : ");
                                String num = sc.nextLine();
                                friend.setPhoneNum(num);
                                break;
                        }
                    }
                    System.out.println("성공적으로 수정하였습니다.");
                }
            }
        }
    }


    public static void main(String[] args) {
        while(true){
            switch(menu()){
                case 1: create(); break;
                case 2: list(); break;
                case 3: search(); break;
                case 4: update(); break;
                case 5: delete(); break;
                case 6: System.exit(1);
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            }
        }
    }

}
