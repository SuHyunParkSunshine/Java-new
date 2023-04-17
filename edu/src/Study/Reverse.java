//배열 뒤집기

package Study;

public class Reverse {
	public static void main(String[] args) {

		int[] arr = new int[] { 11, 12, 13, 14, 11 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[arr.length - i - 1]); // 길이의 i를 빼면 54321 이런식으로 나와서 없는 배열이 나오기 때매 에러가 뜸으로 1을 더빼주어야 한다.

		}
		System.out.println("=".repeat(50));
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		// 회문여부 확인 코드
		boolean result = true;

		System.out.println("=".repeat(50));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[arr.length - i - 1]) { // 많이 쓰는 트릭임으로 알아두는게 중요!!
				result = true;

			} else {
				result = false;
				break;
			}

		}
		if (result == true) {
			System.out.println("회문입니다");
		} else {
			System.out.println("회문이 아닙니다");
		}
	}

}
