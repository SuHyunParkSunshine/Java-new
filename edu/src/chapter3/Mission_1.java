package chapter3;

import java.util.Scanner;

public class Mission_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ko = 0;
		int en = 0;
		int ma = 0;

		while (true) {

			System.out.println("국어 점수를 입력하세요: ");
			ko = sc.nextInt();

			System.out.println("영어 점수를 입력하세요: ");
			en = sc.nextInt();

			System.out.println("수학 점수를 입력하세요: ");
			ma = sc.nextInt();

//			int k = ko + en + ma;
//			int j = (ko + en + ma) / 3;

			if (ko > 100 || en > 100 || ma > 100) {
				System.out.println("부적절한 점수입니다.");
				return;
			}
			if (ko < 60 || en < 60 || ma < 60) {
				System.out.println("입력: " + ko + "," + en + "," + ma + ", " + "총계: " + (ko + en + ma) + ", " + "평균:"
						+ (ko + en + ma) / 3 + "-> 과락");
			} else if ((ko + en + ma) / 3 >= 70) {
				System.out.println("입력: " + ko + "," + en + "," + ma + ", " + "총계: " + (ko + en + ma) + ", " + "평균:"
						+ (ko + en + ma) / 3 + "-> 통과");
			} else
				System.out.println("입력: " + ko + "," + en + "," + ma + ", " + "총계: " + (ko + en + ma) + ", " + "평균:"
						+ (ko + en + ma) / 3 + "-> 탈락");
//			sc.close();
		}
	}
}

