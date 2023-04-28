package Study4; //Unit interface랑 같은 것!!

public abstract class UnitAbstract {

	abstract void run();

	abstract void walk();

	abstract void attack();

	
	public void Drink() { //abstract는 interface랑 달리 함수를 가질 수 있다.
		System.out.println("회복 포션을 마신다");
	}
}
