package Tjavabaseday04;

public class Phone {
	String brand;
	/**
	 * @Fields price : 价格
	 */
	int price;
	/**
	 * @Fields color : 颜色
	 */
	String color;

	/**
	 * @Title: call
	 * @Description: 打电话
	 * @param name
	 */
	public  void call(String name) {
		System.out.println("给" + name + "打电话");
	}

	/**
	 * @Title: sendMessage
	 * @Description: 发短信
	 */
	public void sendMessage() {
		System.out.println("群发短信");
	}

}
