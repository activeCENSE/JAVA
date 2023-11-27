package JavaPractice01.study.study;

public class Code1113_1 {

	public static void main(String[] args) {
		Student11 s1 = new Student11(90,"ulsan");
		Student11 s2 = new Student11(80,"busan", "pnu");
		
		s1.printing();
		System.out.println(s1.getName());
		//s1.name ="ulsan";
		s1.setName("ulsan");
		s2.printing();
		

	}

}
