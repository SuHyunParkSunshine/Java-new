package chapter10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Test10 {
	
	public static void main(String[] args) {
		lotto_generator(5);
	}
	
	public static void lotto_generator(int n) {
		Random number = new Random(); 
		HashSet<Integer> lotto = null;//6개의 숫자를 가지고 있는 set
		HashSet<HashSet<Integer>> lot = new HashSet<HashSet<Integer>>();
		for(int i = 0; i < n; i++) {
			
			lotto = new HashSet<Integer>();
			
			for(int j = 0; lotto.size() <= 6; j++) { //lotto의 사이즈가 6보다 적으면 계속 도는겨
				lotto.add(number.nextInt(46));
			}
			
			lot.add(lotto);
			List<Integer> L = new ArrayList<Integer>(lotto);
			Collections.sort(L);
			System.out.println(L);
		}
		System.out.println("=".repeat(30));
		System.out.println(lot);
	}//해쉬셋을 Array로 정렬????

}
