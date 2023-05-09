package Chap3_SearchAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

class Fruit {

	String name;
	int price;
	String expire;

	public Fruit(String name, int price, String expire) {
		this.name = name;
		this.price = price;
		this.expire = expire;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return name + " " + price + " " + expire;

	}
}

public class FruitObjectSearch {

	static void showData(Fruit[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString() + "");
		}
	}

	Comparator<Fruit> cc_name = new Comparator<Fruit>() {// 익명클래스 사용

		@Override
		public int compare(Fruit f1, Fruit f2) {
			return (f1.name.compareTo(f2.name));
		}
	};

	static Comparator<Fruit> cc_price = new Comparator<Fruit>() {

		@Override
		public int compare(Fruit f1, Fruit f2) {
			return f1.price - f2.price;
		}

	};

	private static void sortData(Fruit[] arr, Comparator<Fruit> cc_price) {
		
		Arrays.sort(arr, cc_price);
		
	}
	

	private static int binarySearch(Fruit[] arr, Fruit newFruit, Comparator<Fruit> cc_name) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		Fruit[] arr = { new Fruit("사과", 200, "2023-5-8"), new Fruit("키위", 500, "2023-6-8"),
				new Fruit("오렌지", 200, "2023-7-8"), new Fruit("바나나", 50, "2023-5-18"), new Fruit("수박", 880, "2023-5-28"),
				new Fruit("체리", 10, "2023-9-8") };

		System.out.println("정렬전 객체 배열: ");
		showData(arr);
		Arrays.sort(null, null);
		Arrays.sort(arr, (a, b) -> a.getPrice() - b.getPrice()); // Fruit에 compareTo()가 있어도 람다식 우선 적용

		System.out.println("람다식 정렬(가격)후 객체 배열: ");
		showData(arr);

		Arrays.sort(arr, new Comparator<Fruit>() {
			@Override
			public int compare(Fruit a1, Fruit a2) {
				return a1.getName().compareTo(a2.getName());
			}
		});

		System.out.println("comparator 정렬(이름)후 객체 배열: ");
		showData(arr);

//		Fruit newFruit = new Fruit("체리", 500, "2023-5-18");
//		int result3 = Arrays.binarySearch(arr, newFruit, cc_name);
//
//		System.out.println("\nArrays.binarySearch() 조회결과::" + result3);
//		result3 = binarySearch(arr, newFruit, cc_name);
//
//		System.out.println("\nbinarySearch() 조회결과::" + result3);
		sortData(arr, cc_price);
		System.out.println("comparator 정렬(가격)후 객체 배열: ");
		showData(arr);
//
//		result3 = Arrays.binarySearch(arr, newFruit, cc_price);
//		System.out.println("\nArrays.binarySearch() 조회결과::" + result3);
//
//		result3 = binarySearch(arr, newFruit, cc_price);
//		System.out.println("\nbinarySearch() 조회결과::" + result3);
	}

}
