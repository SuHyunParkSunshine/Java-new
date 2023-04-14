package chapter9;

public class Test02 {

	public static void main(String[] args) {

		String s1 = new String("hello"); //heap 영역에 주소가 s1 & s2 다른 객체가 생성된다. 
		String s2 = "hello";
		System.out.println(System.identityHashCode(s1) + "::" + System.identityHashCode(s2)); //hashCode 알아내는 법
		System.out.println(s1 + "::" + s2);
		System.out.println(s1.toString() + "::" + s2.toString());
		System.out.println(s1.hashCode() + "::" + s2.hashCode());

		if (s1 == s2) {
			System.out.println("s1 == s2"); // 아무런 결과가 나오지 않는다. //값이 같지만 식별자가 달라서 같다고 나오지 않는다.
		} else {
			System.out.println("같지 않다");
		}
	}

}
