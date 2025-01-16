package j0116;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0116_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] ball = new int[45];  // 공
		int[] lotto = new int[6];  // 로또번호
		int[] input = new int[6];  // 적은번호
		int[] answer = new int[6]; // 맞춘번호
		int count = 0;			   // 맞춘개수
		
		
		for(int i=0;i<45;i++) {
			ball[i] = i+1;
		}
		
		// 섞기
		int temp = 0;
		for(int i=0;i<300;i++) {
			int randomN = (int)(Math.random()*45);  // +1 안한 이유는 주소값(0-44)때문
			// temp를 따로 만들어서 하는 이유는 java가 옛날 언어라. 지금 적용시키기엔 그로 인한 에러가 발생할 수 있기에 아직도 그대로 둠. 
			// 이러함 불편함 보강 위해 spring이 있음
			temp = ball[0];
			ball[0] = ball[randomN];
			ball[randomN] = temp;
		}
		
		// ball 중 6개의 공을 lotto에 복사
		for(int i=0;i<6;i++) {
			lotto[i] = ball[i];
		}
		
		// 번호입력
		for(int i=0;i<6;i++) {
			System.out.printf("%d 번째 번호를 입력하세요. :  \n", i+1);
			input[i] = scan.nextInt();
		}
		
		// 5. 입력 번호와 로또 번호 대조
		for(int i=0;i<6;i++) {   						// 로또 번호에서 하나 가져옴
			loop:for(int j=0;j<6;j++) {					// 내가 적어낸 번호랑 비교
				if(input[i] == lotto[j]) {
					answer[count] = input[i];
					count++;  // 보다 더 빠르게 동작하기 위함
					break loop;
				}
			}
		}
		
		// 6. 출력
		System.out.println("[ 로또번호 확인 ]");
		System.out.println("----------------------");
		System.out.printf("로또번호 : %s\n", Arrays.toString(lotto));
		System.out.printf("입력번호 : %s\n", Arrays.toString(input));
		System.out.printf("맞춘개수 : %d\n", count);
		System.out.print("맞춘 번호 : ");
		for(int i=0;i<count;i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println();
		
		
		
		
		// 똥
//		int[] num = new int[5];
//		num[0] = 1;
//		num[1] = 2;
//		num[2] = 3;
//		num[3] = 4;
//		num[4] = 5;
//		
//		System.out.println(num);	// 주소값
//		System.out.println(num[0]); // 변수값
		
		
//		int[] num2 = {1, 2, 3, 4, 5};
//		
//		int[] num3 = new int[5];
//		for(int i=0;i<5;i++) {
//			num3[i] = i+1;
//		}
		
		
	}

}
