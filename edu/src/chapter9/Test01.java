package chapter9;

class MyObject {
	int num;

	public MyObject(int num) {
		this.num = num;
	}

	public String toString() {
		return "MyObject";
	}
}

public class Test01 {

	public static void main(String[] args) {

		MyObject my = new MyObject();
		// my.equals(my)
		System.out.println("myobject = " + my);
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		System.out.println(obj1.equals(obj3));
		System.out.println(obj1.hashCode());

		Class c = obj1.getClass();
		System.out.println(c.getName());
		System.out.println(obj1.hashCode()); // heap에 hash cod객체 생성 고유식별번호 부여
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj1); // Sysout은 ()안에 String이 올걸 요구하는데 obj1는 객체임으로 컴파일러가 자동으로 String으로 자동 타입변환을 해줌
		System.out.println(obj2);
		System.out.println(obj3);

		MyObject obj4 = new MyObject(123);
		System.out.println(obj4);
		MyObject obj5 = new MyObject(123);
		if (obj4.equals(obj5)) {
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}

		if (obj4 == obj5) {
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}
	}
}
