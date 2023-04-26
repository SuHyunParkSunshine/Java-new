package chapter14;

interface NumberFunc {
	int func(int n);
}

interface StringFunc {
	String modify(String s);
}

interface IntegerStringFunc {
	Integer modify(Integer s);
}

interface MyFunc<T> {
	T modify(T t);
}

public class Test05 {
	public static void main(String[] args) {
		MyFunc<Integer> mf2 = (n) -> n*2;
		MyFunc<String> mf1 = (s) -> s.toUpperCase() + s.length(); //toUpperCase는 스트링, length는 정수 벋 같이 +하면 스트링이 되서 length 단독으로 사용했을 때 발생하는 에러가 해소된다.
		
		NumberFunc sum = (n) -> {
			int result = 0;
			for(int i = 0; i <= n; i++) {
				result += i;
			}
			return result;
		};
		System.out.println("sum = " + sum.func(10));
	}
}
