package JAday0201;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		p.sleep();
		p.work();
		p.study();
		System.out.println("===================");
		// 使用多态,只表现出父类(等号左边的数据类型)的功能
		Animal a = new Person();
		a.eat();
		a.sleep();
		// 调用feed方法
		// 使用多态的形式,创建子类对象,赋值给父类引用
//		 Animal a22=new Person();
//		 feed(a22);
//		 Person p22=new Person();
//		 feed(p22);

		feed(new Person());
		System.out.println("===================");
		// 在强制类型转换时,必须是什么对象,转为什么类型.
		// 如果使用错,使用了其他类型,则编译时不报错,运行时会报错,显示类型转换异常:java.lang.ClassCastException

		Animal a2 = new Person();
//		Person p2 = (Person) a;
		method(a2);
		System.out.println("==============================");
	
		
	
		

	}

	public static void feed(Animal x) {
		// x可以接收Animal的任意子类对象
		// 调用该动物的吃饭方法
		System.out.println("feed方法内的动物吃饭方法被调用了");
		x.eat();
	}
public static void method(Animal a) {	
		//先吃饭
		a.eat();
		//如果是狗,就看门,如果是人就学习工作
		if(a instanceof Dog) {
			//强转为狗
			Dog d = (Dog)a;
			//调用狗的方法
			d.keepDoor();
		}	
		//如果是,就看门,如果是人就学习工作
		if(a instanceof Person) {
			//强转为人
			Person p = (Person)a;
			//调用人的方法
			p.study();
			p.work();
		}
	}

	
}
