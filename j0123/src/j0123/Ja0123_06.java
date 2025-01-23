package j0123;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ja0123_06 {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Scanner scan = new Scanner(System.in);
		
		String a = new String("a");
		StringBuffer str = new StringBuffer("aaa");
		System.out.println(a+2+"aaa"+3.14+10.0);
		System.out.println(str.append(2).append("aaa").append(3.14).append(10.0)); // stringbuffer쓰면 이렇게 추가해줘야 함(귀찮음)
		
		
//		// 기존은 이러면 저장공간 10개생겨서 메모리낭비였음
//		String a = "a";
//		for(int i=0;i<10;i++) {
//			a += i;
//		}
		
//		//indexOf
//		String str = "aabbccAABBCCaaddeeffAAaa";
//		int cnt = 0;
//		for(int r=0;r<str.length();r++) {
//			int an = str.indexOf("aa",cnt);
//			if (an <= -1) {
//				System.out.println("끝");
//				break;
//			}
//			System.out.println(an);
//			an++;
//			cnt = an;
//			System.out.println(str.indexOf("aa",r));
			
//		}
//		System.out.println(str.length());
		
		
//		//valueOf
//		int a = 10;
//		double b = 3.14;
//		String .valueOf(a); // 문자열
//		String .valueOf(b); // 문자열
//		String a1 = ""+a;	// 근데 이방법이 더 간단함 
//		String b1 = ""+b;	// 근데 이방법이 더 간단함
//		
//		String str1 = "3.14";
//		String str2 = "100";
		
		
//		String[] arr = {"홍길동임","유관순입니다.","이순신이다","강감찬일까요?","김구입니다","홍길동이노","유관순이당","홍길자이덩","홍황순이다",};
//		// 첫 자 빼고 출력
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i].substring(1,arr[i].length()-1));
//		}
		
		
//		String str = "1조1234567";
//		// 1234만 출력
//		System.out.println(str.substring(2,6));
//		// 끝까지 출력하려면 앞숫자만 입력하면됨
//		System.out.println(str.substring(2));
		
		
//		//length() : 문자의 길이
//		String str = "안녕하세요. 반갑습니다. 홍길동입니다.";
//		System.out.println(str.length());
//		// 10자 이상이면 글자를 다시 입력하세요.
//		while(true) {
//			System.out.print("10자 이내로 글자를 입력하세요. : ");
//			String input = scan.next();
//			if(input.length() > 10) {
//				System.out.println("10자를 넘습니다. 다시 입력해주세요.");
//			}else {
//				System.out.println("10자를 안넘깁니다. 잘하셨습니다.");
//				System.out.println("입력한 글자 : " + input);
//				break;
//			}
//		}
				
		
//		// replace 빈공백 제거로 사용하는 경우
//		String str = "               안녕  하세    요      ";
//		System.out.println(str.replace(" ", ""));
		
		
//		// replace : 문자를 다른 문자로 대체
//		String str = "안녕하세요 홍길동입니다. 성은 홍 입니다.";
//		String input = "김";
//		str.replace("홍", "김");
//		System.out.println(str); // 파이썬처럼 원본 수정은 안됨(원본 바꾸려면 = 넣어야 함)
//		System.out.println(str.replace("홍", "김"));
		
		
//		// trim : 빈공백 제거( 글자 사이 빈공백 제거는 못함 )
//		String str = "               안녕  하세    요      ";
//		System.out.println(str);
//		System.out.println(str.trim());
		
//		// indexOf
//		String str = "안녕하세요. 성은 홍 입니다.";
//		String input = "홍";
//		System.out.println("있는위치 : " + str.indexOf(input));
//		int no = str.indexOf(input);
		
