package Tjavabaseday0401;

public class student {
	private String name;
	private int age;

	// 默认的构造方法：不带参数的构造方法
	// 系统默认会为对象自动创建
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
	 * @Description: 获取姓名
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * @Title: setAge
	 * @Description: 设置年龄
	 * @param a
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @Title: getAge
	 * @Description: 获取年龄
	 * @return
	 */
	public int getAge() {
		return age;
	}
}
