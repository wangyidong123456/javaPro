package JAday0203;

public class Test01 {
	public static final double PI = 3.1415926;

	public static void main(String[] args) {

		// final修饰的变量无法被再次赋值
		int a = 10;
		a = 20;

		final int b = 20;
		// 被final修饰的变量不能二次赋值
		// b = 30;
		System.out.println(a + b);
		// 使用静态常量
		double r = 2.5;
		double area = r * r * Test01.PI;
		System.out.println(area);

		// 为引用变量二次赋值,指p这个变量只能指向一个地址,不能指向第二个地址
		final Person p = new Person();
		p.setName("张三");
		p.setName("李四");
		System.out.println(p.getName());

		// 地址不能改,为下边这句内容
		// p = new Person();
		java.lang.String s = "abc";
		System.out.println(s);

		// 使用类全名访问同包下的其他类
		JAday0203.Person person = new JAday0203.Person();
		person.setName("Rose");
		System.out.println(person.getName());

		// 使用类全名访问不同包(跨包)下的其他类
		// JAday0203.other.Person person2=new JAday0203.Person();
		// System.out.println(person2.getName());

	}

}
