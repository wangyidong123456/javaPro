package Review;

import java.math.BigDecimal;
import java.util.Scanner;

import org.junit.Test;

public class Test03 {
	@Test
	public void Test01() {
		System.out.println("������һ������");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 1;
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				sum *= 2;
			}
		} else {
			sum = 0;
		}
		System.out.println(sum);
		sc.close();
	}

	@Test
	public void Test02() {
		double d = -10.1;
		double d1 = 0.1;
		BigDecimal bd1 = new BigDecimal(String.valueOf(d));
		BigDecimal bd2 = new BigDecimal(String.valueOf(d1));
		for (int i = 0; i < 201; i++) {

			bd1 = bd1.add(bd2);
			System.out.println(bd1);
		}

	}

	// 4.�����������������磬m =2��n = 5������
	/**
	 * 2+22+222+2222+22222 =2(1+11+111+1111+11111) 1=1 11=1+10*1
	 * 111=1+10*1+10*10 1111=1+10+10*10+10*10*10
	 * 11111=1+10+10*10+10*10*10+10*10*10*10
	 */
	@Test
	public void Test0401() {
		System.out.println("��������������");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int tem = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			tem = tem * 10 + m;
			sum += tem;
		}
		System.out.println(sum);
		sc.close();
	}

	@Test
	public void Test04() {
		System.out.println("��������������");
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		double d = 0;
		double m = sc.nextDouble();
		double n = sc.nextDouble();
		for (int i = 0; i < n; i++) {
			d += Math.pow(10, i) * m;
			sum += d;
			System.out.println("���Ϊ" + sum + "\t��������Ϊ" + d);
		}
		sc.close();
	}

	/**
	 * �}Ŀ(��������)����һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
	 * С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ������ܹ��ж��ٶԣ�
	 * System.out.println(�ڼ����£��ж��ٶ�����);
	 */
	@Test
	public void Test05() {
		System.out.println("������һ������");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		arr[0] = 1;
		if (n >= 2) {
			arr[1] = 1;
			for (int i = 2; i < n; i++) {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}
		System.out.println(arr[n - 1]);
		sc.close();
	}

}
