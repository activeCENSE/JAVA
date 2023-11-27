package JavaPractice01.study.study;

public class Code1106_2 {

	public static void main(String[] args) {
		int i;
		
		int[] temp;
		temp = new int[3];
				
		Student haksung;
		haksung = new Student();
		haksung.name ="홍길동";
		haksung.SchoolName="울산과학대학교";
		System.out.println(haksung.name);
		System.out.println(haksung.SchoolName);
		System.out.println(haksung.score);
		haksung.playGame();
		
	}

}
