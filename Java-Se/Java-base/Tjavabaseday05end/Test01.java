package Tjavabaseday05end;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Tjavabaseday0502.Student;

public class Test01 {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		String filePath = "d:\\student.txt";
		System.out.println("---------------��ӭ����ѧ������ϵͳ-----------");
		Scanner sc = new Scanner(System.in);
		// Ϊ���ó����ܹ��ص�������������ʹ��ѭ��
		boolean isContinue = true;
		while (isContinue) {
			// �Ѽ����е�Ԫ������
			students.clear();
			// ���ļ��ж�ȡ���ݵ�����Students��
			readFromFile(students, filePath);
			// ����ѧ������ϵͳ��������
			System.out.println("1������ѧ����Ϣ");
			System.out.println("2���鿴����ѧ����Ϣ");
			System.out.println("3�����ѧ����Ϣ");
			System.out.println("4��ɾ��ѧ����Ϣ");
			System.out.println("5���޸�ѧ����Ϣ");
			System.out.println("6���˳���ϵͳ");
			System.out.println("���������ѡ��");
			// ��������¼�����
			String choiceString = sc.nextLine();
			// ��switch���ʵ��ѡ��
			switch (choiceString) {
			case "1":
				// ����ѧ����Ϣ
				findDataId(students,sc);
				break;
			case "2":
				// �鿴����ѧ��
				outputDataAll(students);
				break;
			case "3":
				// ���ѧ��
				addData(students,sc);
				writeToFile(students, filePath);
				break;
			case "4":
				// ɾ��ѧ��
				deleteData(students,sc);
				writeToFile(students, filePath);
				break;
			case "5":
				// �޸�ѧ��
				modifyData(students,sc);
				writeToFile(students, filePath);
				break;
			case "6":
				isContinue = false;
				System.out.println("ллʹ�ñ�ϵͳ��");
				break;
			// �˳�;
			// System.out.println("лл���ʹ��");
			// break;
			default:
				System.out.println("����������Ч������������");
				break;
			}
		
		}
	}

	// �������е����ݴ��浽�ļ��У�����ģʽ
	public static void writeToFile(ArrayList<Student> students, String filePath) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
			for (int i = 0; i < students.size(); i++) {
				Student s = students.get(i);
				StringBuilder sb = new StringBuilder();
				sb.append(s.getId()).append(",").append(s.getName()).append(",")
						.append(s.getAge()).append(",").append(s.getAddress());
				bw.write(sb.toString());
				bw.newLine();
				bw.flush();
			}
			bw.close();
		} catch (IOException e) {
			//�쳣����ʽ
			e.printStackTrace();
		}
	}

	// ���ļ��ж�ȡ���ݵ�����Students��
	public static void readFromFile(ArrayList<Student> students, String filePath) {

		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String t;
			while ((t = br.readLine()) != null) {
				String [] data=t.split(",");
				Student s = new Student();
				s.setId(data[0]);
				s.setName(data[1]);
				s.setAge(data[2]);
				s.setSex(data[3]);
				s.setAddress(data[4]);
			}
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// ���һ��ѧ������Ϣ
	public static void addData(ArrayList<Student> stuArray,Scanner sc) {
//		Scanner sc = new Scanner(System.in);
	
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
		Student s = new Student(name,age,id,sex,address);
		stuArray.add(s);

		System.out.println("���ѧ���ɹ�");
	
	}

	// ��ѯ����ѧ������Ϣ
	public static void outputDataAll(ArrayList<Student> stuArray) {
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
	public static void findDataId(ArrayList<Student> students,Scanner sc) {
//		Scanner sc = new Scanner(System.in);
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
	public static void deleteData(ArrayList<Student> students,Scanner sc) {
//		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ�ţ�");
		String s = sc.nextLine();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			Student t = students.get(i);
			if (t.getId().equals(s)) {
				System.out.println("ѧ��Ϊ��" + t.getId() + "��ѧ����Ϣ�Ѿ���ɾ��");
				students.remove(i);
				bl = false;
			}

		}
		if (bl == true) {
			System.out.println("��ѯ������ѧ������Ϣ");
		}
		
	}

	// �޸�ѧ����Ϣ
	public static void modifyData(ArrayList<Student> students,Scanner sc) {
//		Scanner sc = new Scanner(System.in);
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
