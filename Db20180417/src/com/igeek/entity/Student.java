package com.igeek.entity;

public class Student {
	  //
    private String id;
    //学生的姓名
	private String name;
	//学生的年龄
	private String age;
    //学生的性别
	private String sex;
	//学生的地址
	private String address;
	
	private String cid;
	private String cname;
	private Double asco;
	
	public  Student(){
		
	}
	public Student(String id,String name, String age,String sex,String address,String cid,String cname,Double asco){
		super();
		this.id=id;
		this.sex=sex;
		this.address=address;
		this.name=name;
		this.age=age;
		this.cid=cid;
		this.cname=cname;
		this.asco=asco;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
	public String getAge() {
		return age;
	}
	
	
	public String getSex() {
		return sex;
	}
	public String getAddress() {
		return address;
	}
	public String getCid() {
		return cid;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Double getAsco() {
		return asco;
	}
	public void setAsco(Double asco) {
		this.asco = asco;
	}
	@Override
	public String toString(){
		return "id="+id+",name="+name+",age="+age+",sex="+
	sex+",address="+address+",cid="+cid+",cname="+cname+",asco="+asco;
		
	}
	
	
	
}
