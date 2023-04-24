package chapter14;

interface MyInterface {
	public void print();
}
/*class Myclass1 implements MyInterface {
	@Override
	public void print() {
		System.out.println("Myclass1");
	}
}
class Myclass2 implements MyInterface {
	@Override
	public void print() {
		System.out.println("Myclass2");
	}
}*/

public class LambdaTest01 {
	
	public static void main(String[] args) {
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명클래스 구현");
			}
		};
		mi.print();
//		Myclass1 mc1 = new Myclass1();
//		Myclass2 mc2 = new Myclass2();

//		mc1.print();
//		mc2.print();
	}

}
