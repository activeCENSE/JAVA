package JavaPractice01.study.study;

public class Code1120_3 {

	public static void main(String[] args) {
		Point p = new Point(10,20);
		Point t = new Point(10,20);
		if( p == t)
			System.out.println("p와 t가 같아요");
		else
			System.out.println("p와 t가 달라요");
		System.out.println("-------------------------");
		if( p.equals(t))
			System.out.println("p와 t가 같아요");
		else
			System.out.println("p와 t가 달라요");
		System.out.println("-------------------------");
		System.out.println(p.getClass());
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);
		

	}

}
