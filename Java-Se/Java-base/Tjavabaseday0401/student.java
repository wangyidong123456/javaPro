package Tjavabaseday0401;

public class student {
	private String name;
	private int age;

	// Ĭ�ϵĹ��췽�������������Ĺ��췽��
	// ϵͳĬ�ϻ�Ϊ�����Զ�����
	public student() {

	}

	public student(String name,int age) {
         this.name=name;
         this.age=age;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @Title: getName
	 * @Description: ��ȡ����
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @Title: setAge
	 * @Description: ��������
	 * @param a
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @Title: getAge
	 * @Description: ��ȡ����
	 * @return
	 */
	public int getAge() {
		return age;
	}
}
