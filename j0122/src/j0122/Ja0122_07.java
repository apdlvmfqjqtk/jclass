package j0122;

import java.util.ArrayList;

public class Ja0122_07 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		for(int i=0;i<20;i++) {
			list.add(new Time(i+1, i+1, i+1)); 
		}
		//랜덤
//		for(int i=0;i<20;i++) {
//			int h = (int)(Math.random()*24)+1;
//			int m = (int)(Math.random()*60)+1;
//			int s = (int)(Math.random()*60)+1;
//			list.add(new Time(h, m, s)); 
//		}
		
		// 삭제
		list.remove(1);
		list.remove(10);
		
		for(int i=0;i<list.size();i++) {
			Time t = (Time) list.get(i);
			System.out.printf("%d. [ %02d:%02d:%02d ] \n",i, t.getHour(), t.getMinute(), t.getSecond());
		}
		
		
	}
	
}