//		// contains : 문자열이 포함돼있는지 검사
//		String[] arr = {"홍길동","유관순","이순신","강감찬","김구","홍길순","홍길자"};
//		String str = "안녕하세요. 성은 홍 입니다.";
//		String input = "홍";
//		
//		//arr 배열에서 홍 있는 이름 출력
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i].contains(input)) {
//				System.out.println(arr[i]);
//			}else {
//				System.out.println("홍 아님");
//			}
//		}
//		if(str.contains(input)) {
//			System.out.println("홍들어감");
//		}else {
//			System.out.println("홍 안들어감");
//		}
		
		
//		String str = "1,홍길동,89,100,93,0,0,0,0";
//		// 학번 : 1
//		// 이름 : 홍길동
//		// 국어 : 89
//		// 영어 : 100
//		// 수학 : 92
//		// 합계 : 290
//		// 평균 : 100
//		// 등수 :  0
//		// 출력
//		String[] inf = str.split(",");
//		int kor = Integer.parseInt(inf[2]);
//		int eng = Integer.parseInt(inf[3]);
//		int math = Integer.parseInt(inf[4]);
//		int total = kor+eng+math;
//		double avg = total/3.0;
//		
//		System.out.printf(" 학번 : %s \n", inf[0]);
//		System.out.printf(" 이름 : %s \n", inf[1]);
//		System.out.printf(" 국어 : %d \n", kor);
//		System.out.printf(" 영어 : %d \n", eng);
//		System.out.printf(" 수학 : %d \n", math);
//		System.out.printf(" 합계 : %d \n", total);
//		System.out.printf(" 평균 : %.4f \n", avg);
//		System.out.printf(" 등수 : %s \n", inf[8]);
		
		
		
//		System.out.println("숫자를 입력하세요. >> 10,9");
//		// 두 수의 합, 곱을 구하시오
//		String input = scan.next();
//		String[] arr = input.split(",");
//		int n1 = Integer.parseInt(arr[0]);
//		int n2 = Integer.parseInt(arr[1]);
//		System.out.printf("합 : %d\n", n1+n2);
//		System.out.println("곱 : " + n1*n2);
		
		
//		//split : 특정 분리자로 분리
//		String str = "100,100,100";
//		String[] arr = str.split(",");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
//		//charAt : 지정된 위치의 문자 반환
//		String str = "abcdef";
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
		
		// equals : 대소문자 구분 비교, equalsIgnoreCase: 대소문자 구분 없이 비교 
//		String str = "abc";
//		String str2 = "aBc";
//		String str3 = "abc";
//		
//		if(str.equalsIgnoreCase(str2)) {
//			System.out.println("같다.");
//		}else {
//			System.out.println("다르다");
//		}
//		if(str.equals(str3)) {
//			System.out.println("같다.");
//		}else {
//			System.out.println("다르다");
//		}
		
//		Point p1 = new Point(3,5);
//		Point p2 = (Point)p1.clone();  // 객체복사
//		Point p3 = new Point(p1);	   // 객체복사
//		
//		//값을 변경
//		p1.x = 10;
//		p2.x = 100;
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		Stu s = new Stu();
//		System.out.println(s);
//		
//		Class s2 = Stu.class;
//		System.out.println(s2.getName());
//		
//		String a = "10";
//		String b = "1";
//		a += b;
//		
//		for(int i=0;i<100;i++) {
//			a += b;
//		}
		
//		String txt = "윤석열 대통령 변호인단은 23일 “공수처의 위법 수사와 불법행위에 대해서는 끝까지 법적 책임을 물을 것임을 엄중히 경고한다”고 밝혔다.\r\n"
//				+ "\r\n"
//				+ "고위공직자범죄수사처가 윤 대통령 사건을 검찰에 넘기며 기소를 요구하자 입장문을 통해 비판의 메시지를 전한 셈이다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “공수처장은 세 번이나 강제구인을 시도하며 대통령에게 사법부를 존중해 달라고 요청했지만, 불법 수사를 자행하던 공수처가 법질서의 존중을 이야기하는 것은 언어도단”이라고 말했다.\r\n"
//				+ "\r\n"
//				+ "이어 “공수처는 수사권이 없음에도 관할권 없는 법원에서 불법 영장을 받아낸 후 수사지휘권 없이 경찰 기동대 수천 명을 동원해 불법 영장 집행을 강행했다”고 주장했다.\r\n"
//				+ "\r\n"
//				+ "또 “55경비단의 공문서를 위조하거나 경호처 관계자로부터 군사시설의 배치 등 기밀 사항을 유출하도록 하는 행위에 공모하는 등 온갖 불법을 저질렀다”고도 했다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “대통령을 체포한 후 진술을 강요하며 망신 주기에 앞장섰고, 가족의 접견과 서신도 제한하는 등 과도한 인권침해를 자행했다”면서 “수사 착수 후 51일 동안 공수처가 한 것은 불법과 꼼수, 대통령의 인권과 방어권을 침해하는 위법이 전부”라고 전했다.\r\n"
//				+ "\r\n"
//				+ "이후 검찰을 향해서는 \"공수처와 같은 불법 수사가 아니라 법적 정당성을 갖춘 수사로 적법절차를 준수하라\"고 요청했다.\r\n"
//				+ "\r\n"
//				+ "그러면서 \"대통령은 향후 수사와 재판, 탄핵심판에서 비상계엄 선포의 필요성을 국민들에게 알리고, 헌정질서 회복과 국정 마비 상황을 극복하기 위해 노력할 것\"이라고 덧붙였다.";
//		
//		String txt2 = "윤석열 대통령 변호인단은 23일 “공수처의 위법 수사와 불법행위에 대해서는 끝까지 법적 책임을 물을 것임을 엄중히 경고한다”고 밝혔다.\r\n"
//				+ "\r\n"
//				+ "고위공직자범죄수사처가 윤 대통령 사건을 검찰에 넘기며 기소를 요구하자 입장문을 통해 비판의 메시지를 전한 셈이다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “공수처장은 세 번이나 강제구인을 시도하며 대통령에게 사법부를 존중해 달라고 요청했지만, 불법 수사를 자행하던 공수처가 법질서의 존중을 이야기하는 것은 언어도단”이라고 말했다.\r\n"
//				+ "\r\n"
//				+ "이어 “공수처는 수사권이 없음에도 관할권 없는 법원에서 불법 영장을 받아낸 후 수사지휘권 없이 경찰 기동대 수천 명을 동원해 불법 영장 집행을 강행했다”고 주장했다.\r\n"
//				+ "\r\n"
//				+ "또 “55경비단의 공문서를 위조하거나 경호처 관계자로부터 군사시설의 배치 등 기밀 사항을 유출하도록 하는 행위에 공모하는 등 온갖 불법을 저질렀다”고도 했다.\r\n"
//				+ "\r\n"
//				+ "변호인단은 “대통령을 체포한 후 진술을 강요하며 망신 주기에 앞장섰고, 가족의 접견과 서신도 제한하는 등 과도한 인권침해를 자행했다”면서 “수사 착수 후 51일 동안 공수처가 한 것은 불법과 꼼수, 대통령의 인권과 방어권을 침해하는 위법이 전부”라고 전했다.\r\n"
//				+ "\r\n"
//				+ "이후 검찰을 향해서는 \"공수처와 같은 불법 수사가 아니라, 법적 정당성을 갖춘 수사로 적법절차를 준수하라\"고 요청했다.\r\n"
//				+ "\r\n"
//				+ "그러면서 \"대통령은 향후 수사와 재판, 탄핵심판에서 비상계엄 선포의 필요성을 국민들에게 알리고, 헌정질서 회복과 국정 마비 상황을 극복하기 위해 노력할 것\"이라고 덧붙였다.";
//		
//		
//		String txt3 = "안녕하세요";
//		String str1 = new String(txt);
//		String str2 = new String(txt2);
//		String str3 = new String(txt3);
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		System.out.println(str3.hashCode());
		
//		Stu s1 = new Stu("홍길동", 100, 90, 90);
//		Stu s2 = new Stu("홍길동", 70, 70, 70);
//		
//		if(s1.equals(s2)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		
//		Person p1 = new Person(2001011111111L);
//		Person p2 = new Person(2001011111111L);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		if(p1.equals(p2)) {
//			System.out.println("같은 사람입니다.");
//		}else {
//			System.out.println("같은 사람입니다.");
//		}
		
		
	}// main
}// class
