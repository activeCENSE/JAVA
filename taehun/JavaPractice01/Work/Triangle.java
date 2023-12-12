package JavaPractice01.Work;

public class Triangle extends Figure{
    private double length;

    public void setLength(double x1, double x2, double y1, double y2) {
        this.length = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public double getLength(){
        return this.length;
    }

    public void setArea(double sideA, double sideB, double sideC){
        double s = (sideA + sideB + sideC)/2;
        double area = Math.sqrt(s * (s-sideA) * (s-sideB) * (s-sideC));
        setArea(area);
    }

    public void setCircumference(double sideA, double sideB, double sideC){
        double cf = sideA + sideB + sideC;
        setCircumference(cf);
    }

    public void getType(double sideA, double sideB, double sideC){

        if(sideC == sideA && sideA == sideB && sideB == sideC){
            System.out.println("해당 삼각형은 정삼각형 입니다.");
        } else if(sideA == sideB || sideB == sideC || sideC == sideA) {
            System.out.println("해당 삼각형은 이등변삼각형 입니다.");
        } else {
            System.out.println("해당 삼각형은 일반삼각형 입니다.");
        }
    }



}
