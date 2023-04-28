package Study3;

public class Magician extends Unit{

	public void meteo() {
		System.out.println("마법사가 메테오를 날립니다.");
		
	}

	@Override
	public void run() {
		System.out.println("마법사가 달립니다");
	}

	@Override
	public void walk() {
		System.out.println("마법사가 걷습니다");
	}
}
