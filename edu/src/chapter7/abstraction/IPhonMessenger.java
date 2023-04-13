package chapter7.abstraction;

public class IPhonMessenger extends GraphicIOS implements Messenger {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "iPhone";
	}

	@Override
	public void setMessage(String msg) {
		System.out.println("iPhone에서 메세지를 설정합니다 : " + msg);

	}

	public void clearMessage() {
		System.out.println("좌우로 흔들어 문자열을 지웁니다.");
	}
	
	@Override
	public void draw_submitButton() {
		//super=> 자기 부모 클래스에 있는 것을 사용하겠다.
		super.draw_submitButton();		
		System.out.println("IphoneMessenger: 전송버튼을 그림다.");

	}

	

}
