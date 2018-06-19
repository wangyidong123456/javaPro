package com.igeek.jdbc.liststusysjdbc;

import java.util.Scanner;


public class StudentAction extends StudentDao {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StudentAction sa=new StudentAction();
		sa.systemStudent();
	}

	public void systemStudent() {
		System.out.println("欢迎进入学生系统");
		while (true) {
			System.out.println("1、添加学生");
			System.out.println("2、显示所有学员信息");
			System.out.println("3、根据学号显示学员信息");
			System.out.println("4、给学生评分");
			System.out.println("5、根据学号删除学生");
			System.out.println("6、按学号升序排序，分页显示学员信息，每页三条");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("请输入学号：");
				String id = sc.next();
				System.out.println("请输入姓名：");
				String sname = sc.next();
				System.out.println("请输入年龄：");
				String age = sc.next();
				System.out.println("请输入性别：");
				String scores = sc.next();
				Student student = new Student(id, sname, age, scores);
				if(addStudent(student)==1){
					System.out.println("添加学生成功");
				}else{
					System.out.println("添加学生失败");
				}
				break;
			case 2:
				System.out.println(findAll());
				break;
			case 3:
				System.out.println("请输入查询学生学号！");
				String s=sc.next();
				System.out.println(findById(s));
				break;
			case 4:
				System.out.println("请输入打分学生学号！");
				String s1=sc.next();
				System.out.println("请输入分数");
				String scores1 = sc.next();
				if(upStudent(s1,scores1)==1){
					System.out.println("评分成功");
				}else{
					System.out.println("评分失败");
				}
				break;
			case 5:
				System.out.println("请输入查询学生学号！");
				String s2=sc.next();
				if(deleteById(s2)==1){
					System.out.println("删除成功");
				}else{
					System.out.println("删除失败");
				}
				break;
			case 6:
				System.out.println("请输入第几页学员");
				int start=sc.nextInt();
				System.out.println(findAll(start));
				break;
			default:
				System.out.println("输入数字错误，请重新输入");
				break;
			}
		}
	}

}
