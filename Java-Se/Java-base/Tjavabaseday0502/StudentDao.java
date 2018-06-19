package Tjavabaseday0502;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDao {

	// ���һ��ѧ������Ϣ
	public void addData(ArrayList<Student> stuArray, Scanner sc) {
		// Scanner sc = new Scanner(System.in);

		System.out.println("������һ��ѧ����Ϣ��");
		String id;
		while (true) {
			System.out.println("������ѧ�ţ�");
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
				System.out.println("�������ѧ���Ѿ���ռ��,����������");
			} else {
				break;
			}
		}
		System.out.println("������������");
		String name = sc.nextLine();
		System.out.println("���������䣺");
		String age = sc.nextLine();
		System.out.println("�������Ա�");
		String sex = sc.nextLine();
		System.out.println("�������ַ��");
		String address = sc.nextLine();
		Student s = new Student(name, age, id, sex, address);
		stuArray.add(s);
		System.out.println("���ѧ���ɹ�");
	}

	// ��ѯ����ѧ������Ϣ
	public void outputDataAll(ArrayList<Student> stuArray) {
		if (stuArray.size() == 0) {
			System.out.println("������˼,Ŀǰû��ѧ����Ϣ�ɹ���ѯ,���ȥ����ѡ����Ĳ���");
			return;
		}
		for (int i = 0; i < stuArray.size(); i++) {
			Student s = stuArray.get(i);
			System.out.println(s.toString());
		}
	}

	// ����ID��ʵ��ѧ����Ϣ�ļ���������ѧ�Ų���ѧ������Ϣ
	public void findDataId(ArrayList<Student> students, Scanner sc) {
		// Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ�ţ�");
		String s = sc.nextLine();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			Student t = students.get(i);
			if (t.getId().equals(s)) {
				bl = false;
				System.out.println("��ѧ������ϢΪ��");
				System.out.println(t.toString());
			}
		}
		if (bl == true) {
			System.out.println("��ѯ������ѧ������Ϣ");
		}
	}

	// ɾ��ѧ����Ϣ
	public void deleteData(ArrayList<Student> students, Scanner sc) {
		// Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ�ţ�");
		String s = sc.nextLine();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			Student t = students.get(i);
			if (t.getId().equals(s)) {
				System.out.println("�ҵ�ѧ��Ϊ" + t.getId() + "��ѧ���Ƿ�ȷ��ɾ����ɾ��������Q/���������򷵻�");
				String str = sc.nextLine();
				if (str.equals("Q") || str.equals("q")) {
					System.out.println("ѧ��Ϊ��" + t.getId() + "��ѧ����Ϣ�Ѿ���ɾ��");
					students.remove(i);
				}
				bl = false;
			}
		}
		if (bl == true) {
			System.out.println("��ѯ������ѧ������Ϣ");
		}
	}

	// �޸�ѧ����Ϣ
	public void modifyData(ArrayList<Student> students, Scanner sc) {
		// Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ�ţ�");
		String s = sc.nextLine();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			Student t = students.get(i);
			if (t.getId().equals(s)) {
				System.out.println("�������µ�ѧ�ţ�");
				String x0 = sc.nextLine();
				t.setId(x0);
				System.out.println("�������µ����֣�");
				String x = sc.nextLine();
				t.setName(x);
				System.out.println("�������µ����䣺");
				String x1 = sc.nextLine();
				t.setAge(x1);
				System.out.println("�������µ��Ա�");
				String x2 = sc.nextLine();
				t.setSex(x2);
				System.out.println("�������µĵ�ַ��");
				String x3 = sc.nextLine();
				t.setAddress(x3);
				bl = false;
			}
		}
		if (bl == true) {
			System.out.println("��ѯ������ѧ������Ϣ");
		}
	}

}
