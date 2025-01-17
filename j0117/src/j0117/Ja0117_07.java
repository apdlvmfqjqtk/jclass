package j0117;

public class Ja0117_07 {

	public static void main(String[] args) {
		// 클래스변수 - 객체선언 없이 클래스변수명.변수명
		Stu.count = 10;  
		// Stu.id = "bbb" // 이렇게는 사용못함
		System.out.println("Stu.count : " + Stu.count);
		
		
		// 인스턴스변수 - 객체선언 후 참조변수명.변수명
		Stu s1 = new Stu();
		s1.id = "aaa";
		s1.count = 100;  // class변수 count에 이렇게도 접근 가능함
		s1.age = 100;
		System.out.println(s1.id);
		System.out.println(s1.age);
		System.out.println("s1.count : " + s1.count);
		
		Stu s2 = new Stu();
		s2.id = "bbb";
		s2.count = 500;
		s2.age = 500;
		
		System.out.println("s1.age : " + s1.age);
		System.out.println("s2.age : " + s2.age);
		System.out.println("s2.count : " + s2.count);
		System.out.println("s1.count : " + s1.count);
		

	}

}
