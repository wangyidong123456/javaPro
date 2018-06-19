package JAday0202;

public class Test01 {

	public static void main(String[] args) {
		//创建人类对象,验证静态static修饰的成员被多个对象共享
		Chinese c = new Chinese("王宝强", 34, "演员");
		System.out.println(c.getAge()+"岁的"+c.getName()+"是"+Chinese.country+"人");
		
		Chinese c2 = new Chinese("周星驰", 48, "演员或导演或制片");
		System.out.println(c2.getAge()+"岁的"+c2.getName()+"是"+Chinese.country+"人");
		
		Chinese.country = "中华人名共和国";
		System.out.println("================================");
		
		System.out.println(c.getAge()+"岁的"+c.getName()+"是"+Chinese.country+"人");
		
		System.out.println(c2.getAge()+"岁的"+c2.getName()+"是"+Chinese.country+"人");

		c.normalMethod();
		//建议
		Chinese.method();
		//不建议 这么使用
//		c.method();
		
	}

}
