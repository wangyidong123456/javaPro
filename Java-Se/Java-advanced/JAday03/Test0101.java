package JAday03;

import java.util.Scanner;

public class Test0101 {

	public static void main(String[] args) {
		try {
			TestExcetion();
		} catch (Exception ex) {
			System.out.println("���򱨴��ˣ�");
			ex.printStackTrace();
		} finally {
			// �˴����һ��Ҫִ�еĴ���
			// һ����ͷ���Դ�Ĵ���ŵ�finally��
			// �ļ��ر�
			// ���ݿ����ӹر�
			System.out.println("����һ��ִ���ͷ���Դ�Ĵ���");
			System.out.println("����һ��ִ���ͷ���Դ�Ĵ���");
			if(Math.random()>0.5){
				return;
			}
			System.out.println("����һ��ִ���ͷ���Դ�Ĵ���");
		}

	}

	public static void TestExcetion() throws NumberFormatException {
		Scanner sc = new Scanner(System.in);
		double a = Integer.parseInt(sc.next());
		double ds = 1.0 / a;
		System.out.println("ds" + ds);
        sc.close();
	}
}
