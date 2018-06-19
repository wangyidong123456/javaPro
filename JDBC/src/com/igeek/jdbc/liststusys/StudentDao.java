package com.igeek.jdbc.liststusys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentDao extends Student{
	Scanner sc = new Scanner(System.in);

	// addStudent���ѧ��
	public void addStudent(ArrayList<Student> students) {
		System.out.println("������һ��ѧ����Ϣ��");
		String id;
		while (true) {
			System.out.println("������ѧ�ţ�");
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
				System.out.println("�������ѧ���Ѿ���ռ��,����������");
			} else {
				break;
			}
		}
		System.out.println("������������");
		String sname = sc.nextLine();
		System.out.println("���������䣺");
		String age = sc.nextLine();
		System.out.println("�������Ա�");
		String scores = sc.nextLine();
		Student s = new Student(id, sname, age, scores);
		students.add(s);
		System.out.println("���ѧ���ɹ�");
	}

	// deleteById ɾ��ѧ��
	public void deleteById(ArrayList<Student> students) {
		System.out.println("������ѧ��id");
		String id = sc.nextLine();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
				System.out.println("�ҵ�ѧ��idΪ" + id + "��ѧ����ɾ��");
				students.remove(i);
				bl = false;
			}
		}
		if (bl == true) {
			System.out.println("�Ҳ�����ѧ��");
		}
	}

	// upStudent ��ѧ������
	public void upStudent(ArrayList<Student> students) {
		System.out.println("������ѧ��id");
		String id = sc.nextLine();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
				System.out.println("�ҵ�ѧ��idΪ" + id + "��ѧ���������ѧ������");
				String scores = sc.nextLine();
				students.get(i).setScores(scores);
				System.out.println("���ֳɹ�");
				bl = false;
			}
		}
		if (bl == true) {
			System.out.println("�Ҳ�����ѧ��");
		}
	}

	// findById ����ѧ��
	public void findById(ArrayList<Student> students) {
		System.out.println("������ѧ��id");
		String id = sc.nextLine();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId().equals(id)) {
				System.out.println(students.get(i));
				bl = false;
			}
		}
		if (bl == true) {
			System.out.println("�Ҳ�����ѧ��");
		}
	}

	// findAll ����ѧ��
	public void findAll(ArrayList<Student> students) {
		if (students.size() == 0) {
			System.out.println("������˼,Ŀǰû��ѧ����Ϣ�ɹ���ѯ,���ȥ����ѡ����Ĳ���");
			return;
		}
		System.out.println(students.toString());
	}

	// findAll ����ѧ��
	public <T> void findAllbyId(ArrayList<Student> students) {
		List<Student> newStu = new ArrayList<Student>();
		System.out.println("�������ѯ�ڼ�ҳ��Ϣ");
		int i = sc.nextInt();
		System.out.println("������һҳ��ʾ������Ϣ");
		int j = sc.nextInt();
		if(i<=0){
			System.out.println("�����������������");
			return;
		}
		if((i)*j>students.size()){
			System.out.println("��������û��"+(i)*j+"������");
			return;
		}
		for (int a = (i-1) * j + 1; a < i  * j + 1; a++) {
			newStu.add(students.get(a));
		}
		Collections.sort(newStu,new Student());
		System.out.println(newStu);
	}

	

}
