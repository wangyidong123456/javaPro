package Tjavabaseday04;

public class Phone {
	String brand;
	/**
	 * @Fields price : �۸�
	 */
	int price;
	/**
	 * @Fields color : ��ɫ
	 */
	String color;

	/**
	 * @Title: call
	 * @Description: ��绰
	 * @param name
	 */
	public  void call(String name) {
		System.out.println("��" + name + "��绰");
	}

	/**
	 * @Title: sendMessage
	 * @Description: ������
	 */
	public void sendMessage() {
		System.out.println("Ⱥ������");
	}

}
