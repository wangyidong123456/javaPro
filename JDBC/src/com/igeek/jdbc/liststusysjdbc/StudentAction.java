package com.igeek.jdbc.liststusysjdbc;

import java.util.Scanner;


public class StudentAction extends StudentDao {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StudentAction sa=new StudentAction();
		sa.systemStudent();
	}

	public void systemStudent() {
		System.out.println("��ӭ����ѧ��ϵͳ");
		while (true) {
			System.out.println("1�����ѧ��");
			System.out.println("2����ʾ����ѧԱ��Ϣ");
			System.out.println("3������ѧ����ʾѧԱ��Ϣ");
			System.out.println("4����ѧ������");
			System.out.println("5������ѧ��ɾ��ѧ��");
			System.out.println("6����ѧ���������򣬷�ҳ��ʾѧԱ��Ϣ��ÿҳ����");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("������ѧ�ţ�");
				String id = sc.next();
				System.out.println("������������");
				String sname = sc.next();
				System.out.println("���������䣺");
				String age = sc.next();
				System.out.println("�������Ա�");
				String scores = sc.next();
				Student student = new Student(id, sname, age, scores);
				if(addStudent(student)==1){
					System.out.println("���ѧ���ɹ�");
				}else{
					System.out.println("���ѧ��ʧ��");
				}
				break;
			case 2:
				System.out.println(findAll());
				break;
			case 3:
				System.out.println("�������ѯѧ��ѧ�ţ�");
				String s=sc.next();
				System.out.println(findById(s));
				break;
			case 4:
				System.out.println("��������ѧ��ѧ�ţ�");
				String s1=sc.next();
				System.out.println("���������");
				String scores1 = sc.next();
				if(upStudent(s1,scores1)==1){
					System.out.println("���ֳɹ�");
				}else{
					System.out.println("����ʧ��");
				}
				break;
			case 5:
				System.out.println("�������ѯѧ��ѧ�ţ�");
				String s2=sc.next();
				if(deleteById(s2)==1){
					System.out.println("ɾ���ɹ�");
				}else{
					System.out.println("ɾ��ʧ��");
				}
				break;
			case 6:
				System.out.println("������ڼ�ҳѧԱ");
				int start=sc.nextInt();
				System.out.println(findAll(start));
				break;
			default:
				System.out.println("�������ִ�������������");
				break;
			}
		}
	}

}
