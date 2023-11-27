package JavaPractice01.study.study;

public class Code1106_5 {

	public static void main(String[] args) {
		City.national="korea";
		
		City ulsan, busan,seoul;
		ulsan = new City();
		ulsan.name="울산광역시";
		ulsan.su=110;
		
		busan = new City();
		busan.name="부산광역시";
		busan.su=340;
		
		seoul = new City();
		seoul.name="서울특별시";
		seoul.su=960;
		
		System.out.println(ulsan.name);
		System.out.println(ulsan.su);
		System.out.println(ulsan.national);
		System.out.println(busan.name);
		System.out.println(busan.su);
		System.out.println(busan.national);
		City.national="s.Korea";
		System.out.println(seoul.name);
		System.out.println(seoul.su);
		System.out.println(seoul.national);
		System.out.println(ulsan.national);
	}

}
