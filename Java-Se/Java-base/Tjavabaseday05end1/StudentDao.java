package Tjavabaseday05end1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDao {
	// ���ļ�������
	public void readFromFile(ArrayList<Student> students, String filePath) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String str;
		while((str=br.readLine())!=null){
         String [] datas=str.split(",");
         Student stu = new Student(datas[0],datas[1],datas[2],datas[3],datas[4]);
         students.add(stu);
		}
		br.close();
	}

	// ���ļ���д����
	public void writeToFile(ArrayList<Student> students, String filePath) throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
		for (int i = 0; i < students.size(); i++) {
			bw.write(students.get(i).toShow());
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}

	// ���һ��ѧ������Ϣ
	public void addData(ArrayList<Student> stuArray, Scanner sc) {
		// Scanner sc = new Scanner(System.in);
		System.out.println("������һ��ѧ����Ϣ��");
		String id;
		while (true) {
			System.out.println("������ѧ�ţ�");
			id = sc.next();
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
		String name = sc.next();
		System.out.println("���������䣺");
		String age = sc.next();
		System.out.println("�������Ա�");
		String sex = sc.next();
		System.out.println("�������ַ��");
		String address = sc.next();
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
		String s = sc.next();
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
		String s = sc.next();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			Student t = students.get(i);
			if (t.getId().equals(s)) {
				System.out.println("�ҵ�ѧ��Ϊ" + t.getId() + "��ѧ��:\n"+t.toString()+"\n�Ƿ�ȷ��ɾ����ɾ��������Q/���������򷵻�");
				String str = sc.next();
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
		String s = sc.next();
		boolean bl = true;
		for (int i = 0; i < students.size(); i++) {
			Student t = students.get(i);
			if (t.getId().equals(s)) {
				System.out.println("�ҵ�ѧ��Ϊ" + t.getId() + "��ѧ��:\n"+t.toString()+"\n");
				System.out.println("�������µ����֣�");
				String x = sc.next();
				System.out.println("�������µ����䣺");
				String x1 = sc.next();
				System.out.println("�������µ��Ա�");
				String x2 = sc.next();
				System.out.println("�������µĵ�ַ��");
				String x3 = sc.next();
				t.setName(x);
				t.setAge(x1);
				t.setSex(x2);
				t.setAddress(x3);
				bl = false;
			}
		}
		System.out.println("�޸�ѧ����Ϣ�ɹ�");
		if (bl == true) {
			System.out.println("��ѯ������ѧ������Ϣ");
		}
	}

}
