package j0123;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_Deck {
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int no = 0, kor = 0, eng = 0, math = 0, total = 0, rank = 0;
	String name = "";
	double avg = 0;
	int choice = 0, temp = 0, rankC = 0;  // 번호선택, 검색확인, 등수 확인
	
	// 1. 상단메뉴 메소드
	int main_print() {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 성적 수정");
		System.out.println("4. 성적 삭제");
		System.out.println("5. 등수 처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("-------------------");
		System.out.print("원하는 번호를 입력하세요.>");
		choice = scan.nextInt();
		return choice;
	}
	
	//2. 입력메소드
	void input() {
		System.out.println("[ 학생성적 입력 ]");
		while(true) {
			System.out.printf("[ %d 번째 ] \n",list.size()+1);
			// 번호
			System.out.println("이름을 입력하세요.(0.이전 페이지 이동) : ");
			// 이름
			name = scan.next();
			// 0인지 확인
			if(name.equals("0")){
				break;
			}
			// 국어 영어 수학
			System.err.printf("국어 점수를 입력하세요.\n");
			kor = scan.nextInt();
			System.err.printf("영어 점수를 입력하세요.\n");
			kor = scan.nextInt();
			System.err.printf("수학 점수를 입력하세요.\n");
			kor = scan.nextInt();
			
			//list 저장
			list.add(new Stu(name, kor, eng, math));
			System.out.printf("%s 학생이 저장됐습니다. \n", name);
		}// while
	}//input
	
	//3. 출력메소드
	void output() {
		System.out.println("[ 학생성적 출력]");
		// 입력 내용 출력
		System.out.println("[ 학생성적 ]");
		System.out.println("------------------------------------------------------------");
		for(int j=0;j<title.length;j++) {
			System.out.printf("%s\t", title[j]);
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		for(int j=0;j<list.size();j++) {
//			list.get(0);  // Object 타입이라 형변환 필요
			Stu s = (Stu)list.get(j); 
			System.out.printf("%d \t", s.getNo());
			System.out.printf("%s \t", s.getName());
			System.out.printf("%d \t", s.getKor());
			System.out.printf("%d \t", s.getEng());
			System.out.printf("%d \t", s.getMath());
			System.out.printf("%d \t", s.getTotal());
			System.out.printf("%.2f \t", s.getAvg());
			System.out.printf("%d \t", s.getRank());
			System.out.println();
		}
	}// output
	
	void update() {
		System.out.println("[ 학생성적 수정 ]");
		System.out.println("학생 리스트");
		System.out.println("------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Stu s = (Stu)list.get(i); 
			System.out.printf("%s \t", s.getName());
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		System.out.println("수정하려는 학생 이름을 입력하세요");
		name = scan.next();
		// 검색한 이름 찾기
		
		int srcN = 0;
		for(int o=0;o<list.size();o++) {
			Stu s = (Stu)list.get(o); 
			if(name.equals(s.getName())) {
				srcN = o;   // 이름위치값
				temp = 1;   // 검색결과 있음
			}
		}
		
		if(temp == 0) {
			System.out.println("검색한 학생을 찾지 못했습니다. 다시 입력해주세요.");
		}else {
			System.out.printf("학생 성적 수정 \n", name);
			System.out.println("1. 국어 점수 수정");
			System.out.println("2. 영어 점수 수정");
			System.out.println("3. 수학 점수 수정");
			System.out.println("----------------");
			System.out.println("원하는 번호를 입력해주세요.(0번은 뒤로가기)");
			choice  = scan.nextInt();
			
			Stu s = (Stu)list.get(srcN);
			switch(choice) {
			case 1:
				System.out.println("1. 국어 점수 수정");
				System.out.printf("현재 점수 : %d점", s.getKor());
				System.out.println("변경할 점수를 입력해주세요.");
				s.setKor(scan.nextInt());
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				System.out.println("[ 뒤로가기 ]");
				break;
			}// switch 문
		}
		
		
	}// update 메소드
	
	
}
