package Tjavabaseday03;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean result = ispalindrome(num);
		System.out.println(result == true ? num + "这个数是回文" : num + "这个数不是回文");
		// 判定是否是回文
		sc.close();
	}

	// 12345
	// t n
	// 0 12345
	// 5 1234
	// 5*10+4 123
	// (5*10+4)*10+3 12
	// ((5*10+4)*10+3)*10+2 1
	// (((5*10+4)*10+3)*10+2)*10+1 0

	public static boolean ispalindrome(int n) {
		int m = n;
		int t = 0;
		for (; n > 0;) {
			t = t * 10 + n % 10;
			n = n / 10;
		}
		return m == t;
	}
}
