package Tjavabaseday052;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// ����һ�����ϣ��洢ѧ������ѧ����������������ڼ���¼�룬��󣬱�������
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
		
		System.out.println("������ѧ�ţ�");
		String id = sc.next();
		System.out.println("������������");
		String name = sc.next();
		System.out.println("���������䣺");
		int age = sc.nextInt();
		System.out.println("�������Ա�");
		String sex = sc.next();
		System.out.println("�������ַ��");
		String address = sc.next();	
		Student s= new Student(name,age,id,sex,address);
		array.add(s);
		System.out.println("���ѧ���ɹ�");
		
	}
	
}
