package Review;

import java.util.Scanner;

import org.junit.Test;

public class Test04 {
	// 6. ��һ������������� int n = 123456; ��� 654321
	@Test
	public void Te01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����֣�");
		int n = sc.nextInt();
		int x = 0;
//		int[] arr = new int[1000];
		for (; n > 0;) {
			x = n % 10;
			n = n / 10;
			System.out.print(x);
		}
		// System.out.println(arr[1]);
//		for (int i = 0; i < index; i++) {
//			System.out.print(arr[i]);
//		}
		sc.close();
	}

	// 8.��ӡ100���ڵ����� ���� ֻ�ܱ�1������������
	@Test
	public void Te02() {
		int n = 100;
		for (int i = 1; i <= n; i++) {
			int x = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					x++;
				}
			}
			if (x == 0) {
				System.out.print(i + " ");
			}

		}
	}

	// 5����һ���������ֽ�����������������90����ӡ��90=2*3*3*5 9*10=3*3*2*5
	@Test
	public void Te03() {
		int n = 90;
		System.out.print(n + "=");
		for (int i = 2; i < n; i++) {
			for (int j = 2; j < n; j++) {
				if (n % j == 0) {
					n = n / j;
					System.out.print(j + "*");
					break;
				}
			}
		}
		System.out.println(n);
	
	}
	//Ƥ����ط��������ʮ�� �߶� ����·��
	@Test
	public void Te04() {
		double h=100;
		double sumh=h;
		for(int i=0;i<10;i++){
			h=h/2;
			sumh+=h;
		}
		System.out.println("���һ�θ߶�"+h+"��"+"��·����"+sumh+"��");
	}
}
