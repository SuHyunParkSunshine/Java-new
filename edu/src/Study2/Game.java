package Study2;

public class Game {
	public static void main(String[] args) {
		
		Archer a = new Archer();
		Worrier w = new Worrier();
		Magician m = new Magician();
		
		a.run();
		a.walk();
		a.arrow();
		
		w.run();
		w.walk();
		w.sword();
		
		m.run();
		m.walk();
		m.meteo();
	}

}
