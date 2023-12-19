package JavaPractice01.arrayList;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LibManager {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> bookList = new ArrayList<>();

    public static int menu(){
        System.out.println("1. insert   2. search   3.remove    4. change   5.list    6.loan   7.return  8.exit==>");
        return Integer.parseInt(sc.nextLine());
    }

    static void insert() {
        int bookNum, price, choice;
        String title, publisher, pubDate, tel, author, isbn, issn;
        author = isbn = issn = null;

        System.out.print("1. TextBook 2. Magazine 선택: ");
        choice = Integer.parseInt(sc.nextLine());

        Random rand = new Random();
        bookNum = rand.nextInt(1000);
        System.out.println("책 제목:");
        title = sc.nextLine();
        if(choice == 1){
            System.out.print("\n책 저자: ");
            author = sc.nextLine();
        }
        System.out.print("\n출판사: ");
        publisher = sc.nextLine();
        System.out.print("\n책 가격: ");
        price = Integer.parseInt(sc.nextLine());
        System.out.println("\n출판일: ");
        pubDate = sc.nextLine();
        System.out.println("\n연락처: ");
        tel = sc.nextLine();
        if (choice == 1) {
            bookList.add(new TextBook(bookNum, title, publisher, price, pubDate, tel, author, isbn)); //bookList 동적배열 n번에 TextBook의 객체를 넣음.
        }
        else {
            bookList.add(new Magazine(bookNum, title, publisher, price, pubDate, tel, issn));
        }

    }

    static void printingText(TextBook item) {
        System.out.print(item.getBookNum() + "\t");
        System.out.print(item.getTitle() + "\t");
        System.out.print(item.getAuthor() + "\t");
        System.out.print(item.getPublisher() + "\t");
        System.out.print(item.getPrice() + "\t");
        System.out.print(item.getPubDate() + "\t");
        System.out.print(item.getTel() + "\t");
        System.out.println(item.getIsbn() + "\t");
    }

    static void printingMag(Magazine item) {
        System.out.print(item.getBookNum() + "\t");
        System.out.print(item.getTitle() + "\t");
        System.out.print(item.getPublisher() + "\t");
        System.out.print(item.getPrice() + "\t");
        System.out.print(item.getPubDate() + "\t");
        System.out.print(item.getTel() + "\t");
        System.out.println(item.getIssn() + "\t");
    }


    static void list(){
        Book item;
        System.out.println("번호\t제목\t저자\t출판사\t가격\t출판날짜\t연락처\tisbn(issn)");
        System.out.println("-----------------------------------------------------");
        for (Book book : bookList) {
            item = book;
            if (item instanceof TextBook) {
                printingText((TextBook) item);
            } else {
                printingMag((Magazine) item);
            }
        }
        System.out.println("-----------------------------------------------------");
    }

    static void findList(String findTitle){
        Book item;
        TextBook tb;
        System.out.println("번호\t제목\t저자\t출판사");
        System.out.println("---------------------");
        for (Book book : bookList) {
            item = book;
            if (item.getTitle().contains(findTitle)) {
                System.out.print(item.getBookNum() + "\t");
                System.out.print(item.getTitle() + "\t");
                if (item instanceof TextBook) {
                    tb = (TextBook) item;
                    System.out.println(tb.getAuthor() + "\t");
                } else {
                    System.out.println("              \t");
                }
                System.out.print(item.getPublisher() + "\t");
            }
        }
        System.out.println("---------------------");
    }

    static void find(){
        System.out.println("찾을 도서의 이름을 입력하세요.");
        String findItem = sc.nextLine();
        findList(findItem);
    }

    static void remove(){
        String delTitle;
        Book item;
        System.out.print("삭제할 책 제목:");
        delTitle = sc.nextLine();
        findList(delTitle);
        System.out.println("목록에서 삭제할 책(잡지)의 책 번호를 입력하세요: ");
        int delBookNumber = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < bookList.size(); i++){
            item = bookList.get(i);

            if(item.getBookNum() == delBookNumber){
                bookList.remove(item);
                System.out.println(delBookNumber + " 번호의 책을 삭제했습니다.");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("<< 도서관리 프로그램 >>");
        while(true) {
            switch(menu()) {
                case 1:
                    insert();
                    break;
                case 2:
                    find();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                case 5:
                    list();
                    break;
                case 6:
                case 7:
                case 8: System.exit(0);
                default:
                    System.out.println("입력한 메뉴가 잘못됨.. 다시 입력하세요!");
            }
        }
    }
}
