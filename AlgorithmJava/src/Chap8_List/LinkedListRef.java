package Chap8_List;

//연결 리스트 클래스

import java.util.Comparator;

public class LinkedListRef<E> {
 //--- 노드 ---//
 class Node<E> {
     private E data;              // 데이터
     private Node<E> link;        // 뒤쪽 포인터(다음 노드에 대한 참조)

     //--- 생성자(constructor) ---//
     Node(E data, Node<E> next) {
         this.data = data;
         this.link = next;
     }
 }

 private Node<E> first;        // 머리 포인터(머리 노드에 대한 참조)
 private Node<E> crnt;        // 선택 포인터(선택 노드에 대한 참조)

 //--- 생성자(constructor) ---//
 public LinkedListRef() {
     first = crnt = null;
 }

 //--- 노드 검색 ---//
 public E search(E obj, Comparator<? super E> c) {
     Node<E> p = first;                          // 현재 스캔 중인 노드

     while (p != null) {
         if (c.compare(obj, p.data) == 0) {    // 검색 성공
             crnt = p;
             return p.data;
         }
         p = p.link;                                // 뒤쪽 노드에 주목
     }
     return null;                                       // 검색 실패
 }

 //--- 머리 노드 삽입 ---//
 public void addFirst(E obj) {
     Node<E> p = first;                       // 삽입 전의 머리 노드
     first = crnt = new Node<E>(obj, p);
 }
 
 //--- 꼬리 노드 삽입 ---//
 public void addLast(E obj) {
     if (first == null)                // 리스트가 비어있으면
         addFirst(obj);               // 머리에 삽입
     else {
         Node<E> p = first;
         while (p.link != null)
             p = p.link;
         p.link = crnt = new Node<E>(obj, null);
     }
 }

 //--- 머리노드 삭제 ---//
 public void removeFirst() {
     if (first != null)                        // 리스트가 비어있지 않으면
         first = crnt = first.link;
 }

 //--- 꼬리노드 삭제 ---//
 public void removeLast() {
     if (first != null) {
         if (first.link == null)             // 노드가 하나만 있으면
             removeFirst();                 // 머리노드 삭제
         else {
             Node<E> p = first;            // 스캔 중인 노드
             Node<E> q = first;            // 스캔 중인 노드의 앞쪽 노드

             while (p.link != null) {
                 q = p;
                 p = p.link;
             }
             q.link = null;                // q는 삭제 뒤의 꼬리 노드
             crnt = q;
         }
     }
 }

 //--- 노드p 삭제 ---//
 public void remove(Node p) {
     if (first != null) {
         if (p == first)                // p가 머리 노드이면
             removeFirst();            // 머리 노드 삭제
         else {
             Node<E> p = first;

             while (p.link != p) {
                 p = p.link;
                 if (p == null) return;    // p가 리스트에 없음
             }
             p.link = p.link;
             crnt = p;
         }
     }
 }

 //--- 선택 노드 삭제 ---//
 public void removeCurrentNode() {
     remove(crnt);
 }

 //--- 전체노드 삭제 ---//
 public void clear() {
     while (first != null)        // 비게 될 때까지
         removeFirst();          // 머리 노드 삭제
     crnt = null;
 }

 //--- 선택 노드를 하나 뒤쪽으로 진행 ---//
 public boolean next() {
     if (crnt == null || crnt.link == null)
         return false;           // 나아갈 수 없음
     crnt = crnt.link;
     return true;
 }

 //--- 선택 노드 표시 ---//
 public void printCurrentNode() {
     if (crnt == null)
         System.out.println("주목노드가 없습니다.");
     else
         System.out.println(crnt.data);
 }

 //--- 전체 노드 표시 ---//
 public void dump() {
     Node<E> p = first;

     while (p != null) {
         System.out.println(p.data);
         p = p.link;
     }
 }
}