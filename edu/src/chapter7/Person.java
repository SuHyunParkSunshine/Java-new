package chapter7;

public class Person {
	private String name; //private로 설정해둔 경우에 자식의 클라스에서 나오지 않음, 벋 자바의 경우에는 필드는 private으로 두고 씀
	private int age;

	public Person( ) {
		System.out.println("Person 생성자가 호출되었습니다.");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	public static void main(String[] args) {
//		
//		Person p = new Person();
//		p.setName("홍길동");
//		p.setAge(20);
//		
//		System.out.println(p);
//
//	}

	public String getName() { 
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() { // 화면에 어떻게 보일지를 찍는 함수?
		return name + ":" + age;
	}
}
