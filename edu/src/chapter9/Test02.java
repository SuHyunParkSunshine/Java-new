package chapter9;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {

		String s1 = new String("java"); // heap 영역에 주소가 s1 & s2 다른 객체가 생성된다.
		String s2 = "java";
		String s3 = new String("java");
		String s4 = "java";
//		System.out.println(System.identityHashCode(s1) + "::" + System.identityHashCode(s2)); //hashCode 알아내는 법
//		System.out.println(s1 + "::" + s2);
//		System.out.println(s1.toString() + "::" + s2.toString());
//		System.out.println(s1.hashCode() + "::" + s2.hashCode());
		
		System.out.println("s1 : " + s1.hashCode() + ", s2 : " + s2.hashCode()); //java 문자열(String)을 사용하여 객체를 만드는데 코드 최적화(객체가 존재할때 기존의 객체를 가져다 씀)를 함
		if (s1.equals(s2))
			System.out.println("s1 equals s3");
		else
			System.out.println("s1 not equals s3");
		if (s1 == s2) {
			System.out.println("s1 == s2"); // 아무런 결과가 나오지 않는다. //값이 같지만 식별자가 달라서 같다고 나오지 않는다.
		} else {
			System.out.println("같지 않다");
		}
		int i3 = Integer.parseInt("123");
		Arrays.sort(null);
	}

}
