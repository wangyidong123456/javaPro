package com.jiayuan.utils;

import java.io.*;

public class Copy {
	// дһ�������ļ��еĳ���
	public static void main(String[] args) throws Exception {
		Copy cd = new Copy();
		// �����Ƶ��ļ��е�ַ
		File fl = new File("d:/KGMusic");
		// ��Ҫ���Ƶ����µ�ַ
		File newfl = new File("e:/");
		cd.copydcy(fl, newfl);
	}

	// ��ӡ�����ļ���ַ
	public void copydcy(File fl, File newfl) throws Exception {
		newfl = new File(newfl, fl.getName());
		if (fl.isFile()) {
			copyFile(fl, newfl);
		} else {
			// new fl=e:/KGMusic
			// �ݹ�ڶ���ʱ, fl=tempfl
			// ������ļ���·��
			// �����ļ���
			newfl.mkdirs();
			// ��ȡ�����ļ�
			File[] farr = fl.listFiles();
			for (File tempfl : farr) {
				System.out.println(tempfl.getAbsolutePath());
				// �ж����ļ�����
				if (tempfl.isFile()) {
					File newtfl = new File(newfl, tempfl.getName());// �����ļ�D:/KGMusic/KuGou.exe
					copyFile(tempfl, newtfl);
				} else {
					// �ж����ļ�����ݹ�
					copydcy(tempfl, newfl);
				}
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
			bw.flush();
		}
		br.close();
		bw.close();
	}

}
