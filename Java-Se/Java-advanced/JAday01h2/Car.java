package JAday01h2;

public class Car {
	private String mark;
    int age;
	public Car() {

	}

	public Car(String mark) {
		this.mark = mark;
	}
    public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public void drive(){
    	System.out.println("本车的品牌是"+this.mark);
    }
}
