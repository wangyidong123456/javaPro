package JAday0202;

public class Chinese {
	// 静态成员，被多个对象共享
	// 国籍
	public static String country = "中国";
	// 普通成员，每个对象的普通成员其内容不同
	// 姓名
	private String name;
	// 年龄
	private int age;
	// 职业
	private String work;
	public Chinese(){
		super();
	}
	public Chinese(String name, int age, String work) {
		super();
		this.name = name;
		this.age = age;
		this.work = work;
	}
	public static String getCountry() {
		return country;
	}
	public static void setCountry(String country) {
		Chinese.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	/**  
	* @Title: normalMethod  
	* @Description: 普通的实例成员方法      
	*/

	public void normalMethod() {
		System.out.println("普通方法");
	}
	
	/**  
	* @Title: method  
	* @Description: 静态成员方法      
	*/
	public static void method() {
		//静态方法不能直接访问非静态成员
		//System.out.println(name);
		//normalMethod();
		System.out.println("static方法");
	}
}
