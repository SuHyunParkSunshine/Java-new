package chapter3;

import java.util.Scanner;

public class Test22_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Op[+,-,*,/]: ");
			char op = sc.next().charAt(0);
			int a = 0;
			int b = 0;
			
			if(op == '+' || op == '-' || op == '*' || op == '/') {
			
			System.out.println("첫번째 숫자를 입력하세요: ");
			a = sc.nextInt();

			System.out.println("두번쨰 숫자를 입력하세요: ");
			b = sc.nextInt();
			}

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
				return;
			}
			sc.close();
		}
	}

}