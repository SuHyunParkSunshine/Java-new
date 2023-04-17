package chapter10;

import java.util.ArrayList;

class Employee {
	String name;
	int age;
	int height;
	int weight;
	char bloodType;
	String email;

	public Employee(String name, int age, int height, int weight, char bloodType, String email) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.bloodType = bloodType;
		this.email = email;
	}

	public String toString() {
		return name + ", " + age + ", " + height + ", " + weight + ", " + bloodType + ", " + email;
	}
}

public class Test01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("부산");
		list.add("창원");
		list.add("서울");
		list.add("울산");
		list.add("밀양");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			list.add(0, "인천");
			list.remove(1);
			System.out.println("\n인천삽입후::");
			for(int i = 0; i <list.size(); i++) {
				System.out.println(" " + list.get(i).toString());
			}
			
			Object arr [] = new Object[10];
			ArrayList lst = new ArrayList();
			String s = "java"; Integer i = 123;
			arr[0] = s; arr[1] = i;
			int m = arr[0].length();
			int [] data = new int [10];
			int k = data.length;
		}

		int[] a = new int[10];
		Employee[] eset = new Employee[10]; // 배열 만들기

		eset[0] = new Employee("hong", 11, 130, 50, 'A', "bhhong@go.kr"); // 객체 생성하기
		eset[1] = new Employee("kim", 11, 130, 50, 'A', "bhhong@go.kr");
		eset[2] = new Employee("lee", 11, 130, 50, 'A', "bhhong@go.kr");
		eset[3] = new Employee("park", 11, 130, 50, 'A', "bhhong@go.kr");
		eset[4] = eset[3];
		eset[3] = eset[2];
		eset[2] = new Employee("choi", 11, 130, 50, 'A', "bhhong@go.kr");

		for (int i = 0; i < 5; i++) {
			System.out.println(eset[i].toString());
		}

	}

}
