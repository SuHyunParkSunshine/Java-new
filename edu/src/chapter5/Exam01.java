package chapter5;

import java.util.Scanner;

public class Exam01 {
	
	public static void main(String[] args) {
		
		Armour armour = new Armour(); // 우리가 만든 Armour라는 데이터 타입을 선언하는것, 글래스 이름이 곧 타입 & new라는 새로운 객체를 생성
//		armour.setName();
		
		String name = armour.getName();
		System.out.println("Name: " + name);
	}

}
