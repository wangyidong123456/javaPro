package com.igeek.ad2_1.ClassForName;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) throws Exception {
		// �����ȡClass
		Class<?> clazz = Class.forName("com.igeek.ad1_7.ClassForName.Student");
		// ��������
		Object obj = clazz.newInstance();
		// ��ȡset����
		Method m1 = clazz.getMethod("setName", String.class);
		//������ȡ˽�з���
		Method m2 = clazz.getDeclaredMethod("print");
		//��ȡ��̬����
//		Method m3= clazz.getMethod("main1",Student[].class);
//		Student [] stu={};
//		m3.invoke(obj);
		//��ǿ�Ʒ���Ȩ��
		m2.setAccessible(true);
		// ��invoke����set����
		m1.invoke(obj, "С��");
		m2.invoke(obj);
//		String a[] ={};
//		int a[] ={};
		//m3.invoke(null);
//		Student.main(null);
		System.out.println(obj);
//		 �������з���
		 System.out.println(Arrays.toString(clazz.getMethods()));
		 for(Method m:clazz.getMethods()){
		 System.out.println(m.getName());
		 }
		 System.out.println("------------");

//		 ���������ֶ�
		 for(Field f:clazz.getFields()){
		 System.out.println(f.getName());
		 }
//		��ȡ�вι��췽��
		Constructor<?> ct=clazz.getConstructor(String.class,String.class);
		Object obj1=ct.newInstance("С��","22");
		System.out.println(obj1);
	}

}
