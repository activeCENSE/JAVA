package JavaPractice01.middle.study;

public class Rect implements Shape{
    private int x1,y1,x2,y2;
    public Rect(int x1, int y1, int x2, int y2){
        this.x1 = x1; this.x2 = x2; this.y1 = y1; this.y2 = y2;
    }

    @Override
    public double getArea() {
        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

    @Override
    public String toString(){
        return "Rect(x1:" + this.x1 + ", y1:" + this.y1 + "...x2:" + this.x2 + "y2: " + this.y2;
    }
}
