package JavaPractice01.middle.study.Library;

import java.util.Scanner;

public class Manager {
    static String[] book;
    static Scanner sc = new Scanner(System.in);
    static Library library = new Library();

    public static void inputBook() {
        library.searchBookList();
        System.out.print("추가/변경/검색할 책 입력 (입력 예 : 책 제목,책 저자) : ");
        book = sc.nextLine().trim().split(",");
    }

    public static void searchBook() throws NotFoundException, WrongRegExpException {
        System.out.println("1. 책 이름으로 검색\t2. 책 이름 및 저자로 검색");
        try {
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    try {
                        System.out.print("검색할 책 입력 (입력 예 : 책 제목) : ");
                        library.searchBookList(sc.nextLine());
                        return;
                    } catch (Exception e) {
                        throw new NotFoundException("해당 책을 찾을 수 없습니다.");
                    }
                case 2:
                    inputBook();
                    System.out.println("책 고유번호는 " + library.searchBook(new Book(book[0], book[1])) + "입니다.");
                    break;
            }
        } catch (Exception e) {
            throw new WrongRegExpException("알맞지 않은 형식입니다.");
        }

    }

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("-=-=-=-=-=-= 메뉴 =-=-=-=-=-=-");
                System.out.println("1. 추가\t2.검색\t3.수정\t4.삭제\t5.종료");
                System.out.println("=-=-=-=-=-=-=-=-=-==-=-=-=-=-=");
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        try {
                            inputBook();
                            library.createBook(new Book(book[0], book[1]));
                        } catch (DuplicateBookException e) {
                            throw new DuplicateBookException(e.getMessage());
                        } catch (Exception e) {
                            throw new WrongRegExpException("알맞지 않은 형식입니다.");
                        }
                        continue;
                    case 2:
                        searchBook();
                        continue;
                    case 3:
                        try {
                            inputBook();
                            System.out.print("수정할 책 정보 입력 (입력 예 : 책 제목,책 저자) : ");
                            String[] editBook = sc.nextLine().trim().split(",");
                            library.editBook(new Book(book[0], book[1]), editBook[0], editBook[1]);
                        } catch (Exception e) {
                            throw new WrongRegExpException("알맞지 않은 형식입니다.");
                        }
                        continue;
                    case 4:
                        try {
                            inputBook();
                            library.removeBook(new Book(book[0], book[1]));
                        } catch (Exception e) {
                            throw new WrongRegExpException("알맞지 않은 형식입니다.");
                        }
                        continue;
                    case 5:
                        System.out.println("시스템을 종료합니다.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("메뉴 번호를 다시 입력해주세요");
                }
            } catch (DuplicateBookException | WrongRegExpException | NotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
