package com.ruby.java.ch06; //하나의 파일에 Count & CountTest 두개의 파일

class Count {
	public static int totalCount; // public or private 아무것도 안 쓰면 'default' 기본 적으로 private인데 정의된 파일에선 사용가능.
	private int num;

	public void setNum(int n) { // 값을 바꿔주는 놈 세터
		num = n;
	}

	public int getNum() { // 값을 바꿔주는 놈 게터
		return num;
	}
}

public class CountTest {
	public void show() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		int num = 0;
		Count.totalCount =10;		
//		Count.num = 20; -> num이 static이 아니라서 안댐, private라 쓸수가 없음
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count.totalCount =110;

//		c1.num++; num이 private라 main에서 접근 안 됨.
		c1.setNum(num);
		System.out.println("num = " + c1.getNum());
		Count.totalCount++;
		c2.num++;
		Count.totalCount++;
		c3.num++;
		Count.totalCount++;

		System.out.println(Count.totalCount + " : " + c1.getNum());
		System.out.println(Count.totalCount + " : " + c2.count);
		System.out.println(Count.totalCount + " : " + c3.count);
	}
}

//static은 필수로 알아야 한다!! 