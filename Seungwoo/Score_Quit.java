import java.util.Scanner;

public class Score_Quit {
    public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int sum = 0;
		String str;
		int point;
		while(true){
			str = in.next();
			if(str.equals("quit")){
				break;
			}
			point = Integer.parseInt(str);
			sum += point;
		}
		System.out.println(sum);

        in.close();
	}
}