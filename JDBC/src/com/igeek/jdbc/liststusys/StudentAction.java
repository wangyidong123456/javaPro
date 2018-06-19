package com.igeek.jdbc.liststusys;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentAction extends StudentDao {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StudentAction sa=new StudentAction();
		sa.systemStudent();
	}

	public void systemStudent() {
		ArrayList<Student> students = new ArrayList<Student>();
		System.out.println("欢迎进入学生系统");
		while (true) {
			System.out.println("1、添加学生");
			System.out.println("2、显示所有学员信息");
			System.out.println("3、根据学号显示学员信息");
			System.out.println("4、给学生评分");
			System.out.println("5、根据学号删除学生");
			System.out.println("6、按学号升序排序，分页显示学员信息，每页三条");
			String a = sc.next();
			switch (a) {
			case "1":
				addStudent(students);
				break;
			case "2":
				findAll(students);
				break;
			case "3":
				findById(students);
				break;
			case "4":
				upStudent(students);
				break;
			case "5":
				deleteById(students);
				break;
			case "6":
				findAllbyId(students);
				break;
			default:
				System.out.println("输入数字错误，请重新输入");
				break;
			}
		}
	}

}
