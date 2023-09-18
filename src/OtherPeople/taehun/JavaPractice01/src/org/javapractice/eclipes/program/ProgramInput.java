package org.javapractice.eclipes.program;
import javax.swing.JOptionPane;

import org.javapractice.iot.*; // Import Iot All

public class ProgramInput {
	// parameter, 매개변수
	public static void main(String[] args) {
//		IoT 라이브러리 설치하기 org.javapractice.iot
//		입력창 호출
//		String myApartment = JOptionPane.showInputDialog("아파트 호수를 입력하세요");
//		String bright = JOptionPane.showInputDialog("밝기를 입력하세요");
		String myApartment = args[0]; //Argument 조정으로 인한 args 배열 삽입
		String bright = args[1];
		
//		엘레베이터 호출
		Elevator myElevator = new Elevator(myApartment); //Elevator에서 호출
		myElevator.callForUp(1);
		
//		Security Off
		Security mySecurity = new Security(myApartment); //Security에서 호출
		mySecurity.off(); //메소드 off 실행
		
//		Light on
		Lighting HallLamp = new Lighting(myApartment+ " / Hall Lamp"); //Light 호출
		HallLamp.on();
		
//		무드등 조작
		DimmingLights moodLamp = new DimmingLights(myApartment+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright)); //string to double
		moodLamp.on();
		
		
	}	

}
