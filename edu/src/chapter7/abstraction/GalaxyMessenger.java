package chapter7.abstraction;

public class GalaxyMessenger implements Messenger, WorkFile { //interface는 다중상속이 가능하다.

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "galaxy";
	}

	@Override
	public void setMessage(String msg) {
		System.out.println("galaxy에서 메시지를 설정합니다 : " + msg);
	}

	public void changeKeyboard() {
		System.out.println("키보드아이콘 터치후 키보드를 변경합니다.");
	}

	@Override
	public void fileUpload() {
		System.out.println("file을 업로드합니다.");
		
	}

	@Override
	public void fileDownload() {
		System.out.println("file을 다운로드합니다.");
		
	}
}
