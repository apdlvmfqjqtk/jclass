package j0113;

public class Ja0113_06 {
	
	public static void main(String[] args) {
		char ch = 'a';
		System.out.println(ch);
		
		char ch2 = 65;
		System.out.println(ch2);
		
		int ch3 = 65;
		System.out.println(ch3);
		
//		char ch4 = 'AB';
		String ch4 = "AB";
		System.out.println(ch4);
		
		String num = "3.14";
		System.out.println(num);
		
		String s1 = "A"+"B";
		System.out.println(s1);     // 타입 : String
		
		System.out.println(""+7);   // 타입 : String
		
		// 계산은 왼쪽부터 진행하기에 시작 값이 무었이냐가 중요함
		System.out.println(""+7+7); // 결과값 : 77, 타입 : String
		System.out.println(7+7+""); // 결과값 : 14, 타입 : String
		System.out.println(7+7+""+7); // 결과값 : 14, 타입 : String
		
//		char ch5 = '';  // ''사이에 아무것도 없으면 에러
		char ch6 = ' '; // 빈공백문자 가능
		
		String s2 = "";
		String s3 = " ";
		
		byte b1 = 127;
//		byte b2 = 128;
		
		int n1 = 2147483647; // -2147483648 ~ 2147483647
//		int n2 = 2147483648;
		
		int n3 = n1 + 1;
		
		System.out.println(n3);
		
		int n4 = -2147483648;
		int n5 = n4 - 1;
		System.out.println(n5);
		
		
	}
	
}
