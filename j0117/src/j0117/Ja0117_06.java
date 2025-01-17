package j0117;

public class Ja0117_06 {

	static int count = 0; // 1. 클래스변수 - 프로그램이 실행되면 사용가능
	int num = 10; 		  // 2. 인스턴스 변수 - 객체선언을 해야 사용가능
	
	public static void main(String[] args) {
		
		Stu.count = 1;
		System.out.println(Stu.count);
		
		
		
//		// 1-100합
//		// 합 중 200이 넘는 시점의 i
//		int sum = 0;
//		int chk = 0;
//		int sum2 = 0;
//		int chk2 = 0;
//		for(int i=1;i<100;i++) {
//			sum += i;
//			if(sum > 200) {
//				chk = i;
//				chk2 = i;
//				sum2 = sum - i;
//				break;
//			}
//		}
//		System.out.println(chk);
//		System.out.println(sum);
//		System.out.println(chk2);
//		System.out.println(sum2);
		
		
		
//		int a = 5; // 3. 지역변수 - 객체선언을 해야 사용가능
//		System.out.println(a);
		

	}

}
