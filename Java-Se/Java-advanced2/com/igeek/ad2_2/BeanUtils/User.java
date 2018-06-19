package com.igeek.ad2_2.BeanUtils;

import java.util.Arrays;

/**  
* @ClassName: User  
* @Description: �û���
* @date 2018��2��7�� ����9:02:30    
* Company www.igeekhome.com
*    
*/
public class User {

	/**  
	* @Fields uid : �û�id  
	*/  
	private String uid;
	/**  
	* @Fields userName : �û���  
	*/  
	private String userName;
	/**  
	* @Fields password : ����  
	*/  
	private String password;
	/**  
	* @Fields hobbies : ����  
	*/  
	private String[] hobbies;		
	/**  
	* @Fields age : ����  
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
	* @Description: User���toString����  
	* @return
	* @see java.lang.Object#toString()
	*/
	@Override
	public String toString() {
		return "User [uid=" + uid + ", userName=" + userName + ", password=" + password + ", hobbies="
				+ Arrays.toString(hobbies) + ", age=" + age + "]";
	}

}