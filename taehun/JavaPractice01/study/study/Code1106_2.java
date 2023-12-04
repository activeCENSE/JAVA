package JavaPractice01.study.study;

public class Code1106_2 {

	public static void main(String[] args) {
		int i;
		
		int[] temp;
		temp = new int[3];
				
		Student haksung = new Student();
		haksung.setName("홍길동");
		haksung.setScore(99);
		haksung.setSchoolName("울산과학대학교");
		System.out.println(haksung.getName());
		System.out.println(haksung.getScore());
		System.out.println(haksung.getSchoolName());
		haksung.playGame();
		
	}

}
