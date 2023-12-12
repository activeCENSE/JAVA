package JavaPractice01.Work;

public class Circle extends Figure {
    private double length;
    public void setLength(double x1, double x2, double y1, double y2){
        this.length = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public double getLength(){
        return this.length;
    }

    public void setArea(){
        double r = this.length/2;
        double area = r * r * Math.PI;
        setArea(area);
    }

    public void setCircumference(){
        double cf = 2 * this.length * Math.PI;
        setCircumference(cf);
    }


}
