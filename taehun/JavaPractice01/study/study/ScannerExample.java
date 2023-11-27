package JavaPractice01.study.study;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		System.out.println("이름 도시 나이 체중 독신여부를 빈칸으로 분리하여 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String cityName = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		boolean isSingle = sc.nextBoolean();
		System.out.println("당신 이름은 " + name + "입니다.");
		System.out.println("당신이 사는 도시는 " + cityName + "입니다.");
		System.out.println("당신 나이는 " + age + "살 입니다.");
		System.out.println("당신 몸무게는 " + weight + "kg 입니다.");
		System.out.println("당신의 독신 여부는 " + isSingle + "입니다.");
		
		sc.close();

	}

}
