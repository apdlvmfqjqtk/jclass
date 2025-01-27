package j0124;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class StuDeck {
	
	
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Stu> list = new ArrayList<Stu>();
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"};
	int no = 0, kor = 0, eng = 0, math = 0, total = 0, rank = 0;
	String name = "";
	double avg = 0;
	int choice = 0, temp = 0, rankC = 0;  // 번호선택, 검색확인, 등수 확인
	
	//학생성적 입력
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
			eng = scan.nextInt();
			System.err.printf("수학 점수를 입력하세요.\n");
			math = scan.nextInt();
			
			total = kor+eng+math;
			avg = total/3.0;
			rank = 0;
			
			
			
			//list 저장
			list.add(new Stu(name, kor, eng, math));
			System.out.printf("%s 학생이 저장됐습니다. \n", name);
		}// while
	}//input
	
	
	//list 출력
	void listPrint() {
		System.out.println("                     [ 학생성적 출력 ]");
		System.out.println("-------------------------------------------");
		System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t %s\t %s \n",
				title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			System.err.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f\t %d \n",
					s.getNo(), s.getName(), s.getKor(), s.getEng(),
					s.getMath(), s.getTotal(), s.getAvg(), s.getRank() );
		}
	}//listPrint
	
	void nameSrc() {
		System.out.println("[ 학생성적 검색 ]");
		System.out.println("찾으려는 이름을 입력하세요.");
		String name = scan.next();
		
		int src = 0;
		int temp = 0;
		for(int i=0;i<list.size();i++) {
			Stu s = (Stu)list.get(i);
			if(name.equals(s.getName())) {
				src = i;
				temp = 1;
				
				System.out.printf("%s학생 성적 입니다. \n",name);
				System.out.println("                     [ 학생성적 출력 ]");
				System.out.println("-------------------------------------------");
				System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t %s\t %s \n",
						title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
				System.err.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f\t %d \n",
						s.getNo(), s.getName(), s.getKor(), s.getEng(),
						s.getMath(), s.getTotal(), s.getAvg(), s.getRank() );
			}
		}	
			if(temp==0){
				System.out.println("찾는 학생이 없습니다. 다시 검색해 주세요");
			}
	}
	
	void infoUp() {
		System.out.println("  [ 학생성적 수정 ]");
		System.out.println("찾으려는 이름을 입력하세요.");
		String name = scan.next();
		int src = 0;
		int temp = 0;
		for(int i=0;i<list.size();i++) {
			Stu s = (Stu)list.get(i);
			if(name.equals(s.getName())) {
				src = i;
				temp = 1;
			}
		}
				
		if(temp==1){
			Stu s = (Stu)list.get(src);
			System.out.printf("%s학생 성적 입니다. \n",name);
			System.out.printf("                      [ %s학생 성적 ] \n", name);
			System.out.println("-------------------------------------------------------------");
			System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t %s\t %s \n",
					title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
			System.err.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f\t %d \n",
					s.getNo(), s.getName(), s.getKor(), s.getEng(),
					s.getMath(), s.getTotal(), s.getAvg(), s.getRank() );
			
			//점수 수정
			int choice = 0;
			System.out.println();
			System.out.println("			1. 국어 점수 수정");
			System.out.println("			2. 영어 점수 수정");
			System.out.println("			3. 수학 점수 수정");
			System.out.println("-------------------------------------------------------------");
			System.out.println("		원하는 번호를 입력해주세요.(0번은 뒤로가기)");
			choice  = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("변경할 국어 점수를 입력해주세요.");
				s.setKor(scan.nextInt());
				s.setTotal(s.getKor()+s.getEng()+s.getMath());
				s.setAvg(s.getTotal()/3.0);
				break;
			case 2:
				System.out.println("변경할 영어 점수를 입력해주세요.");
				s.setEng(scan.nextInt());
				s.setTotal(s.getKor()+s.getEng()+s.getMath());
				s.setAvg(s.getTotal()/3.0);
				break;
			case 3:
				System.out.println("변경할 수학 점수를 입력해주세요.");
				s.setMath(scan.nextInt());
				s.setTotal(s.getKor()+s.getEng()+s.getMath());
				s.setAvg(s.getTotal()/3.0);
				break;
			default:
				System.out.println("[ 뒤로가기 ]");
				break;
			}// switch 문
		
		
		}else {
			System.out.println("찾는 학생이 없습니다. 다시 검색해 주세요");
		}
		
	}
	
	
	
	// 파일 읽어오기
	void fileBoard() throws Exception{
		// 파일 읽어오기
		FileReader fr = new FileReader("c:/save/studata.txt");
		BufferedReader br = new BufferedReader(fr);
		int no = 0, kor = 0, eng = 0, math = 0, total = 0, rank = 0;
		String name = "";
		double avg = 0;
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			String[] str = line.split(",");
			no = Integer.parseInt(str[0]);
			name = str[1];
			kor = Integer.parseInt(str[2]);
			eng = Integer.parseInt(str[3]);
			math = Integer.parseInt(str[4]);
			total = Integer.parseInt(str[5]);
			avg = Double.parseDouble(str[6]);
			rank = Integer.parseInt(str[7]);
			list.add(new Stu(no,name,kor,eng,math,total,avg,rank));
			//no,name,kor,eng,math,total,avg,rank
		}
		br.close();
		fr.close();
	}//fileBoard
	
	// 성적 삭제하기
	void FileDelete() {
		System.out.println("[ 성적 삭제하기 ]");
		System.out.println("삭제하려는 학생 이름을 입력해주세요.");
		
		System.out.println("찾으려는 이름을 입력하세요.");
		String name = scan.next();
		int src = 0;
		int temp = 0;
		for(int i=0;i<list.size();i++) {
			Stu s = (Stu)list.get(i);
			if(name.equals(s.getName())) {
				src = i;
				temp = 1;
			}
		}
				
		if(temp==1){
			Stu s = (Stu)list.get(src);
			System.out.printf("%s학생 성적 입니다. \n",name);
			System.out.printf("                      [ %s학생 성적 ] \n", name);
			System.out.println("-------------------------------------------------------------");
			System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t %s\t %s \n",
					title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
			System.err.printf("%d\t %s\t %d\t %d\t %d\t %d\t %.2f\t %d \n",
					s.getNo(), s.getName(), s.getKor(), s.getEng(),
					s.getMath(), s.getTotal(), s.getAvg(), s.getRank() );
			System.out.println("-------------------------------------------------------------");
			
			System.out.println("성적을 삭제하시겠습니까? 맞으면 1, 아니면 0을 입력해 주십시오. >>");
			choice = scan.nextInt();
			if(choice == 1) {
				list.remove(s);
				System.out.println("성적 삭제가 완료됐습니다.");
			}else {
				System.out.println("성적 삭제가 취소됐습니다.");
			}
		}else {
			System.out.println("찾는 학생이 없습니다. 다시 검색해 주세요.");
		}
	}//FileDelete
	
	void nameLineUp() {
		System.out.println("[이름순으로 정렬]");
		System.out.println("1. 순차 정렬");
		System.out.println("2. 역순 정렬");
		System.out.println("0. 정렬 취소");
		System.out.println("번호를 입력해 주세요.");
		choice = scan.nextInt();
		if(choice==0) {
			System.out.println("정렬을 취소하셨습니다.");
			return;
		}
		list.sort(new Comparator<Stu>() {
			@Override
			public int compare(Stu s1, Stu s2) {
				if(choice==1) {
					return s1.getName().compareTo(s2.getName()); // 순차
				}else{
					return s2.getName().compareTo(s1.getName()); // 역순
				}
			}
		});
		System.out.println("이름 정렬이 완료되었습니다.");
	}// nameLineUp
	
	// 성적 정렬
	void gradeLineUp() {
		System.out.println("[성적순으로 정렬]");
		System.out.println("1. 국어 정렬");
		System.out.println("2. 영어 정렬");
		System.out.println("3. 수학 정렬");
		System.out.println("0. 정렬 취소");
		System.out.println("번호를 입력해 주세요.");
		choice = scan.nextInt();
		if(choice==0) {	System.out.println("정렬을 취소하셨습니다."); return; }
		switch(choice) {
		case 1:
			grade_sub(1);
			break;
		case 2:
			grade_sub(2);
			break;
		case 3:
			grade_sub(3);
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}// switch

		
	}
	
	//성적 개별 정렬 처리
	void grade_sub(int gno) {
		System.out.printf("[%s성적 정렬] \n",(gno==1 ? "국어" : gno==2 ? "영어" : "수학"));
		System.out.println("1. 순차 정렬");
		System.out.println("2. 역순 정렬");
		System.out.println("0. 정렬 취소");
		System.out.println("번호를 입력해 주세요.");
		choice = scan.nextInt();
		if(choice==0) {
			System.out.println("정렬을 취소하셨습니다.");
			return;
		}
		list.sort(new Comparator<Stu>() {
			@Override
			public int compare(Stu s1, Stu s2) {
				// 순차정렬이라면
					int result = 0;
					switch(gno) {
					case 1:
						result = s1.getKor() - s2.getKor();
						break;
					case 2:
						result = s1.getEng() - s2.getEng();
						break;
					case 3:
						result = s1.getMath() - s2.getMath();
						break;
					}
					
					if(choice==1) {
						return result;
					}else {
						return -result;
					}
			}
		});//list.sort
		System.out.println("성적 정렬이 완료되었습니다.");
	}// grade_sub
	
	
	void rankUp() {
		System.out.println("[등수 처리 입니다.]");
		for(int i=0;i<list.size();i++) {
			int rank = 1;
			for(int j=0;j<list.size();j++) {
				if(list.get(i).getTotal() < list.get(j).getTotal()) {
					rank++;
				}
			}
			list.get(i).setRank(rank);
		}
		System.out.println("등수 처리가 완료됐습니다.");
	}// rankUp
	
	void fileSave() {
		
		//FileOutputStream
		try {
			// 폴더확인 및 폴더 생성
			String folder = "c:/save4";
			File f = new File(folder);
			if(!f.exists()) {
				f.mkdirs(); //폴더생성
				System.out.println("폴더가 생성되었습니다.");
			}
			
			//파일 생성
			File file = new File(folder+"/ccc.txt");
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("파일이 생성되었습니다.");
			}
			
			// 글자저장 - FileOutputSteam
			FileOutputStream fos = new FileOutputStream(folder+"/Stuinfo.txt");
			String str = "";
			for(int i=0;i<list.size();i++) {
				Stu s = list.get(i);
				str += s.getNo()+","+s.getName()+","+s.getKor()+","+s.getEng()+","+s.getMath()+","+s.getTotal()+","+s.getAvg()+","+s.getRank()+"\n";
			}
			//String을 byte 단위로 분리를 해야 함.
			byte[] bytes = str.getBytes(); //byte단위로 분리
			for(byte b:bytes) {
				fos.write(b);
			}
			fos.close();
		} catch (Exception e) {e.printStackTrace();}
		
		System.out.println("프로그램 종료");
		
	}

	
}//main