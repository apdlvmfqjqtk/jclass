package j0114;

import java.util.Scanner;

public class Ja0114_05 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 3개의 숫자를 입력받아 가장 큰 수를 출력
		System.out.println("숫자 1을 입력하세요");
		int n1 = scan.nextInt();
		System.out.println("숫자 2을 입력하세요");
		int n2 = scan.nextInt();
		System.out.println("숫자 3을 입력하세요");
		int n3 = scan.nextInt();
		
		int maxNum = (n1>n2) ? (n1>n3 ? n1:n3) : (n2>n3 ? n2:n3); 
		System.out.println("maxNum: "+ maxNum);
		
		int minNum = (n1>n2) ? (n2>n3 ? n3:n2) : (n1>n3 ? n3:n1);
		System.out.println("minNum: "+ minNum);
		
		
		// 양수(0포함), 음수 구분
//		System.out.println("숫자를 입력하세요. ");
//		int score = scan.nextInt();
//		String result = (score < 0) ? "음수":(score == 0) ? 0 : (score > 0) ? "양수";		 // 맞으면은 앞, 아니면 뒤를 실행시킴
//		System.out.println("결과 : " + result);
		
		
		
		// 삼항식
//		System.out.println("점수를 입력하세요. ");
//		int score = scan.nextInt();
//		String result = score >= 60 ? "합격":"불합격";		 // 맞으면은 앞, 아니면 뒤를 실행시킴
//		System.out.println("결과 : " + result);
		
		
//		System.out.println("숫자를 입력하세요. ");
//		int x = scan.nextInt();
//		int absX = x >= 0 ? x:-x; 
//		System.out.println(absX);
		
		
//		System.out.println("영문자를 입력하세요. ");
//		char input = scan.next().charAt(0);
//		if((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
//			System.out.println("영문자입니다.");
//		} else {
//			System.out.println("영문자가 아닙니다.");
//		}
		
		
//		if(5>3) {
//			System.out.println("정답");
//		} else {
//			System.out.println("오답");
//		}
		
//		// 올림-ceil, 버림-floor, 반올림-round
//		Scanner scan = new Scanner(System.in);
//		System.out.println("소수점 3자리 실수를 입력하세요. ");
//		double input = scan.nextDouble();
//		
//		//3자리에서 반올림해서 출력
//		System.out.println(Math.round(input*100)/100.0);
		
//		float f = 0.1F;
//		double d = (double)0.1f;
//		System.out.println(f);
//		System.out.println(d);
		
		
		// 무조건 소수점 첫번째 자리에서 계산(지정불가)
//		System.out.println(Math.ceil(102.9820));
//		System.out.println(Math.round(102.9820));
//		System.out.println(Math.floor(102.9820));
		
		// 반올림
//		double pi =  3.141592;
//		double pi2 = Math.round(pi * 1000)/1000.0;
//		System.out.println(pi2);
		
		// 버림
//		float pi = 3.141592f;
//		float pi2 = (int)(pi*10000)/10000F;
//		System.out.println(pi2);
		
	}
	
}
