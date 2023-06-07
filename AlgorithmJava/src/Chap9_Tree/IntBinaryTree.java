package Chap9_Tree;

/*
 * 23.6.7 3회차 실습 코드
 */
import java.util.Random;
import java.util.Scanner;

//정수를 저정하는 이진트리 만들기 실습
class TreeNode {
	TreeNode LeftChild;
	int data;
	TreeNode RightChild;

	public TreeNode(int x) {
		LeftChild = RightChild = null;
		data = x;
	}
}

class Tree {
	TreeNode root;

	Tree() {
		root = null;
	}

	// inorder은 recursive버전, 이건 recursive아닌 버전
	// 기준값의 successor(후계자, 바로 뒤에 오는 값)을 구할 수 있는 알고리즘
	TreeNode inorderSucc(TreeNode current) {
		TreeNode temp = current.RightChild;
		if (current.RightChild != null)
			while (temp.LeftChild != null)
				temp = temp.LeftChild; // temp가 inorder successor가 된다.
		return temp;
	}

	boolean isLeafNode(TreeNode current) {
		if (current.LeftChild == null && current.RightChild == null)
			return true;
		else
			return false;
	}

	// inorder Function ->
	void inorder() {
		// overloading
		inorder(root);
	}

	void preorder() {
		preorder(root);
	}

	void postorder() {
		postorder(root);
	}

	// recursive함수
	void inorder(TreeNode CurrentNode) {
		if (CurrentNode != null) {
			inorder(CurrentNode.LeftChild);
			System.out.print(" " + CurrentNode.data);
			inorder(CurrentNode.RightChild);
		}
	}

	void preorder(TreeNode CurrentNode) {
		if (CurrentNode != null) {
			System.out.print(CurrentNode.data + " ");
			preorder(CurrentNode.LeftChild);
			preorder(CurrentNode.RightChild);
		}
	}

	void postorder(TreeNode CurrentNode) {
		if (CurrentNode != null) {
			postorder(CurrentNode.LeftChild);
			postorder(CurrentNode.RightChild);
			System.out.print(CurrentNode.data + " ");
		}
	}

	boolean insert(int x) {// binary search tree를 만드는 입력 => A + B * C을 tree로 만드는 방법: 입력 해결하는 알고리즘 작성 방법을
							// 설계하여 구현
		TreeNode p = root;
		TreeNode temp = new TreeNode(x);

		if (p == null) {
			root = temp;
			return true;
		}

		// root에 데이터가 있을때 반복문으로 들어간다
		while (p != null) {
			if (x == p.data) {
				return false;
			} else if (x < p.data) {
				if (p.LeftChild == null) {
					p.LeftChild = temp;
					return true;
				}
				p = p.LeftChild;
			} else { // (x < p.data)
				if (p.RightChild == null) {
					p.RightChild = temp;
					return true;
				}
				p = p.RightChild;
			}
		}
		return false;
	}

