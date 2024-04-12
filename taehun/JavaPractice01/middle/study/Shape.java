package JavaPractice01.middle.study;

public interface Shape {
    double getArea();
    String toString();
    default void redraw(){
        System.out.println("--다시 도형을 그립니다--");
    }
}
