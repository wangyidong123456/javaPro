package miniGame;

import java.util.Random;

public class RandomPoker {
	// 54���˿��ƣ�������֣�����������ɵ�������Ϣ
	public static void main(String[] args) {
		rPoker();
	}
	private static void rPoker() {
		Random r = new Random();
		int color = r.nextInt(4);
		int number = r.nextInt(13);
		switch (color) {
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
		switch (number) {
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

	}
}
