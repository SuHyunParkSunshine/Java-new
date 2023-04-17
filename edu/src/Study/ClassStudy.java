package Study;

class FishFrame {
	
	int fid; // = this.fid 클래스 안에 있는 변수들을 필드 혹은 맴버변수, 속성이라고 부름
	String color;
	
	FishFrame() { //case1 => 생성자
		this.fid = 0;
		this.color = "노란색";
	}
	
	FishFrame(int fid, String color) { //case2 => 생성자
		this.fid = fid;
		this.color = color;
	}
//	int cut () { // 함수, 매서드, 멤버함수-> 클래스 안에 들어가 있는 함수
//		
//	}
}

public class ClassStudy {
	
	public static void main(String[] args) {
		FishFrame fish1 = new FishFrame(); //case1을 불러옴
		
		FishFrame fish2 = new FishFrame(0, "갈색");
		
		System.out.println(fish1.fid);
		System.out.println(fish1.color); //fish1은 기본 생성자를 가지고 와가지구 출력해줌
		
		System.out.println(fish2.fid);
		System.out.println(fish2.color); //새로 넣은 값을 출력해줌
	}

}
