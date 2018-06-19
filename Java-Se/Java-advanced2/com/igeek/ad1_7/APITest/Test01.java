package com.igeek.ad1_7.APITest;

import java.util.Scanner;


public class Test01 {
	// 键盘录入一个字符串，要求删除该字符串中的所有"java"字符串（最终的字符串中不能包含java），
	// 要求打印删除后的结果以及删除了几个java字符串
	// 比如键盘录入："java woaijava,i like jajavava,i enjoy java"
	// 程序输出结果：
	// 原字符串："java woaijava,i like jajavava,i enjoy java"中
	// 总共包含：5个java删除java后的字符串为：" woai,i like ,i enjoy "

	public static void main(String[] args) {
		Test01 te = new Test01();
		String ss = "java woaijava,i like jajavava,i enjoy java";
		String s = "java";
		// te.delete1(s);
		te.delete(s);
		int total = 0;
		while (ss.indexOf(s) != -1) {
			String[] temps = ss.split(s);
			String s1 = "";
			for (String temp : temps) {
				s1 += temp;
			}
			if (ss.endsWith(s)) {
				total += temps.length;
			} else {
				total += temps.length - 1;
			}
			System.out.println(ss+" "+total+" "+temps.length+" "+ss.endsWith(s));
			ss = s1;
		}
		System.out.println("最后字符串为:"+ss+"\n删除了"+total+"个"+s);
	}

	// 删除一个字符串里指定字符串s
	public void delete(String s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String temp = sc.nextLine();
		while (temp.indexOf(s) != -1) {
			temp = temp.replace(s, "");
		}
		System.out.println(temp);
		sc.close();
	}

	// 删除一个字符串里指定字符串s1
	public void delete1(String s) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = str;
		int i = 0;
		int index;
		while ((index = str1.indexOf(s)) != -1) {
			i++;
			String before = str1.substring(0, index);
			String after = str1.substring(index + 4);
			str1 = before + after;
			System.out.println(str1);
		}
		System.out.println("============================================");
		System.out.println("原字符串：" + str + "中");
		System.out.println("总共包含：" + i + "个java，删除java后的字符串为：" + str1);
		sc.close();
	}
}
