package Javase_test2;

import java.util.Arrays;
import java.util.HashSet;

public class Test03 {
	int total = 0;

	public static void main(String[] args) {
		// 我们有36个在A-Z和0-9范围内。编写一个程序，
		// 从给定的集合中随机选择N个不同的字符，并打印出所有的排列和组合
		char ch[] = { 'A', 'B', 'C' };
//		combe(new char [3], ch, 3-1);
		combee(ch, 0, 3);
//		randomm(5);
	}

	public static void randomm(int n) {
		HashSet<Integer> hs = new HashSet<Integer>();
		while (hs.size()<n) {
			hs.add((int) Math.round(Math.random() * 36));
		}
		System.out.println(hs);
	}

	public static void combe(char[] bch, char[] ch, int len) {
		if (len == -1) {
			if (bch[1] != bch[2] && bch[1] != bch[0] && bch[2] != bch[0]) {
				System.out.println(Arrays.toString(bch));
			}
			return;
		}
		for (int i = 0; i < ch.length; i++) {
			bch[len] = ch[i];
			combe(bch, ch, len - 1);
		}
	}

	// 第一个字符串一共有n种选择，剩下的变成一个n-1规模的递归问题。
	// 而第一个字符的n种选择，都是字符串里面的。因此可以使用第一个字符与1-n的位置上进行交换，
	// 得到n中情况，然后递归处理n-1的规模，只是处理完之后需要在换回来，变成原来字符的样子。
	public static void combee(char[] ch, int start, int len) {
		if (start == len - 1) {
			System.out.println(Arrays.toString(ch));
			return;
		}
		for (int i = start; i < ch.length; i++) {
			char temp = ch[start];
			ch[start] = ch[i];
			ch[i] = temp;
			combee(ch, start + 1, len);
			temp = ch[start];
			ch[start] = ch[i];
			ch[i] = temp;
		}
	}

}
