package Tetris; //클래스안에 변수나 함수를 만들때는 접근제한자(private)를 붙이자!!

public class Block {

	private String color;
	private String shape;
	private int rotation;
	private int xPos;
	private int yPos;

	public Block(String c, String s) {
		this.color = c;
		this.shape = s;
		this.rotation = 0;
		this.xPos = 4;
		this.yPos = 20;

	} // 생성자는 new 뒤에 나오는 것 new의 항 자체가 b를 만들어줌, 아예 객체 자체를 만들어 줌

	protected void Drop() {

		while (this.yPos > 0) {

			System.out.println("!블럭이 떨어지는 즁!" + this.toString());
			this.yPos--;

			// 1초를 쉬도록 하는 코드 try&catch문 안 쓰면 못 쓰게 해놈
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toString() {

		String msg = "color = " + this.color + ", shape = " + this.shape + ", rotation = " + this.rotation + ", xPos = "
				+ this.xPos + ", yPos = " + this.yPos;
		return msg;
	}

	private void MoveLeft() {

	}

	private void MoveRight() {

	}

	private void Acc() {

	}

	private void Rotatet() {

	}

}
