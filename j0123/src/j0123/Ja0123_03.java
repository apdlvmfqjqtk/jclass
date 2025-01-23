package j0123;

import java.util.Scanner;

public class Ja0123_03 {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
//		System.out.println(3/0);
			Exception e = new Exception("고의로 에러 발생");
			throw new Exception("고의로 에러 발생");
			//정상적으로 돌아가는 프로그램 구현
//			System.out.println(3/0);
		}catch (Exception e) {
			// 에러가 났을 때 실행되는 부분
			e.printStackTrace(); // 에러가 났을때 에러 위치ㅡ 에러 설명
			System.out.println("에러발생 3-1");
			System.out.println("에러발생 4-1");
		}
		System.out.println(5);
		System.out.println(6);
		
		
//		System.out.prtln("안녕");  // 오타 : 컴파일 에러
//		int[] n = new int[3];
//		Scanner scan = new Scanner(System.in);
//		for(int i=0;i<4;i++) {
//			System.out.println("숫자입력");
//			n[i] = scan.nextInt();  // 런타임 에러
//		}
			
	}

}
