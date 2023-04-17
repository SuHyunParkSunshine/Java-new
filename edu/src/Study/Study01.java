//for문은 반복횟수 있을 경우, while문은 반복횟수 잘 모를때 주로 사용


//while(true) 하면 무한 반복
package Study;

public class Study01 {
	int value = 0;
	int square = 1;
	 
	
	
	while(value <= 1000) {
		value = (int)Math.pow(2, square);
		
		if (value >= 1000) {
			break;
		}
	}

}
}
