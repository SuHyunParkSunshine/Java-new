package chapter11;

public class Test01 {

	public static void main(String[] args) {

		try {
			int arr[] = new int[3];
			arr[0] = 30;
			String s = "java";
			s = null;
			System.out.println(s.length()); //s가 null이여서 실행할게 없다.
			System.out.println("OK");
		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("잘못된 배열을 인덱스 사용!" + e.toString());
			System.out.println("잘못된 배열을 인덱스 사용!");
			e.printStackTrace();
		} catch (NullPointerException e1) {
			e1.getMessage();
			e1.toString();
			
			System.out.println("null 에러발생");
		}

		System.out.println("GOOD");
	}

}
