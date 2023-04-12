package Missions;

class Mission6Sub {

	private int money;
	private int omanwon = 0;
	private int manwon = 0;
	private int ocheonwon = 0;
	private int chenonwon = 0;

	// 값을 받으면 천원 단위로 만들기

	// 값을 만든 것을 5만원으로 나눈값

	public void Exchange(int money) {
		this.money = money;

		int omanwon = money / 50000;
		int remnant50 = money % 50000;

		int manwon = remnant50 / 10000;
		int remnant10 = remnant50 % 10000;

		int ochenwon = remnant10 / 5000;
		int remnant5 = remnant10 % 5000;

		int chenonwon = remnant5 / 1000;

		System.out.println(omanwon);
		System.out.println(manwon);
		System.out.println(ochenwon);
		System.out.println(chenonwon);
	}

}
public class Mission6{
	public static void main(String[] args) {
		
		Mission6Sub result = new Mission6Sub();
		result.Exchange(152365);
		
	}
}

//배열로 루푸를 돌리는 방법-> 기본적으로 같은 게 반복이 되면 루프를 돌릴수 잇음으로 돌리는게 좋음