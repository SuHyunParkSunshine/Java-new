package Chap2_기본자료구조;

public class StringArray {
	
	static void showData(String [] data) {
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] +", ");
		}
	
}
	static void sortData(String [] data) {
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (data[i].compareTo(data[j]) < 0) {
					String temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}

			}
		}
	
}
	
	public static void main(String[] args) {
		String [] data = {"apple", "grape", "banana", "melon"};
		
		showData(data);
		sortData(data);
		System.out.print("\n");
		showData(data);
		
	}

}
