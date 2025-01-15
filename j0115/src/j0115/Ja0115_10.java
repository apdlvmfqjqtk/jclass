package j0115;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ja0115_10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] ball = new String[45];  // 번호 45개
		// 1-45 저장
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1+"";  // 뒤에 ""만 넣어도 문자 타입으로 바뀜
		}
		
		int chk = 0; 
		int[] marklist = new int[6];
		
		ltmark:while(true) {
			if(chk == 6) {
				break ltmark;
			}
			System.out.println("[ 로또맞추기 ]");
			for(int i=0;i<ball.length;i++) {
				if(i%5==0) {
					System.out.println();
				}
				System.out.print(ball[i]+"\t");
			}
			
			System.out.println();
			System.out.printf("원하는 번호를 입력하세요. (%d번째)>> ",chk+1);
			int input = scan.nextInt();
			marklist[chk] = input;
			
			// 입력한 번호 5 -> 5번짜리 X를 입력
			ball[input-1] = "X";
			chk++;
			
		}
		
		// 입력 번호가 모두 출력하도록 설정
		System.out.println("번호 : " + Arrays.toString(marklist));
		
		
		
		
//		int[] num = { 1, 9, 3, 8, 5, 2, 7 };
//		Integer[] num2 = { 1, 9, 3, 8, 5, 2, 7 };
//		System.out.println(Arrays.toString(num));
//		
//		// 순차정렬
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));
//		
//		// 역순정렬
//		Arrays.sort(num2,Collections.reverseOrder());
//		System.out.println(Arrays.toString(num2));

	}

}
