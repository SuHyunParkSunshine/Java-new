package chapter4;

public class Test36 {
	public static void main(String[] args) {
		char letter = 'A';
		char[] alphabet = new char[26];
				
		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char)(letter + i);
		}
		for(char c : alphabet) {
			System.out.println(c);
			// ln 지우고 print만 할 경우, 가로로 표기됨.
		}
	}
}
// char & int 상호호환 가능// 내가 원하는대로 안되는 경우 디버깅 해보기 벌레모양 단축키F6