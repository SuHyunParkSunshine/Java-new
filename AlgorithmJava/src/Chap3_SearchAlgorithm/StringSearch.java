package Chap3_SearchAlgorithm;

import java.util.Arrays;
import java.util.Random;

public class StringSearch {

	static void showData(String[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + ", ");

		}
	}

	static void sortData(String[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[i].compareTo(data[j]) < 0) {
					String temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
	}

	private static int linearSearch(String[] data, String key) {

		int i = 0;

		while (true) {
			if (i == data.length)
				return -1;
			if (data[i].compareTo(key) == 0) 
				return i;
			i++;

		}

	}

	private static int binarySearch(String[] data, String key) {
	
		int pl = 0;
		int pr = data.length - 1;
		
		do {
			int pc = (pl + pr) / 2;
			if (data[pc].compareTo(key) == 0)
				return pc;
			else if (data[pc].compareTo(key) < 0)
				pl = pc +1;
			else
				pr = pc -1;
		} while(pl <= pr);
		return 0;
	}

	public static void main(String[] args) {
		String[] data = { "apple", "grape", "persimmon", "감", "배", "사과", "포도", "pear", "blueberry", "strawberry",
				"melon", "oriental melon" };

		showData(data);
		sortData(data);
		System.out.println("\n- 정렬 후 결과 -");
		showData(data);

		String key = "감";
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);

		key = "배";
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + idx);

	}


}
