package j0122;

public class Ja0122_03 {
	
	public static void main(String[] args) {
		//CaptionTv - text, caption()
		//Tv - power, channel, power(), channelUp(), channelDown()
		CaptionTv c = new CaptionTv();
		c.text = "[뮤직비디오] 로제-APT";
		System.out.println("자막 : "+c.text);
		
		Tv t = new CaptionTv();
//		t2.text = "자막기능이없음" 
		Tv t2 = new Tv();
		CaptionTv c3;
		c3 = (CaptionTv)t;
		c3.text = "aaa";
		t = c3;
		System.out.println(c3.text);
		
//		c3 = (CaptionTv)t2; //입력은 되지만 실행 시 에러
		c3.text = "bbb";
//		t.text =  // 에러
//		CaptionTv c2 = new Tv(); // 자손의 참조변수 = 부모 객체 안됨
		
		
	}
	
}
