package j0122;

public class Car extends Object{
	Car(){
		super();
	}
	
	Car(String color, String gearType, int door){
		super();
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	//같은클래스 내에서만 사용 가능
	String color;
	String gearType;
	int door;
	
	void drive() {
		System.out.println("자동차 출발");
	}
	void stop() {
		System.out.println("자동차 정지");
	}
	
	void setDoor(int door) {
		if(door>0 && door<10)
		this.door = door;
	}
	int getDoor() {
		return door;
	}
	
	// private 변수에 제약조건을 걸기가 가능
	String getColor() {
		
		return color;
	}
	
}
