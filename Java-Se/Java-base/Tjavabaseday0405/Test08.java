package Tjavabaseday0405;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// 键盘录入一个字符串，把该字符串的首字母转成大写，其余为小写。
		// (只考虑英文大小写字母字符)
		System.out.println("请输入一个字符串(纯字母)");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = str.substring(0, 1);
		String str2 = str.substring(1);
		String str0 = str1.toUpperCase() + str2.toLowerCase();
		System.out.println(str0);
		sc.close();

	}

}
