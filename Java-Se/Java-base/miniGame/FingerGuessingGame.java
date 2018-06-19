package miniGame;

import java.util.Random;
import java.util.Scanner;
public class FingerGuessingGame {
	// ��дһ����ȭ��Ϸ����ҽ�������ѡ����Ϸģʽ
	// ģʽ1 ������20��0
	// ģʽ2 ����һֱ�浽��20��Ϊֹ
	// ��Ϸ������ͳ����Ӯƽ�ִ���
	// ��Ϸ��������ʾ��ҵĻ���(Ӯ�ô���*10)
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("��ӭ�������ȭ��Ϸ! \n��ѡ����Ϸģʽ��\nģʽ1 ������20��(����1);\nģʽ2 ����һֱ�浽��20��Ϊֹ(����2)");
		int i = sc.nextInt();
		switch (i) {
		case 1:
			game1();
			break;
		case 2:
			game2();
			break;
		default:
			System.out.println("����������������룡");
		}
	}

	private static void game1() {
		// arr[0] Ӯ���� arr[1] ����� arr[2]ƽ�ִ���
		int arr[] = new int[3];
		System.out.println("��ӭ�������ȭ��Ϸ.ģʽ1,�����Բ�ȭ20��");
		for (int a = 1; a < 21;) {
			System.out.println("����1Ϊ��,����2Ϊ����,����3Ϊʯͷ����" + a + "�����ȭ");
			// ��ҳ�ȭ
			int i = sc.nextInt();
			if (i >= 1 && i <= 3) {
				a++;
			}
			game(i,arr);
		}
		System.out.println("��Ϸ����! лл���룡");
		// ��Ϸ������ͳ����Ӯƽ�ִ���
		System.out.println("Ӯ����Ϊ" + arr[0] + " �����Ϊ" + arr[1] + " ƽ�ִ���Ϊ" + arr[2]);
		// ��Ϸ��������ʾ��ҵĻ���(Ӯ�ô���*10)
		System.out.println("���Ļ���Ϊ" + arr[0] * 10);
	}

	private static void game2() {
		// arr[0] Ӯ���� arr[1] ����� arr[2]ƽ�ִ���
		int arr[] = new int[3];
		System.out.println("��ӭ�������ȭ��Ϸ.ģʽ2,������һֱ�浽��20��Ϊֹ");
		for (int a = 1; arr[1] < 20;) {
			System.out.println("����1Ϊ��,����2Ϊ����,����3Ϊʯͷ����" + a + "�����ȭ");
			// ��ҳ�ȭ
			int i = sc.nextInt();
			if (i >= 1 && i <= 3) {
				a++;
			}
			game(i,arr);
		}
		System.out.println("��Ϸ����! лл���룡");
		// ��Ϸ������ͳ����Ӯƽ�ִ���
		System.out.println("Ӯ����Ϊ" + arr[0] + " �����Ϊ" + arr[1] + " ƽ�ִ���Ϊ" + arr[2]);
		// ��Ϸ��������ʾ��ҵĻ���(Ӯ�ô���*10)
		System.out.println("���Ļ���Ϊ" + arr[0] * 10);
	}
	private static void game(int i,int arr []) {
		Random r = new Random();
		// ���Գ�ȭ
		int num = r.nextInt(3) + 1;
		// ��ȭ���
		switch (i) {
		case 1:
			if (num == 1) {
				System.out.println("������ȭ��������Գ���,ƽ��");
				arr[2]++;
			} else if (num == 2) {
				System.out.println("������ȭ��������Գ�����,����");
				arr[1]++;
			} else if (num == 3) {
				System.out.println("������ȭ��������Գ�ʯͷ,Ӯ��");
				arr[0]++;
			}
			break;
		case 2:
			if (num == 1) {
				System.out.println("������ȭ��������Գ���,Ӯ��");
				arr[0]++;
			} else if (num == 2) {
				System.out.println("������ȭ��������Գ�����,ƽ��");
				arr[2]++;
			} else if (num == 3) {
				System.out.println("������ȭ��������Գ�ʯͷ,����");
				arr[1]++;
			}
			break;
		case 3:
			System.out.println("��ʯͷ��ȭ��� 3");
			if (num == 1) {
				System.out.println("������ȭ��������Գ���,����");
				arr[1]++;
			} else if (num == 2) {
				System.out.println("������ȭ��������Գ�����,Ӯ��");
				arr[0]++;
			} else if (num == 3) {
				System.out.println("������ȭ��������Գ�ʯͷ,ƽ��");
				arr[2]++;
			}
			break;
		default:
			System.out.println("����������������룡");
		}
	}



}
