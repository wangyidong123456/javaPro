package Tjavabaseday0405;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// ����:ģ���¼,�����λ���,����ʾ���м���
		String username = "admin";
		String password = "admin";
		for (int x = 0; x < 3; x++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("���������룺");
			String pwd = sc.nextLine();
			if (username.equals(name) && password.equals(pwd)) {
				System.out.println("��½�ɹ�");
				break;
			} else {
				if (x == 0) {
					System.out.println("�Բ����û�����������������������룬�������λ��ᡣ");
				} else if (x == 1) {
					System.out.println("�Բ����û�����������������������룬����һ�λ��ᡣ");
				} else if (x == 2) {
					System.out.println("�û��������뱻�������������Ա��ϵ");
				}
			}
			sc.close();

		}

	}
}
