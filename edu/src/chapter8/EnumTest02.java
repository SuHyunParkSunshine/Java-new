package chapter8;

enum Mandarin {
	   금귤(600), 한라봉(500), 레드향(300), 천혜향(400), 황금향(800); //초기값 설정
	   
	private int price; //필드

	   Mandarin(int p) { //생성자
	      price = p;
	   }

	   int getPrice() { //매소드
	      return price;
	   }
	}

	public class EnumTest02 {
	   public static void main(String[] args) {
		   
		   Object o1 = Mandarin.금귤;
		   System.out.println("hashcode = " + o1.hashCode());
		   System.out.println("toString = " + o1.toString());

	      Mandarin ma = Mandarin.한라봉;
	      if (ma == Mandarin.한라봉)
	         System.out.println("ma는 한라봉입니다.");
	      System.out.println(ma + " 가격 : " + ma.getPrice());

	      Mandarin list[] = Mandarin.values();
	      System.out.println("== 귤의 종류 ==");
	      for (Mandarin m : list)
	         System.out.println(m + ":" + m.getPrice());
	   }
	}