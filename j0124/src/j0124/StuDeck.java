package j0124;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;



public class StuDeck {
	
	public class Stu {
	    private int no;
	    private String name;
	    private int kor;
	    private int eng;
	    private int math;
	    private int total;
	    private double avg;
	    private int rank;

	    public Stu(int no, String name, int kor, int eng, int math, int total, double avg, int rank) {
	        this.no = no;
	        this.name = name;
	        this.kor = kor;
	        this.eng = eng;
	        this.math = math;
	        this.total = total;
	        this.avg = avg;
	        this.rank = rank;
	    }
	    
	    
	    
	    public void setNo(int no) {
			this.no = no;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setKor(int kor) {
			this.kor = kor;
		}

		public void setEng(int eng) {
			this.eng = eng;
		}

		public void setMath(int math) {
			this.math = math;
		}

		public void setTotal(int total) {
			this.total = total;
		}

		public void setAvg(double avg) {
			this.avg = avg;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}



		// 게터 메서드 (필요한 만큼 추가)
	    public int getNo() { return no; }
	    public String getName() { return name; }
	    public int getKor() { return kor; }
	    public int getEng() { return eng; }
	    public int getMath() { return math; }
	    public int getTotal() { return total; }
	    public double getAvg() { return avg; }
	    public int getRank() { return rank; }
	}
	
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
			list.add(new Stu(list.size()+1, name, kor, eng, math, total, avg, rank));
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
	
	
	
	

	
}//main