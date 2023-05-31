package BaekJun;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			String s = sc.next();
			System.out.println(solve(s));			
		}
		sc.close();
	}
	
	public static String solve(String str) {
		Stack<Character> stk = new Stack<>();
		
		for(int j = 0; j < str.length(); j++) {
			
			char c = str.charAt(j);
			
			if(c == '(') {
				stk.push(c);
			}
			else if (stk.isEmpty()) {
				return "NO";
			}
			else {
				stk.pop();
			}
		}
		
		if(stk.isEmpty()) {
			return "YES";
		}
		else {
			return "NO";
		}
	}
}
