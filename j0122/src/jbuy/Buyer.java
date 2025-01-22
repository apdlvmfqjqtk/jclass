package jbuy;

import java.util.ArrayList;

class Buyer {

	int money = 10000000;	// 보유 헌금
	int log = 0;
	int bonusPoint = 0;		// 보유 보너스포인트
//	Product[] cart = new Product[10];
	int count = 0;
	ArrayList list = new ArrayList();
	
	
	//생성자
	Buyer(){}
	Buyer(int money, int bonusPoint){
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	// 메소드
	void aaa() { // 완성된 메소드
		
	}
	void bbb() {};  // 완성 메소드 
	
	
	
	//나의정보 메소드
	void myInfo() {
		System.out.printf("[ 보유금액 : %,d ] \n", money);
		System.out.printf("[ 보유 포인트 : %,d ] \n", bonusPoint);
	}
	
	
	//구매 메소드
	void buy(Product p) {
		list.add(p);
		money -= p.price;
		log += p.price;
		bonusPoint += p.bonusPoint;
	}
	
	void cartInfo() {
		System.out.print("구매목록 : ");
		for(int i=0;i<list.size();i++) {
				System.out.printf("%s ",((Product)list.get(i)).name);
			}
		System.out.println();
		System.out.printf("구매갯수 : %,d개 \n", list.size());
		System.out.printf("총 구매금액 : %,d원 \n", log);
	}
	
//	void buy(Tv t) {
//		System.out.println("TV를 구매합니다.");
//		money -= t.price;
//		bonusPoint += t.bonusPoint;	
//	}
//	
//	void buy(Computer c) {
//		System.out.println("Computer를 구매합니다.");
//		money -= c.price;
//		bonusPoint += c.bonusPoint;	
//	}
//	
//	void buy(Audio a) {
//		System.out.println("Audio를 구매합니다.");
//		money -= a.price;
//		bonusPoint += a.bonusPoint;	
//	}

}
