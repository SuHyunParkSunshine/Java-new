package chapter10;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("부산");
		list.add("제주");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.add(0, "대구"); //자동적으로 한칸 씩 뒤로 미뤄짐, 실무에서 사용 多
		
		System.out.println("=".repeat(50));
		
		String [] sl = new String[10];
		sl[0] = "서울";
		sl[1] = "부산";
		sl[2] = "제주";
		//sl[0]에 "대구"를 입력하려면 하드코딩(노가다)을 해주어야 함 하나하나 배열의 자리를 이동시켜줘야한다. 하니면 0자리의 배열이 그냥 대구로 교체됨.
		sl[2] = sl[1];
		sl[1] = sl[0];
		sl[0] = "대구";
		
				
		for(String sx : sl) {
			System.out.println(" " + sx);
		}
		
		System.out.println("=".repeat(50));
		
		Iterator<String> iter = list.iterator();		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
