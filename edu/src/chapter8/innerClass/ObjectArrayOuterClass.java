package chapter8.innerClass;

public class ObjectArrayOuterClass {
	
	class Student {
		int sid;
		String sname;

		Student(int sid, String sname) {
			this.sid = sid;
			this.sname = sname;
		}

		public String toString() { //객체를 출력하는 것
			return "sid = " + sid + ", sname = " + sname;
		}
		void show() {
			System.out.println(this.toString());
//			System.out.println("sid = " + sid + ", sname = " + sname);
		}
	}

	public static void main(String[] args) {
		int[] data = new int[10];
		Student[] sdata = new Student[10]; //new는 생성자 heap영역에 할당했다.
		data[0] = 10;
		ObjectArrayOuterClass my = new ObjectArrayOuterClass(); //외부클래스의 객체 my
		sdata[0] = my.new Student(2023, "hong");
		sdata[1] = my.new Student(2022, "kim");
		sdata[2] = my.new Student(2021, "lee");
		sdata[3] = my.new Student(2020, "park");
		sdata[4] = my.new Student(2019, "nam");

		for (int i = 0; i < 5; i++) {
			sdata[i].show();
		}

	}
}

