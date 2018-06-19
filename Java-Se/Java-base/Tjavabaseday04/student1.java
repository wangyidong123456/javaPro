package Tjavabaseday04;

public class student1 {

	/**
	 * @ClassName: Student
	 * @Description: 学生类
	 * @date 2017年11月10日 下午5:14:25 Company www.igeekhome.com
	 * 
	 *       通过对象直接访问成员变量，会存在数据安全问题 这个时候，我们就想能不能不让外界的对象直接访问成员变量呢？ 能！ 如何实现呢？
	 *       private关键字
	 * 
	 *       private： 是一个权限修饰符。 可以修饰成员(成员变量和成员方法) 被private修饰的成员只能在本类中才能访问。
	 * 
	 *       针对private修饰的成员变量，我们会相应的提供getXxx()和setXxx()用于获取和设置成员变量的值，方法用public修饰
	 */

		/**
		 * @Fields name : 姓名
		 */
		String name;
		/**
		 * @Fields age : 年龄
		 */
		// int age;
		private int age;

		/**
		 * @Title: setAge
		 * @Description: 设置年龄
		 * @param a
		 */
		public void setAge(int a) {
			if (a < 0 || a > 200) {
				System.out.println("你给的年龄有误");
			} else {
				age = a;
			}
		}

		/**
		 * @Title: getAge
		 * @Description: 获取年龄
		 * @return
		 */
		public int getAge() {
			return age;
		}

		/**
		 * @Title: show
		 * @Description: 显示学生信息
		 */
		public void show() {
			System.out.println("姓名是：" + name + "，年龄是：" + age);
		}
	}

