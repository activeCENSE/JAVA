package JavaPractice01.study.study;

public class Code1030_3 {

	public static void main(String[] args) {
		int[][][] data = {{ {10,20,30},
			                {100,200,300} }, 
				          { {1000,2000,3000},
		                	{-100,-200,-300}
				          }
						 };
		
		
		for(int[][] temp1 : data) {
			for(int[] temp2: temp1) {
				for(int temp3: temp2) {
					System.out.print(temp3+" ");
				}
				System.out.println();
			}
		}
		
		for(int i=0; i < data.length; i++) {
			for(int j =0; j < data[i].length; j++) {
				for(int k=0; k < data[i][j].length; k++) {
					System.out.print(data[i][j][k]+" ");
				}
				System.out.println();
			}
			
		}
		
		System.out.println(data);
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[0][0]);
		System.out.println(data[1][1]);
	}

}
