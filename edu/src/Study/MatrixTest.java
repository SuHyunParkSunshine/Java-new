package Study;

//행렬 실행하는 클래스
public class MatrixTest {
	public static void main(String[] args) {

		MatrixStudy A = new MatrixStudy(2, 3);
		MatrixStudy A1 = new MatrixStudy(2, 3);
		
		A.setData();
		A1.setData();
		
		A.showData("A");
		A1.showData("A1");
		
		
		MatrixStudy A2 = MatrixStudy.addMatrix(A, A1); //파라메터도 메트릭스 타입이여야 한다.
		A2.showData("A2");
		
		//System.out.println(A2.rowCount);
		int row = A2.getRowCount();
		System.out.println(row);
		
		A2.setRowCount(A2.getRowCount());
		System.out.println(A2.getRowCount());
	}
}