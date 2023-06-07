package Test;


/*
 * 23.6.7 3회차 실습 코드
 */
import java.util.Random;
import java.util.Scanner;

//정수를 저정하는 이진트리 만들기 실습
class TreeNode {
   // node만들기 클래스
   TreeNode LeftChild;
   int data;
   TreeNode RightChild;

   public TreeNode() {
      LeftChild = RightChild = null;
   }
}

class Tree {
   TreeNode root;

   Tree() {
      root = null;
   }

   TreeNode inorderSucc(TreeNode current) {
      TreeNode temp = current.RightChild;
      if (current.RightChild != null)
         while (temp.LeftChild != null)
            temp = temp.LeftChild;
      return temp;
   }

   boolean isLeafNode(TreeNode current) {
      if (current.LeftChild == null && current.RightChild == null)
         return true;
      else
         return false;
   }

   void inorder() {
      inorder(root);
   }

   void preorder() {
      preorder(root);
   }

   void postorder() {
      postorder(root);
   }

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
      // 트리에 값이 없는 경우 즉, root가 null일때 = 새로운 노드를 루트로 추가
      if (root == null) {
         root = new TreeNode();
         root.data = x;
         return true;
      }

      TreeNode current = root;
      while (true) {
         if (x == current.data) {// 넣을려는 값이 중복된 값인 경우
            return false;
         } else if (x < current.data) {
            // 넣을려는 값이 현재 노드의 값보다 작은 경우, 왼쪽으로 이동
            if (current.LeftChild == null) {
               // 왼쪽 자식이 없는 경우, 새로운 노드를 왼쪽 자식으로 추가
               current.LeftChild = new TreeNode();
               current.LeftChild.data = x;
               return true;
            }
            current = current.LeftChild;

         } else // (x<current.data)
         {
            if (current.RightChild == null) {
               current.RightChild = new TreeNode();
               current.RightChild.data = x;
               return true;
            }
            current = current.RightChild;
         }
      }

   }

   boolean delete(int num) {
      TreeNode parent = null;
      TreeNode current = root;
      // 삭제 하려는 노드를 찾음 경우의 수는 3가지
      while (current != null && current.data != num) {
         parent = current;
         if (num < current.data) {
            current = current.LeftChild;
         } else {
            current = current.RightChild;
         }
      }
      if (current == null) {
         return false;
      }

      // 단말 노드인 경우(밑에 자식이 없는 경우)
      if (current.LeftChild == null && current.RightChild == null) {
         if (current == root) {
            root = null;

         } else if (current == parent.LeftChild) {
            parent.LeftChild = null;
         }

         else {
            parent.RightChild = null;
         }

      }
      // Case 2: 자식을 한 개 가지고 있는 경우
      else if (current.LeftChild == null) {
         if (current == root) {
            root = current.RightChild;
         } else if (current == parent.LeftChild) {
            parent.LeftChild = current.RightChild;
         } else {
            parent.RightChild = current.RightChild;
         }
      } else if (current.RightChild == null) {
         if (current == root) {
            root = current.LeftChild;
         } else if (current == parent.LeftChild) {
            parent.LeftChild = current.LeftChild;
         } else {
            parent.RightChild = current.LeftChild;
         }
      }
      // Case 3: 자식을 두 개 가지고 있는 경우
      else {
         TreeNode successor = inorderSucc(current); // 후속자 찾기
         if (current == root) {
            root = successor;
         } else if (current == parent.LeftChild) {
            parent.LeftChild = successor;
         } else {
            parent.RightChild = successor;
         }
         successor.LeftChild = current.LeftChild;
      }

      return true;
   }

   boolean search(int num) {
      TreeNode current = root;
      while (current != null) {
         if (num == current.data) {
            return true;

         } else if (num < current.data) {
            current = current.LeftChild;
         } else {
            current = current.RightChild;
         }
      }
      return false;

   }
}

public class IntBinaryTreeRef {
   enum Menu {
      Add("삽입"), Delete("삭제"), Search("검색"), InorderPrint("순차출력"), PreorderPrint("실험"), PostorderPrint("실험2"),
      Exit("종료");

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
               //input[ix] = rand.nextInt(20);
            	input[ix] = stdIn.nextInt();
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
         case PreorderPrint:
            t.preorder();
            System.out.println();
            break;
         case PostorderPrint:
            t.postorder();
            System.out.println();
            break;

         }
      } while (menu != Menu.Exit);
   }
}