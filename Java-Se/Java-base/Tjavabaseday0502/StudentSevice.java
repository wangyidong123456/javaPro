package Tjavabaseday0502;


import java.util.ArrayList;
import java.util.Scanner;

import Tjavabaseday0502.Student;

public class StudentSevice {



	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		StudentDao stuDao=new StudentDao();
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------��ӭ����ѧ������ϵͳ-----------");
		// Ϊ���ó����ܹ��ص�������������ʹ��ѭ��
		boolean isContinue = true;
		while (isContinue) {
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
				stuDao.findDataId(students,sc);
				break;
			case "2":
				// �鿴����ѧ��
				stuDao.outputDataAll(students);
				break;
			case "3":
				// ���ѧ��
				stuDao.addData(students,sc);
				break;
			case "4":
				// ɾ��ѧ��
				stuDao.deleteData(students,sc);
				break;
			case "5":
				// �޸�ѧ��
				stuDao.modifyData(students,sc);
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

}
