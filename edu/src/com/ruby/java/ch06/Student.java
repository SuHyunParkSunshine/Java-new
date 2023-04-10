package com.ruby.java.ch06;

public class Student {

	private int sid;
	private String name;
	private String dept;
	public Student() {} //디폴트 생성자, 값 주는거 아무것도 없음
	public Student(int sid, String name, String dept) {
		 this.sid = sid; this.name = name; this.dept = dept; //this=receiver object
	}
	
	public static void main(String[] args) {
		System.out.println("6장 시작");
		int n = 10;
		Student s =  null;
//		s = new Student();
		s = new Student(2023, "홍길동", "컴퓨터"); // new: 객체를 생성한다는 키워드
		System.out.println(s.sid);
		s.sid = 99;
		System.out.println("student 객체 = " + s);
	}	
}

// book p.231 참고