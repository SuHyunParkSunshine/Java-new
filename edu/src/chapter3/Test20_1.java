package chapter3;

import java.util.Scanner;

public class Test20_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //in = 키보드를 의미 & out = 모니터 console을 의미/ ctrl+shift+O -> import 시키기
		
		System.out.println("성적을 입력하세요: ");
		int score = sc.nextInt();
		char grade;

		if(score < 0 || score >= 100 ) {
			System.out.println("부적절한 점수입니다.");
			return; // return = 호출한대로 돌아감. 여기서는 void, 결과로 하기의 코드르 실행하지 않고 빠져나간다. // break는 괄호 하나만 벗어나게 됨.
		}
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';				
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("당신의 성적은 " + grade + "입니다.");		
	}	
}
// if 같이 색이 변하는거는 키워드 예약어임