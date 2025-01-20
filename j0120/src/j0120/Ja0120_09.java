package j0120;

public class Ja0120_09 {

	public static void main(String[] args) {
		Product p1 = new Product();
		System.out.println(p1.seriaNo);
		Product p2 = new Product();
		System.out.println(p2.seriaNo);
		Product p3 = new Product();
		System.out.println(p3.seriaNo);
		
		System.out.println("Count : " + Product.count);
		
	}

}//class

class Product{
	static int count = 0;
	int seriaNo;
	
	//초기화블럭
	{	++count;
		seriaNo = count;
	}
	
	Product(){}// 기본생성자
}// class

