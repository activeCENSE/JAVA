package org.javapractice.eclipes.javaApp;

import java.io.FileWriter;
import java.io.IOException;

public class OOPPracticeApp {

	public static void main(String[] args) throws IOException {
		//클래스와 메소드와 인스턴스
		// 클래스 : System, Math, FileWriter 메소드 : println, floor, write, close
		// 인스턴스 : fw 
		System.out.println(Math.floor(1.8));
		
		FileWriter fw = new FileWriter("text.txt");
		fw.write("안녕 ㅋ");
		fw.close();
		

	}

}
