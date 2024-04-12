package JavaPractice01.middle.study;

public class Circle implements Shape{
    private int x,y,radius;

    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return (this.radius / (2 * Math.PI)) * (this.radius / (2 * Math.PI)) * Math.PI;
    }

    @Override
    public String toString(){
        return "Circle(" + this.x + "," + this.y + ")";
    }
}
