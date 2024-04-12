package JavaPractice01.middle.study.Figure;

public class Triangle extends Shape{
    static int baseLength;
    static int height;


    public Triangle(int baseLength, int height){
        Triangle.baseLength = baseLength;
        Triangle.height = height;
        this.area = (double)(baseLength * height) / 2;
    }

    static public int getBaseLength() {
        return baseLength;
    }

    static public int getHeight() {
        return height;
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
