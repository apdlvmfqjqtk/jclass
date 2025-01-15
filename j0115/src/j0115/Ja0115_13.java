package j0115;

import java.util.Arrays;
import java.util.Scanner;

public class Ja0115_13 {

	public static void main(String[] args) {
		// 로또 맞추기
		
		// 1-45까지 로또 번호 6개와
		// 입력한 숫자 6개를 비교해서 맞춘 번호와 출력하시오.	
		//
		// 1. 변수 선언
		// 2. 1-45 번호 저장
		// 3. 배열 섞기
		// 4. 6개 로또 번호
		// 5. 입력창 만들기
		// 6. 맞춘 번호 확인 - input, lotto
 		// 7. 출력
		
		////////////////////////////
		Scanner scan = new Scanner(System.in);
		
		int[] ball 		= new int[45];    // 로또 번호 공
		int[] lotto_num = new int[6]; 	  // 로또 정답 번호 6개
		int[] num_mark  = new int[6];     // 내가 고르는 번호 6개
		int[] lotto_res = new int[6]; 	  // 일치한 번호 (최대 6개)
		int   res_cnt 	= 0;  			  // 일치한 번호 수
		
		//1. 1-45가 적힌 번호 공 45개를 생성
		for(int i=0;i<45;i++) {
			ball[i] = i+1;
		}
		
//		// 생성 확인 (디버그)
//		for(int i=0;i<45;i++) {System.out.printf(ball[i] + " ");}
//		System.out.println();
		
		//2. 3자 변수를 이용해 ball객체 무작위로 섞기
		int temp = 0;
		for(int i=0;i<1000;i++) {   // 조건식에 큰 의미는 없고 이정도 섞으면 랜덤이겠다 때려맞추는거
			int rdn = (int)(Math.random()*45); // 0-44
			temp = ball[0];  	 // 임시 주머니에 공 리스트에서 0번째 공 꺼내서 넣음
			ball[0] = ball[rdn]; // 빈 0번째 공간에 rdn번째 공을 꺼내서 넣음
			ball[rdn] = temp; 	 // 빈 rdn번째 공간에 임시 주머니에 있던 공을 넣음 
		}
		
//		// 섞임 확인 (디버그)
//		for(int i=0;i<45;i++) {System.out.printf(ball[i] + " ");}
		
		//3. 섞인 공에서 앞에 6개만 가져와서 로또 정답 번호 6개 생성
		for(int i=0;i<lotto_num.length;i++) {
			lotto_num[i] = ball[i];
		}
		
//		// 정답 확인 (디버그)
//		for(int i=0;i<lotto_num.length;i++) {System.out.printf(lotto_num[i] + " ");}
		
		//3. 정답이라 생각하는 로또 번호 6개를 기입 후 저장
		for(int i=0;i<lotto_num.length;i++) {
			System.out.printf("%d번째 번호 입력. >> ", i+1);
			num_mark[i] = scan.nextInt();
		}
//		// 번호 기입 확인 (디버그)
//		System.out.print("기입한 번호 : ");
//		for(int i=0;i<lotto_num.length;i++) {System.out.printf(num_mark[i] + " ");}
		
		//4. 기입한 번호와 정답을 대조
		for(int i=0;i<lotto_num.length;i++) {
			for(int e=0;e<num_mark.length;e++) {
				if(num_mark[i] == lotto_num[e]) {
					lotto_res[res_cnt] = lotto_num[e];
					res_cnt++;
					break;
				}
			}
		}
		
		//5.  결과 공개
		System.out.println("[ 로또번호 확인 ]");
		System.out.print("로또번호 : ");
		System.out.println(Arrays.toString(lotto_num));
		System.out.print("입력번호 : ");
		System.out.println(Arrays.toString(num_mark));
		System.out.print("맞춘개수 : ");
		System.out.println(res_cnt);
		System.out.print("맞춘번호 : ");
		for(int i=0;i<res_cnt;i++) {
			System.out.print(lotto_res[i]+" ");
		}
		
		
		
		
	}

}
