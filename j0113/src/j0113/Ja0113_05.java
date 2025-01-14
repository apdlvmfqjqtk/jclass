package j0113;

public class Ja0113_05 {

	public static void main(String[] args) {
		
		// boolean - true, false
		// char - ''표시, 아스키코드값 : 65 = A, 97= a, 48 = 0
		// 정수형 - byte, short(거의 안씀), 기본형 정수 int - 값을 입력
		// 정수형 - long : 접미사 L을 붙여야 함
		// 실수형 - float, double: float - 접미사 F, double - 접미사 D(생략가능. 일부러 생략(F와 식별)) 
		
		
		
		char ch ='A';
		System.out.println(ch);
		
		char ch2 = '\u0041';   // 16*4 + 1*1 = 65
		System.out.println(ch2);
		
		char ch3 = 97;
		System.out.println(ch3);
		
		char ch4 = '\t';
		System.out.print(ch4);
		
		char ch5 = 'a';
		System.out.print(ch5);
		
		char ch6 = 'b';
		System.out.print(ch6);
		
		char ch7 = 'c';
		System.out.print(ch7);
		
		boolean p = true;
		boolean p2 = false;
		
		// 21억이 넘는 숫자는 L을 붙인다 (long 쓰면 그냥 붙여도됨)
		long l = 10000000000L;
		
		float f = 3.14F;
		float f2 = 100F; // 100.0으로 출력됨
		System.out.print(f2);
		
		double d = 3.14;
		
	}

}
