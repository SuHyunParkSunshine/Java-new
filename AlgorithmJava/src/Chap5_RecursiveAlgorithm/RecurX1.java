package Chap5_RecursiveAlgorithm;

import java.util.Scanner;

public class RecurX1 {

	// 재귀함수
	static void recur(int n) {
		// 꼬리 재귀를 제거
		while (n > 0) {
			recur(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수를 입력하세요: ");
		int x = stdIn.nextInt();

		recur(x);

		stdIn.close();
	}

}
