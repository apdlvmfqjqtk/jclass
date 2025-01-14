package j0114;

import java.util.Scanner;

public class Ja0114_04 {
	
	 public static void main(String[] args) {
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("소문자를 입력하세요. : ");
		 char str = scan.next().charAt(0);
		 str = (char)(str-32);
		 System.out.println(str);
		 
//		 char ch1 = 'a';
//		 char ch2 = (char)(ch1 - 32);
//		 // a를 아스키 코드(97)로 바꾸고 32를 뺌 -> 65는 대문자 A
//		 System.out.println(ch2);
//		 
//		 char ch3 = 'A';
//		 char ch4 = (char)(ch3+32);
//		 System.out.println(ch4);
		 
//		 char c1 = 'A';
//		 char c2 = (char)(c1 + 1);
//		 System.out.println(c2);
//		 
//		 int n1 = c1 + 1;
//		 System.out.println(n1);
//		 
//		 char c3 = ++c1;		 
//		 System.out.println(c3);
//		 
//		 int n2 = 'B' - 'A';
//		 System.out.println(n2);
//		
//		 int n3 = '9' - '0';
//		 System.out.println(n3);
//		 
//		 int n4 = '2' - '0';
//		 System.out.println(n4);
		
				 
//		 int a = 10000000;
//		 int b = 20000000;
//		 long c = (long)a*b;  // int * int = int
//		 int a * b의 값이 21억 4700만이 넘어가서(int한계값) 에러, 하나를 long 타입으로 변경해야 에러가 안뜸 
// 		 System.out.println("c : " +c);
// 		 
// 		 int n1 = 2100000000;
// 		 int n2 = 2000000000;
// 		 long n3 = (long)n1 + n2;
// 		 long n4 = n1 + n2;
// 		 System.out.println(n3);
// 		 System.out.println(n4);  // 오버플로우 발생
		 
		 
//		 // byte, short, char의 경우 사칙연산 시 int타입으로 변경됨
//		 // byte에 담으려면 강제 형 변환 해야함
//		 byte a = 1;
//		 byte b = 2;
//		 byte c = (byte)(a+b);
//		 byte d = (byte)a + (byte)b; // 이거도 결국 더하면서 int로 변하기에 error
//		 
//		 char ch = 'a';	   //
//		 char ch2 = 'b';   //
//		 int ch3 = ch+ch2; //
//		 System.out.println("ch3 : " + ch3);
//		 
//		 double d1 = 3.14;
//		 int num = (int)d1;
//		 System.out.println(num);
		 
		 
//		 int a = 10;
//		 a++;
//		 int b = a;
//		 System.out.println("a : " + a);
//		 System.out.println("b : " + b);
	}
	 
}
