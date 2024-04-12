package JavaPractice01.middle.study;

public class Manager {
    public static void main(String[] args) {
        Circle c = new Circle(10, 10, 20);
        Rect r = new Rect(1,1,10,10);

        if(c.getArea() == r.getArea())
            System.out.println(c + "과 " + r + "의 면적이 동일");
        else
            System.out.println(c + "과 " + r + "의 면적이 다름");
    }
}
