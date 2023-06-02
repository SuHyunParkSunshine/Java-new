package BaekJun;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		Stack<Integer> stk = new Stack<>();

		int n = sc.nextInt();

		int start = 0;

		while (n-- > 0) {
			int value = sc.nextInt();

			if (value > start) {
				for (int i = start + 1; i <= value; i++) {
					stk.push(i);
					sb.append("+").append("\n");
				}
				start = value;
			} else if (stk.peek() != value) {
				System.out.println("NO");
				return;
			}
			stk.pop();
			sb.append("-").append("\n");
		}
		System.out.println(sb);
		sc.close();
	}
}