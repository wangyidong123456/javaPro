package Tjavabaseday03;

import java.util.Scanner;

public class Test01 {
	public static void printHelloWorld() {
		for (int x = 1; x <= 10; x++) {
			System.out.println("HelloWorld");
		}
	}

	public static int sum(int a, int b) {
		// int c = a + b;
		// return c;

		return a + b;
	}

	public static int getMax(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		int s = sum(10, 20);
		// s+=100;
		System.out.println("s:" + s);

		Scanner sc = new Scanner(System.in);

		// ��������
		System.out.println("�������һ�����ݣ�");
		int x = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int y = sc.nextInt();

		// ���÷���
		int max = getMax(x, y);
		System.out.println("max:" + max);

		printHelloWorld();
		// void ֻ���õ������õķ���

		sc.close();
	}

}
