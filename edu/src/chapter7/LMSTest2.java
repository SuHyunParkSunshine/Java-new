package chapter7;

public class LMSTest2 {
	public static void main(String[] args) {

		Employee e = new Employee("오정임", 47, "입학처");
		Professor p = new Professor("김푸름", 52, "빅데이터");
		Student s = new Student("김유빈", 20, "컴퓨터 과학");
		
		System.out.println(s); //System.out.println(s.toString)(); 랑 같음, 자바 버전에 따라 다르지만 toString을 붙이지 않아도 출력해줌. Overriding되어 있는지 확인요 overriding이 되어 있으면 값을 제대로 불러오지 못할 수 도 있음.
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}
