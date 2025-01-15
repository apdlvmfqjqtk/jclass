package j0115;

public class Ja0115_01 {
	
	public static void main(String[] args) {
		
		// score 배열 100 만들어서 1-100까지 입력해 출력
		// 배열에 들어가 있는 숫자를 모두 더하시오
		int[] score = new int[10];
		int sum = 0;
		// 1-10 랜덤수 입력해서 합계출력
		for(int i=0;i<10;i++) {
			int ran = (int)(Math.random()*10)+1;
			System.out.println(ran);
			score[i] = ran; 
			sum += score[i];
		}
		System.out.printf("합계 : %d", sum);
		
//		// 출력
//		for(int i=0;i<100;i++) {
//			System.out.printf("%d \t", score[i]);
//		}
		
		
//		// 배열에 데이터 넣기
//		
//		// 1. 일일히
//		int[] score = new int[10];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		score[5] = 6;
//		score[6] = 7;
//		score[7] = 8;
//		score[8] = 9;
//		score[9] = 10;
//		
//		// 2. 중괄호
//		int[] score2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
//		// 3. 반복문
//		int[] score3 = new int[10];
//		for(int i=0;i<10;i++) {
//			score3[i] = i+1;
//		}
		
		
//		int[] num = new int[10];
//		
//		for(int i=0;i<10;i++) {
//			num[i] = i;
//		}
//
//		for(int i=0;i<10;i++) {
//			System.out.println(num[i]);
//		}
		
		
		
//		int[] score = new int[5];
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
//		System.out.println(score[4]);
//		// 주소값이 출력
//		System.out.println(score);    	
		
		
		
//		String str = new String("abc"); // 주소값을 저장
//		String str2 = "abc";  
//		System.out.println(str);
//		
//		if(str == str2) {
//			// 이러면 비교가 안됨
//		}
//		if(str.equals(str2)) {
//			// 이렇게 비교해야 비교가 됨
//		}
		
	}
	
}
