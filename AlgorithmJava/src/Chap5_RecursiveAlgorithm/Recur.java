package Chap5_RecursiveAlgorithm;

import java.util.Scanner;

public class Recur {

	// 재귀함수
	static void recur(int n) {
		if (n > 0) {
			System.out.println("recur1(" + n + "- 1);");
			recur(n - 1);
			System.out.println(n);
			System.out.println("recur2(" + n + "- 2);"); //꼬리 재귀
			recur(n - 2);
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
