package Tjavabaseday052;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// 创建一个集合，存储学生对象，学生对象的数据来自于键盘录入，最后，遍历集合
        ArrayList<Student> array=new ArrayList<Student>();
        StudentService stus=new StudentService();
        stus.addArray(array);
        stus.addArray(array);
        stus.addArray(array);
        for(int i=0;i<array.size();i++){
        	System.out.println(array.get(i));
        }
        sc.close();
	}

	private  void addArray(ArrayList<Student> array) {
		// TODO Auto-generated method stub
		
		System.out.println("请输入学号：");
		String id = sc.next();
		System.out.println("请输入姓名：");
		String name = sc.next();
		System.out.println("请输入年龄：");
		int age = sc.nextInt();
		System.out.println("请输入性别：");
		String sex = sc.next();
		System.out.println("请输入地址：");
		String address = sc.next();	
		Student s= new Student(name,age,id,sex,address);
		array.add(s);
		System.out.println("添加学生成功");
		
	}
	
}
