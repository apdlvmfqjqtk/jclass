package j0121;

public class Ja0121_03 {

	public static void main(String[] args) {
		Deck d = new Deck();
		
		// 전체출력
		d.print_all(52);
		
		//섞기실행
		d.shuffle();
		
		//10번째 카드 선택
		Card c = d.pick(10);
		d.print_all(c);
		
		// 전체출력
		d.print_all(5);
		
	}//main
}//class
	