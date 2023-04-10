// 윤년 검사
// 2023년 이후 윤년 10개를 찾아서 배열에 저장하고 이를 출력하는 메소드를 구현해 보세요
// 1. 4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년
// 2. 4로 나누어 떨어지더라도 100으로 나누어지고 떨어지면 평년
// 3. 4로 나누어 떨어지더라도 100으로 나누어지고 떨어지지만 400으로 나누어 떨어지면 윤년

package chapter5;

public class Mission4 {

	public static void main(String[] args) {

		int year = 2023;

		int[] result = new int[10];
		int idx = 0;

		while (idx < 10) {

			// 4로 나누어 진다면
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				result[idx++] = year;

			}
			year++;
			// 4로 나누어 떠러지더라도 100으로 나누어지면 평년
			// 3조건이 맞으면

		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);

//			if (result.length == 10)
//				break;
		}

	}

}