	// inorderSucc를 사용해야함
	boolean delete(int num) {
		TreeNode parent = null;
		TreeNode p = root;
		if (p == null) {
			return false;
		}

//		while (p.data != num) {
//			if(search(num) == false)			
//			parent = p;
//		}
		while (p != null && p.data != num) {
			if (num < p.data) {
				p = p.LeftChild;
			} else {
				p = p.RightChild;
			}
			parent = p;
		}
		// case1. 자식 노드가 없는 노드를 삭제하는 경우, 노자식(leafNode 삭제)
		if (isLeafNode(p) == true) {
			if (p == root) {
				root = null;
			} else if (p == parent.LeftChild) {
				parent.LeftChild = null;
			} else { // p == parent.rightChild
				parent.RightChild = null;
			}
		}
		// case 2. 자식을 한 개 가지고 있는 경우
		else if (p.LeftChild == null) {
			if (p == root) {
				root = p.RightChild;
			} else if (p == parent.LeftChild) {
				parent.LeftChild = p.RightChild;
			} else {
				parent.RightChild = p.RightChild;
			}
		} else if (p.RightChild == null) {
			if (p == root) {
				root = p.LeftChild;
			} else if (p == parent.LeftChild) {
				parent.LeftChild = p.LeftChild;
			} else {
				parent.RightChild = p.LeftChild;
			}
		}
		// case 3. 자식을 두개 가지고 있는 경우
		else {
			TreeNode successor = inorderSucc(p);
			if (p == root) {
				root = successor;
			} else if (p == parent.LeftChild) {
				parent.LeftChild = successor;
			} else {
				parent.RightChild = successor;
			}
			successor.LeftChild = p.LeftChild;
		}
		return true;
	}
	
//	  boolean delete(int num) {// inorderSucc가 필요
//	      // TreeNode tempP = inorderSucc(root); // 부모 노드
//	      TreeNode p = root;
//	      TreeNode q = null;
//
//	      if (p == null) {
//	         return false;
//	      }
//
//	      while (p != null) {
//	         if (p.data == num) {// 삭제하는 작업
//	            if (isLeafNode(p)) { // leaf Node(자식이 없는 경우) 삭제
//	               if (q == null) {
//	                  root = null;
//	                  return true;
//	               } else if (p == q.LeftChild) {
//	                  q.LeftChild = null;
//	                  return true;
//	               } else {
//	                  q.RightChild = null;
//	                  return true;
//	               }
//	            } else { // 삭제할 노드가 리프 노드가 아닌 경우 / inorder이용
//	               TreeNode su = inorderSucc(p);
//	               if (su == null) {
//	                  return false;
//	               }
//	               delete(su.data); // 후속자 노드를 재귀적으로 삭제
//	               p.data = su.data; // 삭제할 노드의 데이터를 후속자 노드의 데이터로 대체
//	               return true;
//	            }
//	         } else if (num < p.data) {// 트리를 따라가기
//	            q = p;
//	            p = p.LeftChild;
//	         } else {
//	            q = p;
//	            p = p.RightChild;
//	         }
//	      }
//	      return false; // 삭제할 노드가 없는 경우
//	   }


	boolean search(int num) {
		TreeNode p = root;
		while (p != null) {
			if (num == p.data) {
				return true;
			} else if (num < p.data) {
				p = p.LeftChild;
			} else {
				p = p.RightChild;
			}
		}
		return false;
	}
}

public class IntBinaryTree {
	enum Menu {
		Add("삽입"), Delete("삭제"), Search("검색"), InorderPrint("순차출력"), Exit("종료");

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
		Scanner stdIn = new Scanner(System.in);
		int key;
		do {
			for (Menu m : Menu.values())
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
			System.out.print(" : ");
			key = stdIn.nextInt();
		} while (key < Menu.Add.ordinal() || key > Menu.Exit.ordinal());

		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		Tree t = new Tree();
		Menu menu; // 메뉴
		int count = 0;
		int num;
		boolean result;
		do {
			switch (menu = SelectMenu()) {
			case Add: // 노드 삽입
				System.out.println("The number of items = ");
				count = stdIn.nextInt();
				int[] input = new int[10];
				for (int ix = 0; ix < count; ix++) {
					input[ix] = rand.nextInt(20);
				}
				for (int i = 0; i < count; i++) {
					if (t.insert(input[i]) == false)
						System.out.println("Insert Duplicated data");
				}
				break;

			case Delete: // 노드 삭제
				System.out.println("삭제할 데이터:: ");
				num = stdIn.nextInt();
				if (t.delete(num) == true)
					System.out.println("삭제 데이터 = " + num + " 성공");
				else
					System.out.println("삭제 실패");
				;
				break;

			case Search: // 노드 검색
				System.out.println("검색할 데이터:: ");

				num = stdIn.nextInt();
				result = t.search(num);
				if (result == true)
					System.out.println(" 데이터 = " + num + "존재합니다.");
				else
					System.out.println("해당 데이터가 없습니다.");
				break;

			case InorderPrint: // 전체 노드를 키값의 오름차순으로 표시
				t.inorder();
				System.out.println();
				break;
			}
		} while (menu != Menu.Exit);
	}
}
