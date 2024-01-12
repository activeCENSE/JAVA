package JavaPractice01.arrayList;

public class Magazine extends Book {

    private String issn;

    public Magazine(int bookNum, String title, String publisher, int price, String pubDate, String tel, String issn) {
        super(bookNum, title, publisher, price, pubDate, tel);
        this.issn = issn;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }



}