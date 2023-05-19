package BaekJun;

import java.util.Scanner;

class IntStack {

	private int[] stk; // 스택용 배열
	private int capacity; // 스택의 크기
	private int ptr; // 스택포인터

	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {

		}
	}

	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {

		}
	}

	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;

		try {
			stk = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	// push function
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= capacity)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}

	// pop function
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
//			return -1;
		return stk[--ptr]; // 여기는 else인 경우에 바로 이렇게 return을 적으면 되는 건지??
	}

	// size function
	public int size() {
		return ptr;
	}

	// empty function
//	public int empty() {
//		if (ptr <= 0)
//			return 1;
//		else
//			return 0;
//	}

	public boolean empty() {
		return ptr <= 0;
	}

	// top function
	public int top() {
		if (ptr <= 0)
			return -1;
		return stk[ptr - 1];

	}

}

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(60);

		int N = stdIn.nextInt();

		int i = 0;
		while (i < N) {

			int x;
			String st = stdIn.next();
			switch (st) {

			case "push":
				x = stdIn.nextInt();
				s.push(x);
//				try {
//					s.push(x);
//				} catch (IntStack.OverflowIntStackException e) {
//					System.out.println("스택이 가득 찼습니다.");
//				}
				i++;
				break;

			case "pop":
//				x = s.pop();
//				System.out.println(x);
				try {
					x = s.pop();
					System.out.println(x);
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println(-1);
				}
				i++;
				break;

			case "size":
				System.out.println(s.size());
//				try {
//					System.out.println(s.size());
//				} catch (IntStack.EmptyIntStackException e) {
//					System.out.println("스택이 비어있습니다.");
//				}
				i++;
				break;

			case "empty":
				System.out.println(s.empty() ? 1 : 0);
//				System.out.println(s.empty());
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