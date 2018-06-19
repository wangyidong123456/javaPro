package Test01;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * arr[3][4]
		 * 1 2 3 4
		 * 5 6 7 8 
		 * 9 10 11 12 
		 * arr[4][3]
		 * 1 5 9 
		 * 2 6 10 
		 * 3 7 11
		 * 4 8 12
		 */
		
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int[][] arr1 = new int[4][3];   
		/**
		 * 
		 * i=0
		 arr[0][0]=arr1[0][0];
		 arr[0][1]=arr1[1][0];
		 arr[0][2]=arr1[2][0];
		 i=1
		 arr[1][0]=arr1[0][1];
         arr[1][1]=arr1[1][1];
		 arr[1][2]=arr1[2][1];
		 i=2
		 arr[2][0]=arr1[0][2];
         arr[2][1]=arr1[1][2];
		 arr[2][2]=arr1[2][2];
		  i=3
		 arr[3][0]=arr1[0][3];
         arr[3][1]=arr1[1][3];
		 arr[3][2]=arr1[2][3];

		 */
		for (int i = 0; i < arr1.length; i++) { 
			for (int j = 0; j < 3; j++) {
				arr1[i][j]=arr[j][i];
				//i(0-3)  j(0-2)
				// arr1[4][3]  maxindex:arr[3][2]  arr[3][4]  maxindex:arr[2][3]
				//i=3ʱ
				//arr1[3][j]=arr[j][3];
				System.out.print(arr1[i][j]+" ");
				
			}
			System.out.println("");
		}
	}

}
