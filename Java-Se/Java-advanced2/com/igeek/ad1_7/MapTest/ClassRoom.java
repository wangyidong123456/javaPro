package com.igeek.ad1_7.MapTest;

import java.util.ArrayList;

public class ClassRoom {
	private String classNumber;
	private ArrayList<Student> studentsList;

	public ClassRoom() {

	}

	public ClassRoom(String classNumber, ArrayList<Student> studentsList) {
		super();
		this.classNumber = classNumber;
		this.studentsList = studentsList;
	}

	public String getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}

	public ArrayList<Student> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(ArrayList<Student> studentsList) {
		this.studentsList = studentsList;
	}
}
