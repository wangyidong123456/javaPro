package com.igeek.jdbc.liststusysjdbc;

public class Test01 {

	public static void main(String[] args) {
		StudentDao sd=new StudentDao();	
		String sql="select * from stu";
		System.out.println(sd.getListValue(sql,Student.class));
		
	}

}
