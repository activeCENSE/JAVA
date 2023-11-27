package JavaPractice01.study.study;

public class StaticSample {
	static {
		System.out.println("여기는 static 코드인데 순서를 확인하세요.");
	}
	
	static void printing1() {
		System.out.println("여기는 staticSample의 메소드 printing1(s)입니다.");
	}
	
	void printing2() {
		System.out.println("여기는 staticSample의 메소드 printing2입니다.");	
	}
}
