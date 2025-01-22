package jbuy;

import java.util.Scanner;

public class jaMain {

	static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 로그인 구현
		// 보유한 금액, 보너스 포인트가 설정
		Buyer b = new Buyer(); // b 10000000,0
		System.out.printf("현재 보유금 : %,d원 \n", b.money);
		
		
		shop:while(true) {
			System.out.println("[ 전자제품 쇼핑몰 ]");
			System.out.println("1. TV");
			System.out.println("2. COMPUTER");
			System.out.println("3. AUDIO");
			System.out.println("9. 구매정보");
			System.out.println("0. 종료");
			System.out.println("번호를 선택해주세요. >>");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				b.buy(new Tv());
				b.myInfo();
				break;
			case 2:
				b.buy(new Computer());
				b.myInfo();
				break;
			case 3:
				b.buy(new Audio());
				b.myInfo();
				break;
			case 9:
				b.cartInfo();
				break;
			case 0:
				System.out.println("[ 가게 종료 ]");
				break shop;
			}//case
			
		}//while
	
		
	}//main
}//class