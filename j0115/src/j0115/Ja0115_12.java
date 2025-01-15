package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
////////////////////////////////////////////////////////////////////		
//		// 로또번호입력을 3개 받아 출력
//		int[] input = new int[3];
//		
//		// 입력
//		for(int i=0;i<3;i++) {
//			System.out.print(i+1+"번째 번호 입력.>>");
//			input[i] = scan.nextInt();
//		}
//		
//		// 출력
//		System.out.print("번호 : ");
//		for(int i=0;i<input.length;i++) {
//			System.out.printf(input[i]+" ");
//		}
//		//또는
//		System.out.println();
//		System.out.println(Arrays.toString(input));
////////////////////////////////////////////////////////////////////		
		
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		// 국어, 영어, 수학, 합계 3명 학생 성적 입력
		String[] name = new String[3];
		int[][] score = new int[3][4];
		double[] avg = new double[3];
		// 성적 입력받아 출력
		for(int i=0;i<score.length;i++) {
			System.out.println("이름을 입력하세요.");
			name[i] = scan.next();
			

			int total = 0;
			for(int j=0;j<score[i].length-1;j++) {
				System.out.printf("[%] 점수를 입력하세요. >> ",title[j+1]);
				score[i][j] = scan.nextInt();
				total += score[i][j];
				if(j==2) {
					score[i][j+1] = total;
					avg[i] = total/3.0;
				}
				
			}
		}
		// 출력
		System.out.println("------------------------------------");
		for(int i=0;i<score.length;i++) {
			System.out.println(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(avg[i]+"\t");
		}
		
		
		
	}

}
