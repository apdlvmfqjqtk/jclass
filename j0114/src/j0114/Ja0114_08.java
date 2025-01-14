package j0114;

import java.util.Scanner;

public class Ja0114_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// break : 반복문을 중지
		// continue :; 1번만 중지
		
		
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j==3) {
					continue;
				}
				System.out.printf(" %d * %d = %d \n", i, j, i*j);
			}
		}
		
		
		
//		String str = "홍길동";
//		System.out.println("이름을 입력하세요. >>");
//		String input = scan.next();
//		
//		if(str.equals( )) {
//			System.out.println("홍길동이 맞습니다.");
//		}else {
//			System.out.println("홍길동이 아닙니다.");
//		}
		
		
		
		
		
		
//		// 조건문 : if, switch
//		// 반복문 : for, while
//		// boolean, char, byte, short, int, long, float, double 기본형 타입 같은 경우 등가비교 가능
//		// == 등가비교
//		
//		Scanner scan = new Scanner(System.in);
//		
//		String str = "안녕하세요.";
//		String str2 = "안녕";
//		String str3 = "안녕하세요.";
//		String str4 = new String("안녕하세요.");
//		
//		System.out.println(str);
//		System.out.println(str3);
//		System.out.println(str4);
//		
//		// 기본형 이외의 것을 등가비교하면 안된다
//		
//		if(str == str4) {
//			System.out.println("같습니다.");
//		}else{
//			System.out.println("다릅니다.");
//		}
//		
//		// 8가지 기본형 이외 비교는 .equals() 사용
//		if(str.equals(str4)) {
//			System.out.println("equals 비교 같습니다.");
//		}else {
//			System.out.println("equals 비교 다릅니다.");
//		}
//		
//		// 파이썬에서 리스트 주솟값으로 비교
//		// String 2가지 이상의 값을 저장하기 때문
		
		
//		if(str == str2) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
//		System.out.println("-------------------");
//		if(str == str3) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		
		
		
		
//		int num = 10;
//		int num2 = 10;
//		
//		if(num ==num2) {
//			System.out.println("같습니다.");
//		}else {
//			System.out.println("다릅니다.");
//		}
		
		
		// 1~ 100 숫자 입력받아 10번을 입력해 숫자 맞추기 게임을 구현
		// 10번 이후에는 정답 공개를 하시오
//		int ran = (int)(Math.random()*100)+1;
//		int i = 1;
//		int chk = 0;
//		while(i <= 10) {
//			System.out.println("숫자입력");
//			int input = scan.nextInt();
//			if (ran == input) {
//				System.out.printf("정답입니다. %d번만에 맞추셨습니다. 정답은 %d 입니다", i, ran);
//				chk = 1;
//				break;
//			}else {
//				if(ran < input) {
//					System.out.println("오답입니다. 더 낮은 숫자를 입력하세요.");
//				}else if(ran > input) {
//					System.out.println("오답입니다. 더 높은 숫자를 입력하세요");
//				}
//			}
//			i++;
//		}
//		if(chk == 0) {
//			System.out.printf("기회를 모두 소진했습니다. 정답은 %d 입니다. \n", ran);
//		}
		
		
		
		
		// 1~ 100
//		for(int i=0;i<5;i++) {
//			int ran = (int)(Math.random()*100)+1;
//			System.out.println(ran);
//		}
		
		// 0.000000000 <= x < 1.000000000
//		double num = Math.random();
//		System.out.println(num);

		
		
//		
//		// 반복문 사용해서
//		// 000 ~ 999까지 출력
//		Scanner scan = new Scanner(System.in);
//		// 000,001,002,003...010,011,012,013...100,101,102
//		
//		int i = 0;
//		while( i <= 999) {
//			System.out.printf("%03d \n", i);
//			i++;
//		}
//			
	}
	
}