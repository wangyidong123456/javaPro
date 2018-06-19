package Tjavabaseday04;

public class student2 {
	/**  
	* @Fields name : 姓名  
	*/  
	private String name;
	/**  
	* @Fields age : 年龄  
	*/  
	private int age;
	
	/**  
	* @Title: setName  
	* @Description: 设置姓名  
	* @param n    
	*/
	public void setName(String name){
		this.name=name;
	}
	
	/**  
	* @Title: getName  
	* @Description: 获取姓名  
	* @return    
	*/
	public String getName(){
		return name;
	}
	
	/**  
	* @Title: setAge  
	* @Description: 设置年龄  
	* @param a    
	*/
	public void setAge(int age){
		this.age=age;
	}
	
	/**  
	* @Title: getAge  
	* @Description: 获取年龄  
	* @return    
	*/
	public int getAge(){
		return age;
	}

}
