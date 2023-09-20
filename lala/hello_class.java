package hello;
import java.util.Scanner;

//입력받은 글자 첫글자에대한 대소문자 판별
public class hello_class {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in); //얘를 입력해야 입력받을수있당가...
		String str;
		char cha;
		
		System.out.println("영단어 아무거나 입력!!!!!!");
		str =scan.next();
		
		cha=str.charAt(0); //cha라는변수에 문자열 첫번째 넣어줌 하하
		
		if(Character.isUpperCase(cha)){
	         System.out.println("대문자");
		}
	         else if(Character.isLowerCase(cha)){
		         System.out.println("소문자");
	         }
	         
	         else{
	             System.out.println("대소문자가 아님");
	         }
		  scan.close();
 		}
}