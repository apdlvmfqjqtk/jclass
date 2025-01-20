package j0120;

public class Cal {
	

	public int mult(int a, int b) {
		int result = a*b;
		return result;
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	int sub(int a, int b) {
		return a-b;
	}
	
	double div(int a, int b) {
		return a/(double)b;  // 그냥 나누기 하면 인트라서 에러, 한 쪽을 더블로 바꿔줘야 함
	}
	
	
}// class Cal
