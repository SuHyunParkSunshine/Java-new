package Chap5_RecursiveAlgorithm;

import java.util.Scanner;

public class Factorial {

	static int factorial(int n) {

		//삼항연산자!!
		return (n > 0) ? n * factorial(n - 1) : 1;

//		if (n > 0) {
//			System.out.println("return" + n + "* factorial(" + n + " - 1)");
//			return n * factorial(n - 1);
//		} else {
//			System.out.println("return 1");
//			return 1;
//		}

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수를 입력하세요: ");
		int x = stdIn.nextInt();
		int result = factorial(x);

		System.out.println(x + "의 팩토리얼은 " + result + "입니다.");
		
		stdIn.close();
	}

}
