package com.igeek.jdbc.JAday04_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Test01 {

	public static void main(String[] args) {
//		Properties prop = new Properties();
		
		ArrayList<Student> students = new ArrayList<Student>();
		String filePath = "d:\\student.txt";
		
		System.out.println("---------------欢迎来到学生管理系统-----------");
		Scanner sc = new Scanner(System.in);
		// 为了让程序能够回到这里来，我们使用循环
		boolean isContinue = true;
		while (isContinue) {
			// 把集合中的元素清零
			students.clear();
			// 从文件中读取数据到集合Students中
			readFromFile(students, filePath);
			// 这是学生管理系统的主界面
			System.out.println("---------------1、查找学生信息---------------");
			System.out.println("---------------2、查看所有学生信息------------");
			System.out.println("---------------3、添加学生信息---------------");
			System.out.println("---------------4、删除学生信息---------------");
			System.out.println("---------------5、修改学生信息---------------");
			System.out.println("---------------6、退出本系统----------------");
			System.out.println("请输入你的选择：");
			// 创建键盘录入对象
			String choiceString = sc.nextLine();
			// 用switch语句实现选择
			switch (choiceString) {
			case "1":
				// 查找学生信息
				findDataId(students);
				break;
			case "2":
				// 查看所有学生
				outputDataAll(students);
				break;
			case "3":
				// 添加学生
				addData(students);
				writeToFile(students, filePath);
				break;
			case "4":
				// 删除学生
				deleteData(students);
				writeToFile(students, filePath);
				break;
			case "5":
				// 修改学生
				modifyData(students);
				writeToFile(students, filePath);
				break;
			case "6":
				isContinue = false;
				System.out.println("谢谢使用本系统！");
				break;
			// 退出;
			// System.out.println("谢谢你的使用");
			// break;
			default:
				System.out.println("输入数据无效，请重新输入");
				break;
			}
			sc.close();
		}
	}

	// 将集合中的数据储存到文件中，覆盖模式
	public static void writeToFile(ArrayList<Student> students, String filePath) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
			for (int i = 0; i < students.size(); i++) {
				Student s = students.get(i);
				bw.write(s.getId());
				bw.newLine();
				bw.write(s.getName());
				bw.newLine();
				bw.write(s.getAge());
				bw.newLine();
				bw.write(s.getSex());
				bw.newLine();
				bw.write(s.getAddress());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			//异常处理方式
			e.printStackTrace();
		}
	}

	// 从文件中读取数据到集合Students中
	public static void readFromFile(ArrayList<Student> students, String filePath) {

		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String t;
			while ((t = br.readLine()) != null) {
				Student s = new Student();
				s.setId(t);
				t = br.readLine();
				s.setName(t);
				t = br.readLine();
				s.setAge(t);
				t = br.readLine();
				s.setSex(t);
				t = br.readLine();
				s.setAddress(t);
				students.add(s);
			}
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 添加一个学生的信息
	public static void addData(ArrayList<Student> stuArray) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.println("请输入一个学生信息：");
		String id;
		while (true) {
			System.out.println("请输入学号：");
			id = sc.nextLine();
			boolean flag = false;
			for (int x = 0; x < stuArray.size(); x++) {
				Student t = stuArray.get(x);
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
		String name = sc.nextLine();
		System.out.println("请输入年龄：");
		String age = sc.nextLine();
		System.out.println("请输入性别：");
		String sex = sc.nextLine();
		System.out.println("请输入地址：");
		String address = sc.nextLine();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setSex(sex);
		s.setAddress(address);
		stuArray.add(s);

		System.out.println("添加学生成功");
		sc.close();
	}

	// 查询所有学生的信息
	public static void outputDataAll(ArrayList<Student> stuArray) {
		if (stuArray.size() == 0) {
			System.out.println("不好意思,目前没有学生信息可供查询,请回去重新选择你的操作");
			return;
		}
		for (int i = 0; i < stuArray.size(); i++) {
			Student s = stuArray.get(i);
			System.out.print("\t学号:\t" + s.getId());
			System.out.print("\t姓名:\t" + s.getName());
			System.out.print("\t年龄:\t" + s.getAge());
			System.out.print("\t性别:\t" + s.getSex());
			System.out.print("\t地址:\t" + s.getAddress());
			System.out.println("");
		}
	}

	// 输入ID，实现学生信息的检索，根据学号查找学生的信息
	public static void findDataId(ArrayList<Student> students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学号：");
		String s = sc.nextLine();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			Student t = students.get(i);
			if (t.getId().equals(s)) {
				bl = false;
				System.out.println("该学生的信息为：");
				System.out.print("\t学号:" + t.getId());
				System.out.print("\t姓名:" + t.getName());
				System.out.print("\t年龄:" + t.getAge());
				System.out.print("\t性别:" + t.getSex());
				System.out.print("\t地址:" + t.getAddress());
				System.out.println("");
			}
		}
		if (bl == true) {
			System.out.println("查询不到该学生的信息");
		}
     sc.close();
	}

	// 删除学生信息
	public static void deleteData(ArrayList<Student> students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学号：");
		String s = sc.nextLine();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			Student t = students.get(i);
			if (t.getId().equals(s)) {
				System.out.println("学号为：" + t.getId() + "的学生信息已经被删除");
				students.remove(i);
				bl = false;
			}

		}
		if (bl == true) {
			System.out.println("查询不到该学生的信息");
		}
		sc.close();
	}

	// 修改学生信息
	public static void modifyData(ArrayList<Student> students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学号：");
		String s = sc.nextLine();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			Student t = students.get(i);
			if (t.getId().equals(s)) {
				System.out.println("请输入新的学号：");
				String x0 = sc.nextLine();
				t.setId(x0);
				System.out.println("请输入新的名字：");
				String x = sc.nextLine();
				t.setName(x);
				System.out.println("请输入新的年龄：");
				String x1 = sc.nextLine();
				t.setAge(x1);
				System.out.println("请输入新的性别：");
				String x2 = sc.nextLine();
				t.setSex(x2);
				System.out.println("请输入新的地址：");
				String x3 = sc.nextLine();
				t.setAddress(x3);
				bl = false;
			}
		}
		if (bl == true) {
			System.out.println("查询不到该学生的信息");
		}
		sc.close();
	}

}
