package Missions;

public class Test {
	
	public static void main(String[] args) {
	
	
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] reverseArr = new int[arr.length];

		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {			
			reverseArr[j] = arr[i];

			System.out.print(reverseArr[j]);
//			System.out.print(arr[i]);
		}
	}
}