package JavaPractice01.study.study;

public class HelloWorld {
	static int i;
	public static void main(String[] args) {
		
		System.out.println(i);
		System.out.println("Hello World");
		System.out.println("홍길동");
		System.out.println("sum:" + (100 + 200));
		printInfo();
	}
	
	public static void printInfo() {
		System.out.println("자바 프로그래밍 수업중입니다.");
		System.out.println("eclipse를 이용하여 코딩/실행을 진행하고자 합니다.");
	}

}
