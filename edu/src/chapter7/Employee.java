package chapter7;

public class Employee extends Person {

	private String dept;
	
	public Employee( ) {
		System.out.println("Employee 생성자가 호출되었습니다.");
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) { //this 자기 자신을 의미
		this.dept = dept; //자기 자신(this)의 dept에 dept를 넣어라잉
	}

	@Override
	public String toString() {
		return "Employee [" + getName() + ":" + getAge() + ":" + dept + "]";
	}

	
}
