package j0115;

public class Ja0115_08 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		int i=0;
		loop:while(i<10) {
			int randomN = (int)(Math.random()*10)+1;
			for(int j=0;j<i;j++) {
				if(num[j]==randomN) {
					System.out.println("번호가 동일합니다. " + randomN);
					continue loop;
				}
			}
			num[i] += randomN;
			i++;
		}
		System.out.print("랜덤입력숫자 : ");
		for(int j=0;j<10;j++) {
			System.out.print(num[j] + " ");
		}
		System.out.println();
		
		// for문을 이용한 랜덤숫자 중복없이 넣기
		int[] num2 = new int[10];
		for(int j=0;j<10;j++) {
			num2[j] = j+1;
			
		}
		
		int temp = 0;
		for(int j=0;j<300;j++ ) {
			int ran = (int)(Math.random()*10);
			temp = num2[0];
			num2[0] = num2[ran];
			num2[ran] = temp;
		}
		System.out.print("랜덤입력숫자 : ");
		for(int j=0;j<10;j++) {
			System.out.print(num2[j] + " ");
		}
		System.out.println();
		
		
		// 두번째 똥
//		int[] list = new int[10];
//		int p = 0;
//		roll:while(p<6) {
//			int a = (int)(Math.random()*10)+1;
//			for(int i=0;i<p;i++) {
//				if(list[i]== a) {
//					System.out.println("mrsk");
//					continue roll;
//				}
//			}
//			list[p] += a;
//			p++;
//		}
//		System.out.print("수:" + " ");
//		for(int i=0;i<10;i++){
//			System.out.print(list[i] + " ");
//		}
		
		
		
		
		
//		똥
//		// 1-10까지 랜덤숫자 입력받아 중복 없게 저장
//		int[] num = new int[10];
//		int temp = 0;
//		
//		for(int i=0;i<50;i++) {
//			int ran = (int)(Math.random()*10);
//			for(int j=0;j<i;j++) {
//				if(ran==(num[j])) {
//					System.out.println("중복");
//				}else {
//					num[i] = ran;
//				}
//			}
//		}
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}
//		
//		
	}

}
