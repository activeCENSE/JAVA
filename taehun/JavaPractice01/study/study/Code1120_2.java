package JavaPractice01.study.study;

public class Code1120_2 {

	public static void main(String[] args) {
		Rect[] r;
		r = new Rect[5];
		for(int i=0; i < r.length; i++) {
			r[i] = new Rect((int) (Math.random()*1000),(int) (Math.random()*1000) );
		}
		for(Rect temp: r) {
			System.out.println(temp.getArea());
			System.out.println(temp.getClass());
		}
	}

}
