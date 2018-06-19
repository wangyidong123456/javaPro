package JAday01h2;

public class SuCar extends Car {
	private int price;
	private int speed;

	public SuCar() {

	}

	public SuCar(String mark, int price, int speed) {
		super(mark);
		this.price = price;
		this.speed = speed;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
    public void show(int newSpeed){
    	this.drive();
    	System.out.println(this.getMark()+"车的价格是"+this.price);
    	System.out.println(this.getMark()+"车原来的速度是"+this.speed+"\n本车正在驾驶");
    	this.speed=newSpeed;
    	System.out.println(this.getMark()+"车速的速度是"+this.speed);
    	
    	
    }
}
