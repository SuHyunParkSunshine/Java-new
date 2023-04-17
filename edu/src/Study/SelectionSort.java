//선택정렬 알고리즘

package Study;

public class SelectionSort {
	public static void main(String[] args) {
		
		int [] arr = new int[] {15, 11, 1, 3, 8};
		
		for(int cursor = 0; cursor < arr.length -1; cursor++) {
			System.out.println("cursor = " + cursor);
			
			int min = 999999;
			int minIndex = 0;
			
			for(int compare = cursor+1; compare < arr.length; compare++) {
				System.out.println("  compare = " + compare);
				
				
				if(min > arr[compare]) { //최소값을 찾는 과정
					min = arr[compare];
					minIndex = compare;
				}

			}
			System.out.println("  -min = " + min);
			
			if(arr[cursor] > min) {
				int temp = arr[cursor];
				arr[cursor] = min;
				arr[minIndex] = temp; //min의 자리를 교체한 수로 채워줌. min이랑 cursor랑 자리 바꿔주는 것임.
			}
		}
		System.out.println("=".repeat(50));
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
