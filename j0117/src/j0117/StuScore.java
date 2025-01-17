package j0117;

public class StuScore {
	int no;
	String name;
	int kor;
	int eng;
	int total;
	double avg;
	
	void cal_total() {
		total = kor+eng;
		System.out.println(total);
	}
	
	void cal_avg() {
		avg = (kor+eng)/2.0;
	}
	
	
}
