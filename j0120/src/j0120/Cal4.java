package j0120;

import java.util.Arrays;
import java.util.Scanner;

public class Cal4 {

	void input(String[] name, int[] kor) {
		Scanner scan = new Scanner(System.in);
		// 이름 3명, 국어점수 3개
		for(int i=0;i<3;i++) {
			System.out.print("이름을 입력. >>");
			name[i] = scan.next();
			System.out.printf("%s의 국어 점수를 입력. >> ", name[i]);
			kor[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(kor));
		return ;
	}
	
}
