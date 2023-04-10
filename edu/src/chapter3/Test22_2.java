package chapter3;

import java.util.Scanner;

public class Test22_2 {
	public static void main(String[] args) {

		int a = 12;
		int b = 2;
//		char op = '+';
		Scanner sc = new Scanner(System.in);

		System.out.println("Op[+,-,*,/]: ");
		String op = sc.next();

		switch (op) {
		case "+":
			System.out.println("+:" + (a + b));
			break;
		case "-":
			System.out.println("-:" + (a - b));
			break;
		case "*":
			System.out.println("*:" + (a * b));
			break;
		case "/":
			System.out.println("/:" + (a / b));
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
			break;
		}
		sc.close();
	}

}
//String = class의 객체형태, doc 기능을 하는 함수를 가지고 있다.