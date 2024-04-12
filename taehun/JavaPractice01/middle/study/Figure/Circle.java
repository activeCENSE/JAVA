package JavaPractice01.middle.study.Figure;

public class Circle extends Shape{
    static int radius;

    public Circle(int radius){
        Circle.radius = radius;
        this.area = radius * radius * Math.PI;
    }

    static int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
