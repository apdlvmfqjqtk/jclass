package j0117;

public class Ja0117_08 {
	public static void main(String[] args) {
		
		// 카드모양 : spade, heart, diamond, clover
		// 숫자 : 1(A), 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11(J), 12(Q), 13(K)
		// 총 카드 수 : 13
		
		// 13장
		String[] shape = {"Spade", "Heart", "Diamond", "Clover"};
 		Card[] c = new Card[52];
			for(int i=0;i<c.length;i++) {
				c[i] = new Card();
				c[i].kind = shape[i/13];
				c[i].number = (i%13)+1;
			}
		
		for(int i=0;i<c.length;i++) {
			System.out.printf("[문양 : %s, 숫자 : %d]\n",c[i].kind,c[i].number);
		}


	}// main
}// class
