package com.igeek.jdbc.studentsystem;

import org.junit.Test;

public class Test01 {

	public static void main(String[] args) {
		Student stu=new Student("s001","С��","25","Ů","�人");
		StudentDao sd=new StudentDao();
//		StudentDao.addStudent(stu);
//		StudentDao.deleteStudent("s001");
		sd.upStudent(stu);
		System.out.println(sd.seStudent("s001"));
		System.out.println(sd.seAllStudents());
		
	}
	@Test
	public void testcbyid(){
		ClassesDao cd=new ClassesDao();
//		System.out.println(cd.findbyId(1));
		System.out.println(cd.findClasses(1));
//		System.out.println(cd.findClassesMap(1));
	}
	@Test
	public void testfindcAll(){
		ClassesDao cd=new ClassesDao();
//		System.out.println(cd.findClassesAll());
		System.out.println(cd.findClassesMapList());
	}
	

}
