package stuproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuDeck {
	Scanner scan = new Scanner(System.in);
	// Stu 변수로 객체 만들어 담을 list 생성
	ArrayList<Stu> list = new ArrayList<Stu>();
	String[] title = {"번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수"};
	// 성적정보 변수 
	int no = 0, kor = 0, eng = 0, math = 0, total = 0, rank = 0;
	// 이름 변수
	String name = "", fname = "";
	// 평균 변수
	double avg = 0;
	// 번호 선택, 검색 확인, 등수확인, 검색결과 저장 변수
	int choice = 0, temp = 0, rankC = 0, src = 0; 
			
	
	//성적 입력
	public void gradeInput() {
		System.out.println("[ 학생성적 입력 ]");
		while(true) {
			System.out.printf("[%d번째 학생] \n", (list.size()+1) );
			System.out.println("학생 이름을 입력해주세요.(뒤로 돌아가려면 0 입력.) >>");
			name = scan.next();
			
			//0이면 break로 if문 빠져나옴
			if(name.equals("0")) {break;}
			
			//0이 아니면(이름이면) 성적 이러서 입력
			System.out.println("이어서 입력");
			System.out.println("국어 성적을 입력하세요. >>");
			kor = scan.nextInt();
			System.out.println("영어 성적을 입력하세요. >>");
			eng = scan.nextInt();
			System.out.println("수학 성적을 입력하세요. >>");
			math = scan.nextInt();
			
			//Stu list에 저장
			list.add(new Stu(name, kor, eng, math));
			System.out.printf("%s 학생이 저장됐습니다.", name);
		}//while
	}//gradeInput()


	public void gradeOutput() {
		System.err.println("[ 학생성적 출력 ]");
		System.err.println("----------------------------------");
		// 항목 이름 출력
		System.err.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n",
				title[0], title[1], title[2], title[3], 
				title[4], title[5], title[6], title[7] );
		System.err.println("----------------------------------");
		// 항목 내용 출력
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			System.err.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t \n",
					s.getNo(), s.getName(), s.getKor(), s.getEng(),
					s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
		}
		if(list.size() == 0) {
			System.out.println("저장된 학생 데이터가 없습니다.");
		}
		System.err.println("----------------------------------");
	}//gradeOutput()

	
	//학생성적 검색 메소드
	public void gradeSearch() {
		System.out.println("[ 학생성적 검색 ]");
		System.out.println("찾으려는 이름을 검색하세요.");
		name = scan.next();
		
		src = 0;
		temp = 0;
		
		for(int i=0;i<list.size();i++) {
			Stu s = list.get(i);
			if(s.getName().equals(name)) {
				src = i; // 성적 수정, 삭제에 필요한 변수
				temp = 1;
				
				System.out.printf("찾는 학생이 있습니다. %s 학생 성적입니다.\n", name);
				System.err.println("[ 학생성적 출력 ]");
				System.err.println("------------------------------------------------------------");
				// 항목 이름 출력
				System.err.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t\n",
						title[0], title[1], title[2], title[3], 
						title[4], title[5], title[6], title[7] );
				System.err.println("------------------------------------------------------------");
				// 항목 내용 출력
					System.err.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t \n",
							s.getNo(), s.getName(), s.getKor(), s.getEng(),
							s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
				System.err.println("------------------------------------------------------------");
			}
		}
		if(temp == 0) {
			System.out.println("찾는 학생이 없습니다. 다시 검색해 주세요.");
		}
	}//gradeSearch()

	
	public void gradeEdit() {
		System.out.println("[ 학생성적 수정 ]");
		System.out.println("학생 검색 후 수정을 진행합니다.");
		gradeSearch();
		
		//서치값이 없다면 수정 메소드도 종료
		if(temp == 0) {
			System.out.println();
			return;
		}
		
		Stu s = (Stu)list.get(src);
		System.out.println("1. 국어점수 수정");
		System.out.println("2. 영어점수 수정");
		System.out.println("3. 수학점수 수정");
		System.out.println("원하는 번호를 입력해주세요. (0번은 뒤로가기) >>");
		choice = scan.nextInt();
		
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
		case 0:
			System.out.println("[ 뒤로가기 ]");
			break;
		}
	}//gradeEdit()


	//성적삭제
	public void gradeDelete() {
		System.out.println("[ 학생성적 수정 ]");
		System.out.println("학생 검색 후 삭제를 진행합니다.");
		
		gradeSearch();
		Stu s = (Stu)list.get(src);
		
		//서치값이 없다면 삭제 메소드도 종료
		if(temp == 0) {
			System.out.println();
			return;
		}
		
		System.out.println("삭제하려는 성적이 맞으면 1, 아니면 0을 입력해주세요");
		choice = scan.nextInt();
		
		if(choice == 1) {
			list.remove(s);
			System.out.println("성적 삭제가 완료되었습니다.");
		}else {
			System.out.println("성적 삭제가 취소되었습니다.");
		}
	}//gradeDelete() 

	//성적 정렬
	public void gradeLineup() {
		System.out.println("[ 학생 등수 정렬 ]");
		System.out.println("평균 점수를 기준으로 정렬합니다.");
		System.out.println("1. 순차 정렬 (1-100)");
		System.out.println("2. 역순 정렬 (100-1)");
		System.out.println("0. 정렬 취소");
		System.out.println("원하는 번호를 입력해주세요. >>");
		
		choice = scan.nextInt();
		list.sort(new Comparator<Stu>() {
			@Override
			public int compare(Stu s1, Stu s2) {
				switch(choice) {
				case 1:  // 순차
					return Double.compare(s1.getTotal(), s2.getTotal());
				case 2:  //역순
					return Double.compare(s2.getTotal(), s1.getTotal());
				default: // 정렬취소
					System.out.println("정렬 취소");
					return 0;
				}
			}
		});//list.sort
	}//gradeLineup()

	//이름 정렬
	public void nameLineup() {
		System.out.println("[ 학생 이름 정렬 ]");
		System.out.println("이름을 기준으로 정렬합니다.");
		System.out.println("1. 순차 정렬 (ㄱ-ㅎ)");
		System.out.println("2. 역순 정렬 (ㅎ-ㄱ)");
		System.out.println("0. 정렬 취소");
		System.out.println("원하는 번호를 입력해주세요. >>");
		
		choice = scan.nextInt();
		list.sort(new Comparator<Stu>() {
			@Override
			public int compare(Stu s1, Stu s2) {
				switch(choice) {
				case 1:
					return s1.getName().compareTo(s2.getName());
				case 2:
					return s2.getName().compareTo(s1.getName());
				default:
					System.out.println("정렬취소");
					return 0;
				}
			}
		});
	}//nameLineup()

	//등수 정렬
	public void rankLineup() {
		System.out.println("[ 등수 처리를 시작합니다. ]");
		for(int i=0;i<list.size();i++) {
			rankC = 1;
			for(int j=0;j<list.size();j++) {
				if(list.get(i).getTotal() < list.get(j).getTotal()) {
					rankC++;
				}
			}
			list.get(i).setRank(rankC);
		}
		System.out.println("[ 등수 처리가 완료되었습니다. ]");
	}//rankLineup()

	//파일저장
	public void fileSave() {
		try {
			// 폴더 확인 후 폴더가 없을 시 폴더 생성
			String folder = "c:/save5";
			File f = new File(folder);
			if(!f.exists()) {
				f.mkdirs(); //폴더생성
				System.out.println("폴더가 생성되었습니다.");
			}
			
			System.out.println("폴더 저장 경로 : c:/save5/");
			
			//파일 생성
			System.out.println("저장할 이름을 입력해주세요.");
			fname = scan.next();
			File file = new File(folder+"/"+fname+".txt");
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("[ 해당 이름으로 txt 파일 생성 ]");
			}else {
				System.out.println("이미 있는 이름입니다. 다른 이름을 입력해주세요.");
				return;
			}
			
			//생성된 파일에 글자를 저장 - fileOutputSteam
			FileOutputStream fos = new FileOutputStream(folder + "/"+fname+".txt");
			String str = "";
			for(int i=0;i<list.size();i++) {
				Stu s = list.get(i);
				str += s.getNo()+","+s.getName()+","+s.getKor()+","+s.getEng()+","+s.getMath()+","+s.getTotal()+","+s.getAvg()+","+s.getRank() + "\n";   
			}
			byte[] bytes = str.getBytes(); // byte단위로분리
			for(byte b:bytes) {
				fos.write(b);
			}
			fos.close();
		} catch (Exception e) {e.printStackTrace();}
		System.out.println("[ 파일 저장 완료 ]");
	}//fileSave()


	// 파일 읽어오기
	public void fileLoad(){
		//파일읽기
		System.out.println("불러올 파일 이름을 입력하세요. >>");
		fname = scan.next();
		FileReader fr =null;
		BufferedReader br = null;
		try {
			fr = new FileReader("c:/save5/"+fname+".txt");
			br = new BufferedReader(fr);
			while(true) {
				// String line변수는 br의 한 줄 읽은것
				String line = br.readLine();
				// 가져온 line는 (A, B, C, D, E, F, G, H)의 형태인데, 그걸 쉼표 기준으로 SPLIT해서 str배열에 저장
				String[] str = line.split(",");
				no = Integer.parseInt(str[0]);
				name = str[1];
				kor = Integer.parseInt(str[2]);
				eng = Integer.parseInt(str[3]);
				math = Integer.parseInt(str[4]);
				total = Integer.parseInt(str[5]);
				avg = Double.parseDouble(str[6]);
				rank = Integer.parseInt(str[7]);
				list.add(new Stu(no, name, kor, eng, math, total, avg, rank));
			}//while
		} catch (Exception e) {e.printStackTrace();}
		finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}//fileLoad()


	
	
	
	
	
	
}