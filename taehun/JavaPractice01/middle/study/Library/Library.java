package JavaPractice01.middle.study.Library;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Library{
    private final Set<Book> BOOKS;

    public Library() {
        BOOKS = new HashSet<>();
    }
    public void createBook(Book book) throws DuplicateBookException {
        try{
            BOOKS.add(book);
            System.out.println("성공적으로 추가되었습니다 : " + book);
        } catch (Exception e){
            throw new DuplicateBookException("중복된 도서 : " + book);
        }
    }

    public void searchBookList(String title){
        ArrayList<Book> list = new ArrayList<>();
        for(Book book : BOOKS){
            if(book.toString().equals(title)){
                list.add(book);
            }
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("책 코드\t|\t책 제목\t|\t책저자");
        for (Book book : list) {
            System.out.println(book.getBookCode() + "\t|\t" + book + "\t|\t" + book.getAuthor());
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public void searchBookList(){
        ArrayList<Book> list = new ArrayList<>(BOOKS);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("책 코드\t|\t책 제목\t|\t책저자");
        for (Book book : list) {
            System.out.println(book.getBookCode() + "\t|\t" + book + "\t|\t" + book.getAuthor());
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public int searchBook(Book book) throws NotFoundException {
            if(BOOKS.contains(book))
                return book.getBookCode();
            else
                throw new NotFoundException("해당 도서를 찾을 수 없습니다 : " + book);
    }

    public void removeBook(Book book) throws NotFoundException {
        try{
            BOOKS.remove(book);
            System.out.println("성공적으로 삭제되었습니다 : " + book);
        } catch (Exception e){
            throw new NotFoundException("해당 도서를 찾을 수 없습니다 : " + book);
        }
    }

    public void editBook(Book book, String title, String author) throws NotFoundException {
            if(BOOKS.contains(book)){
                book.setTitle(title);
                book.setAuthor(author);
                System.out.println("성공적으로 변경되었습니다 : " + book);
            }
            else
                throw new NotFoundException("해당 도서를 찾을 수 없습니다 : " + book);
    }
}
