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
		System.out.println("��ӭ����ѧ��ϵͳ");
		while (true) {
			System.out.println("1�����ѧ��");
			System.out.println("2����ʾ����ѧԱ��Ϣ");
			System.out.println("3������ѧ����ʾѧԱ��Ϣ");
			System.out.println("4����ѧ������");
			System.out.println("5������ѧ��ɾ��ѧ��");
			System.out.println("6����ѧ���������򣬷�ҳ��ʾѧԱ��Ϣ��ÿҳ����");
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
				System.out.println("�������ִ�������������");
				break;
			}
		}
	}

}
