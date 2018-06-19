package Review;

import java.util.Scanner;

public class _test {
	public static void main(String[] args) {
		System.out.println("请输入两个数：");
		Scanner sc = new Scanner(System.in);
		// a=x 基数
		int x = sc.nextInt();
		// y y个数相加
		int y = sc.nextInt();
		System.out.println("s=" + nSum(x, y));
		sc.close();
	}

	public static int nSum(int x, int y) {
		int nsum = 0;
		int temp = 0;
		for (int i = 0; i < y; i++) {
			temp = temp * 10 + x;
			nsum += temp;
		}
		return nsum;
	}
}