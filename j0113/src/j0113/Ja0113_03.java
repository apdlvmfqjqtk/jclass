package j0113;

public class Ja0113_03 {
	public static void main(String[] args) {
		int score;
		score = 10;
		System.out.println(score);
		
		int s = 100;
		System.out.println(s);
		
		char ch = 'a';
		System.out.println(ch);

		// char에는 한글자만 들어간다. 두 글자 이상 시 에러
		// char ch2 = 'aa'; 
		// System.out.println(aa);
		
		String str = new String("abc");
		System.out.println(str);
		
		// string은 위가 정석이지만 많이 사용해서 이 방식이 예외
		String str2 = "가나다라";
		System.out.println(str2);
		
		String str3 = null;
		System.out.println(str3);
		
		
	}
}
