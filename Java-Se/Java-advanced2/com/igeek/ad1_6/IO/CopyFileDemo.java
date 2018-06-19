package com.igeek.ad1_6.IO;

import java.io.*;
import org.junit.Test;

/**
 * @ClassName: CopyFileDemo
 * @Description: �ļ����Ʋ�ʹ���ֽ�����
 * @date 2017��11��23�� ����8:58:46 Company www.igeekhome.com
 *
 *       ������ 1. �����ֽ�����������ASCII���������.doc�ļ� 2. �����ֽ����������ASCII���������(����).doc�ļ� 3.
 *       ѭ����ASCII���������.doc��һ���ֽ�, Ȼ������ֽ�д�뵽ASCII���������(����).doc,
 *       ֱ������ASCII���������.doc��ĩβ ���ȶ���д
 */
public class CopyFileDemo {
	@Test
	public void Te01() throws Exception {
		// ʹ��һ��һ���ֽڵķ�ʽ��ɸ���
		// ����IO�������IO��Դ
		FileInputStream fis = new FileInputStream("d:/javabase-day01.docx");
		FileOutputStream fos = new FileOutputStream("d:/javabase-day01(1).docx");
		// ��ȡ����,��һ���ֽ�,дһ���ֽ�
		// �ȶ�
		// �������c,���ڴ洢ÿ�ζ�ȡ�����ֽ�
		int c = -1;
		while ((c = fis.read()) != -1) {
			// ��д
			fos.write(c);
			// System.out.println(c);
		}
		// �ر���
		fos.close();
		fis.close();

	}

	@Test
	public void Te02() throws Exception {
		// ʹ��һ��һ���ֽ�����ķ�ʽ��ɸ���
		// ����IO�������IO��Դ
		FileInputStream fis = new FileInputStream("d:/PPT/1.jpg");
		FileOutputStream fos = new FileOutputStream("d:/1.jpg");
		// ��ȡ����,��һ���ֽ�����,дһ���ֽ�����
		// �����ֽ�����,���ڴ洢ÿ�ζ�ȡ��������
		byte[] bytes = new byte[1024];
		// �������,���ڼ�¼ÿ�ζ�ȡ�����ݵĳ���
		int len = -1;
		// �ȶ�
		while ((len = fis.read(bytes)) != -1) {
			// ��д
			fos.write(bytes, 0, len);
		}
		// �ر���
		fos.close();
		fis.close();
	}
	
	@Test
	public void Te03() throws Exception {
		//ͨ����ͨ�����󴴽���Ч������������̼����˻�����
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:/javabase-day01.docx"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:/javabase-day01(3).docx"));
		byte[] bytes = new byte[1024];
		// �������,���ڼ�¼ÿ�ζ�ȡ�����ݵĳ���
		int len = -1;
		// �ȶ�
		while ((len = bis.read(bytes)) != -1) {
			// ��д
			bos.write(bytes, 0, len);
		}
		bis.close();
		bos.close();
	}
	@Test
	public void Te04 () throws Exception{
		//�������뻺��������
		BufferedReader br = new BufferedReader(new FileReader("d:/student.txt"));
		//�����������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("d:/student(1).txt"));
		//��д����
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		//�ͷ���Դ
		bw.close();
		br.close();
	}
}