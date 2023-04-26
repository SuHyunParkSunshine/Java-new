package chapter14;

@FunctionalInterface //인터페이스는 매소드가 하나만 있어야 함
interface Multiply {
	double getValue();
	//double print();
}

@FunctionalInterface 
interface verify {
	boolean check(int n);
}

public class Test02 {
	public static void main(String[] args) {
		
		verify v = (n) -> (n % 2) ==0;
				
		System.out.println("v = " + v.check(10));
		
		
	}
}
