package j0120;

public class Ja0120_01 {

	static int a = 10;
	
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : " + d.x);
		System.out.println("d : " + d);
		change(d);
		
	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("x : " + d.x);
		// 여기 있는 x는 밖나가면
	}
		
}// class
