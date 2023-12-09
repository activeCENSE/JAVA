package JavaPractice01.Work;

public class Rect extends Figure{
    public Rect(String figure) {
        super(figure);
    }

    public void setWidth(double x1, double x2){
        double width = Math.abs(x2 - x1);
        setWidth(width);
    }

    public void setHeight(double y1, double y2){
        double height = Math.abs(y2 - y1);
        setHeight(height);
    }
}
