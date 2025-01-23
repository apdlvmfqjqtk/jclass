package j0123;

import java.util.ArrayList;
import java.util.List;

public class Ja0123_07 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		for(int i=0;i<10;i++) {
			list.add(i+1); //  입력
		}
		
		list.add(4,100); // 위치값 입력
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)); // 값 출력
		}
		
		
		// 이러면 총길이 10의 절반인 5개만 지워짐
		// 지우는 순간 공간이 앞당겨 0번자리에 1번자리 데이터가 들어오기 때문
		// 고로 for문을 이용해서 지우려면 거꾸로 삭제하셈, 어짜피 이거 안써서 상관없음(clear()문 쓰기 때문)
		for(int i=0;i<list.size();i++) {
			list.remove(i); // 전체 삭제
		}
		
		
		System.out.println("------------------");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)); // 값 출력
		}
		
		
//		List list2 = new ArrayList();
//		Integer i1 = new Integer(1);
//		Integer i2 = new Integer(2);
//		Integer i3 = new Integer(3);
//		Integer i4 = new Integer(4);
//		list.add(i1); // 1->기본타입, list -> 객체타입.
//		list.add(i2); // 1->기본타입, list -> 객체타입.
//		list.add(i3); // 1->기본타입, list -> 객체타입.
//		list.add(i4); // 1->기본타입, list -> 객체타입.
		
//		list.add(1); // 순서 있음, 중복 가능
//		list.add(2); // 값 입
//		list.add(3);
//		list.add(4);
//		list.add(4);
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		list.remove(3); // index번호 삭제
//		System.out.println("-----------");
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		list.clear();  // 전체삭제
//		System.out.println("-----------");
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}

		
	}
}
