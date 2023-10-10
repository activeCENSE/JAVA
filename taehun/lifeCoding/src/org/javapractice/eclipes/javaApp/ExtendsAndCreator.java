package org.javapractice.eclipes.javaApp;


class Cal{
	int v1,v2;
	Cal(int v1, int v2){ //생성자
		System.out.println("Cal init!");
		this.v1 = v1;
		this.v2 = v2;
	}
	public int sum() {
		return this.v1+v2;
	}
}

class Cal3 extends Cal{

	Cal3(int v1, int v2) { //생성자
		super(v1, v2);
		System.out.println("Cal3 init!");
	}
	public int minus() {
		return this.v1-v2;
	}
}

public class ExtendsAndCreator {

	public static void main(String[] args) {
		
			Cal c = new Cal(2,1); //Cal init!
			Cal3 c3 = new Cal3(2,1); //Cal init! -> Cal3 init!
			System.out.println(c3.sum()); //Cal에서 Sum을 찾아 로직 구현  == 3
			System.out.println(c3.minus()); //1
	}

}
