package com.igeek.ad1_5.File;

import java.io.File;

import org.junit.Test;

public class Test01 {
	@Test
	//
	// * File: �ļ����Գ־û��ش洢����
	// * File��һ������ʹ���һ���ļ����ļ���(�Լ��򵥵ض���,��������˵��)
	// * �ĵ���˵��File������ļ����ļ���·��,�������ǿ���ͨ��·���ҵ���Ӧ���ļ����ļ���.
	// * ������ΪFile��ʹ����ļ����ļ���(ͨ��·���ҵ�)
	// * ���췽��:public File(String pathname) ͨ��·���ҵ���Ӧ���ļ����ļ���

	// * ����·��:���̷���ʼ���ļ���ȫ·��
	// * ���·��:��ĳ������·����ʼ��ָ���ļ���������·��
	// * ��Eclipse��,���е��ļ������ʹ�����·��,�������·����Ϊ��Ŀ��Ŀ¼
	// *
	// ��test.txt�����javaadvanced1_d05_c04��Ŀ��Ŀ¼������a/b/test.txt,��a/b/test.txt���Ǹ��ļ������·��
	// * ��java���ж���·���ķָ�������ʹ��/����\\,��ͨ�õ�
	public void Te01() {
		// �����ļ�
		File file = new File("D:\\other\\test.txt");
		
		File file1 = new File("Testt102.properties");
		System.out.println(file1.getAbsolutePath());
		
		// �����ļ���
//		File dir = new File("D:\\other");
//		File file1 = new File("D:\\javaadvanced1_workspace\\javaadvanced1_d05_c04\\a\\b\\test.txt");
		// ͨ�����·����Eclipse�е�ĳ����Ŀ���д���һ���ļ�����
		// "a/b/test.txt"
		File file2 = new File("a\\b\\test.txt");
		// ��ȡ�ļ���С,�ж��ļ��Ƿ�Ϊtest.txt
		System.out.println(file.length());
		System.out.println(file2.length());
	}
	// * File��ķ���:
	// * ���췽��:
	// * 1:ֱ�Ӹ���·��(����·��,���·��)
	// * 2:·����Ϊ����(���ļ����ļ������ڵ��ļ���)�뺢��(���ļ����ļ����Լ�������)

	// * File�ೣ������
	// * 1:��ȡ�ļ�/�ļ�����Ϣ����
	// * public String getAbsolutePath() ��ȡ����·��
	// * public String getPath() ��ȡ·��(��ʲô��ʽ�����Ķ���,�ͷ���ʲô��ʽ��·��(����·��/���·��))
	// * public String getName() ��ȡ�ļ�/�ļ��е�����
	// * public String getParent() ���������ļ���·��(���ݴ�������ʱ�Ƿ�Ϊ����·��/���·��)
	
	//*  2:���Դ���/ɾ�����ļ�(Javaɾ��ʱ������ʹ��windows�Ļ���վ)
	//*  public boolean delete()  ɾ���ļ�
	//*  public boolean createNewFile() throws IOException  �����ļ�
	//*  		�ڴ����ļ�ʱ,����ļ����ڵ��ļ��в�����,�򱨴�ϵͳ�Ҳ���ָ����·��.�����ļ�ʱ,����ȷ���ļ����Ѿ�����
	//*  public boolean mkdir()  ʹ��mkdir���������ļ���ʱ,���뱣֤�������ļ����Ѿ�����,���򴴽�ʧ��(���ᱨ��)
	//*  public boolean mkdirs() һ���Դ����༶Ŀ¼
	//*  public boolean delete()  ɾ���ļ��в���Ϊ�ǿ�(�ж���),����ɾ��ʧ��
	
	//* 3:�жϸ�File�����Ƿ���ڻ����жϸ�File�������һ���ļ����Ǵ���һ���ļ���
	//* public boolean exists()  �ļ������ļ����Ƿ����
	//* public boolean isDirectory()  �ж��ļ������Ƿ�Ϊ�ļ���
	//* public boolean isFile()  �ж��ļ������Ƿ�Ϊ�ļ�
	
	//* public File[] listFiles()  ��ȡ���÷����ļ����µ�����file����(�ļ����ļ���)
}
