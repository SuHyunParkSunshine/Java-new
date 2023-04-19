package chapter10;

import java.util.Map;
import java.util.TreeMap;

public class Test09 {
	
	public static void main(String[] args) {
		TreeMap<String, String> users = new TreeMap<String, String>();
		
		users.put("42", "김용빈");
		users.put("52", "김유빈");
		users.put("12", "김푸름");
		users.put("22", "김하늘");
		users.put("15", "오정임");
		
		System.out.println(" " + users.toString());
		Map.Entry<String, String> entry = null;
		entry = users.firstEntry();
		System.out.println(entry);
		
	}

}
