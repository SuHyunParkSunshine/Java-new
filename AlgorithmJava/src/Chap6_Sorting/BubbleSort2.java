package Chap6_Sorting;

import java.util.Random;

//버블 환정렬(버전 2: 교환 횟수에 따른 멈춤)

class BubbleSort2 {
	// --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// --- 단순교환정렬(버전 2 : 교환 횟수에 따른 멈춤)---//
	static void bubbleSort(int[] a, int n) {
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			int exchg = 0; // 패스에서 교환하는 횟수
			for (int j = n - 1; j > i; j--) {
				count++;
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
				}
			}
			if (exchg == 0)
				break; // 교환이 이루어지지 않으면 멈춤
		}
		System.out.println("비교횟수 =" + count);
	}

	public static void main(String[] args) {
		// Scanner stdIn = new Scanner(System.in);
		Random random = new Random();

		System.out.println("버블 정렬(버전 2)");

		int nx;
		nx = 100;
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			// x[i] = stdIn.nextInt();
			x[i] = random.nextInt(100);
		}

		bubbleSort(x, nx); // 배열 x를 단순교환정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.print(" " + x[i]);
	}
}