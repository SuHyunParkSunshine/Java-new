package Missions;

public class BinaryNumber {
	
	public static void main(String[] args) {
		
		int num = 10;
		int remainder = num % 2;
		
		//num을 계속 2로 나누어진 나머지를 출력하는 것을 만들어야지	
		
		while(num == 0) { //num==0 0이면 멈추고 num!=0 0이 아니면 계속 돌아감
			
			//2로 나눈 나머지 출력
			System.out.println(remainder);
			
			//증감식?
			num = num/2;
		}
	}

}
