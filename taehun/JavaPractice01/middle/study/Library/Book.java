package JavaPractice01.middle.study.Library;

import java.util.Objects;

public class Book implements BookForm {
    private String title, author;
    private final int bookCode;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.bookCode = hashCode();
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public int getBookCode() {
        return bookCode;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return this.title;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book newBook){ // Book newBook = (Book)obj;
            return this.toString().equals(newBook.toString()) && this.author.equals(newBook.getAuthor());
        }
        return false;
    }
}
