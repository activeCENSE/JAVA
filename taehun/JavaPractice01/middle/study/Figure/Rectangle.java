package JavaPractice01.middle.study.Figure;

public class Rectangle extends Shape{
    static int width, height;

    public Rectangle(int width, int height){
        Rectangle.width = width;
        Rectangle.height = height;
        this.area = (double)(width * height);
    }

    static int getHeight() {
        return height;
    }

    static int getWidth() {
        return width;
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
