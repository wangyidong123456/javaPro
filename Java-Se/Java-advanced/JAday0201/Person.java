package JAday0201;

public class Person extends Animal {
	public void eat() {
		System.out.println("用工具吃饭");
	}
	
	/**  
	* @Title: sleep  
	* @Description: 实现父类的睡觉方法  
	* @see com.igeek_03.Animal#sleep()
	*/
	@Override
	public void sleep() {
		System.out.println("在床上躺着睡觉");
	}

	//定义自身特有方法
	/**  
	* @Title: study  
	* @Description: 学习方法     
	*/
	public void study() {
		System.out.println("学习书本知识与实践科学");
	}
	
	/**  
	* @Title: work  
	* @Description: 工作方法      
	*/
	public void work() {
		System.out.println("努力,用够时间");
	}

}
