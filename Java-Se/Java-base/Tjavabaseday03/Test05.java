package Tjavabaseday03;

import java.util.Scanner;

public class Test05 {
	public static boolean compare(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// ��������
		Scanner sc = new Scanner(System.in);

		// ��������
		System.out.println("�������һ������:");
		int a = sc.nextInt();

		System.out.println("������ڶ�������:");
		int b = sc.nextInt();

		// ���÷���
		boolean flag = compare(a, b);
		System.out.println("flag:" + flag);

		sc.close();
	}

}