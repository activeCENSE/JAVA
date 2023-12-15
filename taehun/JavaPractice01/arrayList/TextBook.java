package JavaPractice01.arrayList;

import JavaPractice01.arrayList.Book;

public class TextBook extends Book {

    private String author;
    private String isbn;

    public TextBook(int bookNum, String title, String publisher, int price, String pubDate, String tel, String author,
                    String isbn) {
        super(bookNum, title, publisher, price, pubDate, tel);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }




}
