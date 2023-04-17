package Missions;

import java.util.Arrays;

public class BinaryNumber {

	public static void main(String[] args) {

		int num = 10;
		int remainder;

		// num을 계속 2로 나누어진 나머지를 출력하는 것을 만들어야지

		while (num != 0) { // num==0 0이면 멈추고 num!=0 0이 아니면 계속 돌아감

			// 2로 나눈 나머지 출력
			remainder = num % 2;

			// 증감식?
			num = num / 2;

			int[] arr = {remainder};
			int[] reverseArr = new int[arr.length];

			for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
				reverseArr[j] = arr[i];
//				System.out.print(reverseArr[j]);
			}
			System.out.println(reverseArr);
		}
	}

}
