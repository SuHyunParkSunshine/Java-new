package com.ruby.java.ch06;

public class Member {
	String name;
	int age;
	double aa;

	public Member() {
		this.name = "guest";
		age = 0;
	}

	public Member(String name) {
		this.name = name;
		age = 0;
	}

	public Member(String name, int age, double aa) {
		this.name = name; //
		this.age = age;
		this.aa = aa;
	}

	public void setNme(String name) {

	}

	public void show() {
		System.out.println("name = " + name + ", age = " + age);
	}

	public static void main(String[] args) {
		System.out.println("main() 매서드 실행");
		Member m1 = new Member();
		Member m2 = new Member("jun");
		Member m3 = new Member("Amy", 23, 0.8);
		m1.show();
		m2.show();
		m3.show();
	}
}
