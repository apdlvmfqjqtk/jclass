package j0120;

public class Ja0120_06 {
	public static void main(String[] args) {
//		int total = 1;
//		for(int i=1;i<=5;i++) {
//			total = total * i;
//		}
//		System.out.println(total);
		Ja0120_06 j = new Ja0120_06(); 
		System.out.println(j.fac(5));
		
	}
	
	long fac(int n) {
		long result = 0;
		if(n==1) {
			result = 1;
		} else {
			result = n * fac(n-1);
		}
		return result;
	}
}
