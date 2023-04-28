package BaekJun;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		int fdice = sr.nextInt();
		int sdice = sr.nextInt();
		int tdice = sr.nextInt();
		int rewards = 0;
		int [] arr = {fdice, sdice, tdice};		
		
		int max = arr[0];
		
		for(int num : arr) {
			if(num >  max) {
				max = num;
			}
		}
		
		if( fdice == sdice && sdice == tdice && tdice == fdice) {
			rewards = 10000 + (fdice * 1000);
		}
		else if( fdice == sdice && sdice != tdice && tdice != fdice) {
			rewards = 1000 +(fdice * 100);
		}
		else if( fdice != sdice && sdice == tdice && tdice != fdice) {
			rewards = 1000 +(sdice * 100);
		}
		else if( fdice != sdice && sdice != tdice && tdice == fdice) {
			rewards = 1000 +(tdice * 100);
		}
		else {
			rewards = max * 100;
		}
		System.out.println(rewards);
		
		sr.close();
	}
}