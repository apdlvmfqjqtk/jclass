package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_03 {

	public static void main(String[] args) {
		// 1-5까지 랜덤숫자 생성해
		// 5번 입력을 받아 몇 번 맞췄는지 개수를 출력
		// 입력했던 숫자도 모두 출력
		
		// 랜덤숫자 : x
		// 정답횟수 : y
		// 입력숫자 : a, b, c, d, e
		
		Scanner scan = new Scanner(System.in);
		int[] Try = new int[5];
		int Count = 0;
		int ran = (int)(Math.random()*5)+1;
		for(int i=0;i<Try.length;i++) {
			System.out.printf("%d 번째 시도입니다. 숫자를 입력하세요. \n", i+1);
			int trynum = scan.nextInt();
			Try[i] = trynum;
			if(ran == trynum) {
				Count++;
				System.out.println("정답입니다.");
			}else {
				System.out.println("오답입니다.");
			}
		}
		System.out.println("랜덤 숫자 : " + ran);
		System.out.println("정답 횟수 : " + Count);
		
		System.out.printf("입력 숫자 : ");
		for(int i=0;i<Try.length;i++) {
			System.out.printf("%d,", Try[i]);
		}
		//또는
		System.out.printf("입력 숫자: %s \n", Arrays.toString(Try));
	}

}
