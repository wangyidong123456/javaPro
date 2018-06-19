package com.igeek.jdbc.liststusys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		List<Student> stus=new ArrayList<Student>();
		Student s1=new Student("esdf","","","");
		Student s2=new Student("bsdfdf","","","");
		Student s3=new Student("aagdf","","","");
		Student s4=new Student("dedf","","","");
		Student s5=new Student("aqdf","","","");
		stus.add(s1);
		stus.add(s2);
		stus.add(s3);
		stus.add(s4);
		stus.add(s5);
		Collections.sort(stus,new Student());
		System.out.println(stus);

	}

}
