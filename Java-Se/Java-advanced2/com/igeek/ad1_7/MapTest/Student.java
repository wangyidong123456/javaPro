package com.igeek.ad1_7.MapTest;

public class Student {
	String name;
	String class_number;
	double score;
	public Student(){
		
	}
	public Student(String name, String class_number, double score) {
		super();
		this.name = name;
		this.class_number = class_number;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClass_number() {
		return class_number;
	}

	public void setClass_number(String class_number) {
		this.class_number = class_number;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "name=" + name + ", class_number=" + class_number + ", score=" + score ;
	}
    
}
