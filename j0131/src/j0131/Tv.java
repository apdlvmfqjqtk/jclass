package j0131;

public class Tv extends Product {

//	private String name;
//	private int price;
//	private int point;
	
	private int size;
	private String pannel;
	private String color;
	
	
	Tv() {
		this("LG50TV",1000000,100000,50,"LED","BLACK");
	}
	
	
	Tv(String name, int price, int point, int size, String pannel, String color){
		setName(name);
		setPrice(price);
		setPoint(point);
		this.pannel = pannel;
		this.size = size;
		this.color = color;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getPannel() {
		return pannel;
	}


	public void setPannel(String pannel) {
		this.pannel = pannel;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
}