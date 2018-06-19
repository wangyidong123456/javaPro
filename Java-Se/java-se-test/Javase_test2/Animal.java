package Javase_test2;

public class Animal {
	public int number = 10;

	public void showNum() {
		System.out.println(this.number);
	}
	
	public static void main(String[] args) {
		Animal al = new Dog();
		al.showNum();
		System.out.println(al.number);

	}
}

class Dog extends Animal {
	public int number = 5;
	public void showNum() {
		System.out.println(this.number);
	}
}
