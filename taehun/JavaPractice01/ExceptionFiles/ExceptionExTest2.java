package JavaPractice01.ExceptionFiles;

public class ExceptionExTest2 {
    public static void main(String[] args) {
        try {
            int score = Integer.parseInt(args[0]);
            if(score<0)
                throw new MinusScoreException("음수값은 정수가 될 수 없어요");
            System.out.println("java Score:" + score);

        } catch (MinusScoreException e) {
            System.out.println(e.getMessage());
        }
    }
}
