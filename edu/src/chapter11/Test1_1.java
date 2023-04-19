package chapter11;

public class Test1_1 {

	public static void main(String[] args) {

		try {int arr[] = new int[3];
			arr[3] = 30;
			
		} catch (IndexOutOfBoundsException a) {
			// TODO: handle exception
			System.out.println("잘못된 배열을 인덱스 사용!" + a.toString());
		}
			
			
//			System.out.println("OK");
//		try {} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("잘못된 배열을 인덱스 사용!" + e.toString());
//			System.out.println("잘못된 배열을 인덱스 사용!");
//			e.printStackTrace();
//		} catch (NullPointerException e1) {
//			e1.getMessage();
//			e1.toString();
//			
//			System.out.println("null 에러발생");
//		}
//
//		System.out.println("GOOD");
//	}

}
	}
