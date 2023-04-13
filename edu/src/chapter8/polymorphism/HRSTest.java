package chapter8.polymorphism;

abstract class Employee {
	String name;
	int salary;

	public abstract void calcSalary(); // {}가 있으면 바디가 있다고 하는데 abstract를 사용하면 바디를 가질 수 없다,

	public abstract void calcBonus();
}

class Salesman extends Employee {
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}

	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

class Manager extends Employee { //추상 클라스는 객체를 만들 수 없다. abstract 지우고 overriding 요(근데 왜?)
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}

@Override
public void calcBonus() {
	// TODO Auto-generated method stub	
}

}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
}

public class HRSTest {
	public static void calcTax(Employee e) {
		System.out.println("소득세를 계산합니다.");
	}

//	public static void main(String[] args) {
//		Salesman s = new Salesman();
//		Consultant c = new Consultant();
//		Director d = new Director();
//		
//		System.out.println(s.toString()); //Salesman 객체에 toString 매소드를 호출
//		System.out.println(c.toString());
//		System.out.println(d.toString());
//		
//		//equals에 대한 설명
//		Salesman s2 = s; //s와 s2는 달라여, s의 참조주소를 s2에 줌. 따라서 해쉬코드가 같음
//		System.out.println(s2.toString());
//		
//		if(s.equals(c)) { //자기 Hashcode를 비교 (Hashcode: )
//			System.out.println("동일한 객체입니다.");
//		}
//		
//		else {
//			System.out.println("서로 다른 객체입니다.");
//		}
//
//		s.calcSalary();
//		c.calcSalary();
//		d.calcSalary();
//
//		calcTax(s);
//		calcTax(c);
//		calcTax(d);
//	}
	
	//부모는 자식을 품을 수 있지만 반대는 불가
	public static void main(String[] args) {
		Salesman s1 = new Salesman();
		Employee s2 = new Salesman();
		Object s3 = new Salesman();
		
		Object m1 = new Manager();
		Employee m2 = new Manager(); 
		Manager m3 = new Manager(); 
		//Director m4 = new Manager();  //오류 발생	// 왼쪽이 무조건 부모 파라메타로 하고 싶으면 받는 쪽이 부모 manager가 부모클라스라 실행이 안된다.
		
		Object arr[] = new Object[6];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = m1;
		arr[4] = m2;
		arr[5] = m3;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}
}