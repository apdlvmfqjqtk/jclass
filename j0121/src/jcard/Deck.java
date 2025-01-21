package jcard;

public class Deck {
	
	
	// 생성자
	// 새로 deck선언 때 마다 안 섞인 카드뭉치를 가져오기 위함
	Deck() {
		for(int x=0;x<4;x++) {
			for(int y=0;y<13;y++) {
//				c[순서] 번째 카드는 s(shape)의 x번째 문양, y+1번째 수를 가진다
				c[x*13+y] = new Card(s[x],n[y]);
			}
		}
	};
	
	// 카드제작재료생성
	Card[] c = new Card[52];
	String[] n = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	String[] s = {"Spade", "Diamond", "Heart", "Clover"};
	
	//카드 입력한수만큼 출력
	void print(int no) {
		for(int i=0;i<no;i++) {
			System.out.printf("[ %s %s ] \n", c[i].shape, c[i].number);
		}
	}
	
	// 카드섞기
	void shuffle() {
		Card temp = null;
		int rnd = 0;
		for(int i=0;i<500;i++) {
			rnd = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[rnd];
			c[rnd] = temp;
		}
	}
	
	// 0-51까지 수 입력받아 해당하는 카드 출력
	
	
}
