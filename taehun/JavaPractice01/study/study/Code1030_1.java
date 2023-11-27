package JavaPractice01.study.study;
import java.util.Scanner;

public class Code1030_1 {
	static void intput(int[] inData) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i < inData.length; i++) {
			System.out.print((i+1) + "번째 데이타:");
			inData[i] = sc.nextInt();
		}
		sc.close();
		return;
	}
	
	public static int calSum(String[] inData){
		int sum =0;
		for(String temp: inData)
			sum += Integer.parseInt(temp);
		return sum;
	}
	
	public static void main(String[] args) {
		int[] data = new int[5];
		intput(data);
		int sum = calSum(args);
		System.out.println("합계:" + sum);
		
//		int sum=0;
//		
//		for(String temp: args) {
//			sum += Integer.parseInt(temp);
//		}
//		
//		sum=0;
//		for(int i=0 ; i < args.length; i++) {
//			sum += Integer.parseInt(args[i]);
//		}
//		System.out.println(sum/args.length);

	}

}
