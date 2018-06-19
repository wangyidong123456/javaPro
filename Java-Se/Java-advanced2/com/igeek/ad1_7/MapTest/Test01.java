package com.igeek.ad1_7.MapTest;

import java.util.*;

public class Test01 {
	public static void main(String[] args) {
		Student s1 = new Student("Jack", "班级1", 89);
		Student s2 = new Student("Jack", "班级2", 29);
		Student s3 = new Student("Jack", "班级1", 39);
		Student s4 = new Student("Jack", "班级3", 49);
		Student s5 = new Student("Jack", "班级2", 59);
		Student s6 = new Student("Jack", "班级1", 50);
		Student s7 = new Student("Jack", "班级1", 88);

		ArrayList<Student> allStudents = new ArrayList<Student>();
		Collections.addAll(allStudents, s1, s2, s3, s4, s5, s6, s7);
		
		ArrayList<Student> class1Students = new ArrayList<Student>();
		ArrayList<Student> class2Students = new ArrayList<Student>();
		ArrayList<Student> class3Students = new ArrayList<Student>();

		for (Student thisStudent : allStudents) {
			if ("班级1".equals(thisStudent.getClass_number())) {
				class1Students.add(thisStudent);
			} else if ("班级2".equals(thisStudent.getClass_number())) {
				class2Students.add(thisStudent);
			} else if ("班级3".equals(thisStudent.getClass_number())) {
				class3Students.add(thisStudent);
			}
		}

		HashMap<String, ClassRoom> allClassMap = new HashMap<String, ClassRoom>();
		// 创建三个ClassRoom对象
		ClassRoom class1 = new ClassRoom("班级1", class1Students);
		ClassRoom class2 = new ClassRoom("班级2", class2Students);
		ClassRoom class3 = new ClassRoom("班级3", class3Students);

		// 再将三个班级加入到对应的Map集合中
		allClassMap.put("班级1", class1);
		allClassMap.put("班级2", class2);
		allClassMap.put("班级3", class3);

		// 遍历Map集合，分别拿到每个班级的班级对象
		Set<String> classNumbers = allClassMap.keySet();

		// 迭代班级班号集合
		for (String classNumber : classNumbers) {
			// 根据班级班号获取班级对象
			ClassRoom classRoom = allClassMap.get(classNumber);
			// 调用方法，求总分与平均分
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
		System.out.println(classRoom.getClassNumber() + "的总分为：" + sum + ",平均分为：" + avg);
	}
}
