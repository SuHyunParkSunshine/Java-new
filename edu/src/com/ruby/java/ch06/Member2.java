package com.ruby.java.ch06;

public class Member2 {
	private String name;
	private int age;

	public Member2() {
//		this.name = "guest";
//		this.age = 0;
		this("guest");
	}

	public Member2(String name) {
//		this.name = name;
//		this.age = 0;
		this(name, 0);
		this.age = 0;
	}

	public Member2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "name = " + name + ", age = " + age; //name + ":" + age;
	}

	public static void main(String[] args) {
		Member2 m1 = new Member2();
		Member2 m2 = new Member2("Amy");
		Member2 m3 = new Member2("Amy", 23);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}
}
