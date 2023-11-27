package JavaPractice01.study.study;
import java.util.Scanner;

public class Code1016_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hakbun, deptCode;
		
		hakbun = sc.nextInt();
		deptCode =  (hakbun/1000) - ((hakbun/100000)*100);
		switch( deptCode  ) {
			case 1: System.out.println("소속학과가 기계학부입니다.");
			        break;
			case 2: System.out.println("소속학과가 전기전자학부입니다.");
	        	break;
			case 12: System.out.println("소속학과가 컴퓨터it학부입니다.");
	        	break;
			case 19: System.out.println("소속학과가 디콘디입니다.");
	        	break;
	        default: System.out.println("학번이 잘못됨");
		}

	}

}
