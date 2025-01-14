package j0114;

import java.util.Scanner;

public class Ja0114_02 {

	public static void main(String[] args) {
//		입력을 받으려면
//		1. Scanner 선언
//		정수형 - nextInt, nextLong, nextByte, nextShort
//		실수형 - nextFloat, nextDouble
//		문자열 = next, nextLine
	
		Scanner scan = new Scanner(System.in);
		//문자열 
//		사이띄우기 하면 그 전까지만 인식
		System.out.println("문자열을 입력하세요. ");
		String str1 = scan.next();
		System.out.println("문자열 1 : " + str1);
		scan.nextLine();
		
//		nextLine : enter키 치는거 까지 인식
		System.out.println("문자열을 입력하세요. ");
		String str2 = scan.nextLine();
		System.out.println("문자열 2 : " + str2);
		
		
//		System.out.println("정수를 입력하세요. ");
//		int num = scan.nextInt();
//		System.out.println("정수 : " + num);
//		
//		System.out.println("실수를 입력하세요. ");
//		double d = scan.nextDouble();
//		System.out.println("실수 : " + d);
		
	}

}
