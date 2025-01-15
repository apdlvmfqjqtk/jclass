//package j0115;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Ja0115_09 {
//
//	public static void main(String[] args) {
//		// 로또번호 6개와 입력 숫자 6개를 비교해서 맞춘 개수와 번호 출력
//		//
//		//[로또 확인]
//		// 로또 번호 : 
//		// 입력 번호 : 
//		// 맞춘 개수 : 
//		// 맞춘 번호 : 
//		
//		Scanner scan = new Scanner(System.in);
//
//		// 로또 번호 생성
//		int[] ball = new int[6];
//		int trc = 0;
//		gacha:while(trc<6) {
//			int randball = (int)(Math.random()*45)+1;
//			for(int i=0;i<trc;i++) {
//				if(randball == ball[i]) {
//					System.out.println("중복");
//					continue gacha;
//				}
//			}
//			ball[trc] = randball;
//			trc++;
//		}
//		System.out.println("로또 번호 : " + Arrays.toString(ball));
//		
//		// 로또 번호 입력
//		// 1-45 생성
//		String[] ballball = new String[45];  // 번호 45개
//		for(int k=0;k<ballball.length;k++) {
//			ballball[k] = k+1+"";  // 뒤에 ""만 넣어도 문자 타입으로 바뀜
//		}
//		
//		int chk = 0; 
//		int[] marklist = new int[6];
//		
//		ltmark:while(true) {
//			if(chk == 6) {
//				break ltmark;
//			}
//			System.out.println("[ 로또맞추기 ]");
//			for(int i=0;i<ball.length;i++) {
//				if(i%5==0) {
//					System.out.println();
//				}
//				System.out.print(ball[i]+"\t");
//			}
//			
//			System.out.println();
//			System.out.printf("원하는 번호를 입력하세요. (%d번째)>> ",chk+1);
//			int input = scan.nextInt();
//			marklist[chk] = input;
//			
//			// 입력한 번호 5 -> 5번짜리 X를 입력
//			ballball[input-1] = "X";
//			chk++;
//			
//		}
//		
//		
//		// 로또 번호 비교
//		int lottoo = 0;
//		int[] ballox = new int[6];
//		for(int q=0; q<6;q++) {
//			for(int w=0;w<6;w++) {
//				if(ball[q] == chkball[w]) {
//					System.out.println("맞춤");
//					ballox[lottoo] = chkball[w];
//					lottoo ++;
//					break;
//				}
//			}
//		}
//		
//		// 결과
//		System.out.println("로또 번호 : " + Arrays.toString(ball));
//		System.out.println("적은 번호 : " + Arrays.toString(chkball));
//		System.out.println("맞춘 개수 : " + lottoo);
//		System.out.print("맞춘 번호 : ");
//		for(int i=0;i<lottoo;i++) {
//				System.out.print(ballox[i] + " ");
//			}
//		}
//		
//		
//	}
//
//
