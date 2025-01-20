package j0120;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ja0120_04 {

	public static void main(String[] args) {
		
		// 두 수를 Cal3 에 보내면 +,-,* 값 한번에 return해서 출력
		Cal3 c3 = new Cal3();
		int[] re = new int[3];
		int a = 10;
		int b = 3;
		System.out.println(Arrays.toString(re));
		c3.op(a, b, re);
		System.out.println(Arrays.toString(re));
		
		
//		// Cal2 - strPrint 에서 이름을 입력받아
//		// 메소드에서 출력하시오
//		Cal2 in = new Cal2();
//		String[] input = in.strPrint();
//		System.out.println("입력이름 : " + Arrays.toString(input));
		
//		// 입력부분 class로 분리
//		// main 배열
//		Input i = new Input();
//		int[] input = new int[5];
//		
//		// 입력
//		for(int j=0;j<input.length;j++) {
//			input[j] = i.Valinput();
//		}
//		// 출력
//		for(int j=0;j<input.length;j++) {
//			System.out.println("입력값 : "+input[j]);
//		}
		
		
//		int a = 10;
//		int b = 3;
//		
//		Cal c = new Cal();
//		int result = c.mult(a,b);
//		System.out.println(result);
//		
//		int result2 = c.add(a,b);
//		System.out.println(result2);
//		
//		double result3 = c.div(a, b);
//		System.out.println(result3);
		
	}

}
