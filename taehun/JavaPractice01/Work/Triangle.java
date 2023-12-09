package JavaPractice01.Work;

public class Triangle extends Figure{

    public Triangle(String figure) {
        super(figure);
    }

    public void getType(){
        double sideA = getWidth();
        double sideB = getHeight();
        double sideC = getSide();

        if(sideC == sideA && sideA == sideB && sideB == sideC){
            System.out.println("해당 삼각형은 정삼각형 입니다.");
        } else if(sideA == sideB || sideB == sideC || sideC == sideA) {
            System.out.println("해당 삼각형은 이등변삼각형 입니다.");
        } else {
            System.out.println("해당 삼각형은 일반삼각형 입니다.");
        }
    }

}
