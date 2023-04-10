package Task;

//하나의 java file에 Student 객체를 정의하고 구현하는 실습
/*
* 생성자 함수 구현 - this(); 호출 사용
* static 데이터 멤버 사용
* static 멤버 함수 구현
* toString() 함수 구현과 사용
* 객체 배열 사용
*/
public class Student {

	static int countStudents;// 객체수
	int sid;// 학번
	String sname; // 학생 이름
	String city; // 주소 도시

	public Student() {
		this(0);
//		 this.sname = "";
//		 this.city = "";
	}

	public Student(int sid) {
		this(sid, "");
//		 this.sid = 202301;
//		 this.sname = "";
//		 this.city = "";
	}

	public Student(int sid, String sname) {
		this(sid, sname, "");
	}

	public Student(int sid, String sname, String city) {
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		countStudents++;
	}

	public String toString() {
		return ("학번 = " + sid + ", 이름 = " + sname + ", 도시 = " + city);
	}

	void showStudent() {
		System.out.print("객체: ");
		System.out.println(this.toString());
	}

	static void showNumberObjects() {// 생성된 객체수를 출력한다.
		System.out.println(countStudents);
	}

	// 생성자 구현한다.
	public static void main(String[] args) {

		int[] a = new int[5];
		Student arry[] = new Student[5];
		showNumberObjects();
		arry[0] = new Student();
		arry[1] = new Student(202301);
		arry[2] = new Student(202302, "Hong");
		arry[3] = new Student(202303, "Lee", "Busan");
		arry[4] = new Student(202304, "Na", "jeju");
		showNumberObjects();

		for (int i = 0; i < 5; i++) {
			arry[i].showStudent();// 생성된 객체 모두를 출력한다.
		}
	}

}
