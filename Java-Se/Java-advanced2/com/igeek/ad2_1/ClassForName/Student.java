package com.igeek.ad2_1.ClassForName;

public class Student {
	public String name;
	private String age;

	public Student() {

	}

	public Student(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	private static void print(){
		System.out.println("����private������");
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public static void main(String [] args) {
		System.out.println("���þ�̬����");
		print();
		System.out.println("���þ�̬����");
	}
	public static void main1(Student []stu) {
		System.out.println("���þ�̬����1");
	}
}
