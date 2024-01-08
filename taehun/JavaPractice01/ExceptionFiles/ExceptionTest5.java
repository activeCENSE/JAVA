package JavaPractice01.ExceptionFiles;

public class ExceptionTest5 {
    public static void main(String[] args) {
        try{
            int score = Integer.parseInt(args[0]);
            if(score < 0)
                throw new MinusException1("시험 점수는 음수 값이 포함될 수 없습니다.");
            else if(score > 100)
                throw new OverException("시험 점수는 100점 아래의 점수값만 입력해주세요.");
        }catch (MinusException1 e){
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
        }
    }
}
