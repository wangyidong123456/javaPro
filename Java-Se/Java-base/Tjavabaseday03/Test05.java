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
		// 创建对象
		Scanner sc = new Scanner(System.in);

		// 接收数据
		System.out.println("请输入第一个数据:");
		int a = sc.nextInt();

		System.out.println("请输入第二个数据:");
		int b = sc.nextInt();

		// 调用方法
		boolean flag = compare(a, b);
		System.out.println("flag:" + flag);

		sc.close();
	}

}
