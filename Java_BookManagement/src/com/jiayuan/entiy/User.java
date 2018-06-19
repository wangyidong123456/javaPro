package com.jiayuan.entiy;

public class User {
    String id;
    String name;
    String password;
    String sex;
    String department;
    String major;
    int age;
    String address;
    String phonenumber;
    int borrownumber;
    public User(){
    	
    }
    
	public User(String id, String name, String password, String sex, String department, String major, int age,
			String address, String phonenumber, int borrownumber) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.department = department;
		this.major = major;
		this.age = age;
		this.address = address;
		this.phonenumber = phonenumber;
		this.borrownumber = borrownumber;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	public int getBorrownumber() {
		return borrownumber;
	}


	public void setBorrownumber(int borrownumber) {
		this.borrownumber = borrownumber;
	}


	@Override
//	public  String toString(){
//		return "id="+id+",name="+name+
//				",password="+password+",sex="+sex+",department="+department+
//				",major="+major+",age="+age+",address="+address+
//				",phonenumber="+phonenumber+",borrownumber="+borrownumber;
//		
//	}
	
	public  String toString(){
		return "id="+id+",name="+name+",borrownumber="+borrownumber;
		
	}
}
