package Javase_test;

public class Father {
	private String name;// ÀΩ”– Ù–‘
	private String sex;

	public void tell() {
		System.out.println(name + sex);
		speak();
	}

	private void speak() {
		System.out.println(name + "is speaking!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}