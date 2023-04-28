package Study4;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {

		Archer a = new Archer();
		Warrier w = new Warrier();
		Magician m = new Magician();

		String s = a.toString();
		System.out.println("s=" + s);
		System.out.println("a.toString=" + a.toString());

		ArrayList<Unit> unitArray = new ArrayList<Unit>();

		unitArray.add(a);
		unitArray.add(w);
		unitArray.add(m);

		for (int i = 0; i < 3; i++) {
			unitArray.get(i).run();
			unitArray.get(i).walk();
			unitArray.get(i).attack();

			System.out.println(unitArray.get(i).toString()); // toString은 String으로 바꿔주는 역할을 하기 때문에 sysout을 사용해서 출력을 해줘야
																// 값이 나온다.

		}

	}

}
