package Study3;

public class Worrier extends Unit{

	public void sword() {
		System.out.println("전사가 칼을 휘두릅니다.");
		
	}
	@Override
	public void run() {
		System.out.println("전사가 달립니다");
	}

	@Override
	public void walk() {
		System.out.println("전사가 걷습니다");
	}
}
