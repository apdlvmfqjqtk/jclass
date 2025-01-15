package j0115;

import java.util.Scanner;

public class Ja0115_02 {

	public static void main(String[] args) {
		// 5개의 숫자를 입력받아, 5개를 저장하고, 5개의 값을 출력하고 합계를 출력
		Scanner scan = new Scanner(System.in);
		int[] number = new int[5];
		int sum = 0;
		for(int i=0;i<number.length;i++) {
			System.out.printf("%d 번째 숫자를 입력하세요. \n", i+1);
			number[i] = scan.nextInt();
			sum += number[i];
		}
		// 합계출력
		System.out.println("합계" + sum);
			
		
	}
	
}
