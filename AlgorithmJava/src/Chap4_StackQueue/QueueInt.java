package Chap4_StackQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//int형 고정 길이 큐

class Queue {
	private List<Integer> que; // 배열로 안하고 list로 함
	private int capacity; // 큐의 크기
	private int front; // 맨 처음 요소 커서 pop
	private int rear; // 맨 끝 요소 커서 push
	private int num; // 현재 데이터 개수

	public class EmptyIntOueueException extends RuntimeException {
		public EmptyIntOueueException() {
		}
	}

	public class OverflowIntOueueException extends RuntimeException {
		public OverflowIntOueueException() {
		}
	}

	public Queue(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;

		try {
			que = new ArrayList<Integer>();
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	// Functions

	public int enque(Integer x) throws OverflowIntOueueException {
		if (num >= capacity) // top이 꽉찻다는 의미
			throw new OverflowIntOueueException();
		{
			que.add(x); // top에 넣고~
			num++;
			rear++;
			return 1;
		}
	}

	public Integer deque() throws EmptyIntOueueException {
		if (num <= 0)
			throw new EmptyIntOueueException();
		{
			Integer p = que.remove(front);
			num--;
			return p;
		}
	}

	public Integer peek() throws EmptyIntOueueException {
		if (num <= 0)
			throw new EmptyIntOueueException();
//		return data[top - 1];		
		return que.get(num - 1);
	}

	public void clear() {
		num = front = rear = 0;
	}

	public int indexOf(Integer x) {
		for (int i = 0; i < num; i++)
			if (que.get(i).equals(x)) // data.get(i) = 포인터 객체,
				return i; // 검색 성공
		return -1; // 검색 실패
	}

	// top이 0보다 작으면 true가 되는 거여
	public boolean isEmpty() {
		return num <= 0;
	}

	public void dump() {
		if (isEmpty())
			// if (top <= 0)
			System.out.println("stack이 비어부렷으");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que.get(i) + " ");
			System.out.println();
		}
	}

}

//int형 고정 길이 큐의 사용 예
public class QueueInt {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Queue s = new Queue(4); // 최대 64개를 인큐할 수 있는 큐

		while (true) {
			System.out.println(" "); // 메뉴 구분을 위한 빈 행 추가
//			System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
			System.out.print("(1)인큐　(2)디큐　(3)피크　(4)덤프　(0)종료: ");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1: // 인큐
				System.out.print("데이터: ");
				x = stdIn.nextInt();
				try {
					s.enque(x);
				} catch (Queue.OverflowIntOueueException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
				break;

			case 2: // 디큐
				try {
					x = s.deque();
					System.out.println("디큐한 데이터는 " + x + "입니다.");
				} catch (Queue.EmptyIntOueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 3: // 피크
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (Queue.EmptyIntOueueException e) {
					System.out.println("큐가 비어 있습니다.");
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