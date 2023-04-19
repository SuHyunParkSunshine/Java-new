package Tetris;

public class TetrisMain {
	public static void main(String[] args) {

		while (true) {

			// 블럭 만들기
			Block b = new Block("white", "ㄱ"); // 블럭을 만들때 값을 지정해주지 않으면 바로 사용하려고하면 에러가 나거나 의미가 없는 블록이 생김 //생성자는 new 뒤에
												// 나오는 것
												// new의 항 자체가 b를 만들어줌, 아예 객체 자체를 만들어 줌

			// 블럭 떨어뜨리기
			b.Drop();
		}

	}
}