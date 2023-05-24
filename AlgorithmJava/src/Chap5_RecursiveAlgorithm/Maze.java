package Chap5_RecursiveAlgorithm;

import java.util.ArrayList;
import java.util.List;

//mark, maze[14][17] 1로 가벽 나중에 세우기

enum Directions {
	N, NE, E, SE, S, SW, W, NW
}

//현재 위치
class Items {
	int x;
	int y;
	int dir;

	public Items(int x, int y, int dir) {
		this.x = x;
		this.y = y;
		this.dir = dir;
	}

}

class Offsets {
	int a;
	int b;

	public Offsets(int a, int b) {
		this.a = a;
		this.b = b;
	}

}

class StackList {

	private List<Items> stk;
	private int ptr;

	public StackList() {
		stk = new ArrayList<>();
		ptr = 0;
	}

	public void push(Items temp) {

		stk.add(temp);
		ptr++;
	}

	public Items pop() {
		if (ptr <= 0)
			return null;
		ptr--;
		return stk.remove(ptr);
	}

	public boolean isEmpty() {
		return ptr <= 0;
	}
}

public class Maze {

	static Offsets[] moves = new Offsets[8];// static을 선언하는 이유를 알아야 한다

	public static void path(int[][] maze, int[][] mark, int ix, int iy) {

		// backtracking 초기값

		mark[0][0] = 0; // 입구
		mark[ix - 1][iy - 1] = 2; // 출구

		StackList st = new StackList();
		Items temp = new Items(0, 0, 0);// N :: 0
		temp.x = 0;
		temp.y = 0;
		temp.dir = 0;// E:: 2
		mark[temp.x][temp.y] = 2;// 미로 찾기 궤적은 2로 표시, 내가 현재가고 있는 길을 2로 표시
		st.push(temp);

		while (!st.isEmpty()) // stack is not empty
		{
			Items tmp = st.pop(); // unstack

			int i = tmp.x;
			int j = tmp.y;
			int d = tmp.dir;
			mark[i][j] = 1;// backtracking 궤적은 1로 표시

			while (d < 8) // moves forward
			{
				int g = i + moves[d].a;
				int h = j + moves[d].b;

				if ((g == ix) && (h == iy)) { // reached exit
					System.out.println("You reached the exit");// output path
					return;

				}
				if ((g >= 0 && g < maze.length) && (h >= 0 && h < maze[0].length) && (maze[g][h] == 0)
						&& (mark[g][h] == 0)) { // new position

//					temp.x = g;
//					temp.y = h;
//					temp.dir = d + 1;
					mark[g][h] = 2;
					Items push = new Items(i, j, d + 1);
					st.push(push);

//					mark[temp.x][temp.y] = 2;

					i = g;
					j = h;
					
					d = 0;

					maze[g][h] = 2;

				} else {
					d++;
				}

			}
		}
		System.out.println("no path in maze ");
	}

	public static void main(String[] args) {
		int[][] maze = new int[12][15]; // 성공한 길 2로 표시
		int[][] mark = new int[12][15]; // 체크용, 실패했던 길을 1로 변경해야댐

		int input[][] = { // 12 x 15
				{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
				{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
				{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 }, { 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 }, { 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 }, { 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 }, { 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 } };

		for (int ia = 0; ia < 8; ia++)
			moves[ia] = new Offsets(0, 0);// 배열에 offsets 객체를 치환해야 한다.
		moves[0].a = -1;
		moves[0].b = 0; // N
		moves[1].a = -1;
		moves[1].b = 1; // NE
		moves[2].a = 0;
		moves[2].b = 1; // E
		moves[3].a = 1;
		moves[3].b = 1; // SE
		moves[4].a = 1;
		moves[4].b = 0; // S
		moves[5].a = 1;
		moves[5].b = -1; // SW
		moves[6].a = 0;
		moves[6].b = -1; // W
		moves[7].a = -1;
		moves[7].b = -1; // NW
		// Directions d;
		// d = Directions.N;
		// d = d + 1;//java는 지원안됨
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 15; j++) {

				maze[i][j] = input[i][j];
				mark[i][j] = input[i][j];
			}
		}

		System.out.println("input[12,15]::");
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print(input[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println("maze[12,15]::");
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print(maze[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println("mark::");
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print(mark[i][j] + " ");

			}
			System.out.println();
		}

		path(maze, mark, 12, 15);
		System.out.println("mark after path::");
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 15; j++) {
				System.out.print(mark[i][j] + " ");

			}
			System.out.println();
		}

	}
}