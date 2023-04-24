package chapter13;

class Book /* extends Object 없어도 알아서 컴파일링 해줌 */ {
	String name;
}

class Pencil {
	String name;
}

class Note {
	String name;
}

class Bag {
	Object thing;

	public Bag(Object thing) {
		this.thing = thing;
	}

	public Object getThing() {
		return thing;
	}

}

public class BagTest {

	public static void main(String[] args) {
		Bag bag = new Bag(new Book()); // Book 객체를 전달해서 만들었음(new Book())
		Bag bag2 = new Bag(new Pencil());
		Bag bag3 = new Bag(new Note());
		Book book = (Book)bag.getThing(); //(Book)->타입캐스팅!!
		bag = bag2; //오류가 발생하지 않지만 심각한 논리적 오류다!!

	}

}
