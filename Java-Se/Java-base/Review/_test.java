package Review;

import java.util.Scanner;

public class _test {
	public static void main(String[] args) {
		System.out.println("��������������");
		Scanner sc = new Scanner(System.in);
		// a=x ����
		int x = sc.nextInt();
		// y y�������
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