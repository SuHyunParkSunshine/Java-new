package BaekJun;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		
		int fnum = sr.nextInt();
		int snum = sr.nextInt();
		
		int last = snum % 10;
		int second = (snum / 10) % 10;
		int first = snum / 100;
		
		int third = fnum * last;
		int forth = fnum * second;
		int fifth = fnum * first;
		
		int sixth = (fifth * 100) + (forth * 10) + third;
		
		System.out.println(third);
		System.out.println(forth);
		System.out.println(fifth);
		
		System.out.println(sixth);
		
		
		sr.close();
	}
}