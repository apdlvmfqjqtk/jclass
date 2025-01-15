package j0115;

import java.util.Scanner;

public class Ja0115_04 {

	public static void main(String[] args) {
		// 1-100의 랜덤 숫자 생성
		// 10번의 도전으로 해서 정답을 맞추면 종료
		// 랜덤수보다 큰 수, 작은 수 입니다 출력
		// 입력한 숫자를 모두 출력
		
		Scanner scan = new Scanner(System.in);
		
		int randnum = (int)(Math.random()*100)+1;
		int[] inputnum = new int[10];
		int trycnt = 0;
		for(int i=0;i<10;i++) {
			System.out.println(i+1+"번째 시도입니다. 숫자를 입력해주세요.");
			int trynum = scan.nextInt();
			inputnum[i] += trynum;
			trycnt += 1;
			if(randnum > trynum) {
				System.out.println("더 높은 숫자를 입력해주세요");
			}else if(randnum < trynum) {
				System.out.println("더 낮은 숫자를 입력해주세요");
			}else {
				System.out.printf("정답입니다. %d번만에 맞추셨습니다. \n", i);
				break;
			}
		}
		
		System.out.println("정답: "+ randnum);
		System.out.printf("시도횟수 : %d회 \n", trycnt);
		System.out.printf("입력숫자 :");
		for(int i=0;i<trycnt;i++) {
			if(i==(trycnt-1)) {
				System.out.printf("%d ",inputnum[i]);
  			}else {
  				System.out.printf("%d, ",inputnum[i]);
  			}
		}
		
		
	}

}
