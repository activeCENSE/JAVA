package JavaPractice01.study.study;

public class Code1204_4 {
    public static void main(String[] args) {
        Point100 p = new Point100();
        p.setXY(100, 200);
        p.show();

        ColorPoint100 cp = new ColorPoint100();
        cp.setColorPoint("red", 200, 300);
        cp.show();
        p = cp;

        p.show();
    }
}
