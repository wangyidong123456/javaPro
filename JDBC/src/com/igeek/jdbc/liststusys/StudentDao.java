package com.igeek.jdbc.liststusys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentDao extends Student{
	Scanner sc = new Scanner(System.in);

	// addStudent添加学生
	public void addStudent(ArrayList<Student> students) {
		System.out.println("请输入一个学生信息：");
		String id;
		while (true) {
			System.out.println("请输入学号：");
			id = sc.nextLine();
			boolean flag = false;
			for (int x = 0; x < students.size(); x++) {
				Student t = students.get(x);
				if (t.getId().equals(id)) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("你输入的学号已经被占用,请重新输入");
			} else {
				break;
			}
		}
		System.out.println("请输入姓名：");
		String sname = sc.nextLine();
		System.out.println("请输入年龄：");
		String age = sc.nextLine();
		System.out.println("请输入性别：");
		String scores = sc.nextLine();
		Student s = new Student(id, sname, age, scores);
		students.add(s);
		System.out.println("添加学生成功");
	}

	// deleteById 删除学生
	public void deleteById(ArrayList<Student> students) {
		System.out.println("请输入学生id");
		String id = sc.nextLine();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
				System.out.println("找到学生id为" + id + "的学生已删除");
				students.remove(i);
				bl = false;
			}
		}
		if (bl == true) {
			System.out.println("找不到该学生");
		}
	}

	// upStudent 给学生评分
	public void upStudent(ArrayList<Student> students) {
		System.out.println("请输入学生id");
		String id = sc.nextLine();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
				System.out.println("找到学生id为" + id + "的学生，请给该学生评分");
				String scores = sc.nextLine();
				students.get(i).setScores(scores);
				System.out.println("评分成功");
				bl = false;
			}
		}
		if (bl == true) {
			System.out.println("找不到该学生");
		}
	}

	// findById 查找学生
	public void findById(ArrayList<Student> students) {
		System.out.println("请输入学生id");
		String id = sc.nextLine();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
				System.out.println(students.get(i));
				bl = false;
			}
		}
		if (bl == true) {
			System.out.println("找不到该学生");
		}
	}

	// findAll 查找学生
	public void findAll(ArrayList<Student> students) {
		if (students.size() == 0) {
			System.out.println("不好意思,目前没有学生信息可供查询,请回去重新选择你的操作");
			return;
		}
		System.out.println(students.toString());
	}

	// findAll 查找学生
	public <T> void findAllbyId(ArrayList<Student> students) {
		List<Student> newStu = new ArrayList<Student>();
		System.out.println("请输入查询第几页信息");
		int i = sc.nextInt();
		System.out.println("请输入一页显示几个信息");
		int j = sc.nextInt();
		if(i<=0){
			System.out.println("输入错误，请重新输入");
			return;
		}
		if((i)*j>students.size()){
			System.out.println("集合里面没有"+(i)*j+"条数据");
			return;
		}
		for (int a = (i-1) * j + 1; a < i  * j + 1; a++) {
			newStu.add(students.get(a));
		}
		Collections.sort(newStu,new Student());
		System.out.println(newStu);
	}

	

}
