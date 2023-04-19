package Study;

public class Study02 {
	public static void main(String[] args) {

		int[][] arr1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr2 = new int[][] { { 11, 12, 13 }, { 14, 15, 16 }, { 17, 18, 19 } };

		System.out.println("- 행렬 1출력 -");
		for (int i = 0; i < 3; i++) {
			// 행출력
			for (int j = 0; j < 3; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			// 한행이 도는게 끝날때 마다 행 바꿈해주기
			System.out.println("\n");
		}
		System.out.println("- 행렬 2출력 -");
		for (int i = 0; i < 3; i++) {
			// 행출력
			for (int j = 0; j < 3; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println("\n");
		}
		System.out.println("- 행렬 3출력 -");
		int[][] arr3 = new int[3][3];

		for (int i = 0; i < 3; i++) {
			// 행출력
			for (int j = 0; j < 3; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

}
