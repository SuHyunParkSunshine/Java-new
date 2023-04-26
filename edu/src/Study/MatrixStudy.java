package Study;

import java.util.Random;

public class MatrixStudy {

	private int[][] data;
	private int rowCount; //변수는 자기만 가지고 있도록 private로 부동임, 함수의 경우에는 public 이나 protected로 변경하기도 함.
	private int colCount;
	
	public int getRowCount() {
		
		return this.rowCount;
	}
	
	public void setRowCount(int rows) {
		
		this.rowCount = rows;
	}

	public MatrixStudy(int rows, int cols) {

		this.data = new int[rows][cols];
		this.rowCount = rows;
		this.colCount = cols;
	}

	protected static MatrixStudy addMatrix(MatrixStudy m1, MatrixStudy m2) {
		
		MatrixStudy result = new MatrixStudy(m1.rowCount, m1.colCount);
		
		for (int r = 0; r < m1.rowCount; r++) {
			for (int c = 0; c < m1.colCount; c++) {
				
				result.data[r][c] = m1.data[r][c] + m2.data[r][c];
			}
		}
		
		return result;
	}

	protected void setData() {// static이 있으면 안되는 이유?
		Random rand = new Random(System.currentTimeMillis());

		for (int r = 0; r < this.rowCount; r++) {
			for (int c = 0; c < this.colCount; c++) { //data를 쓰면 안되는 이유? 해당 함수의 경우 Matrix 안에 rowCount & colCount가 있어가지구 this. ~ 해야댄다 
				data[r][c] = rand.nextInt(100);
			}
		}
		try {
			Thread.sleep(1);
		} catch (Exception e) {

		}
	}

	protected void showData(String name) {
		
		System.out.println(name + " 행렬의 데이터");
		
		for (int r = 0; r < this.rowCount; r++) {
			for (int c = 0; c < this.colCount; c++) {
				System.out.print(data[r][c] + "\t");
			}
			System.out.print("\n");
		}
	}
}
