package j0124;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Stu_main {

	public static void main(String[] args) throws Exception {
		StuDeck stuDeck = new StuDeck();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		//파일 읽어오기
		stuDeck.fileBoard();

		
		loop : while(true) {
				
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 학생성적 입력 ");
			System.out.println("2. 학생성적 출력 ");
			System.out.println("3. 학생성적 수정 ");
			System.out.println("4. 학생성적 삭제 ");
			System.out.println("5. 학생성적 검색 ");
			System.out.println("6. 학생등수 정렬 ");
			System.out.println("7. 학생이름 정렬 ");
			System.out.println("8. 등수처리 ");
			System.out.println("9. 파일저장 ");
			System.out.println("0. 프로그램 종료 ");
			System.out.println("-------------------------");
			System.out.print("번호를 입력해주세요. >> ");
			choice = scan.nextInt();
			switch(choice) {
			case 1: // 학생성적 입력.
				stuDeck.input();
				break;
			case 2: // 학생성적 출력
				stuDeck.listPrint();
				break; 
			case 3: // 성적 수정
				stuDeck.infoUp();
				break;
			case 4: // 성적 삭제
				stuDeck.FileDelete();
				break;
			case 5: // 성적 검색
				stuDeck.nameSrc();
				break;
			case 6: // 성적 정렬
				stuDeck.gradeLineUp();
				break;
			case 7: // 이름 정렬
				stuDeck.nameLineUp();
				break;
			case 8: // 등수처리
				stuDeck.rankUp();
				break;
			case 9: // 파일저장
				stuDeck.fileSave();
				break;
			case 0: // 프로그램 종료
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}
		}//while loop
		
		
		
	}// main
}//class
