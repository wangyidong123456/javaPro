package Tjavabaseday0503;

import java.io.FileWriter;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("d:\\a.txt", true);
		/*
		 * �������������������Щ����: A:����ϵͳ��Դ������һ���ļ� B:������������� C:�����������ָ���ļ�
		 */
		// ��������������д���ݵķ���
		// дһ���ַ�������
		fw.write("IO�����");
		// ����û��ֱ��д���ļ�����ʵ��д�����ڴ滺����
		fw.flush();
		fw.write("helloworld");
		fw.flush();
		fw.write("java");
		fw.flush();

		// void write(String str):дһ���ַ�������
		fw.write("abcde");

		// void write(String str,int index,int len):дһ���ַ����е�һ��������
		fw.write("abcde", 0, 5);
		fw.write("abcde", 1, 3);

		// void write(int
		// ch):дһ���ַ�����,����дint���͵ĺô��Ǽȿ���дchar���͵����ݣ�Ҳ����дchar��Ӧ��int���͵�ֵ��'a',97
		fw.write('a');
		fw.write(97);

		// void write(char[] chs):дһ���ַ���������
		char[] chs = { 'a', 'b', 'c', 'd', 'e' };
		fw.write(chs);

		// void write(char[] chs,int index,int len):дһ���ַ������һ��������
		fw.write(chs, 0, 5);
		fw.write(chs, 1, 4);
		fw.flush();
		for (int x = 0; x < 10; x++) {
			fw.write("hello" + x);
			fw.write("\r\n");
		}

		// �ͷ���Դ
		// ֪ͨϵͳ�ͷź͸��ļ���ص���Դ
		fw.close();
		// while(true) {}

	}

}
