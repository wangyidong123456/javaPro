package com.igeek.ad1_7.APITest;

import java.util.Scanner;


public class Test01 {
	// ����¼��һ���ַ�����Ҫ��ɾ�����ַ����е�����"java"�ַ��������յ��ַ����в��ܰ���java����
	// Ҫ���ӡɾ����Ľ���Լ�ɾ���˼���java�ַ���
	// �������¼�룺"java woaijava,i like jajavava,i enjoy java"
	// ������������
	// ԭ�ַ�����"java woaijava,i like jajavava,i enjoy java"��
	// �ܹ�������5��javaɾ��java����ַ���Ϊ��" woai,i like ,i enjoy "

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
		System.out.println("����ַ���Ϊ:"+ss+"\nɾ����"+total+"��"+s);
	}

	// ɾ��һ���ַ�����ָ���ַ���s
	public void delete(String s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String temp = sc.nextLine();
		while (temp.indexOf(s) != -1) {
			temp = temp.replace(s, "");
		}
		System.out.println(temp);
		sc.close();
	}

	// ɾ��һ���ַ�����ָ���ַ���s1
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
		System.out.println("ԭ�ַ�����" + str + "��");
		System.out.println("�ܹ�������" + i + "��java��ɾ��java����ַ���Ϊ��" + str1);
		sc.close();
	}
}
