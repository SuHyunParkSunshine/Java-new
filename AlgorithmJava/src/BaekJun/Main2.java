package BaekJun;

import java.util.Scanner;

//int형 고정 길이 스택

class IntStack2 {
	private int[] stk; // 스택용 배열
	private int capacity; // 스택의 크기
	private int ptr; // 스택 포인터

	// runtimeException을 상속만 받아가지고 내가 만든 건데 생성자에 아무것도 없어서 걍 런타임 그대로 쓰는거랑 다름 없음
	public class EmptyIntStackException2 extends RuntimeException {
		public EmptyIntStackException2() {
		}
	}

	public class OverflowIntStackException2 extends RuntimeException {
		public OverflowIntStackException2() {
		}
	}

	public IntStack2(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	// push function,
	public int push(int x) throws OverflowIntStackException2 {
		if (ptr >= capacity) // ptr이 꽉찻다는 의미
			throw new OverflowIntStackException2();
		return stk[ptr++] = x; // ptr에 넣고~
	}

	public int pop() throws EmptyIntStackException2 {
		if (ptr <= 0)
			throw new EmptyIntStackException2();
		return stk[--ptr]; // 빼서~
	}

	public int peek() throws EmptyIntStackException2 {
		if (ptr <= 0)
			throw new EmptyIntStackException2();
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
	
	//ptr이 0보다 작으면 true가 되는 거여
	public boolean isEmpty() {
		return ptr <= 0;
	}

	public void dump() {
		if (isEmpty())
		//if (ptr <= 0)
			System.out.println("stack이 비어부렷으");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}

}

public class Main2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack2 s = new IntStack2(4); // 최대 64 개를 푸시할 수 있는 스택

		while (true) {
			System.out.println(); // 메뉴 구분을 위한 빈 행 추가
//			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)push　(2)pop　(3)peek　(4)dump　(0)종료: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {

			case 1: // 푸시
				System.out.print("데이터: ");
				x = stdIn.nextInt();
				try {
					s.push(x);
				} catch (IntStack2.OverflowIntStackException2 e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			case 2: // 팝
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (IntStack2.EmptyIntStackException2 e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 3: // 피크
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (IntStack2.EmptyIntStackException2 e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 4: // 덤프
				s.dump();
				break;
			}
		}
		stdIn.close();
	}
}
