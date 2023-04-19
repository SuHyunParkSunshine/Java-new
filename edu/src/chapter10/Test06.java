package chapter10;

import java.util.HashMap;
import java.util.Iterator;

public class Test06 {
	
	public static void main(String[] args) {
		
		String word[] = {"BUMBLEBEE", "HEAVEN", "ALTHOUGH", "WONDER"};
		String meaning[] = {"꿀벌과에 속하는 호박벌", "천국", "그럼에도 불구하고", "호기심이 들다"};
		
		HashMap<String, String> dic = new HashMap<String, String>();
		
		for(int i = 0; i < word.length; i++) {
			dic.put(word[i], meaning[i]); //키랑 값이랑 일대일로 매칭해서 출력함.
		}
		System.out.println(dic.toString());
		System.out.println(dic.keySet()); // 키 값만
		System.out.println(dic.values()); // 밸류 값만
		
		Iterator<String> keys = dic.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(dic.get(key));
		}
	}

}
