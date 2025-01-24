//package j0124;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//
//import javax.swing.text.html.HTMLDocument.Iterator;
//
//public class Ja0124_01 {
//
//	public static void main(String[] args) {
//		
//		 ArrayList list = new ArrayList();
//		 list.add(new Stu("홍길동",100,100,99)); // 1명 입력
//		 list.add(new Stu("유관순",90,90,99)); // 1명 입력
//		
//		//Map
//		HashMap<String, Object> map = new HashMap<String, Object>();
//		map.put("userId", "aaa");  // map 저장
//		map.put("userPw", "1111");
//		map.put("userName", "홍길동");
////		map.put("list", list);
//		
//		System.out.println(map.containsKey("userId"));  // Key값이 존재하는지 확인
//		System.out.println(map.containsValue("1111"));  // value값이 존재하는지 확인
//		
//		if(map.containsKey("userId")==true) {
//			System.out.println(map.get("userId"));
//		}
//		
////		System.out.println("id : "+map.get("userId"));  // key값을 넣흐면 되고, value없으면 null 돌려냄
////		System.out.println("id : "+map.get("userId2"));  
////		System.out.println("pw : "+map.get("userpw")); 
////		System.out.println("list : "+map.get("list")); 
//		
////		java.util.Iterator i = map.entrySet().iterator();
////		while(i.hasNext()) {
////			System.out.println(i.next());
////		}
//		
////		//list 출력 어캐함
////		// 컬렉션 들어간넘들 오브젝트로 바껴서 다시 바꿔줘야함
////		ArrayList list2 = (ArrayList)map.get("list");
////		for(int i=0;i<list2.size();i++) {
////			Stu s = (Stu)list2.get(i);
////			System.out.println(s.getNo()+", "+s.getName());
////		}
//		
////		HashSet set = new HashSet();
////		set.add(1);
////		set.add(2);
////		set.add(3);
////		set.add(2);
////		
////		java.util.Iterator i = set.iterator();
////		while(i.hasNext()) {
////			System.out.println(i.next());
////		}
////		i = set.iterator();  // 출력은 무조건 1번 더 사용해야 함
////		while(i.hasNext()) {
////			System.out.println(i.next());
////		}
//		
////		 ArrayList list = new ArrayList();
////		 list.add(new Stu("홍길동",100,100,99)); // 1명 입력
////		 list.add(new Stu("유관순",90,90,90));   // 1명 입력
////		 list.add(new Stu("이순신",80,80,90));   // 1명 입력
////		 Stu s1 = new Stu();
////		 s1.setName("강감찬");
////		 s1.setKor(80);
////		 s1.setEng(90);
////		 s1.setMath(88);
////		 list.add(s1);
////		
////		 for(int i=0;i<list.size();i++) {
////			 Stu s = (Stu)list.get(i);
////			 System.out.println(s.getNo()+", "+s.getName());
////		 }
//
//		
//	}//main
//}//class
