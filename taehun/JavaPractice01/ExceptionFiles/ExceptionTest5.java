package JavaPractice01.ExceptionFiles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int score = sc.nextInt();
            if(score < 0)
                throw new MinusScoreException("시험 점수는 음수 값이 포함될 수 없습니다.");
            else if(score > 100)
                throw new OverException("시험 점수는 100점 아래의 점수값만 입력해주세요.");
        }catch (MinusScoreException e){
            System.out.println(e.getMessage());
            System.out.println("-----------------------");
            System.out.println(e.toString());
            System.out.println("-----------------------");
            e.printStackTrace();
        }catch (OverException e){
            System.out.println(e.getMessage());
            System.out.println("-----------------------");
            System.out.println(e.toString());
            System.out.println("-----------------------");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("정수가 아닙니다!");
            System.out.println("-----------------------");
            System.out.println(e.toString());
            System.out.println("-----------------------");
            e.printStackTrace();
        }
    }
}
