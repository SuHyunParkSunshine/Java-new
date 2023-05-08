package Chap2_기본자료구조;

import java.util.Random;

public class Matrix {

	static void getArr(int[][] items) {
		Random rand = new Random();
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items[i].length ; j++) {
				items[i][j] = rand.nextInt(10);
			}
		}
	}

	static void showArr(int[][] items) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items[i].length ; j++) {
				System.out.print(items[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

	static int[][] addMatrix(int[][] A, int[][] A1) {
		int[][] A2 = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				A2[i][j] = A[i][j] + A1[i][j];
			}
		}
		return A2;
	}
	


	public static void main(String[] args) {
		int [][] A = new int[2][3];
		int [][] A1 = new int[2][3];
		int [][] B = new int[3][4];
		int [][] C = new int[2][4];
		int [][] D = new int[3][2];
		
		
		getArr(A);
		showArr(A);
		System.out.println("=".repeat(50));
		getArr(A1);
		showArr(A1);
		System.out.println("=".repeat(50));
		getArr(B);
		showArr(B);
		System.out.println("=".repeat(50));
		int [][] A2 = addMatrix(A, A1);
		showArr(A2);
	}

}
