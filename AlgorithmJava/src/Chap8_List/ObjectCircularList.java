package Chap8_List;

/*
 * 정수 리스트 > 객체 리스트> 객체 원형 리스트
 */
import java.util.Comparator;
import java.util.Scanner;

class SimpleObject3 {
	static final int NO = 1; // 번호를 읽어 들일까요?
	static final int NAME = 2; // 이름을 읽어 들일까요?

	private String no; // 회원번호
	private String name; // 이름

	// --- 문자열 표현을 반환 ---//
	public String toString() {
		return "(" + no + ") " + name;
	}

	public SimpleObject3(String no, String name) {
		this.no = no;
		this.name = name;
	}

	public SimpleObject3() {
		this.no = null;
		this.name = null;
	}

	// --- 데이터를 읽어 들임 ---//
	void scanData(String guide, int sw) {
		Scanner sc = new Scanner(System.in);
		System.out.println(guide + "할 데이터를 입력하세요." + sw);

		if ((sw & NO) == NO) { // & 는 bit 연산자임
			System.out.print("번호: ");
			no = sc.next();
		}
		if ((sw & NAME) == NAME) {
			System.out.print("이름: ");
			name = sc.next();
		}
	}

	// --- 회원번호로 순서를 매기는 comparator ---//
	public static final Comparator<SimpleObject3> NO_ORDER = new NoOrderComparator();

	private static class NoOrderComparator implements Comparator<SimpleObject3> {
		public int compare(SimpleObject3 d1, SimpleObject3 d2) {
			return (d1.no.compareTo(d2.no) > 0) ? 1 : (d1.no.compareTo(d2.no) < 0) ? -1 : 0;
		}
	}

	// --- 이름으로 순서를 매기는 comparator ---//
	public static final Comparator<SimpleObject3> NAME_ORDER = new NameOrderComparator();

	private static class NameOrderComparator implements Comparator<SimpleObject3> {
		public int compare(SimpleObject3 d1, SimpleObject3 d2) {
			return d1.name.compareTo(d2.name);
		}
	}
}

class Node3 {
	SimpleObject3 data;
	Node3 link;

	public Node3(SimpleObject3 element) {
		data = element;
		link = null;
	}
}

class CircularList {
	Node3 first;

	public CircularList() { // head node
		Node3 newNode = new Node3(null);
		newNode.link = newNode;
		first = newNode;
	}

	public int Delete(SimpleObject3 element, Comparator<SimpleObject3> cc) // delete the element
	{

		Node3 p = first.link;
		Node3 q = first;

		while (p != null) {
			if (cc.compare(element, p.data) == 0) {
				if (p == first) {
					first = p.link;
					return 1;
				} else {
					q.link = p.link;
					return 1;
				}
			} else { // element != p.data
				q = p;
				p = p.link;
			}
		}
		return 0;
	}

	public void Show() { // 전체 리스트를 순서대로 출력한다.
		// p값 출력
		if (first.link == first) {
			System.out.println("입력 정보가 없습니다");
		}
		Node3 p = first.link;
		while (p != first) {
			System.out.print(p.data + " ");
			p = p.link;
		}
	}

	public void Add(SimpleObject3 element, Comparator<SimpleObject3> cc) // 임의 값을 삽입할 때 리스트가 오름차순으로 정렬이 되도록 한다
	{
		Node3 nd = new Node3(element);
		Node3 p = first.link, q = first;
		if (p == first) {
			first.link = nd;
			nd.link = p;
			return;
		}

		while (p != first) {

			// 맨 처음일때
			if (cc.compare(element, p.data) < 0) {
				if (p == first) {
					nd.link = p; // 1번
					first = nd; // 2번				
					return;
				} else {
					nd.link = p;
					q.link = nd;
					return;
				}
			} else if (cc.compare(element, p.data) > 0) {
				q = p;
				p = p.link;
				if (p == null) {
					q.link = nd;
					return;
				}
				if (p == first) { // 마지막 노드일 경우 첫 번째 노드와 연결
					q.link = nd;
					nd.link = first;
					break;
				}
			}
		}

	}

	public boolean Search(SimpleObject3 element, Comparator<SimpleObject3> cc) { // 전체 리스트를 순서대로 출력한다.

		Node3 p = first.link;

		while (p != first) {
			if (cc.compare(element, p.data) == 0) {
				System.out.println("검색 성공 = " + p.data.toString());
				return true;
			}
			p = p.link;
		}
		return false;
	}
}

public class ObjectCircularList {
	enum Menu {
		Add("삽입"), Delete("삭제"), Show("인쇄"), Search("검색"), Exit("종료");

		private final String message; // 표시할 문자열

		static Menu MenuAt(int idx) { // 순서가 idx번째인 열거를 반환
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) { // 생성자(constructor)
			message = string;
		}

		String getMessage() { // 표시할 문자열을 반환
			return message;
		}
	}

	// --- 메뉴 선택 ---//
	static Menu SelectMenu() {
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			for (Menu m : Menu.values()) {
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
				if ((m.ordinal() % 3) == 2 && m.ordinal() != Menu.Exit.ordinal())
					System.out.println();
			}
			System.out.print(" : ");
			key = sc.nextInt();
		} while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());
		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Menu menu; // 메뉴
		System.out.println("Linked List");
		CircularList l = new CircularList();
		Scanner sc = new Scanner(System.in);
		SimpleObject3 data;
		System.out.println("inserted");
		l.Show();
		do {
			switch (menu = SelectMenu()) {
			case Add: // 머리노드 삽입
				data = new SimpleObject3();
				data.scanData("입력", 3); // 3이면 번호랑 이름이랑 모두 입력
				l.Add(data, SimpleObject3.NO_ORDER);
				break;
			case Delete: // 머리 노드 삭제
				data = new SimpleObject3();
				data.scanData("삭제", SimpleObject3.NO);
				int num = l.Delete(data, SimpleObject3.NO_ORDER);
				if (num == 1) {
					System.out.println("삭제된 데이터는 " + data);
				}
				break;
			case Show: // 꼬리 노드 삭제
				l.Show();
				System.out.println();
				break;
			case Search: // 회원 번호 검색
				data = new SimpleObject3();
				data.scanData("탐색", SimpleObject3.NO);
				boolean result = l.Search(data, SimpleObject3.NO_ORDER);
				if (result == true)
					System.out.println("검색 성공 = " + result);
				else
					System.out.println("검색 실패 = " + result);
				break;
			case Exit: // 꼬리 노드 삭제
				break;
			}
		} while (menu != Menu.Exit);
	}
}