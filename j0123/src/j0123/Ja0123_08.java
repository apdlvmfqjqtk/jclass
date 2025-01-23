package j0123;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ja0123_08 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add(4);
		set.add(1);  // 순서없고 중복도 못넣음
		set.add(3);
		set.add("aaa");
		set.add(2);
		set.add(1);  // 못넣음
		
		System.out.println("개수 : " + set.size());
		
		// 애는 ArrayList와 다르게 이렇게밖에 출력이 안됨
		// 심지어 한번 선언하고 한번 쓰면 끝임
		// 새로 출력하려면 다시 선언해야함
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("===========");
		Iterator i2 = set.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
//		// HashSet은 이렇게 데이터 못뽑음
//		for(int i=0;i<set.size();i++) {
//			System.out.println(set.get(i)); // 값출력
//		}
		
		
//		ArrayList list = new ArrayList();
//		
//		for(int i=0;i<10;i++) {
//			list.add(i+1); //값입력
//		}
//		
//		// 정석의 형태 - 데이터 불러오기
//		Iterator i1 = list.iterator();
//		while(i1.hasNext()) {
//			System.out.println(i1.next());
//		}
//		
//		//편하게 쓰는 형태
//		for(int i=0;i<10;i++) {
//			System.out.println(list.get(i));
//		}
		
		
		
	}
}
