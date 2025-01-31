package j0131;

import java.util.Scanner;

public class ShopMall {

	public static void main(String[] args) {
		
		// 상품관리 - Product - TV, Computer, 
		// Refrigerator, 120만 12만 
		// Washing 90만 9만
		// 구매한 리스트 보기
		// 유저관리 - Buyer
		// 메소드 관리 - Shop_Deck
		// 메인 - ShopMall
		
		Scanner scan = new Scanner(System.in);
		Shop_Deck sd = new Shop_Deck();
		int choice;	
		
		// 로그인 메소드
		sd.login(); 

		loop:while(true) {
			// 화면출력
			choice = sd.mainPrint();
			switch(choice) {
			case 1:
				sd.buy(new Tv());  // "LG50TV",1000000,10000,50,"LED","BLACK" - 기본옵션
				break;
			case 2:
				sd.buy(new Tv("LG75TV",1500000,150000,75,"LED","BLACK"));  // "LGTV",1000000,10000,50,"LED","BLACK" - 기본옵션
				break;
			case 3:
				sd.buy(new Computer());
				break;
			case 4:
				sd.buy(new Refrigerator());
				break;
			case 5:
				sd.buy(new Washing());
				break;
			case 7: //상품구매리스트
				sd.proList();
				break;
			case 8: //현금충전
				sd.charde();
				break;
			case 0:
				System.out.println("프로그램 종료");
				break loop;
			}// switch
		}//while
		
		
		
	}//main
}//class
