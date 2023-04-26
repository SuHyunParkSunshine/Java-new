package BaekJun;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		int H = sr.nextInt();
		int M = sr.nextInt();
		int minus = sr.nextInt();
		int sum = 0;
		int subSum = 0;
		
		H = H * 60;
		sum = H + M;
		subSum = sum - minus;
		
		sr.close();
	}
}