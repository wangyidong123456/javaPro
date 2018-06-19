package JAday0201;

public class Dog extends Animal {
	@Override
	public void sleep() {
		System.out.println("在小狗窝里躺着睡觉");
	}

	/**
	 * @Title: keepDoor
	 * @Description: 狗的看门方法
	 */
	public void keepDoor() {
		System.out.println("在大门看门");
	}
	

}
