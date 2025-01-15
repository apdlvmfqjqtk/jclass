package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_05 {
	
	public static void main(String[] args) {
		// 이름, 국어 점수 - 5 명 학생의 국어 점수 입력
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] kor = new int[3];				 // 초기화 없이 사용 시 에러
		int[] eng = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		// 이름과 국, 영 입력받아 합계와 평균 출력, 평균은 소수점 3번째 자리까지 출력
		
		for(int i=0;i<name.length;i++) {
			System.out.printf("%d번째 이름을 입력하세요. \n", i+1);
			name[i] = scan.next();
			System.out.printf("%d번째 국어 점수를 입력하세요.\n", i+1);
			kor[i] = scan.nextInt();
			System.out.printf("%d번째 영어 점수를 입력하세요.\n", i+1);
			eng[i] = scan.nextInt();
			total[i] = kor[i]+eng[i];
			avg[i] = total[i]/2.0;
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(total));
		System.out.print("평균 : ");
		for(int i=0;i<3;i++) {
			System.out.printf("%.3f \t", avg[i]);
		}
		
		
	}

}
