package Chap4_StackQueue;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Chap4_StackQueue.Queue.EmptyIntOueueException;
import Chap4_StackQueue.Queue.OverflowIntOueueException;

//int형 고정 길이 큐
class ObjectQueue {
    private List<Point> que;  
	private int capacity; // 큐의 크기
	private int front; // 맨 처음 요소 커서
	private int rear; // 맨 끝 요소 커서
	private int num; // 현재 데이터 개수
	
	public class EmptyQueueException extends RuntimeException {
		public EmptyQueueException() {
		}
	}

	public class OverflowQueueException extends RuntimeException {
		public OverflowQueueException() {
		}
	}
	
	public ObjectQueue(int maxlen) {
		num = front = rear = 0;
		capacity = maxlen;

		try {
			que = new ArrayList<Point>();
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	public int enque(Point x) throws OverflowIntOueueException {
		if (num >= capacity) // top이 꽉찻다는 의미
			throw new OverflowQueueException();
		{
			que.add(x); // top에 넣고~
			num++;
			rear++;
			return 1;
		}
	}

	public Point deque() throws EmptyIntOueueException {
		if (num <= 0)
			throw new EmptyQueueException();
		{
			Point p = que.remove(front);
			num--;
			return p;
		}
	}

	public Point peek() throws EmptyIntOueueException {
		if (num <= 0)
			throw new EmptyQueueException();
//		return data[top - 1];		
		return que.get(num - 1);
	}

	public void clear() {
		num = front = rear = 0;
	}

	public int indexOf(Point x) {
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

class Pointer {
	private int ix;
	private int iy;

	public Pointer(int ix, int iy) {
		this.ix = ix;
		this.iy = iy;
	}

	public String toString() {
		return "(" + ix + ", " + iy + ")";
	}
	
	@Override
	public boolean equals(Object p) {

		Pointer px = (Pointer) p;
		if (this.ix == px.ix && this.iy == px.iy)
			return true;
		else
			return false;
	}
}


//int형 고정 길이 큐의 사용 예
public class QueueObject {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ObjectQueue s = new ObjectQueue(4); // 최대 64개를 인큐할 수 있는 큐
		Random random = new Random();
		int rndx = 0, rndy = 0;
		Point p = null;
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
				rndx = random.nextInt(20);
				rndy = random.nextInt(20);
				p = new Point(rndx,rndy);
				try {
					s.enque(p);
				} catch(ObjectQueue.OverflowQueueException e) {
					System.out.println("stack이 가득찼있습니다.");
				}
				break;

			case 2: // 디큐
				try {
					p = s.deque();
					System.out.println("디큐한 데이터는 " + p + "입니다.");
				} catch (ObjectQueue.EmptyQueueException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				break;

			case 3: // 피크
				try {
					p = s.peek();
					System.out.println("피크한 데이터는 " + p + "입니다.");
				} catch (ObjectQueue.EmptyQueueException e) {
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