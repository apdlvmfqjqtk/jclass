package j0116;

import java.util.Scanner;

public class Ja0116_06 {

	public static void main(String[] args) {
		//1. 변수선언
		//2. 화면구현
		//3. 번호선택
		//4. 학생성적입력
		//5. 학생성적출력
		//6. 종료
		// 번호 이름 국 영 수 합 평 
		
		
		int count = 0;
		int[] no = new int[10];
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int menu = 0; 
		Scanner scan = new Scanner(System.in);
		String[] title = {"번호", "이름", "국어", "영어", "수학", "합계", "평균"};
		int temp = 0, srcNo = 0, choice = 0;
		
		
		//메인메뉴
		main:while(true) {
			
			// 시작 메뉴
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("[ 1. 성적 입력 ]");
			System.out.println("[ 2. 성적 출력 ]");
			System.out.println("[ 0. 프로그램 종료 ]");
			System.out.println("------------------");
			System.out.printf("chose one. >>");
			menu = scan.nextInt();
			
			switch(menu) {	
			case 1:
				System.out.println("[ 1. 성적 입력 ]");
				int i = count;
				while(i<10) {
					System.out.printf("[%d 번째 학생]", count+1);
					no[i] = count+1;
					System.out.println("이름을 입력(0. 이전 페이지) >>");
					name[i] = scan.next();
					// 0이면 종료
					if(name[i].equals("0")) {
						break;
					}
					//성적입력
					int total = 0;
					for(int n=0;n<3;n++) {
						System.out.printf("%s 성적을 입력하세요. >> ",title[n+2]);
						score[i][n] = scan.nextInt();
						total += score[i][n];
					}// for 성적입력
					score[i][3] += total;
					avg[i] = total/3.0;
					System.out.printf("%d번째 학생 작성완료 \n", count+1);
					i++;
					count ++;
				}// 성적입력 while
				break;		
			
			case 2:
				System.out.println("[ 2. 성적 출력 ]");
				System.out.println("학생성적");
				System.out.println("----------");
				for(int j=0;j<count;j++) {
					System.out.printf("%s \t",title[j]);
				}
				System.out.println();
				System.out.println("----------");
				for(int j=0;j<count;j++) {
					System.out.printf("%d \t",no[j]);
					System.out.printf("%s \t",name[j]);
					for(int g=0;g<4;g++) {
						System.out.printf("%d\t", score[j][g]);
					}
					System.out.printf("%.2f \n",avg[j]);
				}
				System.out.println();
				break;
			case 3:
				System.out.println("[ 3.학생성적 수정 ]");
				
				// 수정하려는 학생 검색
				System.out.println("수정하려는 학생 이름을 검색 >>");
				String srcName = scan.next();
				
				// 이름 배열
				temp = 0;
				srcNo = 0;
				for(int j=0;j<name.length;j++) {
					if(srcName.equals(name[j])) {
						srcNo = j;
						temp = 1;
					}
				}
				
				// 검색한 이름이 없다면
				if(temp == 0) {
					System.out.println("검색한 학생이 없습니다.");
				//있다면	
				}else {
					System.out.printf("%s학생 성적수정 \n", srcName);
					System.out.println("1. 국어점수 수정");
					System.out.println("2. 영어점수 수정");
					System.out.println("3. 수학점수 수정");
					System.out.println("수정하려는 번호를 입력하세요.");
					choice = scan.nextInt();
					
					// 수정하려는 성적 따라 정보 변경 switch문 생성
					switch(choice) {
					case 1 :
						System.out.println("국어점수 수정");
						System.out.printf("현재 점수는 %d점 입니다.", score[srcNo][0]);
						System.out.printf("변경하려는 점수를 입력해주세요. >>");
						score[srcNo][0] = scan.nextInt();
						break;
					case 2 :
						System.out.println("영어점수 수정");
						System.out.printf("현재 점수는 %d점 입니다.", score[srcNo][1]);
						System.out.printf("변경하려는 점수를 입력해주세요. >>");
						score[srcNo][1] = scan.nextInt();
						break;
					case 3 :
						System.out.println("수학점수 수정");
						System.out.printf("현재 점수는 %d점 입니다.", score[srcNo][2]);
						System.out.printf("변경하려는 점수를 입력해주세요. >>");
						score[srcNo][2] = scan.nextInt();
						break;
					}
					// 합계
					score[srcNo][3] = score[srcNo][0] + score[srcNo][1] + score[srcNo][2]; 
					// 평균
					avg[srcNo] = score[srcNo][3]/3.0;
				}
				break;
			case 4:
//				System.out.println("[ 3.학생등수 정렬 ]");
//				for(int j=0;j<count;j++) {
//					rankC = 1;
//					for(int k=0;k<count;k++) {
//						if(score[j][3] <)
//					}
//				}
//				break;
			default:
				System.out.println("프로그램 종료.");
				break;
			}// switch menu
			
		}// while main
 	
		
		
	}// main
}// class
