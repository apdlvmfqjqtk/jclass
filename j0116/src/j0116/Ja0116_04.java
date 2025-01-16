package j0116;

public class Ja0116_04 {

	public static void main(String[] args) {
		// 1. 5,5배열 생성 arr
		// 2. 뽑기 글자 입력
		// 3. 5,5배열 생성 arr2
		// 4. 25개 1찬원 배열 생성
		// 5. 1차원 배열 값 넣기
		// 6. 배열 섞기
		// 7. 뽑기 배열 출력
		// 8. 번호 입력	
		// 9. 당첨 확인	
		// 10. 최종 결과
		
		// 같은 arr가 2개 필요한 이유는 표면상으로 보일 하나와
		// 실제 좌표값으로 계산이 이뤄질 하나가 필요하기 때문인다
		
		String[][] arr = new String[5][5];
		
		
		// 뽑기판 제작
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = "뽑기"; 
			}
		}
//		// 뽑기판 디버그
//		for(int i=0;i<arr.length;i++) {	for(int j=0;j<arr[i].length;j++) {	System.out.printf(arr[i][j]+"\t");	}	System.out.println();	}
		
		
		// 정답 생성 (당첨확률) 
		int[] num = {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		// 위치 섞기
		int temp = 0;
		for(int i=0;i<300;i++) {
			int ran = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[ran];
			num[ran] = temp;
		}
		
		// (정답판 제작)
		String[][] arr2 = new String[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr2[i][j] = num[5*i+j] + "";  // arr2는 string 배열이라 형변환
			}
		}
//		// 정답판 디버그
//		for(int i=0;i<arr.length;i++) {	for(int j=0;j<arr[i].length;j++) {	System.out.printf(arr2[i][j]+"\t");	}	System.out.println();	}
		
		// 뽑기판 출력
		System.out.println("[뽑기]");
		System.out.println("--------------------------------------------");
		System.out.printf("좌표 |\t0\t1\t2\t3\t4 \n");
		System.out.println("--------------------------------------------");
		for(int i=0;i<arr.length;i++) {	
			System.out.printf("%d   |\t", i);
			for(int j=0;j<arr[i].length;j++) {	
				System.out.printf("%s\t",arr[i][j]);	
			}	
			System.out.println();	  
		}
		
		
		
		
		
		
		
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = (5*i)+(j+1);
//			}
//		}
//		
//		// arr1 출력
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.printf(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j] = "뽑기";
//			}
//		}
		
		
		
		
		
		
		
		
		
	}

}
