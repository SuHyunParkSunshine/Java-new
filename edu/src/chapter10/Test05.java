package chapter10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test05 {
	
	public static void print(int n, LinkedList<String> list) {
		System.out.println();
		System.out.println(n + " : " + list);
	}
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("서울");
		list.add("부산");
		list.add("제주");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "\t");
		}
		
		list.add(1, "LA");
		for(String sx : list) {
			System.out.println(" " + sx);
		}
		print(1, list);
		
		List<String> list2 = Arrays.asList("북경", "상해");
		list.addAll(list2);
		print(2, list);
		
		Object obj[] = list.toArray(); //List를 배열으로 만들기.
		System.out.println("배열 출력: " + Arrays.toString(obj));
	}

}
