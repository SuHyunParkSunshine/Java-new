package Study;

public class Array2Function {
	public static void main(String[] args) {

		int[][] arr1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr2 = new int[][] { { 11, 12, 13 }, { 14, 15, 16 }, { 17, 18, 19 } };

		System.out.println("- 행렬 1출력 -");
		ShowMatrix(arr1);

		System.out.println("- 행렬 2출력 -");
		ShowMatrix(arr2);

		System.out.println("- 행렬의 합구하기 -");
		int[][] arr3 = SumMatrix(arr1, arr2);

		System.out.println("- 행렬 3출력 -");
		ShowMatrix(arr3);

	}

	static int[][] SumMatrix(int[][] m1, int[][] m2) {

		int[][] result = new int[3][3];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				result[i][j] = m1[i][j] + m2[i][j];
				System.out.print(result[i][j] + "\t");
			}
			System.out.println("\n");
		
		}
		return result;
	}

	static void ShowMatrix(int[][] m) { // return 타입이 없으니까 void로 해야댐

		for (int i = 0; i < 3; i++) {
			// 행출력
			for (int j = 0; j < 3; j++) {
				System.out.print(m[i][j] + "\t");
			}
			// 한행이 도는게 끝날때 마다 행 바꿈해주기
			System.out.println("\n");
		}

	}
}
