package chapter7;

public class Mission5 {
		
		//함수이용
	public static void main(String[] args) {
		int oddsum = 0;
		int evensum = 0;

		for (int i = 0; i < 1001; i++) {
			if ((i % 2) == 0) {
				evensum += i;
			} else
				oddsum += i;
		}
		System.out.println("짝수의 합: " + evensum);
		System.out.println("홀수의 합: " + oddsum);
		System.out.println("총계: " + (evensum + oddsum));
	}
}

