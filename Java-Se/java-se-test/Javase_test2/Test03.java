package Javase_test2;

import java.util.Arrays;
import java.util.HashSet;

public class Test03 {
	int total = 0;

	public static void main(String[] args) {
		// ������36����A-Z��0-9��Χ�ڡ���дһ������
		// �Ӹ����ļ��������ѡ��N����ͬ���ַ�������ӡ�����е����к����
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

	// ��һ���ַ���һ����n��ѡ��ʣ�µı��һ��n-1��ģ�ĵݹ����⡣
	// ����һ���ַ���n��ѡ�񣬶����ַ�������ġ���˿���ʹ�õ�һ���ַ���1-n��λ���Ͻ��н�����
	// �õ�n�������Ȼ��ݹ鴦��n-1�Ĺ�ģ��ֻ�Ǵ�����֮����Ҫ�ڻ����������ԭ���ַ������ӡ�
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
