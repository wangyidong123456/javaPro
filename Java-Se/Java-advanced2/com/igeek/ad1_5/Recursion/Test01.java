package com.igeek.ad1_5.Recursion;

//递归，指在当前方法内调用自己的这种现象
//递归分为两种，直接递归和间接递归。
//直接递归称为方法自身调用自己。
//间接递归可以A方法调用B方法，B方法调用C方法，C方法调用A方法。
public class Test01 {
	/**
	 * @Fields i : 成员位置定义变量,供不同的方法访问
	 */
	static int i = 1;
	public static void main(String[] args) {
		methodA();
	}
	/**
	 * @Title: methodA
	 * @Description: 第一个方法：打印i,i++,再调用其他方法,i++,打印
	 */
	public static void methodA() {
		System.out.println("方法A:" + i);
		i++;
		methodB();
		i++;
		System.out.println("方法A:" + i);
	}
	/**
	 * @Title: methodB
	 * @Description: 第二个方法
	 */
	public static void methodB() {
		System.out.println("方法B:" + i);
		i++;
		methodC();
		i++;
		System.out.println("方法B:" + i);
	}
	/**
	 * @Title: methodC
	 * @Description: 第三个方法
	 */
	private static void methodC() {
		System.out.println("方法C:" + i);
		i++;
		methodD();
		i++;
		System.out.println("方法C:" + i);
	}
	/**
	 * @Title: methodD
	 * @Description: 第四个方法
	 */
	private static void methodD() {
		System.out.println("方法D:" + i);
	}
}
