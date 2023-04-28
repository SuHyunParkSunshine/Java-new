package Study4;

public class Archer implements Unit { // 자식한테 구현해 놓은 함수를 무조건 쓰도록 강제하는 것

	public void run() {
		System.out.println("궁수가 달립니다");
	}

	public void walk() {
		System.out.println("궁수가 걷습니다");
	}

	public void attack() {
		System.out.println("궁수가 화살을 쏩니다");
	}

	@Override
	public String toString() {
		return "궁수임당";
	}

}
