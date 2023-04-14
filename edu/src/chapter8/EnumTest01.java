package chapter8;

enum Status {
	READY, SEND, COMPLETE, CLOSE
}

public class EnumTest01 {
	public static void main(String[] args) {
		Status work = null;

		int n = 2;

		switch (n) {
		case 1:
			work = Status.READY;
			break;
		case 2:
			work = Status.SEND;
			break;
		case 3:
			work = Status.COMPLETE;
			break;
		case 4:
			work = Status.CLOSE;
			break;
		}
		System.out.println("현재 작업 상태 : " + work);
		work.toString();
		
		String name = "hello";
		String sname = "good";

		if (name > sname) { //하기의 방법으로 해야지 에러가 안나는데 이유는 모르겠네....
		}
		if (name.compareTo(sname) > 0) {
		}
	}
}