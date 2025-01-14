package j0114;

import java.util.Scanner;

public class Ja0114_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// for - 반복 횟수 있는 경우
		// while - 조건식이 있는 경우
		
		// while 구구단 출력
		int i = 2;
		while(i <= 9) {
			System.out.printf("[%d 단] \n", i);
			int j=1;
			while(j <= 9) {
				System.out.printf("%d * %d = %d \n", i, j, i*j);
				j++;
			}
			i++;
		}
		
		
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.printf("%d * %d =%d \n", i, j, i*j);
//			}
//		}
//		
		
//		int i = 1;
//		while(i <= 5) {
//			System.out.println("안녕" + i);
//			i++;
//		}
		
//		for(int j=1; j<=5; j++) {
//			System.out.println("안녕" + j);
//		}
		
		
		
		
//		// 숫자 두개를 입력받고 두 숫자 사이 구구단 출력
//		System.out.println("숫자 1을 입력해주세요.");
//		int num1 = scan.nextInt();
//		System.out.println("숫자 2를 입력해주세요.");
//		int num2 = scan.nextInt();
//		
//		int max,min;
//		
//		max = Math.max(num1, num2);
//		min = Math.min(num1, num2);
//		
//		for(int i=min;i<=max;i++) {
//			System.out.printf("[ %d 단 ] \n", i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \t", i, j, i*j);
//			}
//			System.out.println();
//		}
		
//		//입력받은 숫자부터 9단까지 구구단이 시작되도록 구현
//		System.out.println("시작 단을 입력해주세요. :");
//		int a = scan.nextInt();
//		for(int i=a;i<=9;i++) {
//			System.out.printf("[ %d 단 ] \n", i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \t", i, j, i*j);
//			}
//			System.out.println();
//		}
		
		
//		// 구구단
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d 단 ] \n", i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %d \t", i, j, i*j);
//			}
//			System.out.println();
//		}
		
		
		
//		Scanner scan = new Scanner(System.in);
//		// for
//		for (int i=0;;i++) {  // 조건식이 없으면 무한반복
//			System.out.println("안녕" +i);
//		}
//		
		
		
		// 입력받은 글자를 1개씩 출력하는 프로그램을 구현하시오
//		System.out.println("영단어를 입력해주세요. : ");
//		String input = scan.next();
		// 모두 영문자일때만 한개씩 출력
		// 1. 영문자인지 확인
//		int temp = 0;
//		for(int i=0; i<input.length();i++) {
//			if (!(input.charAt(i) >= 'a' && input.charAt(i) <= 'z') || (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')) {
//				temp = 1;
//				break;
//			}
//		}
		
		// 2. 영문자이면 출력, 그렇지 않으면 '다시 입력하세요' 출력
//		if(temp == 0) {
//			for(int i=0;i<input.length();i++) {
//				System.out.println(input.charAt(i));
//			}
//		}else {
//			System.out.println("입력한 글자 중에 영문자가 아닌 것이 있습니다. 다시 입력하세요.");
//		}
		
		
		
		
		
// 연습		
//		for (int i=0;i<input.length();i++) {
//			char a = input.charAt(i);
//				if(a >= 'a' && a<='z' || a>='A' && a<='Z') {
//					boolean result = true ;
//				} else {
//					boolean result = false ;
//					break;
//				}
//				if(result = true) {
//					System.out.println(input.charAt(i));
//				}
//			}
		
		
		
//		String input = "abcdefghijk";
//		for(int i=0;i<input.length();i++) {
//			System.out.println(input.charAt(i));
//		}
		
//		System.out.println(input.length());
//		System.out.println(input.charAt(input.length()-1));

//		System.out.println("글자를 입력해주세요. (영문자만 입력 가능) : ");
//		String str = scan.next();
//		char ch = str.charAt(0);
//		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
//			System.out.println("출력 : " + ch);
//		}else {
//			System.out.println("영문자가 아닙니다.");
//		}

		
		
		// 반복문
//		int sum = 0;
//		for (int i=1;i<=5;i++) {
//			System.out.println(i);
//			sum += i;
//		}
//			// System.out.println(i + "안녕하세요");
//			sum = sum + i;
//		
//		System.out.println(sum);
		
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
//		System.out.println("안녕하세요");
		
	}

}
