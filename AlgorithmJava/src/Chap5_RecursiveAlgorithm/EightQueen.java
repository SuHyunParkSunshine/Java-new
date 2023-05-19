//https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/?ref=lbp
//N Queen problem / backtracking
//책에 있는대로 하지말고 이 코드는 교수님이 주신 코드!! 객체Stack을 가져와서 Point객체를 사용해서 코딩하는 방법
//이 문제는 Stack을 이용해서 푸는 것을 추천, recursive를 이용해서 푸는 것은 비추!!- 교수님 피셜

package Chap5_RecursiveAlgorithm;

import java.util.ArrayList;
import java.util.List;

class Stack3 {
	private List<Point> data; // 스택용 배열
	private int capacity; // 스택의 크기
	private int top; // 스택 포인터

	public class EmptyGenericStackException extends RuntimeException {
		public EmptyGenericStackException() {
		}
	}

	public class OverflowGenericStackException extends RuntimeException {
		public OverflowGenericStackException() {
		}
	}

	public Stack3(int maxlen) {
		top = 0;
		capacity = maxlen;
		try {
			data = new ArrayList<Point>();
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}

	// push function,
	public int push(Point x) throws OverflowGenericStackException {
		if (top >= capacity) // top이 꽉찻다는 의미
			throw new OverflowGenericStackException();
		{
			data.add(x); // top에 넣고~
			top++;
			return 1;
		}
	}

	public Point pop() throws EmptyGenericStackException {
		if (top <= 0)
			throw new EmptyGenericStackException();
		{
			Point p = data.remove(top - 1);
			return p;
		}

//		return data[--top]; // 빼서~ -> 정수버전
	}

	public Point peek() throws EmptyGenericStackException {
		if (top <= 0)
			throw new EmptyGenericStackException();
//		return data[top - 1];
		return data.get(top - 1);
	}

	public void clear() {
		top = 0;
	}

	public int indexOf(Point x) {
		for (int i = top - 1; i >= 0; i--)
			if (data.get(i).equals(x)) // data.get(i) = 포인터 객체,
				return i; // 검색 성공
		return -1; // 검색 실패
	}

	// top이 0보다 작으면 true가 되는 거여
	public boolean isEmpty() {
		return top <= 0;
	}

	public void dump() {
		if (isEmpty())
			// if (top <= 0)
			System.out.println("stack이 비어부렷으");
		else {
			for (int i = 0; i < top; i++)
				System.out.print(data.get(i) + " ");
			System.out.println();
		}
	}
}

public class EightQueen {
	
	static final int qCount = 4;
	
	public static void SolveQueen(int[][] d) {
		int count = 0, mode = 0;
		int ix = 0, iy = 0;
		Stack3 st = new Stack3(10);
		Point p = new Point(ix, iy);
		d[ix][iy] = 1;
		count++;
		st.push(p);
		while (count < qCount) {
			ix++;
			int cy = 0;
			while (ix < d.length) {

				while (cy < d[0].length) {

					st.push(p);
					count++;
					break;

				}
				if (cy != d[0].length) {
					break;
				} else {
					p = st.pop();
					count--;

				}

			}

		}
	}

	public static boolean checkRow(int[][] d, int crow) {
		
		for (int i = 0; i < d.length; i++) {
			if (d[i][crow] == 0)
				return false;

		}

		return true;
	}

	public static boolean checkCol(int[][] d, int ccol) {

		return true;
	}

	public static boolean checkDiagSW(int[][] d, int x, int y) { // x++, y-- or x--, y++ where 0<= x,y <= 7
		// 배열 d에 d[cx][cy]의 SW대각선에 배치 가능하냐?
		int cx = x, cy = y;

		while (cx >= 0 && cx < d.length && cy >= 0 && cy < d.length) {
			cx++;
			cy--;
			if (d[cx][cy] == 1)
				return false;
		}
		cx = x;
		cy = y;
		while (cx >= 0 && cy < d.length && cy >= 0 && cx < d.length) {
			cx--;
			cy++;
			if (d[cx][cy] == 1)
				return false;
		}

		return true;
	}

	public static boolean checkDiagSE(int[][] d, int cx, int cy) {// x++, y++ or x--, y--

		return true;
	}

	public static boolean CheckMove(int[][] d, int x, int y) {// (x,y)로 이동 가능한지를 check CheckMove ->

		if (checkRow(d, x) && checkCol(d, y))
			return true;
		else
			return false;
	}

	public static int NextMove(int[][] d, int row, int col) {// 다음 row에 대하여 이동할 col을 조사 NextMove -> CheckMove

		for(int i = 0; i < d.length; i++) {
			if(CheckMove(d, row, i))
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int row = qCount, col = qCount;
		int[][] data = new int[qCount][qCount];
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data[0].length; j++)
				data[i][j] = 0;

		SolveQueen(data);

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(" " + data[i][j]);
			}
			System.out.println();
		}
	}
}
