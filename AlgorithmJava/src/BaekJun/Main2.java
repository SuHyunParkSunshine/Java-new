package BaekJun;

import java.util.Scanner;

class IntStack {
	private int[] stk;
	private int capacity;
	private int ptr;

	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;

		try {
			stk = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	public int push(int x) {
		if (ptr >= capacity)
			return -1;
		return stk[ptr++] = x;
	}

	public int pop() {
		if (ptr <= 0)
			return -1;
		return stk[--ptr];
	}

	public int size() {
		return ptr;
	}
	
	public boolean empty() {
		return ptr <= 0;
	}

	public int top() {
		if (ptr <= 0)
			return -1;
		return stk[ptr - 1];
	}
}

public class Main2 {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(60);

		int N = stdIn.nextInt();

		int i = 0;

		while (i < N) {
			// 이전 코드와 동일
			int x;
			String st = stdIn.next();
			switch (st) {

			case "push":
				x = stdIn.nextInt();
				s.push(x);
				i++;
				break;

			case "pop":
				x = s.pop();
				System.out.println(x);
				i++;
				break;

			case "size":
				x = s.size();
				System.out.println(x);
				i++;
				break;

			case "empty":
				System.out.println(s.empty() ? 1 : 0);
				i++;
				break;

			case "top":
				x = s.top();
				System.out.println(x);
				i++;
				break;
			}
		}
		stdIn.close();
	}
}
