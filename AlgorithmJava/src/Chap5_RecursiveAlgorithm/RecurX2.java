package Chap5_RecursiveAlgorithm;

import java.util.Scanner;

class IntStack {
	private int[] stk; // 스택용 배열
	private int capacity; // 스택의 크기
	private int ptr; // 스택 포인터

	// runtimeException을 상속만 받아가지고 내가 만든 건데 생성자에 아무것도 없어서 걍 런타임 그대로 쓰는거랑 다름 없음
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

	// push function,
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= capacity) // ptr이 꽉찻다는 의미
			throw new OverflowIntStackException();
		return stk[ptr++] = x; // ptr에 넣고~
	}

	public int pop() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr]; // 빼서~
	}

	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	public void clear() {
		ptr = 0;
	}

	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--)
			if (stk[i] == x)
				return i; // 검색 성공
		return -1; // 검색 실패
	}

	// ptr이 0보다 작으면 true가 되는 거여
	public boolean isEmpty() {
		return ptr <= 0;
	}

	public void dump() {
		if (isEmpty())
			// if (ptr <= 0)
			System.out.println("stack이 비어부렷으");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}

}

public class RecurX2 {

	// 재귀를 제거
	static void recur(int n) {

		IntStack s = new IntStack(n);

		// 꼬리 재귀를 제거
		while (true) {
			if (n > 0) {
				System.out.println("recur1(" + n + "- 1);");
				
				try {
					s.push(n);					
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				n = n - 1;
				continue;
			}
			if (s.isEmpty() != true) {
				System.out.println("recur2(" + n + "- 2);");
				
				try {
					n = s.pop();	
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비었습니당");
				}
				
				
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
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
