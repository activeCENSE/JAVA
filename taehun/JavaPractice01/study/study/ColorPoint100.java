package JavaPractice01.study.study;

public class ColorPoint100 extends Point100{
    private String color;

    public void setColorPoint(String color, int x, int y) {
        this.color = color;
        setXY(x, y);
    }

    public String getColor() {
        return color;
    }

    public void show(){
        System.out.print(color);
        super.show(); //부모 클래스의 show를 호출
    }
}

