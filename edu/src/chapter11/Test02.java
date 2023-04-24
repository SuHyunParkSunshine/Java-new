package chapter11;

import java.io.FileInputStream;

public class Test02 {

	public static void main(String[] args) {
		
		try(FileInputStream fi = new FileInputStream("a.txt")) {			
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			String s = null;
			s.length();
		} catch (Exception e) {
			
			System.out.println("오류 발생");
		} finally { //finally는 무조건 실행하는 것!! 
		
			System.out.println("OK");
		}
		System.out.println("4");
	}
}
