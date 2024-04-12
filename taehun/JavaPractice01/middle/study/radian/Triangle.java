package JavaPractice01.middle.study.radian;

public class Triangle {
    double[] Lvalue;
    double[] Avalue;
    private int area;
    public Triangle(int v1, int v2, double v3){
        Lvalue = new double[3];
        Avalue = new double[3];
        Lvalue[0] = v1; Lvalue[1] = v2; Lvalue[2] = v3;
        Avalue[2] = 90;
        Avalue[0] = Math.toDegrees(Math.acos(v2/v3));
        Avalue[1] = Math.toDegrees(Math.acos(v1/v3));
        area = (v1 * v2) / 2;
    }
    public int getArea(){
        return area;
    }
}
