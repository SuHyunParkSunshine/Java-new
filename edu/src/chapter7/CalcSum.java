package chapter7;

class CalcSumSub {
	// 필드 변수 선언

	private int num;
	private int totalsum;
	private int oddsum;
	private int evensum;

	// 생성자 정의
	public CalcSumSub() {

	}

	public CalcSumSub(int num) {

		this.num = num;

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				evensum += i;
			} else {
				oddsum += i;
			}
		}
		// 전체 합 계산
		totalsum = evensum + oddsum;

	}

	// 함수 만들기
	public void asdasd(int num) {
		this.num = num;
//		num = 0;
//		even = 0;
//		odd = 0;
		// 쓰레기값을 청소해줌

		for (int i = 0; i <= num; i++) {
			totalsum += i;
			if (i % 2 == 0) {
				evensum += i;

			} else {
				oddsum += i;
			}			
		}
		System.out.println(totalsum);
		System.out.println(evensum);
		System.out.println(oddsum);
	}

	// Setter&Getter 메소드 정의
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getTotalsum() {
		return totalsum;
	}

	public void setTotalsum(int totalsum) {
		this.totalsum = totalsum;
	}

	public int getOddsum() {
		return oddsum;
	}

	public void setOddsum(int oddsum) {
		this.oddsum = oddsum;
	}

	public int getEvensum() {
		return evensum;
	}

	public void setEvensum(int evensum) {
		this.evensum = evensum;
	}
}

public class CalcSum {
	// 메인 메서드 시작
	public static void main(String[] args) {
		// CalcSumSub 클래스 객체 생성
		CalcSumSub cs = new CalcSumSub();

		System.out.println(cs.getNum());

		CalcSumSub cs1 = new CalcSumSub(50);

		System.out.println(cs1.getTotalsum());
		System.out.println(cs1.getOddsum());
		System.out.println(cs1.getEvensum());

		CalcSumSub cs2 = new CalcSumSub();
	
		cs2.asdasd(50);

	}
}

//결과 출력
