package j0122;

import stu.Shape;

public class Ja0122_01 {

	public static void main(String[] args) {
		
		Time t1 = new Time(12,05,10);
//		System.out.println(t1.hour); // private로 바꿔서 이렇게 호출못함
		System.out.println(t1.getHour());
		t1.setHour(t1.getHour()+1);
		System.out.println(t1.getHour());
		
		// 17,35,30
		Time t2 = new Time(17,35,30);
		System.out.println(t2.getHour());
		System.out.println(t2.getMinute());
		System.out.println(t2.getSecond());
		
		System.out.printf("시간 : %d시 %d분 %d 초 ", t2.getHour(), t2.getMinute(), t2.getSecond());
		

		
//		//private - 같은 클래스, default -같은클래스, 같은 패키지
//		//protected - 같은클래스, 같은패키지, 자손클래스 public - 전체
//		Car c = new Car();
//		System.out.println(c.getColor()); // 아무것도 안넣어서 null값
//		Car c2 = new Car("white","auto",5);
//		System.out.println(c2.getColor());
//		c2.setDoor(-50);
//		System.out.println(c2.getDoor());
//		Shape s = new Shape();
		
	}//main
}//class
