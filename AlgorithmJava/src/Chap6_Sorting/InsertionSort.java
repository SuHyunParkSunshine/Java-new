package Chap6_Sorting;

import java.util.Random;

//단순 삽입 정렬

class InsertionSort {
	// --- 단순 삽입 정렬 ---//
	static void insertionSort(int[] a, int n) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--) {
				a[j] = a[j - 1];
				count++;
			}
			a[j] = tmp;
		}
		System.out.println("비교횟수 =" + count);
	}

	public static void main(String[] args) {
		// Scanner stdIn = new Scanner(System.in);
		Random random = new Random();

		System.out.println("단순 삽입 정렬");

		int nx;
		nx = 100;
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			// x[i] = stdIn.nextInt();
			x[i] = random.nextInt(100);
		}

		insertionSort(x, nx); // 배열 x를 단순교환정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
	}
}
