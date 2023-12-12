package JavaPractice01.Work;

public class Rect extends Figure {
    private double width, height;

    public void setWidth(double x1, double x2) {
        this.width = Math.abs(x2 - x1);
    }

    public double getWidth() {
        return this.width;
    }

    public void setHeight(double y1, double y2) {
        this.height = Math.abs(y2 - y1);
    }

    public double getHeight() {
        return this.height;
    }

    public void setArea(){
        double area = width * height;
        setArea(area);
    }

    public void setCircumference(){
        double cf = (width + height) * 2;
        setCircumference(cf);
    }

}