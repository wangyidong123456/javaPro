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

		// 接收数据
		System.out.println("请输入第一个数据：");
		int x = sc.nextInt();

		System.out.println("请输入第二个数据：");
		int y = sc.nextInt();

		// 调用方法
		int max = getMax(x, y);
		System.out.println("max:" + max);

		printHelloWorld();
		// void 只能用单独调用的方法

		sc.close();
	}

}
