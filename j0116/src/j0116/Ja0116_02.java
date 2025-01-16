package j0116;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ja0116_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요. ");
		String input = scan.next();
		System.out.println("숫자2를 입력하세요. ");
		String input2 = scan.next();
		
		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		
		System.out.println("입력한 수 더하기 : " + (num+num2));
		
		
//		// 윈도우 프로그램처럼 할수있음 (html 모달창같은 기능)
//		// 그러나 java 프로그램이깔려 있어야 구동이 가능해서 잘 안씀
//		String input = JOptionPane.showInputDialog("1에서 100까지 숫자를 입력하세요.");
//		
//		System.out.println("입력숫자 : " + input);
		
//		int[] num = {1, 2, 3, 4, 5};
//		int[] num2 = new int[6];
//
//		// System.arraycopy(num, a, num2, b, 5); num의 a부터 5개 복사해서 num2의 b부터 붙여넣기
//		System.arraycopy(num, 0, num2, 0, 3);
//		System.out.println(Arrays.toString(num2));
		
		
//		num[3] = 0;
//		System.out.println(Arrays.toString(num));
//		
//		num[5] = 6; // 에러
//		System.out.println(Arrays.toString(num));
//		
//		for(int i=0;i<num.length;i++) {
//			num2[i] = num[i];
//		}
//		num = num2;
//		num2[5] = 6;
//		System.out.println(Arrays.toString(num));
		
		
//		int[][] score = new int[4][6]; //1-24
//		
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				score[i][j] = 6*i + j+1;
//			}
//		}
//		
//		for(int i=0;i<score.length;i++) { 
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		
//		// 2차원 배열
//		int[][] score = new int[5][5];
//		// 1-25 번호 입력
//		for(int i=0;i<score.length;i++) { 
//			for(int j=0;j<score[i].length;j++) {
//				score[i][j] = 5*i + j+1;
//			}
//		}
//		
//		// 출력
//		for(int i=0;i<score.length;i++) { 
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		
		
//		// 1차원 배열
//		int[] num = new int[5];
//		// 번호 입력
//		for(int i=0;i<5;i++) { num[i] = i+1; }
//		
//		// 번호 출력
//		for(int i=0;i<5;i++) { System.out.print(num[i] + " "); }
		
		
		
//		int[] num = new int[5];
//		num[0] = 1;
//		num[1] = 2;
//		num[2] = 3;
//		num[3] = 4;
//		num[4] = 5;
//		
//		int[] num2 = {1, 2};
//		num2 = num;  // num2의 주소값을 num의 주소값으로 변경시킨 셈
//		
//		num[0] = 200;
//		
//		System.out.println(Arrays.toString(num2));
		
		
//		int n = 10;
//		int n2 = 0;
//		
//		n2 = n;
//		n = 100;
//		
//		System.out.println(n);
//		System.out.println(n2);
	
		
	}
	
}
