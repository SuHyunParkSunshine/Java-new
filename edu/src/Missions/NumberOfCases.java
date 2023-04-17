package Missions;

import java.util.Scanner;

public class NumberOfCases {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.println("10~100 사이의 임의의 정수를 입력하시오");
		int num = sr.nextInt();

		int minus = 0;
		int remainder = 0;
		int gram5 = 1;
		int count = 0;


		for (int gram3 = 1; gram3 <= 10; gram3++) {

			for (int gram2 = 1; gram2 <= 10; gram2++) {
	
				minus = num - (2 * gram2);
				if (minus <= 0) {
					break;
				}

				remainder = minus - (3 * gram3);
				if (remainder <= 0) {
					break;
				} else if (remainder % 5 == 0) {
					gram5 = remainder / 5;
					if (gram5 <= 0) {
						break;
					}
					System.out.print("(" + gram2 + "," + gram3 + "," + gram5 + ")"); //gram5이 값을 받을 때만 출력하고 싶으면 if문 안에 넣어야함.
					count++; // 값을 출력 할때마다 갯수를 출력하기 위함
				}  //else{break;}를 해서 for문 바깥으로 나가버려가지구 계속 답이 안나왔던 거임!!
				
			}
		}
		System.out.println(" : " + count);
		sr.close();
	}
}