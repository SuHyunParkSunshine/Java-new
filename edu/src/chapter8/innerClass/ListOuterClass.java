package chapter8.innerClass;
//노드가 안으로 들어온 버전

class LinkedList {
	class Node {
		String data;
		Node link;

		Node(String data) {  //객체의 단위 Node는 내가 정해준 클라스 이름 고유데이터 타입은 아님
			this.data = data;
			link = null;
		}
		public String toString() {
			return "data =" + data;
		}
	}

	Node head;
	void show() {
		Node p = head;
		while(p != null) {
			System.out.println(p.toString());
			p = p.link;
		}
	}
	

	void add(String name) {
		Node temp = new Node(name);
		if (head == null) {
			head = temp;
		} else {
			temp.link = head;
			head = temp;
		}

	}
}

public class ListOuterClass {
	public static void main(String[] args) {
		LinkedList my = new LinkedList();
		my.add("hong"); // add 새로운 Node 생성
		my.add("kim");
		my.add("lee");
		my.add("park");
		my.add("nam");
		
		my.show();
	}
}