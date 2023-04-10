package chapter5;

public class Armour {
	private String name;
	private int height;
	private int weight;
	private String colour;
	private boolean isFly;

	public void setName() { //void 되돌려 주는 값이 없음(무)
		String value ="mark6";
		name = value;
		}
	public String getName() { // String을 되돌려 줌
		if (name == null)
			return "NO Name"; //name은 private로 되어 있어도 같은 함수 내기 떄문에 사용가능, return 현재를 끝으로 돌아가라

		return name;
	}
}
