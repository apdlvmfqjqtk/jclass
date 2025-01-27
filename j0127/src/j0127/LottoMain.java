package j0127;

import java.util.Arrays;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		
		// 1. ball 객체
		// 2. ball_deck 객체
		// - ball 45개 생성, ball 숫자 입력, ball 섞기
		// - 6개 로또번호 추출, 6개 숫자 입력, 로또번호와 입력번호 비교
		// - 출력화면이 있음
		// 3. main에서 로또 프로그램 생성해서 6개 숫자 입력, 로또 번호와 비교해서 몇 개 맞췄는지 확인
		
		// 공45개, 로또번호 6개, 작성번호 6개, 맞춘번호(최대)6개
		int[] ball = new int[45];
		int[] lotton = new int[6];
		int[] inputn = new int[6];
		int[] answer = new int[6];
		
		// 공생성
		for(int i=0;i<45;i++) {
			ball[i] = i+1;
		}
		
		
		//공섞기
		int temp = 0;
		int ranN = 0;
		for(int r=0;r<300;r++) {
			ranN = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[ranN];
			ball[ranN] = temp;
		}
		
		// 로또 번호 생성
		for(int i=0;i<6;i++) {
			lotton[i] = ball[i];
		}
		
		
		Scanner scan = new Scanner(System.in);
		
		
		// 수 적기
		for(int i=0;i<6;i++) {
			System.out.printf("%d번째 숫자를 입력 >>", i+1);
			inputn[i] = scan.nextInt();
		}
		System.out.println("적은 숫자. : " + Arrays.toString(inputn));
		
		
		// 수 대조하기
		int cnt = 0;
		for(int i=0;i<6;i++){
			for(int y=0;y<6;y++) {
				if(lotton[i]==inputn[y]) {
					answer[cnt] = inputn[y];
					cnt++;
					break;
				}
			}
		}
		
		System.out.println("==========================");
		//결과 출력하기
		for(int i=0;i<45;i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();
		System.out.println("==========================");
		
		for(int g=0;g<6;g++) {
			System.out.print(lotton[g] + " ");
		}
		System.out.println();
		System.out.println("==========================");
		for(int g=0;g<6;g++) {
			System.out.print(answer[g] + " ");
		}
		
		
		
		
		
	}//main
}//class
