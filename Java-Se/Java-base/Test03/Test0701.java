package Test03;

import java.util.Random;
import java.util.Scanner;

public class Test0701 {

	public static void main(String[] args) {
		/**
		 * @ClassName: RandomTest
		 * @Description: ϵͳ����һ��1-100֮������������³���������Ƕ��١�
		 * @date 2017��10��12�� ����5:19:58 Company www.igeekhome.com
		 * 
		 *       ������С��Ϸ���� ϵͳ����һ��1-100֮������������³���������Ƕ��١� ������ A:ϵͳ����һ�������1-100֮��ġ�
		 *       int number = r.nextInt(100) + 1; B:����¼������Ҫ�µ����� ��Scannerʵ��
		 *       C:�Ƚ�����������(��if���) ���ˣ�������ʾ���� С�ˣ�������ʾС�� �����ˣ�������ʾ����ϲ�㣬������
		 *       D:��β����ݣ������ǲ�֪��Ҫ�¶��ٴΣ���ô����? while(true) {ѭ��������}
		 */
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		int usenumber;
		boolean gameOver = false;
		for (; gameOver == false;) {
			System.out.println("������һ�������ڣ�0-100֮�䣩");
			usenumber = sc.nextInt();
			if (usenumber > 100 || usenumber < 0) {
				System.out.println("�����������������");
			} else if (number == usenumber) {
				System.out.println("��ϲ�������");
				gameOver = true;
			} else if (number > usenumber) {
				System.out.println("��С��");
			} else {
				System.out.println("�´���");
			}

		}
		sc.close();
	}

}