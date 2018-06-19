package Tjavabaseday0402;

public class Cat {
	private String breed;
	private String color;

	// 默认的构造方法：不带参数的构造方法
	// 系统默认会为对象自动创建
	public Cat() {
	}
	public Cat(String breed,String color) {
         this.breed=breed;
         this.color=color;
	}
	public String getbreed() {
		return breed;
	}
	public void setbreed(String breed) {
		this.breed = breed;
	}

	

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	public boolean equals(Cat c){
		return this.breed==c.breed&&this.color==c.color;
	}
	public  Cat createCat(String breed,String color){
		Cat c=new Cat(breed,color);
		 return c;
	}
	
}
