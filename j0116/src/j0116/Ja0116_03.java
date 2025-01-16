package j0116;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0116_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		// 내 돈
		int money = 0;
		// 당첨금 따불
		int dcnt = 1;
		int ddouble = 1;
		int x=0;
		int y=0;
		
		// 5,5 배열 생성해서 출력
		String[][] arr = new String[5][5];
		int[] num = {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		// 섞기
		int temp = 0;
		for(int i=0;i<300;i++) {
			int ran = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[ran];
			num[ran] = temp;
		}
//		System.out.println(Arrays.toString(num));
		
		
		// 섞은거 넣기
		String[][] arr2 = new String[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr2[i][j] = num[5*i + j]+"";
			}
		}
		
//		System.out.println("                [ 번호 출력 ] ");
//		System.out.println("--------------------------------------------");
//		System.out.printf("좌표 |\t0\t1\t2\t3\t4\t \n");
//		System.out.println("--------------------------------------------");
//		for(int i=0;i<arr2.length;i++) {
//			System.out.printf("%d   |\t", i);
//			for(int j=0;j<arr2[i].length;j++) {
//				System.out.printf("%s\t", arr2[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println("--------------------------------------------");
		
		
		
		// 뽑기 입력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = "뽑기";
			}
		}
		
		int no = 0;
		lotto:while(no < 10) {
			
			// 뽑기 출력
			System.out.println("                [ 뽑기 게임 ] ");
			System.out.println("--------------------------------------------");
			System.out.printf("좌표 |\t0\t1\t2\t3\t4\t \n");
			System.out.println("--------------------------------------------");
			for(int i=0;i<arr.length;i++) {
				System.out.printf("%d   |\t", i);
				for(int j=0;j<arr[i].length;j++) {
					System.out.printf("%s\t",arr[i][j]);
				}
				System.out.println();
			}
			
			
			
			while(true) {
				// 좌표 입력
				System.out.print(" (행) X좌표를 입력하세요. (-1 입력시 종료) >>");
				x = scan.nextInt();
				if(x == -1) {
					break lotto;
				}
				System.out.print(" (열) Y좌표를 입력하세요. >>");
				y = scan.nextInt();
				
				if(x>=0 && x<=4 && y>=0 && y<=4 ) {
					break;
				}else {
					System.out.println("다시 입력해주세요.");
				}
			}
			
			System.out.printf("입력 좌표 : [%d,%d]\n",x,y);
			if(arr2[x][y].equals("1")) {
				arr[x][y] = "당첨!";
				if(dcnt > 1) {
					money *= ddouble;
					money += 100000000;
					dcnt *= 2;
				}else {
					money += 100000000;
				}
				ddouble *= 2;
			}else {
				arr[x][y] = "꽝!";
				money -= 100000000;
			}
			System.out.printf("결과 : %s \n",arr[x][y]);
			System.out.printf("너 돈: %d \n",money);
			System.out.printf("당첨횟수: %d \n",dcnt);
			
			no++;
		}
		
		System.out.println("프로그램 종료.");
		
	
		
		
	}
	
}
