package Tjavabaseday0502;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDao {

	// 添加一个学生的信息
	public void addData(ArrayList<Student> stuArray, Scanner sc) {
		// Scanner sc = new Scanner(System.in);

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
		Student s = new Student(name, age, id, sex, address);
		stuArray.add(s);
		System.out.println("添加学生成功");
	}

	// 查询所有学生的信息
	public void outputDataAll(ArrayList<Student> stuArray) {
		if (stuArray.size() == 0) {
			System.out.println("不好意思,目前没有学生信息可供查询,请回去重新选择你的操作");
			return;
		}
		for (int i = 0; i < stuArray.size(); i++) {
			Student s = stuArray.get(i);
			System.out.println(s.toString());
		}
	}

	// 输入ID，实现学生信息的检索，根据学号查找学生的信息
	public void findDataId(ArrayList<Student> students, Scanner sc) {
		// Scanner sc = new Scanner(System.in);
		System.out.println("请输入学号：");
		String s = sc.nextLine();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			Student t = students.get(i);
			if (t.getId().equals(s)) {
				bl = false;
				System.out.println("该学生的信息为：");
				System.out.println(t.toString());
			}
		}
		if (bl == true) {
			System.out.println("查询不到该学生的信息");
		}
	}

	// 删除学生信息
	public void deleteData(ArrayList<Student> students, Scanner sc) {
		// Scanner sc = new Scanner(System.in);
		System.out.println("请输入学号：");
		String s = sc.nextLine();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			Student t = students.get(i);
			if (t.getId().equals(s)) {
				System.out.println("找到学号为" + t.getId() + "的学生是否确定删除？删除请输入Q/输入其他则返回");
				String str = sc.nextLine();
				if (str.equals("Q") || str.equals("q")) {
					System.out.println("学号为：" + t.getId() + "的学生信息已经被删除");
					students.remove(i);
				}
				bl = false;
			}
		}
		if (bl == true) {
			System.out.println("查询不到该学生的信息");
		}
	}

	// 修改学生信息
	public void modifyData(ArrayList<Student> students, Scanner sc) {
		// Scanner sc = new Scanner(System.in);
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
	}

}
