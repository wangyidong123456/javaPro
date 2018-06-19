package Tjavabaseday0503;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader03 {

	public static void main(String[] args) throws IOException {
		// ��������������
		long start = System.currentTimeMillis();
		FileReader fr = new FileReader("d:\\javabase-day01.docx");
		// �������������
		FileWriter fw = new FileWriter("d:\\aa.docx");

		// ��д����
		char[] chs = new char[4 * 1024];
		int len;
		while ((len = fr.read(chs)) != -1) {
			fw.write(chs, 0, len);
		}
		fw.close();
		fr.close();
		long end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
	}

}
