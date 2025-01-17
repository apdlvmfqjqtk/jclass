package j0117;

public class Ja0117_02 {

	public static void main(String[] args) {
		// 1명 학생 성적을 입력
		// 객체 사용 방식
		// 데이터 대입에서는 차이가 없지만 데이터 전달할 때는 s1만 보내주면 됨으로 매우 편리
		// 여기서 더 축약도가능
		
		StuScore s1 = new StuScore();
		s1.no = 1;
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 100;
		s1.cal_total();
		s1.cal_avg();
		
		StuScore s2 = new StuScore();
		s2.no = 2;
		s2.name = "유관순";
		s2.kor = 100;
		s2.eng = 100;
		s2.cal_total();
		s2.cal_avg();
		
		// 이순신, 77, 89
		
		StuScore s3 = new StuScore();
		s3.no = 3;
		s3.name = "이순신";
		s3.kor = 77;
		s3.eng = 89;
		s3.cal_total();
		s3.cal_avg();
		
		System.out.println(s1.no);
		System.out.println(s1.name);
		System.out.println(s1.kor);
		System.out.println(s1.eng);
		System.out.println(s1.total);
		System.out.println(s1.avg);
		
		System.out.println(s2.no);
		System.out.println(s2.name);
		System.out.println(s2.kor);
		System.out.println(s2.eng);
		System.out.println(s2.total);
		System.out.println(s2.avg);
		
		System.out.println(s3.no);
		System.out.println(s3.name);
		System.out.println(s3.kor);
		System.out.println(s3.eng);
		System.out.println(s3.total);
		System.out.println(s3.avg);
		
		
		
		
		// 배열 배우기 전 방식
//		int no = 1;
//		String name = "홍길동";
//		int kor = 100;
//		int eng = 100;
//		int total = kor+eng;
//		double avg = (kor+eng)/2.0;
//		
//		int no2 = 2;
//		String name2 = "유관순";
//		int kor2 = 90;
//		int eng2 = 90;
//		int total2 = kor+eng;
//		double avg2 = (kor+eng)/2.0;
		
		// 이 이상은 배열 사용 int[] no = new int[n]
		
		
		
	}

}
