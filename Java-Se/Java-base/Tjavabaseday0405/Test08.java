package Tjavabaseday0405;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// ����¼��һ���ַ������Ѹ��ַ���������ĸת�ɴ�д������ΪСд��
		// (ֻ����Ӣ�Ĵ�Сд��ĸ�ַ�)
		System.out.println("������һ���ַ���(����ĸ)");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = str.substring(0, 1);
		String str2 = str.substring(1);
		String str0 = str1.toUpperCase() + str2.toLowerCase();
		System.out.println(str0);
		sc.close();

	}

}
