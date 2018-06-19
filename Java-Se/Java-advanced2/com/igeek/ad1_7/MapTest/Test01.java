package com.igeek.ad1_7.MapTest;

import java.util.*;

public class Test01 {
	public static void main(String[] args) {
		Student s1 = new Student("Jack", "�༶1", 89);
		Student s2 = new Student("Jack", "�༶2", 29);
		Student s3 = new Student("Jack", "�༶1", 39);
		Student s4 = new Student("Jack", "�༶3", 49);
		Student s5 = new Student("Jack", "�༶2", 59);
		Student s6 = new Student("Jack", "�༶1", 50);
		Student s7 = new Student("Jack", "�༶1", 88);

		ArrayList<Student> allStudents = new ArrayList<Student>();
		Collections.addAll(allStudents, s1, s2, s3, s4, s5, s6, s7);
		
		ArrayList<Student> class1Students = new ArrayList<Student>();
		ArrayList<Student> class2Students = new ArrayList<Student>();
		ArrayList<Student> class3Students = new ArrayList<Student>();

		for (Student thisStudent : allStudents) {
			if ("�༶1".equals(thisStudent.getClass_number())) {
				class1Students.add(thisStudent);
			} else if ("�༶2".equals(thisStudent.getClass_number())) {
				class2Students.add(thisStudent);
			} else if ("�༶3".equals(thisStudent.getClass_number())) {
				class3Students.add(thisStudent);
			}
		}

		HashMap<String, ClassRoom> allClassMap = new HashMap<String, ClassRoom>();
		// ��������ClassRoom����
		ClassRoom class1 = new ClassRoom("�༶1", class1Students);
		ClassRoom class2 = new ClassRoom("�༶2", class2Students);
		ClassRoom class3 = new ClassRoom("�༶3", class3Students);

		// �ٽ������༶���뵽��Ӧ��Map������
		allClassMap.put("�༶1", class1);
		allClassMap.put("�༶2", class2);
		allClassMap.put("�༶3", class3);

		// ����Map���ϣ��ֱ��õ�ÿ���༶�İ༶����
		Set<String> classNumbers = allClassMap.keySet();

		// �����༶��ż���
		for (String classNumber : classNumbers) {
			// ���ݰ༶��Ż�ȡ�༶����
			ClassRoom classRoom = allClassMap.get(classNumber);
			// ���÷��������ܷ���ƽ����
			getClassInfo(classRoom);
		}

	}
	public static void getClassInfo(ClassRoom classRoom) {
		ArrayList<Student> classStudent = classRoom.getStudentsList();
		double sum = 0;
		double avg = 0;
		for (Student student : classStudent) {
			sum += student.getScore();
		}
		avg = sum / classStudent.size();
		System.out.println(classRoom.getClassNumber() + "���ܷ�Ϊ��" + sum + ",ƽ����Ϊ��" + avg);
	}
}
