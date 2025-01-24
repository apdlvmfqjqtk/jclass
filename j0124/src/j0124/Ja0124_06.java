//package j0124;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.util.ArrayList;
//
//public class Ja0124_06 {
//
//	public static void main(String[] args) {
//		ArrayList<Stu> list = new ArrayList<Stu>();
//		list.add(new Stu("홍길동",100,100,99));
//		list.add(new Stu("유관순",90,90,99));
//		list.add(new Stu("이순신",80,80,89));
//		
//		//list 파일에 들어 있는 내용을 stu.txt
//		//1, 홍길동, 100, 100, 100, 300, 100.0, 0
//		//들어간 3명의 성적 stu.txt파일에 저장.
//		try {
//			FileWriter fw = new FileWriter("c:/save2/Stu.txt");// 
//			BufferedWriter bw = new BufferedWriter(fw);  //한번에 저장
//			for(int i=0;i<list.size();i++) {
//				list.get(i); // Stu 1개 객체
//				String str = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d \r\n", 
//						list.get(i).getNo(), list.get(i).getName(), list.get(i).getKor(), list.get(i).getEng(), 
//						list.get(i).getMath(), list.get(i).getTotal(), list.get(i).getAvg(), list.get(i).getRank());
//				bw.write(str + "\r\n");
//			}
//			bw.close();
//			fw.close();
//			
//			
//		} catch (Exception e) {e.printStackTrace();}
//		
//		System.out.println("종료");
//		
////		// save2폴더에 stu.txt로 아래의 글을 저장하세요
////		String[] str = new String[4];
////		str[0] = "1,홍길동,100,100,99";
////		str[1] = "2,유관순,90,90,99";
////		str[2] = "3,이순신,80,80,89";
////		
////		// FileWriter
////		try {
////			FileWriter fw = new FileWriter("c:/save2/abcd.txt");
////			BufferedWriter bw = new BufferedWriter(fw); // 한번에 저장
////			for(int i=0;i<3;i++) {
//////				String s = list.get(i).getNo()+","+ list.get(i).getName()+","+ list.get(i).getKor()+","+ list.get(i).getEng()+","+ list.get(i).getMath() + "\r\n";
//////				bw.write(s);
////				bw.write(str[i]+"\r\n");
////			}
////			bw.close();
////			fw.close();
////		} catch (Exception e) {e.printStackTrace();}
////		
////		str[3] = "4,강감찬,60,80,75";
////		try {
////			FileWriter fw = new FileWriter("c:/save2/abcd.txt",true); // true : 이어쓰기 (전에쓴내용 이어서써짐)
////			BufferedWriter bw = new BufferedWriter(fw); // 한번에 저장
////			for(int i=3;i<4;i++) {
////				bw.write(str[i]+"\r\n");
////			}
////			bw.close();
////			fw.close();
////		} catch (Exception e) {e.printStackTrace();}
////		
////		//파일불러오기
////		try {
////			FileReader fr = new FileReader("c:/save/stu.txt");
////			BufferedReader br = new BufferedReader(fr);
////		} catch (Exception e) {e.printStackTrace();}
//		
//		
//	}//main
//}//class
