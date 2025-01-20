package j0120;

public class Stuscore {
	
	{ // 초기화 블록(생성자의 초기화 블록)
		count++;
		this.no = count;
	}
	
	//1. 기본생성자
	Stuscore(){}
	//2. 매개변수생성자
	Stuscore(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
		
	}
	
	
	
	//학생성적
	static int count; // 클래스변수 - 객체선언 없이 클래스명.변수명
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	void print() {
		System.out.printf("번호: %d, 이름: %s, 국어: %d, 영어: %d, 수학: %d, 합계: %d, 평균: %.2f \n",no,name,kor,eng,math,total,avg);
	}
	
	

}