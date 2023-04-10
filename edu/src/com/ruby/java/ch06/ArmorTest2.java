package com.ruby.java.ch06;

public class ArmorTest2 {
	public static void main(String[] args) {
		Armor suit = new Armor();
		System.out.println(suit.getName());
		suit = null;		
		suit.setName("mark6"); //null.setName() 해야하는데 널값이라서 부를 함수가 없어서 에러가 남. point 값이 널이되면 문제 발생!
		suit.setHeight(180);
		System.out.println(suit.getName() + " : " + suit.getHeight());
	}
}