package chapter4;

public class Test39 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20},
				{21, 22, 23, 24, 25}};
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i == j)
					sum = sum + arr[i][j];
			}
		}
		System.out.println("합계 : " + sum);
	}

}

//for루프 하나로 문제해결하는 법
// [i][i]하거나 [j][j]로 돌리면 됨, 단 조건은 서로의 크기가 같을 경우에만 가능!!! (4*5는 가능 5*4는 불가능)

