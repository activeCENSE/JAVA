package JavaPractice01.study.study;

public class Code1106_1 {

	public static void main(String[] args) {
		int[][] scoreList = {{100,200,300,400,0}, 
						     {77,88,0},
						     {71,82,93,0} };
		for(int[] temp: scoreList) {
			for(int i=0; i < temp.length-1; i++) {
				temp[temp.length-1] += temp[i];
			}
		}
		
		for(int[] temp : scoreList) {
			for(int val: temp)
				System.out.print(val+" ");
			System.out.println();
		}
	}

}
