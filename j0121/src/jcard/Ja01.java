package jcard;

public class Ja01 {
	
	public static void main(String[] args) {
		Deck d = new Deck();
		d.print(52);
		
		d.shuffle();
		
		System.out.println("--------------------");
		d.print(52);
	}//main
}//class
