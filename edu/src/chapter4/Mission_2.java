package chapter4;

public class Mission_2 {

	public static void main(String[] args) {
		
		int A[][] = {{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}};
		int B[][] = {{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12}};
		
		int C[][] = new int[3][3];
		
		//행렬 곱셈

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 4; k++) {
					
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(C[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}			
	}
}

