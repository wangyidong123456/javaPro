package com.igeek.jdbc.liststusys;

import java.util.Comparator;

public class Student implements  Comparator<Student>{
	private String id;
	private String sname;
	private String age;
	private String scores;

	public Student() {

	}

	public Student(String id, String sname, String age, String scores) {
		super();
		this.id = id;
		this.sname = sname;
		this.age = age;
		this.scores = scores;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getScores() {
		return scores;
	}

	public void setScores(String scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", age=" + age + ", scores=" + scores + "]";
	}

	@Override
	public int compare(Student s1, Student s2) {
		return s1.id.compareTo(s2.id);
	}




}
