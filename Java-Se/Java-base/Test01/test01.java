package Test01;

/*
 * bbbbbbbbbbbbb
 */
public class test01 {

	/**
	 * aaaaaaaaaaaaaaaaaaaa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Ҽ");
		System.out.println(12);
		System.out.println(-23);
		// �ַ�������
		System.out.println("HelloWorld");

		// ��������
		System.out.println(12);
		System.out.println(-23);

		// С������
		System.out.println(12.34);

		// �ַ�����
		System.out.println('a');
		System.out.println('0');

		// ��������
		System.out.println(true);
		System.out.println(2 + 2);

		byte b = 10;
		System.out.println(10);
		System.out.println(b);

		// ����short���͵ı���
		short s = 100;
		System.out.println(s);

		// ����int���͵ı���
		int i = 10000;
		System.out.println(i);

		// ����long���͵ı���
		long l = 1000000000000000L;
		System.out.println(l);

		// ����float���͵ı���
		float f = 12.34F;
		System.out.println(f);

		// ����double���͵ı���
		double d = 12.34;
		System.out.println(d);

		// ����char���͵ı���
		char c = 'a';
		System.out.println(c);

		// ����boolean���͵ı���
		boolean bb = false;
		System.out.println(bb);
		/*
		 * +:��һ������������ӷ�����ġ� �������������ʱ��һ��Ҫ�����������������ͱ���һ�¡�
		 * 
		 * ����ת���� ��ʽת�� ǿ��ת��
		 * 
		 * ��ʽת�� byte 1,short2,char2 -- int4 -- long8 -- float4 -- double8
		 */

		System.out.println(3 + 4);

		// ��������int���͵ı���
		int a = 3;

		int b1 = 4;
		int c1 = a + b1;
		System.out.println(c1);

		// ����һ��byte����,����һ��int����
		byte bb1 = 2;
		int cc = 5;
		System.out.println(bb1 + cc);

		// ���ܲ��ܲ�ֱ���������һ������������?
		// �ñ������ܣ��������Ӧ��������
		// ������ʧ����
		// byte dd = bb + cc;
		int ii1 = 100;
		byte dd = (byte) ii1;
		System.out.println(dd);

		// char->int ����ASCII�����ת��
		// A-Z 65-90
		// a-z 97-122
		// 0-9 48-57
		char ch = 'b';
		int ii = ch;
		System.out.println("ii=" + ii);

		// + +����������������,��ִ����������ѧ����
		// + +�����߳�����һ���ַ���,��ִ����������
		int i1 = 10;
		double i2=(double)i1;
		double f1 = 20.13;		
		double d1 = i2 + f1;
		System.out.println(i2);
		System.out.println(f1);
		System.out.println(d1);
		// step 1: i1->float

		// step 2: i1+f1=30.12f
		// step 3: 30.12f->30.12d;
		// step 4: d1=30.12d;

		String s1 = "11.22";
		String s2 = s1 + i1;
		System.out.println("s2=" + s2);

		System.out.println(Integer.MAX_VALUE);

//		for (char ch1 = 0; ch1 <= 127; ch1++) {
//
//			System.out.println(ch1);
//		}
//		
//		for (int u = 0; u <= 127; u++) {
//			char uu = (char) u;
//			System.out.println(uu);
//
//		}
//	

	}

}
