package chapter3;

import java.util.Scanner;

public class Test22_1 {
	public static void main(String[] args) {

		int a = 12;
		int b = 2;
//		char op = '+';
		Scanner sc = new Scanner(System.in);

		System.out.println("Op[+,-,*,/]: ");
		char op = sc.next().charAt(0);
//		String ops = sc.next(;)
//		char op = ops.charAt(0);  //=>  [char op = sc.next().charAt(0);] 랑 같은 코드

		switch (op) {
		case '+':
			System.out.println("+:" + (a + b));
			break;
		case '-':
			System.out.println("-:" + (a - b));
			break;
		case '*':
			System.out.println("*:" + (a * b));
			break;
		case '/':
			System.out.println("/:" + (a / b));
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
			break;
		}
		sc.close();		
	}

}
