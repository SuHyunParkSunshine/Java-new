package Chap3_SearchAlgorithm;

import java.util.Arrays;

class PhyscData implements Comparable<PhyscData> {
	String name;
	int height;
	double vision;

//	@Override
//	public int compareTo(PhyscData o) {
//		if (this.name.compareTo(o.name) == 0) {
//			if (this.height == o.height) {
//				if (this.vision == o.vision) {
//					return 0;
//				} else if (this.vision < o.vision) {
//					return 1;
//				} else {
//					return -1;
//				}
//			}
//		} else if (this.name.compareTo(o.name) < 0) {
//			return -1;
//		} else {
//			return 1;
//		}
//		return 0;
//	}

	@Override
	public int compareTo(PhyscData pd) {
		int result = this.name.compareTo(pd.name);
		if (result == 0) {
			int hresult = this.name.compareTo(pd.name);
			if (this.height == pd.height) {
				return (int) (this.vision - pd.height);
			} else
				return hresult;
		} else
			return result;
	}

	@Override
	public String toString() {
		return name + " (" + height + "cm, " + vision + ")";
	}

	public PhyscData(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}

}

public class ObjectSearch {

	static void showData(PhyscData[] arr) {
		System.out.println();
		for (PhyscData fruit : arr) {
			System.out.print(fruit + " ");
		}
		System.out.println();
	}

	private static void sortData(PhyscData[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) < 0) {
					PhyscData temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}

	private static int linearSearch(PhyscData[] arr, PhyscData key) {

		int i = 0;

		while (true) {
			if (i == arr.length)
				return -1;
			if (arr[i].compareTo(key) == 0)
				return i;
			i++;
		}

	}

	private static int binarySearch(PhyscData[] arr, PhyscData key) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		PhyscData[] data = { new PhyscData("홍길동", 162, 0.3), new PhyscData("홍동", 164, 1.3),
				new PhyscData("홍길", 152, 0.7), new PhyscData("김홍길동", 172, 0.3), new PhyscData("길동", 182, 0.6),
				new PhyscData("길동", 167, 0.2), new PhyscData("길동", 167, 0.5), };

		showData(data);
		sortData(data);
		System.out.println("\n - 정렬 후 결과 - ");
		showData(data);
		PhyscData key = new PhyscData("길동", 167, 0.2);
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);

		key = new PhyscData("길동", 167, 0.5);
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);

		int idx = Arrays.binarySearch(data, key);
		// Arrays.binarySearch(data, key, cc); //p.125
		System.out.println("\nArrays.binarySearch(): result = " + result);
	}


}
