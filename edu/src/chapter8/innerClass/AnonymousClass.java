package chapter8.innerClass;

interface Messenger { // interface는 함수 선언만 있다. 함수 바디가 없다.
	String getMessenge();

	void setMessage(String msg);
}

//class GMessenger implements Messenger {
//	public String getMessenge() {
//		return "good";
//	}
//
//	public void setMessage(String msg) {
//		System.out.println("my data = " + msg);
//	}
//	public void changeMode() {
//		System.out.println("changed");
//	}
//}

//인터페이스를 구현하는 것 => implements
public class AnonymousClass {
	public static void main(String[] args) {
		Messenger gm = new Messenger() {//new 는 객체생성할때 사용 여기서 GMessenger는 인터페이스 인터페이스에는 객체 생성 불가능한데 자바가 클래스를 자동생성하여 처리하는데 이때 자동 생성된 클래스를 익명 클래스라고 함
			
			public String getMessenge() {
				return "good";
			}
		
			public void setMessage(String msg) {
				System.out.println("my data = " + msg);
			}
			public void changeMode() {
				System.out.println("changed");
			}
		}
				
		gm.getMessenge();
		gm.setMessage("hong");
		
	}
}
