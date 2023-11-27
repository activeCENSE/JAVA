package JavaPractice01.study.study;

public class Code1030_2 {

	public static void main(String[] args) {
		int[][] data = {{100,200},{-10,-20},{0,0}};
		
		data[2][0]= data[0][0]+data[1][0];
		data[2][1]= data[0][1]+data[1][1];
		
		for(int[] temp: data) {
			for(int val : temp)
				System.out.print(val + " ");
			System.out.println();
		}
		
		for(int i=0; i < 3; i++) {
			for(int j =0; j < 2; j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(data);
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);

	}

}
