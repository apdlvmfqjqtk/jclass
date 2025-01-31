package stuproject;

import java.util.Scanner;

public class StuMain {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck sd = new StuDeck();
		int choice;
		
		// 메인메뉴 
		loop:while(true) {
			System.out.println("-------------------------");
			System.out.println("   [ 학생성적프로그램 ]");
			System.out.println("-------------------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적검색");
			System.out.println("4. 학생성적수정");
			System.out.println("5. 학생성적삭제");
			System.out.println("6. 학생등수정렬");
			System.out.println("7. 학생이름정렬");
			System.out.println("8. 등수처리");
			System.out.println("9. 파일저장");
			System.out.println("10. 저장된 파일 불러오기");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				sd.gradeInput();
				break;
			case 2:
				sd.gradeOutput();
				break;
			case 3:
				sd.gradeSearch();
				break;
			case 4:
				sd.gradeEdit();
				break;
			case 5:
				sd.gradeDelete();
				break;
			case 6:
				sd.gradeLineup();
				break;
			case 7:
				sd.nameLineup();
				break;
			case 8:
				sd.rankLineup();
				break;
			case 9:
				sd.fileSave();
				break;
			case 10:
				sd.fileLoad();
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop; // loop 벗어나서 프로그램 종료
			}
		}
		
		
	}//main
}//class