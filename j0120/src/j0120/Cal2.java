package j0120;

import java.util.Scanner;

public class Cal2 {
	
	String[] strPrint() {
		Scanner scan = new Scanner(System.in);
		// 배열에 이름 적고 넘기기
		String[] input = new String[3];
		
		for(int s=0;s<input.length;s++) {
			System.out.print("이름을 입력하세요. >> ");
			input[s] = scan.next();
		}
		return input;
//		System.out.print("이름을 입력하세요. >> ");
//		name = scan.next();
//		return name;
	}
	
	
	
	
	
}
