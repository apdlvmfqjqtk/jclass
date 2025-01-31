package stuproject;

public class Stu {
	static int count=0;
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	
	{this.no = ++count;}
	Stu(){super();}
	
	//성적처리 시 사용할 생성자(합, 평균 출력)
	Stu(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3.0;
	}
	
	//파일 읽어서 ArrayList<Stu>에 저장 시 사용할 생성자
	Stu(int no, String name, int kor, int eng, int math, int total, double avg, int rank){
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.rank = rank;
	}
	
	
	//getset
	// Getter
	public int getNo() {return no;}
	public String getName() {return name;}
	public int getKor() {return kor;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	public int getTotal() {return total;}
	public double getAvg() {return avg;}
	public int getRank() {return rank;}

	// Setter
	public void setNo(int no) {this.no = no;}
	public void setName(String name) {this.name = name;}
	public void setKor(int kor) {this.kor = kor;}
	public void setEng(int eng) {this.eng = eng;}
	public void setMath(int math) {this.math = math;}
	public void setTotal(int total) {this.total = total;}
	public void setAvg(double avg) {this.avg = avg;}
	public void setRank(int rank) {this.rank = rank;}
	
}