package chapter4;

import java.util.Scanner; //Scanner 클래스 쓰겠다고 선언

public class Test37_1 {

	public static void main(String[] args) { //main으로부터 시작 main이 두개인 경우 어디서 시작할지 몰라서 에러뜸

		Scanner sc = new Scanner(System.in);
		
		int[] score = { 90, 85, 78, 100, 98 };
		int sum = 0;
		double avg = 0.0;
		int max = 0;
		int min = 999;

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			if (max < score[i])
				max = score[i];
			if (min > score[i])
				min = score[i];
		}

		avg = sum / score.length;
		System.out.println("총 점 : " + sum);
		System.out.println("평 균 : " + avg);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}

}
