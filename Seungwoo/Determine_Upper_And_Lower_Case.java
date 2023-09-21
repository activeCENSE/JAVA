import java.util.Scanner;

public class Determine_Upper_And_Lower_Case {
    public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str = in.next();

		char value = str.charAt(0);

		if(Character.isUpperCase(value)){
			System.out.println("대문자");
		}else{
			if(Character.isLowerCase(value)){
				System.out.println("소문자");
			}else{
				System.out.println("대소문자가 아님");
		}
		}
        in.close();
	}
}
