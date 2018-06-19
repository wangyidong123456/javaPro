package com.igeek.ad1_6.IO;

import java.io.*;

public class CopyDirectory {
	// дһ�������ļ��еĳ���
	public static void main(String[] args) throws Exception {
		CopyDirectory cd = new CopyDirectory();
		// �����Ƶ��ļ��е�ַ
		File fl = new File("d:/KGMusic");
		// ��Ҫ���Ƶ����µ�ַ
		File newfl = new File("e:/");
		cd.copydcy(fl, newfl);
	}

	// ��ӡ�����ļ���ַ
	public void copydcy(File fl, File newfl) throws Exception {
		// new fl=e:/KGMusic
		// �ݹ�ڶ���ʱ, fl=tempfl
		// tempfl.getName
		newfl = new File(newfl, fl.getName());
		//�����ļ���
		newfl.mkdirs();
		//��ȡ�����ļ�
		File[] farr = fl.listFiles();
		for (File tempfl : farr) {
			System.out.println(tempfl.getAbsolutePath());
			if (tempfl.isFile()) {
				File tfl = new File(tempfl.getAbsolutePath());// �����ļ�
				File newtfl = new File(newfl, tempfl.getName());// �����ļ�D:/KGMusic/KuGou.exe
				copyFile(tfl, newtfl);
			} else {
				//�ж����ļ�����ݹ�
				copydcy(tempfl, newfl);
			}
		}
	}

	// �����ļ�
	public void copyFile(File fl, File newfl) throws Exception {
		BufferedInputStream br = new BufferedInputStream(new FileInputStream(fl));
		BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(newfl));
		byte b[] = new byte[1024];
		int len;
		while ((len = br.read(b)) != -1) {
			bw.write(b, 0, len);
		}
		br.close();
		bw.close();
	}

}
