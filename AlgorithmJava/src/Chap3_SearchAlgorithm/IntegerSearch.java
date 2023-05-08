package Chap3_SearchAlgorithm;

import java.util.Arrays;
import java.util.Random;

public class IntegerSearch {

	static void inputData(int[] data) {

		Random rand = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = rand.nextInt(40);
			for (int j = 0; j < i; j++) {
				if (data[i] == data[j]) {
					i--;
					break;
				}
			}
		}
	}

	static void showData(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}

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

	private static int linearSearch(int[] data, int key) {
		int i = 0;

		for (i = 0; i < data.length; i++) {

			if (data[i] == key)

				return i;

		}
		return -1;
	}

	private static int binarySearch(int[] data, int key) {

		int pl = 0;
		int pr = data.length - 1;

		do {
			int pc = (pl + pr) / 2;
			if (data[pc] == key)
				return pc;
			else if (data[pc] < key)
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl <= pr);
		return -1;
	}
	
	public static void main(String[] args) {
		int[] data = new int[10];
		inputData(data);
		System.out.print("showData: ");
		showData(data);
		System.out.print("\n- 정렬 후 결과 -");
		sortData(data);

		System.out.println();
		for (int num : data) {
			System.out.print(num + " ");
		}

		int key = 33;
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);

		key = 33;
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + idx);

	}

}
