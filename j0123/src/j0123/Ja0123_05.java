package j0123;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ja0123_05 {
	
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("파일이름을 입력");
		String name = scan.next();
		File f = createFile(name + ".txt"); 
		System.out.println("파일이 생성되었습니다.");	
	}
	
	static File createFile (String fileName) throws Exception {
		File f = new File(fileName);
		f.createNewFile();
		return f;
		
		
//		if(fileName == null || fileName.equals("")) { 
//			throw new Exception("파일이름이 없습니다. 다시 확인하세요.");
//		}
	}
	
	static void createNewFile(File f) {
		try {
			f.createNewFile(); // 파일생성 - 외부 하드디스크에 파일을 1개 생성
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
