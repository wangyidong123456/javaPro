package com.igeek.ad2_1.ClassForName;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) throws Exception {
		// 反射获取Class
		Class<?> clazz = Class.forName("com.igeek.ad1_7.ClassForName.Student");
		// 创建对象
		Object obj = clazz.newInstance();
		// 获取set方法
		Method m1 = clazz.getMethod("setName", String.class);
		//暴力获取私有方法
		Method m2 = clazz.getDeclaredMethod("print");
		//获取静态方法
//		Method m3= clazz.getMethod("main1",Student[].class);
//		Student [] stu={};
//		m3.invoke(obj);
		//给强制访问权限
		m2.setAccessible(true);
		// 用invoke调用set方法
		m1.invoke(obj, "小红");
		m2.invoke(obj);
//		String a[] ={};
//		int a[] ={};
		//m3.invoke(null);
//		Student.main(null);
		System.out.println(obj);
//		 遍历所有方法
		 System.out.println(Arrays.toString(clazz.getMethods()));
		 for(Method m:clazz.getMethods()){
		 System.out.println(m.getName());
		 }
		 System.out.println("------------");

//		 遍历所有字段
		 for(Field f:clazz.getFields()){
		 System.out.println(f.getName());
		 }
//		获取有参构造方法
		Constructor<?> ct=clazz.getConstructor(String.class,String.class);
		Object obj1=ct.newInstance("小红","22");
		System.out.println(obj1);
	}

}
