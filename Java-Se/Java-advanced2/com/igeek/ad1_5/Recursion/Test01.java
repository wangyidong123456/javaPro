package com.igeek.ad1_5.Recursion;

//�ݹ飬ָ�ڵ�ǰ�����ڵ����Լ�����������
//�ݹ��Ϊ���֣�ֱ�ӵݹ�ͼ�ӵݹ顣
//ֱ�ӵݹ��Ϊ������������Լ���
//��ӵݹ����A��������B������B��������C������C��������A������
public class Test01 {
	/**
	 * @Fields i : ��Աλ�ö������,����ͬ�ķ�������
	 */
	static int i = 1;
	public static void main(String[] args) {
		methodA();
	}
	/**
	 * @Title: methodA
	 * @Description: ��һ����������ӡi,i++,�ٵ�����������,i++,��ӡ
	 */
	public static void methodA() {
		System.out.println("����A:" + i);
		i++;
		methodB();
		i++;
		System.out.println("����A:" + i);
	}
	/**
	 * @Title: methodB
	 * @Description: �ڶ�������
	 */
	public static void methodB() {
		System.out.println("����B:" + i);
		i++;
		methodC();
		i++;
		System.out.println("����B:" + i);
	}
	/**
	 * @Title: methodC
	 * @Description: ����������
	 */
	private static void methodC() {
		System.out.println("����C:" + i);
		i++;
		methodD();
		i++;
		System.out.println("����C:" + i);
	}
	/**
	 * @Title: methodD
	 * @Description: ���ĸ�����
	 */
	private static void methodD() {
		System.out.println("����D:" + i);
	}
}
