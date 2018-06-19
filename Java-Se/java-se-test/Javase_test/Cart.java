package Javase_test;

public class Cart implements Cookie {
	private String name;
	private String production;

	public Cart(String name, String production) {
		this.name=name;
		this.production=production;
	}
	public void smell(){
//		cookie=new Cart("","");
		System.out.println(cookie);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	
	
}
