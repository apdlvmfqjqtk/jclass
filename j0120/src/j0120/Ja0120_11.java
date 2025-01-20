package j0120;

import java.util.Scanner;

public class Ja0120_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Stuscore[] s = new Stuscore[10]; //배열선언
		int no=0,kor=0,eng=0,math=0,total=0,rank=0;
		int[] score = new int[3];
		String name="";
		double avg =0;
//		s[0] = new Stuscore();
		String[] title = {"번호","이름","국어","영어","수학","평균","합계","등수"};
		int choice =0, temp =0, rankC =0,count=0, searchNo=0;; //번호선택, 검색확인, 등수, 학생수 확인, 위치값
		
		
		loop:while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 성적 수정");
			System.out.println("4. 등수 정렬");
			System.out.println("0. 프로그램 종료");
			System.out.println("----------------");
		
			System.out.print("번호를 선택하세요. >>");
			choice = scan.nextInt();
			
			switch (choice) {
				case 1:
					System.out.println("[ 학생성적 입력 ]");
					while(count<10) {
						System.out.printf("[%d번째 학생]\n", count+1);
						// 이름
						System.out.println("이름을 입력하세요.(0.이전 페이지 이동)");
						name = scan.next();
						if(name.equals("0")) {
							break;
						}
						
//						// 국어, 영어, 수학
//						System.out.println("국어점수를 입력하세요");
//						kor = scan.nextInt();
//						System.out.println("영어점수를 입력하세요");
//						eng = scan.nextInt();
//						System.out.println("수학점수를 입력하세요");
//						math = scan.nextInt();
						
						// 국어, 영어, 수학 (for문)
						for(int i=0;i<3;i++) {
							System.out.printf("%s 점수를 입력하세요.",title[i+2]);
							score[i] = scan.nextInt();
						}
						
						// name, kor, eng, math -> no, total, avg
						// s[count] = new Stuscore(name, kor, eng, math);
						s[count] = new Stuscore(name, score[0], score[1], score[2]);
						
						s[count].print();
						System.out.println("학생성적이 저장되었습니다.");

						count++;
					}
					break;
					
				case 2:
					System.out.println("[ 성적 출력 ]");
					System.out.println("[ 학생성적 ]");
					System.out.println("-------------------------------------------------------");
					for(int k=0;k<title.length;k++) {
						System.out.printf("%s \t", title[k]);
					}
					System.out.println();
					System.out.println("-------------------------------------------------------");
					for(int j=0;j<count;j++) {
						System.out.printf("%d \t", s[j].no);
						System.out.printf("%s \t", s[j].name);
						System.out.printf("%d \t",s[j].kor);
						System.out.printf("%d \t",s[j].eng);
						System.out.printf("%d \t",s[j].math);
						System.out.printf("%d \t",s[j].total);
						System.out.printf("%.2f \t",s[j].avg);
						System.out.printf("%d \n",s[j].rank);
					}
					
					System.out.println();
					break;
				case 3:
					System.out.println("[검색]");
					// 
					System.out.println("검색하시오. >>");
					name = scan.next();
					
					for(int i=0;i<count;i++) {
						if(s[i].name.equals(name)) {
							searchNo =i;
							
							temp = 1;
						}
					}
					if(temp == 0) {
						System.out.println("없다");
					}else {
						System.out.printf("%s 학생 성적 수정 \n", name);
						System.out.println("1. 국어 점수 수정");
						System.out.println("2. 영어 점수 수정");
						System.out.println("3. 수학 점수 수정");
						System.out.println("0. 뒤로가기");
						System.out.println("--");
						System.out.println("번호 선택");
						choice = scan.nextInt();
						switch(choice) {
						case 1:
							System.out.println("1. 국어 점수 수정");
							System.out.printf("현재 성적은 %d입니다.",s[searchNo].kor);
							System.out.println("변경 점수를 입력하세요>>");
							s[searchNo].kor = scan.nextInt();
							break;
						case 2:
							System.out.println("2. 영아 점수 수정");
							System.out.printf("현재 성적은 %d입니다.",s[searchNo].eng);
							System.out.println("변경 점수를 입력하세요>>");
							s[searchNo].eng = scan.nextInt();
							break;
						case 3:
							System.out.println("3. 수학 점수 수정");
							System.out.printf("현재 성적은 %d입니다.",s[searchNo].math);
							System.out.println("변경 점수를 입력하세요>>");
							s[searchNo].math = scan.nextInt();
							break;
						}
						s[searchNo].total = s[searchNo].kor + s[searchNo].eng + s[searchNo].math;
						s[searchNo].avg = s[searchNo].total/3.0;
					}
					
					break;
				case 4:
					System.out.println("등수처리");
					for(int g=0;g<count;g++) {
						for(int p=0;p<count;p++) {
							if(s[g].avg < s[p].avg) {
								rankC++;
							}
						}
						s[g].rank = rankC;
					}
					System.out.println("등수처리 완료");
					System.out.println();
					
					break;
				default :
					System.out.println("프로그램종료");
					break loop;
			}
			
			
		}// while
		
		
		
	}// main
}// class
