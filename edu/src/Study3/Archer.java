package Study3;

public class Archer extends Unit {

	public void arrow() {

		System.out.println("궁수가 화살을 날립니다.");

	}

	@Override
	public void run() {
		System.out.println("궁수가 달립니다");
	}

	@Override
	public void walk() {
		System.out.println("궁수가 걷습니다");
	}
}