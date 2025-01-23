package j0123;

import java.security.DomainCombiner;

public class Person {

	long id; // 주민번호
	String name; // 주민등록상 이름
	
	Person(){}
	Person(long id){
		this.id = id;
	}
	Person(long id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) { //비교대상객체
		if(obj!=null && obj instanceof Person) {
			return id == ((Person)obj).id;
		}else {
			return false;
		}
	}
	
	
	
	@Override // Object class 메소드
	public String toString() {
		return id+"";
	}
	
	
}
