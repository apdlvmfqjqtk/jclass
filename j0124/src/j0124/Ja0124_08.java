package j0124;

import java.io.File;
import java.io.FileOutputStream;

public class Ja0124_08 {

	public static void main(String[] args) {
		try {
			
			//폴더확인 및 폴더 생성
			String folder = "c:/save3";
			File f = new File(folder);
			
			if(f.exists()) {
				f.mkdir(); // 폴더생성
				System.out.println("폴더가 생성되었습니다");
			}
			
			//파일 생성
			File file = new File(folder);
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("파일이 생성되었습니다.");
			}
			
			//글자저장 - FileOutputStream
			FileOutputStream fos = new FileOutputStream(folder+"/ccc.txt");
			String str = "1,hong홍,100,100,100,300,100.0,0";
			str += "2,you유,90,90,90,270,90.0,0";
			byte[] bytes = str.getBytes();
			for(byte b:bytes) {
				fos.write(b);
			}
			fos.close();
		} catch (Exception e) {e.printStackTrace();}
		
		System.out.println("프로그램 종료");
		
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/stu.txt");
//			int read = 0;
//			while((read = fis.read()) != -1) {
//				System.out.println((char) read);
//			}
//			fis.close();
//		} catch (Exception e) {e.printStackTrace();}
//		
//		System.out.println( "프로글그림정료종");
		
		
		
		
	}

}
