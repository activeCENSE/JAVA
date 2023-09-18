package org.javapractice.eclipes.program;
import org.javapractice.iot.*; // Import Iot All

public class Program {

	public static void main(String[] args) {
//		IoT 라이브러리 설치하기 org.javapractice.iot
		String myApartment = "JAVA APT 501";
//		엘레베이터 호출
		Elevator myElevator = new Elevator(myApartment); //Elevator에서 호출
		myElevator.callForUp(1);
		
//		Security Off
		Security mySecurity = new Security(myApartment); //Security에서 호출
		mySecurity.off(); //메소드 off 실행
		
//		Light on
		Lighting HallLamp = new Lighting(myApartment+ " / Hall Lamp"); //Light 호출
		HallLamp.on();
		
	}	

}
