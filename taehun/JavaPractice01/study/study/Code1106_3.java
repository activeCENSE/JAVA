package JavaPractice01.study.study;

public class Code1106_3 {

	public static void main(String[] args) {
		int t;
		System.out.println(t);
		
		Animal cat = new Animal();
		cat.name="고양이";
		cat.age=4;
		cat.eat();
		cat.sleep();
		cat.love();
		
		Human h = new Human();
		h.name="ulsan";
		h.age=21;
		h.hobby="football";
		h.job="student";
		
		h.work();
		System.out.println(h.age);
		h.eat();

	}

}
