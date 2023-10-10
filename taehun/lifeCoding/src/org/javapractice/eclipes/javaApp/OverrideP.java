package org.javapractice.eclipes.javaApp;


class ParentsP{
	public int sum(int v1, int v2){
		return v1 + v2;
	}
}

class SonP extends ParentsP{
	public int minus(int v1, int v2) {
		return v1 - v2;
	}
	//Overriding
	public int sum(int v1, int v2) {
		System.out.println("자식 클래스에서 쓴 sum");
			return super.sum(v1, v2);
	}
	//Overloading - 상속과는 상관없음. 
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2) + v3;
	}
}

public class OverrideP {

	public static void main(String[] args) {
		ParentsP parp = new ParentsP();
		parp.sum(2, 4);
		
		SonP sonp = new SonP();
		sonp.sum(2, 4);
		sonp.minus(4, 2);
		
		
	}

}
