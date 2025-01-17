package j0117;

import java.util.Scanner;

public class Ja0117_09 {
	
//	// 메소드
//	int add(int a, int b) {
//		int result = a+b;
//		return result;
//	}
//	
//	// 인스턴스 변수 - 객체선언후 참조변수명.번수명
//	boolean power;
//	void power() {
//		power = !power;
//		return;
//	}
	
	// 메소드
	public static void main(String[] args) {
		
		// 2개의 값 넘기면
		// 메소드3개
		// a, b -> 각각 10을 합하고 두 수 합해 리턴
		// a, b -> 각각 10을 곱하고 두 수 합해 리턴
		// a, b -> a, b 곱해서 리턴
		Cal2 c2 = new Cal2();
		int a = 5;
		int b = 7;
		
		Scanner scan = new Scanner(System.in);
		cal:while(true) {
			
			System.out.println("a 수를 입력하세요. (0입력시 종료)");
			a = scan.nextInt();
			if(a == 0) {
				System.out.println("계산기종료.");
				break cal;
			}
			System.out.println("b 수를 입력하세요");
			b = scan.nextInt();
			
			System.out.println("각 항에 10을 더하고 더하기 : " + c2.add(a, b));
			System.out.println("각 항에 10을 곱하고 더하기 : " + c2.mula(a, b));
			System.out.println("각 항을 곱하기 : " + c2.mut(a, b));
		
		}
		
		
//		// 객체선언
//		Cal c = new Cal();
//		
//		int num = 100;
//		int num2 = 20;
//		
//		int result = c.add(num, num2);
//		System.out.println("더하기 : " + result);
//		
//		int result2 = c.sub(num, num2);
//		System.out.println("빼기 : " + result2);
//		
//		c.mult(num, num2);
		
		
		
//		// 지역변수
//		int a = 0; 
//		Ja0117_09 j = new Ja0117_09();
//		j.power = true;
//		System.out.println(j.power);
			
		
	}// main
}// class
