package BaekJun;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s;

		while (true) {
			s = sc.nextLine();

			if (s.equals(".")) {
				break;
			}
			System.out.println(solve(s));
		}
		sc.close();
	}

	public static String solve(String str) {
		Stack<Character> stk = new Stack<>();

		for (int j = 0; j < str.length(); j++) {

			char c = str.charAt(j);

			if (c == '(' || c == '[') {
				stk.push(c);
			}

			else if (c == ')') {
				if (stk.isEmpty() || stk.peek() != '(') {
					return "no";
				}
				stk.pop();
			}

			else if (c == ']') {
				if (stk.isEmpty() || stk.peek() != '[') {
					return "no";
				}
				stk.pop();
			}
		}

		if (stk.isEmpty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}
