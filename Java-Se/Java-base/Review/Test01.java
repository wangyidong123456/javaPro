package Review;

import java.util.Scanner;

import org.junit.Test;

public class Test01 {
	@Test
	public void test01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������������Կո�ָ�");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		if (a > b) {
			c = a;
			a = b;
			b = c;
		}
		System.out.println("a=" + a + "b=" + b);
		sc.close();
	}

	@Test
	public void test02() {
		System.out.println("���������������Կո�ָ�");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int empt = 0;
		if (a > b) {
			empt = a;
			a = b;
			b = empt;
		}
		if (b > c) {
			empt = b;
			b = c;
			c = empt;
		}
//		if (a > b) {
//			empt = a;
//			a = b;
//			b = empt;
//		}
		System.out.println("a=" + a + ",b=" + b + ",c=" + c);
		sc.close();

	}

	// ������ (ÿ�İ�����97������)
	@Test
	public void test03() {
		System.out.println("������һ������ж����Ƿ�Ϊ����");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
			System.out.println("��������һ������");
		} else {
			System.out.println("�����ݲ���һ������");
		}
		sc.close();
	}

	// ����λ��ˮ�ɻ���
	@Test
	public void test04() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = x % 10;
		int b = x / 10 % 10;
		int c = x / 10 / 10 % 10;
		if (x == a * a * a + b * b * b + c * c * c) {
			System.out.println("�������һ��ˮ�ɻ�����");
		} else {
			System.out.println("���������һ��ˮ�ɻ�����");
		}
		sc.close();
	}

	@Test
	public void test05() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ѡ��ɫ(0-3)");
		int x = sc.nextInt();
		System.out.println("��ѡ������(0-12)");
		int y = sc.nextInt();
		switch (x) {
		case 0:
			System.out.print("����");
			break;
		case 1:
			System.out.print("����");
			break;
		case 2:
			System.out.print("��Ƭ");
			break;
		case 3:
			System.out.print("�ݻ�");
			break;
		default:
			System.out.print("�������");
		}
		switch (y) {
		case 0:
			System.out.println("A");
			break;
		case 1:
			System.out.println("2");
			break;
		case 2:
			System.out.println("3");
			break;
		case 3:
			System.out.println("4");
			break;
		case 4:
			System.out.println("5");
			break;
		case 5:
			System.out.println("6");
			break;
		case 6:
			System.out.println("7");
			break;
		case 7:
			System.out.println("8");
			break;
		case 8:
			System.out.println("9");
			break;
		case 9:
			System.out.println("10");
			break;
		case 10:
			System.out.println("J");
			break;
		case 11:
			System.out.println("Q");
			break;
		case 12:
			System.out.println("K");
			break;
		default:
			System.out.println("�������");
		}
		sc.close();
	}

	@Test
	public void test06() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ڼ���");
		int year = sc.nextInt();
		System.out.println("�ڼ���");
		int month = sc.nextInt();
		System.out.println("�ڼ���");
		int day = sc.nextInt();
		if (day > 31) {
			System.out.println("�������������ȷ");
		}
		int monthday = 0;

		int month2 = 0;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			month2 = 29;
		} else {
			month2 = 28;
		}
		switch (month) {
		case 1:
			monthday = 0;
			break;
		case 2:
			monthday = 31;
			break;
		case 3:
			monthday = month2 + 31;
			break;
		case 4:
			monthday = month2 + 31 + 31;
			break;
		case 5:
			monthday = month2 + 31 + 31 + 30;
			break;
		case 6:
			monthday = month2 + 31 + 31 + 30 + 31;
			break;
		case 7:
			monthday = month2 + 31 + 31 + 30 + 31 + 30;
			break;
		case 8:
			monthday = month2 + 31 + 31 + 30 + 31 + 30 + 31;
			break;
		case 9:
			monthday = month2 + 31 + 31 + 30 + 31 + 30 + 31 + 31;
			break;
		case 10:
			monthday = month2 + 31 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			break;
		case 11:
			monthday = month2 + 31 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			break;
		case 12:
			monthday = month2 + 31 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			break;
		default:
			System.out.println("������·ݲ���ȷ��");
			break;
		}
		int newday=monthday+day;
		System.out.println("�����������һ��ĵ�" + newday + "��");
		
		sc.close();
	}
}
