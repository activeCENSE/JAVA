package JavaPractice01.ExceptionFiles;

public class exceptionTest01 {
    public static void main(String[] args) {
        try {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);

            System.out.println("입력한 두 수의 나누기 결과 : " + (number1 / number2));
        } catch(Exception e) {
            System.out.println("예기치 못한 에러 발생");
        } finally {
            System.out.println("무조건 실행되는 영역");
        }
    }
}
