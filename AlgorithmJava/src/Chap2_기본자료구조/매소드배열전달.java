package Chap2_기본자료구조;

import java.util.Random;

public class 매소드배열전달 {
	static void getData(int[] data) {
		// 난수 생성하여 배열에 입력
		Random rand = new Random(); // 초기 seed값
		for (int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt(10); // 파라매터없으면 임의의 큰 수
		}
	}

	static void showData(int[] data) {
		// 난수 생성하여 배열에 입력
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}

	}

	static int findMax(int[] data) {
		int max = data[0];
		for (int j = 0; j < data.length; j++) {
			if (data[j] > max) {
				max = data[j];
			}
		}
		return max;
	}

//	static void sortData(int[] data) {
//		for (int cursor = 0; cursor < data.length - 1; cursor++) {
//
//			int min = 9999999;
//			int minIndex = 0;
//
//			for (int compare = 0; compare < data.length; compare++) {
//				if (min > data[compare]) {
//					min = data[compare];
//					minIndex = compare;
//				}
//
//			}
//			if(data[cursor] > min) {
//				int temp = data[cursor];
//				data[cursor] = min;
//				data[minIndex] = temp;
//			}
//		}
//	}

	static void sortData(int[] data) {

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[i] < data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}

			}

		}
	}

	public static void main(String[] args) {
		int[] data = new int[10];
		getData(data);
		showData(data);
		int mvalue = findMax(data);
		System.out.println("\nmax = " + mvalue);
		sortData(data);
		System.out.println("정렬 후 결과");
		showData(data);
	}
}
