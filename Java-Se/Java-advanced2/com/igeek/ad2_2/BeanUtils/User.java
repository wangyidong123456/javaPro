package com.igeek.ad2_2.BeanUtils;

import java.util.Arrays;

/**  
* @ClassName: User  
* @Description: 用户类
* @date 2018年2月7日 上午9:02:30    
* Company www.igeekhome.com
*    
*/
public class User {

	/**  
	* @Fields uid : 用户id  
	*/  
	private String uid;
	/**  
	* @Fields userName : 用户名  
	*/  
	private String userName;
	/**  
	* @Fields password : 密码  
	*/  
	private String password;
	/**  
	* @Fields hobbies : 爱好  
	*/  
	private String[] hobbies;		
	/**  
	* @Fields age : 年龄  
	*/  
	private int age;
	/**  
	* @Title: User      
	*/
	public User() {
		super();
	}
	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the hobbies
	 */
	public String[] getHobbies() {
		return hobbies;
	}
	/**
	 * @param hobbies the hobbies to set
	 */
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**  
	* @Title: toString  
	* @Description: User类的toString方法  
	* @return
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + ", password=" + password + ", hobbies="
				+ Arrays.toString(hobbies) + ", age=" + age + "]";
	}

}