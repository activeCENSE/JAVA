package JavaPractice01.arrayList;

public class Book {
    private int bookNum;
    private String title;
    private String publisher;
    private int price;
    private String pubDate;
    private String tel;
    public Book(int bookNum, String title, String publisher, int price, String pubDate, String tel) {
        super();
        this.bookNum = bookNum;
        this.title = title;
        this.publisher = publisher;
        this.price = price;
        this.pubDate = pubDate;
        this.tel = tel;
    }
    public int getBookNum() {
        return bookNum;
    }
    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getPubDate() {
        return pubDate;
    }
    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }



}