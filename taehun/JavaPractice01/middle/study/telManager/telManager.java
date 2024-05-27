package JavaPractice01.middle.study.telManager;

import JavaPractice01.middle.study.Library.*;

import java.util.Scanner;

public class telManager {
        static String[] splitInfo;
        static Scanner sc = new Scanner(System.in);
        static ContactSystem conSys = new ContactSystem();

        public static void initContact() {
            conSys.listContact();
            System.out.print("추가/변경/검색할 연락처 입력 (입력 예 : 이름,연락처) : ");
            splitInfo = sc.nextLine().trim().split(",");
        }

        public static void main(String[] args) {
            while (true) {
                try {
                    System.out.println("-=-=-=-=-=-= 메뉴 =-=-=-=-=-=-");
                    System.out.println("1. 추가\t2.보기\t5.종료");
                    System.out.println("=-=-=-=-=-=-=-=-=-==-=-=-=-=-=");
                    switch (Integer.parseInt(sc.nextLine())) {
                        case 1:
                            try {
                                initContact();
                                Contact newContact = new Contact(splitInfo[0], splitInfo[1]);
                                Key key = new Key(newContact);
                                conSys.addContact(key, newContact);
                            } catch (DuplicateBookException e) {
                                throw new DuplicateBookException(e.getMessage());
                            } catch (Exception e) {
                                throw new WrongRegExpException("알맞지 않은 형식입니다.");
                            }
                            continue;
                        case 2:
                            conSys.listContact();
                            continue;
                        case 5:
                            System.out.println("시스템을 종료합니다.");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("메뉴 번호를 다시 입력해주세요");
                    }
                } catch (DuplicateBookException | WrongRegExpException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
